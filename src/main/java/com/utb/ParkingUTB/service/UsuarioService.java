/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.ParkingUTB.service;

import com.utb.ParkingUTB.entity.Usuario;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface UsuarioService {

    public List<Usuario> getAllUsuario();
    public Usuario getById(Long id);
    public void save(Usuario usuario);
    public void update(Usuario usuario);
    public void saveOrUpdate(Usuario usuario);
    public void delete(Long id);


}
