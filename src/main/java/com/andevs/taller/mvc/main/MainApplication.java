package com.andevs.taller.mvc.main;

import com.andevs.taller.mvc.controller.PersonController;
import com.andevs.taller.mvc.view.PersonView;

public class MainApplication {
    public static void main(String[] args) {
        PersonView personView = new PersonView();
        PersonController personController = new PersonController(personView);
        personView.addController(personController);
        personView.setVisible(true);
        personView.setLocationRelativeTo(null);
    }
}