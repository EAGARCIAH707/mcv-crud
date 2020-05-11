package com.andevs.taller.mvc.model.repository;

import java.sql.SQLException;

public interface ILoginRepository {
    Boolean login(String user, String password) throws SQLException;
}
