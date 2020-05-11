package com.andevs.taller.mvc.model.repository;

import com.andevs.taller.mvc.model.connection.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("login_id");
            String name = resultSet.getString("_user");
            if (id > 0) {
                System.out.println("registered user : ".concat(name));
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
