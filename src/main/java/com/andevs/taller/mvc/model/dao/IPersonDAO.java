package com.andevs.taller.mvc.model.dao;

import java.util.Map;

public interface IPersonDAO {
    Boolean login(String user, String password);

    Boolean save(Map<String, Object> params);

    Boolean update(Map<String, Object> params);

    void deleteById(Integer idPerson);
}
