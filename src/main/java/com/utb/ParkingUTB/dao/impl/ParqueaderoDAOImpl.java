/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.ParkingUTB.dao.impl;

import com.utb.ParkingUTB.dao.ParqueaderoDAO;
import com.utb.ParkingUTB.entity.Parqueadero;
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
public class ParqueaderoDAOImpl implements ParqueaderoDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Parqueadero> getAllParqueadero() {
        Criteria crit = getSession().createCriteria(Parqueadero.class);
        return crit.list();
    }

    @Override
    public Parqueadero getById(Long id) {
        return (Parqueadero) getSession()
                .createCriteria(Parqueadero.class)
                .add(Restrictions.idEq(id))
                .uniqueResult();
    }

    @Override
    public void save(Parqueadero parqueadero) {
        getSession().save(parqueadero);
    }

    @Override
    public void update(Parqueadero parqueadero) {
        getSession().update(parqueadero);
    }

    @Override
    public void saveOrUpdate(Parqueadero parqueadero) {
        getSession().saveOrUpdate(parqueadero);
    }

    @Override
    public void delete(Long id) {

        Parqueadero parqueadero = new Parqueadero();
        parqueadero.setId(id);
        getSession().delete(parqueadero);
    }

}
