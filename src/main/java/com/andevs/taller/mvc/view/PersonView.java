/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andevs.taller.mvc.view;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author AndresG
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PersonView extends javax.swing.JFrame {

    /**
     * Creates new form PersonView
     */
    public PersonView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPerson = new org.edisoncor.gui.panel.PanelImage();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldDocNumber = new javax.swing.JTextField();
        fieldName = new javax.swing.JTextField();
        fieldWeigth = new javax.swing.JTextField();
        fieldHeight = new javax.swing.JTextField();
        save = new org.edisoncor.gui.button.ButtonIpod();
        update = new org.edisoncor.gui.button.ButtonIpod();
        delete = new org.edisoncor.gui.button.ButtonIpod();
        read = new org.edisoncor.gui.button.ButtonIpod();
        exit = new org.edisoncor.gui.button.ButtonIpod();
        readAll = new org.edisoncor.gui.button.ButtonIpod();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Identificacion :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Altura :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Peso :");

        fieldDocNumber.setBackground(new java.awt.Color(0, 0, 188));
        fieldDocNumber.setForeground(new java.awt.Color(255, 255, 255));
        fieldDocNumber.setCaretColor(new java.awt.Color(255, 255, 255));

        fieldName.setBackground(new java.awt.Color(0, 0, 188));
        fieldName.setForeground(new java.awt.Color(255, 255, 255));
        fieldName.setCaretColor(new java.awt.Color(255, 255, 255));

        fieldWeigth.setBackground(new java.awt.Color(0, 0, 188));
        fieldWeigth.setForeground(new java.awt.Color(255, 255, 255));
        fieldWeigth.setCaretColor(new java.awt.Color(255, 255, 255));

        fieldHeight.setBackground(new java.awt.Color(0, 0, 188));
        fieldHeight.setForeground(new java.awt.Color(255, 255, 255));
        fieldHeight.setCaretColor(new java.awt.Color(255, 255, 255));

        save.setText("Grabar");
        save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        update.setText("Actualizar");
        update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        delete.setText("Eliminar");
        delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        read.setText("Consultar");
        read.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        exit.setText("Salir");
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        readAll.setText("Listar");
        readAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        readAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPersonLayout = new javax.swing.GroupLayout(panelPerson);
        panelPerson.setLayout(panelPersonLayout);
        panelPersonLayout.setHorizontalGroup(
            panelPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPersonLayout.createSequentialGroup()
                        .addGroup(panelPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(47, 47, 47)
                        .addGroup(panelPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fieldWeigth, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldHeight, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPersonLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldDocNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPersonLayout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(read, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(readAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelPersonLayout.setVerticalGroup(
            panelPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(readAll, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(panelPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldDocNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fieldWeigth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(read, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void readAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_readAllActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod delete;
    private org.edisoncor.gui.button.ButtonIpod exit;
    private javax.swing.JTextField fieldDocNumber;
    private javax.swing.JTextField fieldHeight;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldWeigth;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private org.edisoncor.gui.panel.PanelImage panelPerson;
    private org.edisoncor.gui.button.ButtonIpod read;
    private org.edisoncor.gui.button.ButtonIpod readAll;
    private org.edisoncor.gui.button.ButtonIpod save;
    private org.edisoncor.gui.button.ButtonIpod update;
    // End of variables declaration//GEN-END:variables
}