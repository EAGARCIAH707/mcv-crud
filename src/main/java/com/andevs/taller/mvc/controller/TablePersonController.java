package com.andevs.taller.mvc.controller;

import com.andevs.taller.mvc.model.dao.IPersonDAO;
import com.andevs.taller.mvc.model.dao.PersonDAO;
import com.andevs.taller.mvc.model.entities.PersonEntity;
import com.andevs.taller.mvc.view.TablePersonView;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TablePersonController implements ActionListener {
    private final TablePersonView tablePersonView;
    private IPersonDAO personDAO;

    public TablePersonController(TablePersonView tablePersonView) {
        this.tablePersonView = tablePersonView;
        this.personDAO = new PersonDAO();
        tableWrite();
    }

    public void tableWrite() {
        List<PersonEntity> list = personDAO.findAll();
        String header[] = {"Id", "Documento", "Nombre", "Peso", "Altura", "Creado", "Actualizado"};
        String[][] data = new String[list.size()][7];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getId_person().toString();
            data[i][1] = list.get(i).getDocument_number().toString();
            data[i][2] = list.get(i).getName();
            data[i][3] = list.get(i).getWeight().toString();
            data[i][4] = list.get(i).getHeight().toString();
            data[i][5] = list.get(i).getCreated_on().toString();
            data[i][6] = list.get(i).getLast_modified().toString();
        }
        tablePersonView.getTablePerson().setModel(new DefaultTableModel(data, header));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tablePersonView.getExit()) {
            tablePersonView.dispose();
        }
    }
}
