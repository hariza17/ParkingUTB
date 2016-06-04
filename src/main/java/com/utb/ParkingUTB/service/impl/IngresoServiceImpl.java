/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.ParkingUTB.service.impl;

import com.utb.ParkingUTB.dao.IngresoDAO;
import com.utb.ParkingUTB.entity.Ingreso;
import com.utb.ParkingUTB.service.IngresoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Full Stack JavaScrip
 */
@Service
@Transactional
public class IngresoServiceImpl implements IngresoService {

    @Autowired
    IngresoDAO ingresoDAO;

    @Override
    public List<Ingreso> getAllIngreso() {
        return ingresoDAO.getAllIngreso();
    }

    @Override
    public Ingreso getById(Long id) {
        return ingresoDAO.getById(id);
    }

    @Override
    public void save(Ingreso ingreso) {
        ingresoDAO.saveOrUpdate(ingreso);
    }

    @Override
    public void update(Ingreso ingreso) {
        ingresoDAO.update(ingreso);
    }

    @Override
    public void saveOrUpdate(Ingreso ingreso) {
        ingresoDAO.update(ingreso);
    }

    @Override
    public void delete(Long id) {
        ingresoDAO.delete(id);
    }

}
