/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.ParkingUTB.dao;

import com.utb.ParkingUTB.entity.Parqueadero;
import java.util.List;

/**
 *
 * @author Full Stack JavaScrip
 */
public interface ParqueaderoDAO {
    public List<Parqueadero> getAllParqueadero();

    public Parqueadero getById(Long id);

    public void save(Parqueadero parqueadero);

    public void update(Parqueadero parqueadero);

    public void saveOrUpdate(Parqueadero parqueadero);

    public void delete(Long id);
}
