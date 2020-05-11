package com.andevs.taller.mvc.model.repository;

import com.andevs.taller.mvc.model.connection.ConnectionDB;
import com.andevs.taller.mvc.model.entities.PersonEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class PersonRepository implements IPersonRepository {

    private Connection connection;
    private PreparedStatement statement;
    String query;

    public PersonRepository() {
        this.connection = ConnectionDB.getConnection();
    }

    public Boolean save(PersonEntity person) throws SQLException {
        query = "insert into person (id_person, document_number, name, weight,"
                + "height, created_on,last_modified)" + "values "
                + "(default,?,?,?,?,?,?)";

        statement = connection.prepareStatement(query);
        statement.setLong(2, person.getDocument_number());
        statement.setString(3, person.getName());
        statement.setDouble(4, person.getWeight());
        statement.setDouble(5, person.getHeight());
        statement.setTimestamp(6, new Timestamp(new Date().getTime()));
        statement.setTimestamp(7, new Timestamp(new Date().getTime()));

        int result = statement.executeUpdate();
        if (result != 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean update(PersonEntity person) throws SQLException {
        query = "update public.person set document_number = ?,set name = ?,set "
                + "weight = ?,set height = ?," + "set last_modified = ? where "
                + "id_person = ?";

        statement = connection.prepareStatement(query);
        statement.setLong(2, person.getDocument_number());
        statement.setString(3, person.getName());
        statement.setDouble(4, person.getWeight());
        statement.setDouble(5, person.getHeight());
        statement.setTimestamp(6, new Timestamp(new Date().getTime()));
        statement.setInt(7, person.getId_person());

        int result = statement.executeUpdate();
        if (result != 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void findById(Integer idPerson) throws SQLException {
        query = "select * from public.person where id_person = ?";
        statement = connection.prepareStatement(query);
        statement.setInt(1, idPerson);
        statement.executeQuery();
    }

    public void deleteById(Integer idPerson) throws SQLException {
        query = "delete from public.person where id_person = ?";
        statement = connection.prepareStatement(query);
        statement.setInt(1, idPerson);
        statement.executeQuery();
    }

    public void findAll() throws SQLException {
        query = "select * from public.person";
        statement = connection.prepareStatement(query);
        statement.executeQuery();
    }

}
