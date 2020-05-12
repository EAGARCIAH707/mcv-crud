package com.andevs.taller.mvc.model.repository;

import com.andevs.taller.mvc.model.connection.ConnectionDB;
import com.andevs.taller.mvc.model.entities.PersonEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        statement.setLong(1, person.getDocument_number());
        statement.setString(2, person.getName());
        statement.setDouble(3, person.getWeight());
        statement.setDouble(4, person.getHeight());
        statement.setTimestamp(5, new Timestamp(new Date().getTime()));
        statement.setTimestamp(6, new Timestamp(new Date().getTime()));

        int result = statement.executeUpdate();
        if (result != 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean update(PersonEntity person) throws SQLException {
        query = "update public.person set document_number = ?, name = ?, "
                + "weight = ?, height = ?," + " last_modified = ?" + " where "
                + "id_person = ?";

        statement = connection.prepareStatement(query);
        statement.setLong(1, person.getDocument_number());
        statement.setString(2, person.getName());
        statement.setDouble(3, person.getWeight());
        statement.setDouble(4, person.getHeight());
        statement.setTimestamp(5, new Timestamp(new Date().getTime()));
        statement.setInt(6, person.getId_person());
        System.out.println(statement.toString());

        int result = statement.executeUpdate();
        if (result != 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public PersonEntity findByDocumentNumber(Integer idPerson) throws SQLException {
        query = "select * from public.person where document_number = ?";
        statement = connection.prepareStatement(query);
        statement.setInt(1, idPerson);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id_person");
            if (id > 0) {
                return PersonEntity.builder()
                        .id_person(id)
                        .document_number(resultSet.getLong("document_number"))
                        .name(resultSet.getString("name"))
                        .weight(resultSet.getDouble("weight"))
                        .height(resultSet.getDouble("height"))
                        .created_on(resultSet.getTimestamp("created_on"))
                        .last_modified(resultSet.getTimestamp("last_modified"))
                        .id_person(id)
                        .build();
            }
        }
        return PersonEntity.builder().build();
    }

    public void deleteById(Integer idPerson) throws SQLException {
        query = "delete from public.person where id_person = ?";
        statement = connection.prepareStatement(query);
        statement.setInt(1, idPerson);
        statement.execute();
    }

    public List<PersonEntity> findAll() throws SQLException {
        query = "select * from public.person";
        statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        List<PersonEntity> personList = new ArrayList<PersonEntity>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id_person");
            if (id > 0) {
                personList.add(PersonEntity.builder()
                        .id_person(id)
                        .document_number(resultSet.getLong("document_number"))
                        .name(resultSet.getString("name"))
                        .weight(resultSet.getDouble("weight"))
                        .height(resultSet.getDouble("height"))
                        .created_on(resultSet.getTimestamp("created_on"))
                        .last_modified(resultSet.getTimestamp("last_modified"))
                        .id_person(id)
                        .build());
                ;
            }
        }
        return personList;
    }

}
