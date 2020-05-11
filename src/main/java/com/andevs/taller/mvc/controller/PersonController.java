package com.andevs.taller.mvc.controller;

import com.andevs.taller.mvc.model.dao.IPersonDAO;
import com.andevs.taller.mvc.model.dao.PersonDAO;
import com.andevs.taller.mvc.view.LoginView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonController implements ActionListener {
    private final LoginView personView;
    private IPersonDAO personDAO;

    public PersonController(LoginView personView) {
        this.personView = personView;
        this.personDAO = new PersonDAO();
    }

    private void login() {
        String user = personView.getFieldUser().getText().trim();
        String pass = personView.getFieldPass().getText().trim();
        Boolean result = personDAO.login(user, pass);
        if (!result) {
            JOptionPane.showMessageDialog(null, "Datos Invalidos",
                    "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == personView.getLogin()) {
                login();
            }
        } catch (Exception ex) {
            System.out.println("Error in controller " + ex.getMessage());
        }

    }
}
