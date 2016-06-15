package br.com.novaroma.easycon.presentation.view.resident;

import br.com.novaroma.easycon.controller.ControllerResident;
import br.com.novaroma.easycon.controller.IControllerResident;
import br.com.novaroma.easycon.entities.Survey;
import br.com.novaroma.easycon.structures.Link;
import br.com.novaroma.easycon.structures.Structures;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VoteSurvey extends javax.swing.JInternalFrame {

    IControllerResident conRes = new ControllerResident();

    public VoteSurvey() {
        initComponents();
        surveyList(Structures.getList().getFirst());
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Abrir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Votar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pergunta: ");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("a)");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("b)");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("c)");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("d)");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("e)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton5)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 477, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(28, 28, 28)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        openSurvey();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        vote();
        ((DefaultTableModel) jTable1.getModel()).setNumRows(0);
        surveyList(Structures.getList().getFirst());
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void surveyList(Link temp) {

        while (temp != null) {

            Survey surveyTemp = (Survey) temp.getEntity();

            if (conRes.verifyVote(surveyTemp, Structures.getListVotes())) {
                DefaultTableModel surveyList = (DefaultTableModel) jTable1.getModel();
                String[] date = surveyTemp.getDate().toString().split(" ");

                surveyList.addRow(new String[]{surveyTemp.getId(), surveyTemp.getQuestion(), date[2] + "/" + date[1] + "/" + date[5]});
            }

            temp = temp.getNext();
        }
    }

    private void openSurvey() {

        try {
            String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            Survey surveyX = (Survey) conRes.returnEntityList(id, Structures.getList());

            jLabel1.setText(jLabel1.getText() + surveyX.getQuestion());
            jRadioButton1.setText(jRadioButton1.getText() + surveyX.getAlternative(0));
            jRadioButton2.setText(jRadioButton2.getText() + surveyX.getAlternative(1));
            jRadioButton3.setText(jRadioButton3.getText() + surveyX.getAlternative(2));
            jRadioButton4.setText(jRadioButton4.getText() + surveyX.getAlternative(3));
            jRadioButton5.setText(jRadioButton5.getText() + surveyX.getAlternative(4));
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Para visualizar uma enquete, deve-se primeiro selecionar uma das enquetes exibidas na tabela.");
        }
    }

    private void vote() {

        try {
            String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            Survey surveyX = (Survey) conRes.returnEntityList(id, Structures.getList());
            int alternative = 0;

            if (jRadioButton1.isSelected()) {
                surveyX.setAlternativeScore(0);
            } else if (jRadioButton2.isSelected()) {
                surveyX.setAlternativeScore(1);
                alternative = 1;
            } else if (jRadioButton3.isSelected()) {
                surveyX.setAlternativeScore(2);
                alternative = 2;
            } else if (jRadioButton4.isSelected()) {
                surveyX.setAlternativeScore(3);
                alternative = 3;
            } else if (jRadioButton5.isSelected()) {
                surveyX.setAlternativeScore(4);
                alternative = 4;
            } else {
                //lanca excecao!
            }
            conRes.registerVote(alternative, surveyX);

            JOptionPane.showMessageDialog(null, "Voto computado com sucesso!");
            
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Para votar em uma enquete, deve-se primeiro selecionar uma das enquetes exibidas na tabela.");
        }
    }

    private void exit() {
        this.dispose();
    }
}
