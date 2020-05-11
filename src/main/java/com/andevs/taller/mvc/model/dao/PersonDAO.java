package com.andevs.taller.mvc.model.dao;

import com.andevs.taller.mvc.model.entities.PersonEntity;
import com.andevs.taller.mvc.model.repository.ILoginRepository;
import com.andevs.taller.mvc.model.repository.IPersonRepository;
import com.andevs.taller.mvc.model.repository.LoginRepository;
import com.andevs.taller.mvc.model.repository.PersonRepository;

import java.util.Map;

public class PersonDAO implements IPersonDAO {
    private final IPersonRepository personRepository;
    private final ILoginRepository loginRepository;

    public PersonDAO() {
        this.personRepository = new PersonRepository();
        this.loginRepository = new LoginRepository();
    }

    public Boolean login(String user, String password) {
        try {
            return loginRepository.login(user, password);
        } catch (Exception e) {
            System.out.println("Error in login " + e.getMessage());
            return Boolean.FALSE;
        }
    }

    public Boolean save(Map<String, Object> params) {
        try {
            Long document_number = (Long) params.get("document_number");
            String name = params.get("name").toString();
            Double weight = (Double) params.get("weight");
            Double height = (Double) params.get("height");
            return personRepository.save(PersonEntity.builder()
                    .document_number(document_number)
                    .name(name)
                    .weight(weight)
                    .height(height)
                    .build());
        } catch (Exception e) {
            System.out.println("Error in save " + e.getMessage());
            return Boolean.FALSE;
        }
    }

    public Boolean update(Map<String, Object> params) {
        try {
            Integer id_person = (Integer) params.get("id_person");
            Long document_number = (Long) params.get("document_number");
            String name = params.get("name").toString();
            Double weight = (Double) params.get("weight");
            Double height = (Double) params.get("height");
            return personRepository.update(PersonEntity.builder()
                    .id_person(id_person)
                    .document_number(document_number)
                    .name(name)
                    .weight(weight)
                    .height(height)
                    .build());
        } catch (Exception e) {
            System.out.println("Error in update " + e.getMessage());
            return Boolean.FALSE;
        }
    }

    public void deleteById(Integer idPerson) {
        try {
            personRepository.deleteById(idPerson);
        } catch (Exception e) {
            System.out.println("Error in delete " + e.getMessage());
        }
    }
}
