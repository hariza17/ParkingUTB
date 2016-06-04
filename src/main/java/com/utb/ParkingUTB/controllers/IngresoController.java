/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.ParkingUTB.controllers;

import com.utb.ParkingUTB.config.security.ResourceNotFoundException;
import com.utb.ParkingUTB.entity.Ingreso;
import com.utb.ParkingUTB.service.IngresoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Full Stack JavaScrip
 */
@RestController
@RequestMapping("/ingreso")
public class IngresoController {

    @Autowired
    IngresoService ingresoService;

    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public @ResponseBody
    List<Ingreso> getAllIngreso() {
        return ingresoService.getAllIngreso();
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody
    Ingreso getIngresoById(@PathVariable Long id) {
        Ingreso ingreso = ingresoService.getById(id);
        if (ingreso != null) {
            // whatever
            return ingreso;
        } else {
            throw new ResourceNotFoundException();
        }
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST, consumes = "application/json")
    public Ingreso createIngreso(@RequestBody Ingreso ingreso) {
        ingresoService.save(ingreso);
        return ingreso;
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.PUT, consumes = "application/json")
    public Ingreso updateIngreso(@RequestBody Ingreso ingreso) {
        ingresoService.update(ingreso);
        return ingreso;
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity<Ingreso> deleteIngreso(@PathVariable("id") Long id) {

        ingresoService.delete(id);
        return new ResponseEntity<Ingreso>(HttpStatus.NO_CONTENT);
    }

}
