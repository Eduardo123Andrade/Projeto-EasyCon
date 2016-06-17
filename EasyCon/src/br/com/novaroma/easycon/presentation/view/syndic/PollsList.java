package br.com.novaroma.easycon.presentation.view.syndic;

import br.com.novaroma.easycon.controller.ControllerAdm;
import br.com.novaroma.easycon.controller.IControllerAdm;
import br.com.novaroma.easycon.entities.Survey;
import br.com.novaroma.easycon.structures.Link;
import br.com.novaroma.easycon.structures.Structures;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PollsList extends javax.swing.JInternalFrame {

    private IControllerAdm conAdm = new ControllerAdm();

    public PollsList() {
        initComponents();
        surveyList(Structures.getList().getFirst());
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePolls = new javax.swing.JTable();
        jButtonExit = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jLabelQuestion = new javax.swing.JLabel();
        jTextAlternative1 = new javax.swing.JLabel();
        jTextAlternative2 = new javax.swing.JLabel();
        jTextAlternative3 = new javax.swing.JLabel();
        jTextAlternative4 = new javax.swing.JLabel();
        jTextAlternative5 = new javax.swing.JLabel();
        jLabelStats1 = new javax.swing.JLabel();
        jLabelStatistics = new javax.swing.JLabel();
        jLabelStats2 = new javax.swing.JLabel();
        jLabelStats3 = new javax.swing.JLabel();
        jLabelStats4 = new javax.swing.JLabel();
        jLabelStats5 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setTitle("Lista de enquetes");

        jTablePolls.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Pergunta", "Data", "Votos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePolls);

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

        jButtonView.setText("Visualizar resultados");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jLabelQuestion.setText("Pergunta:  ");

        jTextAlternative1.setText("a) ");

        jTextAlternative2.setText("b) ");

        jTextAlternative3.setText("c) ");

        jTextAlternative4.setText("d) ");

        jTextAlternative5.setText("e) ");

        jLabelStats1.setText(".");

        jLabelStatistics.setText("Estatisticas");

        jLabelStats2.setText(".");

        jLabelStats3.setText(".");

        jLabelStats4.setText(".");

        jLabelStats5.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExit))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextAlternative4)
                            .addComponent(jTextAlternative3)
                            .addComponent(jTextAlternative5)
                            .addComponent(jLabelQuestion)
                            .addComponent(jTextAlternative2)
                            .addComponent(jTextAlternative1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelStatistics)
                                .addGap(134, 134, 134))
                            .addComponent(jLabelStats1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelStats2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelStats3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelStats4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelStats5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuestion)
                    .addComponent(jLabelStatistics))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAlternative1)
                    .addComponent(jLabelStats1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAlternative2)
                    .addComponent(jLabelStats2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAlternative3)
                    .addComponent(jLabelStats3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAlternative4)
                    .addComponent(jLabelStats4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAlternative5)
                    .addComponent(jLabelStats5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExit)
                    .addComponent(jButtonView))
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

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        openSurvey();
    }//GEN-LAST:event_jButtonViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JLabel jLabelStatistics;
    private javax.swing.JLabel jLabelStats1;
    private javax.swing.JLabel jLabelStats2;
    private javax.swing.JLabel jLabelStats3;
    private javax.swing.JLabel jLabelStats4;
    private javax.swing.JLabel jLabelStats5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePolls;
    private javax.swing.JLabel jTextAlternative1;
    private javax.swing.JLabel jTextAlternative2;
    private javax.swing.JLabel jTextAlternative3;
    private javax.swing.JLabel jTextAlternative4;
    private javax.swing.JLabel jTextAlternative5;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        this.dispose();
    }

    private void surveyList(Link temp) {

        while (temp != null) {

            Survey surveyTemp = (Survey) temp.getEntity();
            DefaultTableModel surveyList = (DefaultTableModel) jTablePolls.getModel();
            String[] date = surveyTemp.getDate().toString().split(" ");

            surveyList.addRow(new String[]{surveyTemp.getId(), surveyTemp.getQuestion(), date[2] + "/" + date[1] + "/" + date[5], String.valueOf(surveyTemp.getTotal())});

            temp = temp.getNext();
        }
    }

    private void openSurvey() {

        try {
            String id = jTablePolls.getValueAt(jTablePolls.getSelectedRow(), 0).toString();
            Survey surveyX = (Survey) conAdm.returnEntityList(id, Structures.getList());

            double[] percents = surveyX.returnPercent();

            jLabelQuestion.setText("Pergunta: " + surveyX.getQuestion());
            jTextAlternative1.setText("a) " + surveyX.getAlternative(0));
            jTextAlternative2.setText("b) " + surveyX.getAlternative(1));
            jTextAlternative3.setText("c) " + surveyX.getAlternative(2));
            jTextAlternative4.setText("d) " + surveyX.getAlternative(3));
            jTextAlternative5.setText("e) " + surveyX.getAlternative(4));

            jLabelStats1.setText(percents[0] + "%   (" + surveyX.getAlternativeScore(0) + " votos)");
            jLabelStats2.setText(percents[1] + "%   (" + surveyX.getAlternativeScore(1) + " votos)");
            jLabelStats3.setText(percents[2] + "%   (" + surveyX.getAlternativeScore(2) + " votos)");
            jLabelStats4.setText(percents[3] + "%   (" + surveyX.getAlternativeScore(3) + " votos)");
            jLabelStats5.setText(percents[4] + "%   (" + surveyX.getAlternativeScore(4) + " votos)");
            
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Para visualizar uma enquete, deve-se primeiro selecionar uma das enquetes exibidas na tabela.");
        }
    }
}
