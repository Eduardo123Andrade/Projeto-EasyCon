package br.com.novaroma.easycon.presentation.view.syndic;

import br.com.novaroma.easycon.controller.ControllerAdm;
import br.com.novaroma.easycon.controller.IControllerAdm;
import br.com.novaroma.easycon.entities.Maneger;
import br.com.novaroma.easycon.structures.Structures;
import br.com.novaroma.easycon.entities.Message;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ExitBox extends javax.swing.JInternalFrame {
    
    private IControllerAdm conAdm = new ControllerAdm();
    
    public ExitBox() {
        initComponents();
        messageList();
        getContentPane().setBackground(Color.white);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMessages = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextMessage = new javax.swing.JTextArea();
        jButtonExit = new javax.swing.JButton();
        jTextTitle = new javax.swing.JTextField();
        jButtonView = new javax.swing.JButton();

        setTitle("Caixa de Saída");

        jTableMessages.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Assunto", "Morador", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMessages.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableMessagesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMessages);

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

        jTextTitle.setEditable(false);

        jButtonView.setText("Visualizar mensagem");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextTitle)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jButtonView, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExit)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonView))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jButtonExit))
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

    private void jTableMessagesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableMessagesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            openMenssege();
        }
    }//GEN-LAST:event_jTableMessagesKeyPressed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        openMenssege();
    }//GEN-LAST:event_jButtonViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMessages;
    private javax.swing.JTextArea jTextMessage;
    private javax.swing.JTextField jTextTitle;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        this.dispose();
    }
    
    private void openMenssege() {
        
        try {
            String id = jTableMessages.getValueAt(jTableMessages.getSelectedRow(), 0).toString();
            Message messageX = (Message) conAdm.returnEntityStack(id, Structures.getStack());
            
            jTextTitle.setText(messageX.getTitle());
            jTextMessage.setText(messageX.getText());
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Para visualizar uma mensagem, deve-se primeiro selecionar uma das mensagens exibidas na tabela.");
        }
    }
    
    private void messageList() {
        
        for (int i = Structures.getStack().getTop(); i >= 0; i--) {
            
            Message messageX = (Message) Structures.getStack().returnInIndex(i);
            
            if (messageX.getSender().equals(Maneger.getCurrentManeger())) {
                
                String date[] = messageX.getDate().toString().split(" ");
                
                DefaultTableModel residentList = (DefaultTableModel) jTableMessages.getModel();
                residentList.addRow(new String[]{messageX.getId(), messageX.getTitle(), messageX.getReceptor().getName(), date[2] + "/" + date[1] + "/" + date[5]});
            }
            
        }
    }
}
