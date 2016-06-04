/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.ParkingUTB.service.impl;

import com.utb.ParkingUTB.dao.ParqueaderoDAO;
import com.utb.ParkingUTB.entity.Parqueadero;
import com.utb.ParkingUTB.service.ParqueaderoService;
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
public class ParqueaderoServiceImpl implements ParqueaderoService {

    @Autowired
    ParqueaderoDAO parqueaderoDAO;

    @Override
    public List<Parqueadero> getAllParqueadero() {
        return parqueaderoDAO.getAllParqueadero();
    }

    @Override
    public Parqueadero getById(Long id) {
        return parqueaderoDAO.getById(id);
    }

    @Override
    public void save(Parqueadero parqueadero) {
        parqueaderoDAO.save(parqueadero);
    }

    @Override
    public void update(Parqueadero parqueadero) {
        parqueaderoDAO.update(parqueadero);
    }

    @Override
    public void saveOrUpdate(Parqueadero parqueadero) {
        parqueaderoDAO.saveOrUpdate(parqueadero);
    }

    @Override
    public void delete(Long id) {
        parqueaderoDAO.delete(id);
    }

}
