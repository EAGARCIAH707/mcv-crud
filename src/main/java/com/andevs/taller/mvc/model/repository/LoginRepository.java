package com.andevs.taller.mvc.model.repository;

import com.andevs.taller.mvc.model.connection.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginRepository implements ILoginRepository {

    private Connection connection;
    private PreparedStatement statement;
    String query;

    public LoginRepository() {
        this.connection = ConnectionDB.getConnection();
    }

    public Boolean login(String user, String password) throws SQLException {
        query = "select * from public.login where _user = ? and  password = ?";
        statement = connection.prepareStatement(query);
        statement.setString(1, user);
        statement.setString(2, password);
        statement.executeQuery();
        int result = statement.executeUpdate();
        if (result != 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
