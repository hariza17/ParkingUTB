/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.ParkingUTB.controllers;

import com.utb.ParkingUTB.config.security.ResourceNotFoundException;
import com.utb.ParkingUTB.entity.Parqueadero;
import com.utb.ParkingUTB.service.ParqueaderoService;
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
@RequestMapping("/parqueadero")
public class ParqueaderoController {

    @Autowired
    ParqueaderoService parqueaderoService;

    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public @ResponseBody
    List<Parqueadero> getAllParqueadero() {
        return parqueaderoService.getAllParqueadero();
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody
    Parqueadero getParqueaderoById(@PathVariable Long id) {
        Parqueadero parqueadero = parqueaderoService.getById(id);
        if (parqueadero != null) {
            // whatever
            return parqueadero;
        } else {
            throw new ResourceNotFoundException();
        }
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST, consumes = "application/json")
    public Parqueadero createParqueadero(@RequestBody Parqueadero parqueadero) {
        parqueaderoService.save(parqueadero);
        return parqueadero;
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.PUT, consumes = "application/json")
    public Parqueadero updateParqueaderoo(@RequestBody Parqueadero parqueadero) {
        parqueaderoService.update(parqueadero);
        return parqueadero;
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity<Parqueadero> deleteParqueadero(@PathVariable("id") Long id) {

        parqueaderoService.delete(id);
        return new ResponseEntity<Parqueadero>(HttpStatus.NO_CONTENT);
    }
}
