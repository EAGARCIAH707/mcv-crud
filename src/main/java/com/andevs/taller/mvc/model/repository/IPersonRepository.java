package com.andevs.taller.mvc.model.repository;

import com.andevs.taller.mvc.model.entities.PersonEntity;

import java.sql.SQLException;

public interface IPersonRepository {
    Boolean save(PersonEntity person) throws SQLException;

    Boolean update(PersonEntity person) throws SQLException;

    public void findById(Integer idPerson) throws SQLException;

    public void deleteById(Integer idPerson) throws SQLException;

    public void findAll() throws SQLException;
}
