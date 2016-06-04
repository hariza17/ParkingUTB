/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.ParkingUTB.controllers;

import com.utb.ParkingUTB.config.security.ResourceNotFoundException;
import com.utb.ParkingUTB.entity.Parqueadero;
import com.utb.ParkingUTB.entity.Usuario;
import com.utb.ParkingUTB.service.UsuarioService;
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
@RequestMapping("/usuario")
public class UsuarioController {

      @Autowired
      UsuarioService usuarioService;

      @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public @ResponseBody
    List<Usuario> getAllUsuario() {
        return usuarioService.getAllUsuario();
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody
    Usuario getUsuarioById(@PathVariable Long id) {
        Usuario usuario = usuarioService.getById(id);
        if (usuario != null) {
            // whatever
            return usuario;
        } else {
            throw new ResourceNotFoundException();
        }
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST, consumes = "application/json")
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        usuarioService.save(usuario);
        return usuario;
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.PUT, consumes = "application/json")
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
        usuarioService.update(usuario);
        return usuario;
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity<Usuario> deleteUsuario(@PathVariable("id") Long id) {

        usuarioService.delete(id);
        return new ResponseEntity<Usuario>(HttpStatus.NO_CONTENT);
    }
}
