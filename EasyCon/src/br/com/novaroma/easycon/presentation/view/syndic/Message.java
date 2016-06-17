package br.com.novaroma.easycon.presentation.view.syndic;

import br.com.novaroma.easycon.controller.ControllerAdm;
import br.com.novaroma.easycon.controller.IControllerAdm;
import br.com.novaroma.easycon.entities.Resident;
import br.com.novaroma.easycon.structures.AvlLink;
import br.com.novaroma.easycon.structures.Structures;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Message extends javax.swing.JInternalFrame {

    private IControllerAdm conAdm = new ControllerAdm();

    public Message() {
        initComponents();
        residentList(Structures.getTree().getRoot());
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMessages = new javax.swing.JTable();
        jTextTitle = new javax.swing.JTextField();
        jButtonSend = new javax.swing.JButton();
        jButtonSendToAll = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextMessage = new javax.swing.JTextArea();
        jButtonExit = new javax.swing.JButton();

        setTitle("Mensgem");

        jTableMessages.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", " Morador"
            }
        ));
        jScrollPane1.setViewportView(jTableMessages);

        jButtonSend.setText("Enviar");
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });

        jButtonSendToAll.setText("Eviar para todos");
        jButtonSendToAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendToAllActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 567, Short.MAX_VALUE)
                        .addComponent(jButtonExit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonSend)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSendToAll)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSendToAll)
                            .addComponent(jButtonSend)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButtonExit)
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

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
        send();
    }//GEN-LAST:event_jButtonSendActionPerformed

    private void jButtonSendToAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendToAllActionPerformed
        sendToAll();
    }//GEN-LAST:event_jButtonSendToAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JButton jButtonSendToAll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMessages;
    private javax.swing.JTextArea jTextMessage;
    private javax.swing.JTextField jTextTitle;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        this.dispose();
    }

    private void residentList(AvlLink temp) {

        if (temp != null) {
            residentList(temp.getLeft());

            Resident residentTemp = (Resident) temp.getEntity();
            DefaultTableModel residentList = (DefaultTableModel) jTableMessages.getModel();

            residentList.addRow(new String[]{residentTemp.getCpf(), residentTemp.getName()});

            residentList(temp.getRight());
        }
    }

    public void send() {
        try {
            if (jTableMessages.getRowCount() > 0) {
                String cpf = jTableMessages.getValueAt(jTableMessages.getSelectedRow(), 0).toString();
                String title = jTextTitle.getText();
                String text = jTextMessage.getText();

                conAdm.sendMessage(cpf, title, text);
                setNull();
                JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não há moradores cadastrados no sistema.");
            }
            
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Para enviar uma mensagem, deve-se primeiro selecionar um morador na tabela exibida na tela.");
        }
    }

    private void sendToAll() {
       
        if(jTableMessages.getRowCount() > 0) {
            String title = jTextTitle.getText();
            String text = jTextMessage.getText();

            conAdm.sendMessageToAll(Structures.getTree().getRoot(), title, text);
            setNull();
            JOptionPane.showMessageDialog(null, "Mensagem enviada para todos os usuarios com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não há moradores cadastrados no sistema.");
        }
    }

    private void setNull() {
        jTextMessage.setText(null);
        jTextTitle.setText(null);
    }
}
