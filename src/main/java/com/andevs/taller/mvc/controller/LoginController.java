package com.andevs.taller.mvc.controller;

import com.andevs.taller.mvc.model.dao.IPersonDAO;
import com.andevs.taller.mvc.model.dao.PersonDAO;
import com.andevs.taller.mvc.view.LoginView;
import com.andevs.taller.mvc.view.PersonView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener {
    private final LoginView loginView;
    private IPersonDAO personDAO;

    public LoginController(LoginView personView) {
        this.loginView = personView;
        this.personDAO = new PersonDAO();
    }

    private void login() {
        String user = loginView.getFieldUser().getText().trim();
        String pass = loginView.getFieldPass().getText().trim();
        Boolean result = personDAO.login(user, pass);
        if (!result) {
            JOptionPane.showMessageDialog(null, "Datos Invalidos",
                    "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            PersonView personView = new PersonView();
            PersonController personController = new PersonController(personView);
            loginView.dispose();
            personView.addController(personController);
            personView.setVisible(true);
            personView.setLocationRelativeTo(null);
        }
    }

    public void showPass() {
        if (loginView.getShowPass().isSelected()) {
            loginView.getFieldPass().setEchoChar((char) 0);

        } else {
            loginView.getFieldPass().setEchoChar('*');
        }
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == loginView.getLogin()) {
                login();
            }
            if (e.getSource() == loginView.getShowPass()) {
                showPass();
            }
        } catch (Exception ex) {
            System.out.println("Error in controller " + ex.getMessage());
        }

    }
}
