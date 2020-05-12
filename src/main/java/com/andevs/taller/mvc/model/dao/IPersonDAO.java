package com.andevs.taller.mvc.model.dao;

import com.andevs.taller.mvc.model.entities.PersonEntity;

import java.util.List;
import java.util.Map;

public interface IPersonDAO {
    Boolean login(String user, String password);

    Boolean save(Map<String, String> params);

    Boolean update(Map<String, String> params);

    Boolean deleteById(Integer idPerson);

    PersonEntity findByDocumentNumber(Integer idPerson);

    List<PersonEntity> findAll();
}
