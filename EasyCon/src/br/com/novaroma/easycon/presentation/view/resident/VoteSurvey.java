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
        jTablePolls = new javax.swing.JTable();
        jButtonView = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonVote = new javax.swing.JButton();
        jLabelQuestion = new javax.swing.JLabel();
        jRButton1 = new javax.swing.JRadioButton();
        jRButton2 = new javax.swing.JRadioButton();
        jRButton3 = new javax.swing.JRadioButton();
        jRButton4 = new javax.swing.JRadioButton();
        jRButton5 = new javax.swing.JRadioButton();

        jTablePolls.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablePolls);

        jButtonView.setText("Abrir");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jButtonExit.setText("Sair");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonVote.setText("Votar");
        jButtonVote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoteActionPerformed(evt);
            }
        });

        jLabelQuestion.setText("Pergunta: ");

        buttonGroup1.add(jRButton1);
        jRButton1.setText("a)");

        buttonGroup1.add(jRButton2);
        jRButton2.setText("b)");

        buttonGroup1.add(jRButton3);
        jRButton3.setText("c)");

        buttonGroup1.add(jRButton4);
        jRButton4.setText("d)");

        buttonGroup1.add(jRButton5);
        jRButton5.setText("e)");

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
                                    .addComponent(jRButton5)
                                    .addComponent(jRButton4)
                                    .addComponent(jRButton3)
                                    .addComponent(jRButton2)
                                    .addComponent(jRButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 477, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVote)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonExit))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelQuestion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonView)))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuestion)
                    .addComponent(jButtonView))
                .addGap(28, 28, 28)
                .addComponent(jRButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVote)
                    .addComponent(jButtonExit))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
        openSurvey();
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonVoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoteActionPerformed
        // TODO add your handling code here:
        vote();
        ((DefaultTableModel) jTablePolls.getModel()).setNumRows(0);
        surveyList(Structures.getList().getFirst());
    }//GEN-LAST:event_jButtonVoteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonView;
    private javax.swing.JButton jButtonVote;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JRadioButton jRButton1;
    private javax.swing.JRadioButton jRButton2;
    private javax.swing.JRadioButton jRButton3;
    private javax.swing.JRadioButton jRButton4;
    private javax.swing.JRadioButton jRButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePolls;
    // End of variables declaration//GEN-END:variables

    private void surveyList(Link temp) {

        while (temp != null) {

            Survey surveyTemp = (Survey) temp.getEntity();

            if (conRes.verifyVote(surveyTemp, Structures.getListVotes())) {
                DefaultTableModel surveyList = (DefaultTableModel) jTablePolls.getModel();
                String[] date = surveyTemp.getDate().toString().split(" ");

                surveyList.addRow(new String[]{surveyTemp.getId(), surveyTemp.getQuestion(), date[2] + "/" + date[1] + "/" + date[5]});
            }

            temp = temp.getNext();
        }
    }

    private void openSurvey() {

        try {
            String id = jTablePolls.getValueAt(jTablePolls.getSelectedRow(), 0).toString();
            Survey surveyX = (Survey) conRes.returnEntityList(id, Structures.getList());

            jLabelQuestion.setText("Pergunta: " + surveyX.getQuestion());
            jRButton1.setText("a) " + surveyX.getAlternative(0));
            jRButton2.setText("b) " + surveyX.getAlternative(1));
            jRButton3.setText("c) " + surveyX.getAlternative(2));
            jRButton4.setText("d) " + surveyX.getAlternative(3));
            jRButton5.setText("e) " + surveyX.getAlternative(4));
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Para visualizar uma enquete, deve-se primeiro selecionar uma das enquetes exibidas na tabela.");
        }
    }

    private void vote() {

        try {
            String id = jTablePolls.getValueAt(jTablePolls.getSelectedRow(), 0).toString();
            Survey surveyX = (Survey) conRes.returnEntityList(id, Structures.getList());
            int alternative = 0;

            if (jRButton1.isSelected()) {
                surveyX.setAlternativeScore(0);
            } else if (jRButton2.isSelected()) {
                surveyX.setAlternativeScore(1);
                alternative = 1;
            } else if (jRButton3.isSelected()) {
                surveyX.setAlternativeScore(2);
                alternative = 2;
            } else if (jRButton4.isSelected()) {
                surveyX.setAlternativeScore(3);
                alternative = 3;
            } else if (jRButton5.isSelected()) {
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
