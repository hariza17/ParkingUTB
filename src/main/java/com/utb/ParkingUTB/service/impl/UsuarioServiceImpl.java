/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.ParkingUTB.service.impl;

import com.utb.ParkingUTB.dao.UsuarioDAO;
import com.utb.ParkingUTB.entity.Usuario;
import com.utb.ParkingUTB.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Full Stack JavaScrip
 */
@Transactional
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> getAllUsuario() {
        return usuarioDAO.getAllUsuario();
    }

    @Override
    public Usuario getById(Long id) {
        return usuarioDAO.getById(id);
    }

    @Override
    public void save(Usuario usuario) {
        usuarioDAO.save(usuario);
    }

    @Override
    public void update(Usuario usuario) {
        usuarioDAO.update(usuario);
    }

    @Override
    public void saveOrUpdate(Usuario usuario) {
        usuarioDAO.saveOrUpdate(usuario);
    }

    @Override
    public void delete(Long id) {
        usuarioDAO.delete(id);
    }

}
