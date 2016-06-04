/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.ParkingUTB.dao;

import com.utb.ParkingUTB.entity.Ingreso;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface IngresoDAO {

    public List<Ingreso> getAllIngreso();

    public Ingreso getById(Long id);

    public void save(Ingreso ingreso);

    public void update(Ingreso ingreso);

    public void saveOrUpdate(Ingreso ingreso);

    public void delete(Long id);
}
