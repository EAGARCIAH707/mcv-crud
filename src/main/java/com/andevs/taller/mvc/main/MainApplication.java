package com.andevs.taller.mvc.main;

import com.andevs.taller.mvc.controller.LoginController;
import com.andevs.taller.mvc.view.LoginView;

public class MainApplication {
    public static void main(String[] args) {
        LoginView personView = new LoginView();
        LoginController personController = new LoginController(personView);
        personView.addController(personController);
        personView.setVisible(true);
        personView.setLocationRelativeTo(null);
    }
}