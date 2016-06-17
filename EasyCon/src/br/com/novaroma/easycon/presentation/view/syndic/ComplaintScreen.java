package br.com.novaroma.easycon.presentation.view.syndic;

import br.com.novaroma.easycon.controller.ControllerAdm;
import br.com.novaroma.easycon.controller.IControllerAdm;
import br.com.novaroma.easycon.entities.Complaint;
import br.com.novaroma.easycon.structures.Hash;
import br.com.novaroma.easycon.structures.Link;
import br.com.novaroma.easycon.structures.Structures;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ComplaintScreen extends javax.swing.JInternalFrame {

    private IControllerAdm conAdm = new ControllerAdm();

    public ComplaintScreen() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableComplaint = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextMessage = new javax.swing.JTextArea();
        jButtonExit = new javax.swing.JButton();
        jButtonConfirm = new javax.swing.JButton();
        jTextTitle = new javax.swing.JTextField();
        jButtonView = new javax.swing.JButton();
        jRButton1 = new javax.swing.JRadioButton();
        jRButton2 = new javax.swing.JRadioButton();
        jRButton3 = new javax.swing.JRadioButton();

        jScrollPane3.setViewportView(jEditorPane1);

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Urgente", "Intermediario", "Trivial" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jTableComplaint.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Morador", "Data", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableComplaint);

        jTextMessage.setEditable(false);
        jTextMessage.setColumns(20);
        jTextMessage.setRows(5);
        jScrollPane2.setViewportView(jTextMessage);

        jButtonExit.setText("Sair");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jButtonExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonExitKeyPressed(evt);
            }
        });

        jButtonConfirm.setText("Confirmar");
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });
        jButtonConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonConfirmKeyPressed(evt);
            }
        });

        jTextTitle.setEditable(false);

        jButtonView.setText("Visualizar reclamacao");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRButton1);
        jRButton1.setText("Resolvido");

        buttonGroup2.add(jRButton2);
        jRButton2.setText("Em andamento");

        buttonGroup2.add(jRButton3);
        jRButton3.setText("Planejamento futuro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonView)
                            .addComponent(jButtonConfirm)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextTitle)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                            .addComponent(jRButton1)
                            .addComponent(jRButton2)
                            .addComponent(jRButton3))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonView)
                    .addComponent(jRButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirm)
                    .addComponent(jButtonExit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        exit();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonExitKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            exit();
        }
    }//GEN-LAST:event_jButtonExitKeyPressed

    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        toSolve();
        ((DefaultTableModel) jTableComplaint.getModel()).setNumRows(0);
        complaintList(Structures.getHash());
    }//GEN-LAST:event_jButtonConfirmActionPerformed

    private void jButtonConfirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonConfirmKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            toSolve();
        }
    }//GEN-LAST:event_jButtonConfirmKeyPressed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
        openComplaint();
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        ((DefaultTableModel) jTableComplaint.getModel()).setNumRows(0);
        complaintList(Structures.getHash());


    }//GEN-LAST:event_jComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JRadioButton jRButton1;
    private javax.swing.JRadioButton jRButton2;
    private javax.swing.JRadioButton jRButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableComplaint;
    private javax.swing.JTextArea jTextMessage;
    private javax.swing.JTextField jTextTitle;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        this.dispose();
    }

    private void complaintList(Hash hash) {

        String category = jComboBox.getSelectedItem().toString();

        for (int i = 0; i < hash.getHash().length; i++) {
            Link temp = hash.getHashOnIndex(i).getFirst();

            while (temp != null) {
                Complaint complaintX = (Complaint) temp.getEntity();

                if (complaintX.getCategory().equals(category) && !complaintX.getStatus().equals("Resolvido")) {

                    DefaultTableModel complaintList = (DefaultTableModel) jTableComplaint.getModel();
                    String date[] = complaintX.getDate().toString().split(" ");

                    complaintList.addRow(new String[]{complaintX.getId(), complaintX.getTitle(), complaintX.getResident().getName(), date[2] + "/" + date[1] + "/" + date[5], complaintX.getStatus()});
                }

                temp = temp.getNext();
            }
        }
    }

    private void openComplaint() {

        try {
            String id = jTableComplaint.getValueAt(jTableComplaint.getSelectedRow(), 0).toString();
            Complaint complaintX = (Complaint) conAdm.returnEntityHash(id, Structures.getHash());

            jTextTitle.setText(complaintX.getTitle());
            jTextMessage.setText(complaintX.getText());
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Para visualizar uma reclamação, deve-se primeiro selecionar uma das reclamações exibidas na tabela.");
        }
    }

    private void toSolve() {
        try {
            String id = jTableComplaint.getValueAt(jTableComplaint.getSelectedRow(), 0).toString();
            Complaint complaintX = (Complaint) conAdm.returnEntityHash(id, Structures.getHash());

            if (jRButton1.isSelected()) {
                complaintX.setStatus("Resolvido");
            } else if (jRButton2.isSelected()) {
                complaintX.setStatus("Em andamento");
            } else if (jRButton3.isSelected()) {
                complaintX.setStatus("Planejamento futuro");
            }

            JOptionPane.showMessageDialog(null, "Reclamacao atualizada com sucesso!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Para visualizar uma reclamação, deve-se primeiro selecionar uma das reclamações exibidas na tabela.");
        }
    }

}
