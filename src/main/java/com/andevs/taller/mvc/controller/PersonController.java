package com.andevs.taller.mvc.controller;

import com.andevs.taller.mvc.model.dao.IPersonDAO;
import com.andevs.taller.mvc.model.dao.PersonDAO;
import com.andevs.taller.mvc.model.entities.PersonEntity;
import com.andevs.taller.mvc.view.PersonView;
import com.andevs.taller.mvc.view.TablePersonView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class PersonController implements ActionListener {
    private final PersonView personView;
    private IPersonDAO personDAO;

    public PersonController(PersonView personView) {
        this.personDAO = new PersonDAO();
        this.personView = personView;
    }

    private Map<String, String> getFormValues() {
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("id_person", personView.getFieldIdPerson().getText().trim());
        parameters.put("document_number", personView.getFieldDocNumber().getText().trim());
        parameters.put("weight", personView.getFieldWeigth().getText().trim());
        parameters.put("height", personView.getFieldHeight().getText().trim());
        parameters.put("name", personView.getFieldName().getText().trim());
        return parameters;
    }

    private void create() {
        Map<String, String> parameters = getFormValues();
        Boolean result = personDAO.save(parameters);
        if (!result) {
            JOptionPane.showMessageDialog(null, "No fue posible grabar",
                    "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Registro creado con éxito");
        }
    }

    private void update() {
        Map<String, String> parameters = getFormValues();
        Boolean result = personDAO.update(parameters);
        if (!result) {
            JOptionPane.showMessageDialog(null, "No fue posible actualizar",
                    "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Registro actualizado con éxito");
        }
    }

    private void delete() {
        Integer id = Integer.parseInt(personView.getFieldIdPerson().getText().trim());
        Boolean result = personDAO.deleteById(id);
        if (!result) {
            JOptionPane.showMessageDialog(null, "No fue posible eliminar",
                    "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Soliciud procesada");
        }
    }

    private void read() {
        Integer id = Integer.parseInt(personView.getFieldDocNumber().getText().trim());
        PersonEntity result = personDAO.findByDocumentNumber(id);
        if (result.getId_person() == null) {
            JOptionPane.showMessageDialog(null, "No fue posible consultar",
                    "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            formWrite(result);
        }
    }

    public void formWrite(PersonEntity person) {
        if (person.getId_person() != null) {
            personView.getFieldIdPerson().setText(person.getId_person().toString());
        }
        personView.getFieldDocNumber().setText(person.getDocument_number().toString());
        personView.getFieldName().setText(person.getName());
        personView.getFieldHeight().setText(person.getHeight().toString());
        personView.getFieldWeigth().setText(person.getWeight().toString());
        personView.getLblLastModified().setText(person.getLast_modified().toString());
        personView.getLblCreatedOn().setText(person.getCreated_on().toString());
    }

    public void findAll() {
        TablePersonView tablePersonView = new TablePersonView();
        TablePersonController tablePersonController = new TablePersonController(tablePersonView);
        tablePersonView.addController(tablePersonController);
        tablePersonView.setVisible(true);
        tablePersonView.setLocationRelativeTo(null);
    }

    public void clean() {
        personView.getFieldIdPerson().setText("");
        personView.getFieldDocNumber().setText("");
        personView.getFieldName().setText("");
        personView.getFieldHeight().setText("");
        personView.getFieldWeigth().setText("");
        personView.getLblLastModified().setText("");
        personView.getLblCreatedOn().setText("");
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource().toString());
        try {
            if (e.getSource() == personView.getCreate()) {
                create();
            }
            if (e.getSource() == personView.getUpdate()) {
                update();
            }
            if (e.getSource() == personView.getDelete()) {
                delete();
            }
            if (e.getSource() == personView.getRead()) {
                read();
            }
            if (e.getSource() == personView.getClean()) {
                clean();
            }
            if (e.getSource() == personView.getReadAll()) {
                findAll();
            }
            if (e.getSource() == personView.getExit()) {
                personView.dispose();
            }
            if (e.getSource() == personView.getAbout()) {
                JOptionPane.showMessageDialog(null, "Mvc Crud\n" + "" +
                        "Creado por Edisson Garcia");
            }


        } catch (Exception ex) {
            System.out.println("Error in controller " + ex.getMessage());
        }
    }
}
