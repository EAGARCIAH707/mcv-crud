package com.andevs.taller.mvc.main;

import com.andevs.taller.mvc.controller.PersonController;
import com.andevs.taller.mvc.view.LoginView;

public class MainApplication {
    public static void main(String[] args) {
        LoginView personView = new LoginView();
        PersonController personController = new PersonController(personView);
        personView.addController(personController);
        personView.setVisible(true);
        personView.setLocationRelativeTo(null);
    }
}