/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.ParkingUTB.dao.impl;

import com.utb.ParkingUTB.dao.IngresoDAO;
import com.utb.ParkingUTB.entity.Ingreso;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Full Stack JavaScrip
 */
@Repository
public class IngresoDAOImpl implements IngresoDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Ingreso> getAllIngreso() {
        Criteria crit = getSession().createCriteria(Ingreso.class);
        return crit.list();
    }

    @Override
    public Ingreso getById(Long id) {
        return (Ingreso) getSession()
                .createCriteria(Ingreso.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void save(Ingreso ingreso) {
        getSession().save(ingreso);
    }

    @Override
    public void update(Ingreso ingreso) {
        getSession().update(ingreso);
    }

    @Override
    public void saveOrUpdate(Ingreso ingreso) {
        getSession().saveOrUpdate(ingreso);
    }

    @Override
    public void delete(Long id) {
        Ingreso ingreso = new Ingreso();
        ingreso.setId(id);
        getSession().delete(ingreso);
    }

}
