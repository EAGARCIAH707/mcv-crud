package com.andevs.taller.mvc.model.repository;

import com.andevs.taller.mvc.model.entities.PersonEntity;

import java.sql.SQLException;
import java.util.List;

public interface IPersonRepository {
    Boolean save(PersonEntity person) throws SQLException;

    Boolean update(PersonEntity person) throws SQLException;

    PersonEntity findByDocumentNumber(Integer idPerson) throws SQLException;

    void deleteById(Integer idPerson) throws SQLException;

    List<PersonEntity> findAll() throws SQLException;
}
