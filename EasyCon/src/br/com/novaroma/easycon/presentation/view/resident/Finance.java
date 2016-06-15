package br.com.novaroma.easycon.presentation.view.resident;

import br.com.novaroma.easycon.controller.ControllerResident;
import br.com.novaroma.easycon.controller.IControllerResident;
import br.com.novaroma.easycon.entities.Receipt;
import br.com.novaroma.easycon.entities.Resident;
import br.com.novaroma.easycon.structures.Hash;
import br.com.novaroma.easycon.structures.Link;
import br.com.novaroma.easycon.structures.Structures;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Finance extends javax.swing.JInternalFrame {

    private JDesktopPane desktop;
    private IControllerResident conRes = new ControllerResident();

    public Finance() {
        initComponents();
    }

    public Finance(JDesktopPane jDesktopPane1) {
        initComponents();
        getContentPane().setBackground(Color.white);
        desktop = jDesktopPane1;
        receiptList(Structures.getHashReceipt());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabelStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("Pagamentos");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Valor", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabelStatus.setText("Status: ");

        jLabel2.setText("Dispesas mensais pendentes");

        jLabelTotal.setText("Total: ");

        jButton2.setText("Pagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton3.setText("Visualizar recibo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTotal)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatus)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exit();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            exit();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pay(Structures.getHashReceipt());
        ((DefaultTableModel) jTable2.getModel()).setNumRows(0);
        receiptList(Structures.getHashReceipt());

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        openReceipt();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        this.dispose();
    }

    private void receiptList(Hash hash) {

        double total = 0;

        for (int i = 0; i < hash.getHash().length; i++) {
            Link temp = hash.getHashOnIndex(i).getFirst();

            while (temp != null) {
                Receipt receiptX = (Receipt) temp.getEntity();

                DefaultTableModel complaintList = (DefaultTableModel) jTable2.getModel();
                String date[] = receiptX.getDate().toString().split(" ");
                String currentDate[] = new Date().toString().split(" ");

                if (date[1].equals(currentDate[1]) && date[5].equals(currentDate[5]) && !receiptX.isPaid() && Resident.getCurrentResident().equals(receiptX.getResident())) {
                    complaintList.addRow(new String[]{receiptX.getId(), String.valueOf(receiptX.getValue()), date[2] + "/" + date[1] + "/" + date[5]});
                    total += receiptX.getValue();
                }
                temp = temp.getNext();
            }
        }

        setLabels(total);
    }

    private void setLabels(double total) {
        jLabelTotal.setText("Total:" + String.valueOf(total));
        jLabelStatus.setText("Status: " + Resident.getCurrentResident().getOwe());

    }

    private void openReceipt() {

        try {
            String id = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString();
            Receipt receiptX = (Receipt) conRes.returnEntityHash(id, Structures.getHashReceipt());
            String date[] = receiptX.getDate().toString().split(" ");

            JOptionPane.showMessageDialog(null, "RECIBO DE PAGAMENTO"
                    + "\nCodigo: " + receiptX.getId() + "\n"
                    + "\nData: " + date[2] + "/" + date[1] + "/" + date[5]
                    + "\nMorador: " + receiptX.getResident().getName() + " " + receiptX.getResident().getLastName()
                    + "\nValor: " + receiptX.getValue()
                    + "\nDescricao: " + receiptX.getDescription());
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Para visualizar uma mensagem, deve-se primeiro selecionar uma das mensagens exibidas na tabela.");
        }
    }

    private void pay(Hash hash) {

        double total = 0;

        for (int i = 0; i < hash.getHash().length; i++) {
            Link temp = hash.getHashOnIndex(i).getFirst();

            while (temp != null) {
                Receipt receiptX = (Receipt) temp.getEntity();

                if (receiptX.getResident().equals(Resident.getCurrentResident())) {
                    receiptX.setPaid(true);
                    total += receiptX.getValue();
                }

                temp = temp.getNext();
            }
        }

        JOptionPane.showMessageDialog(null, "Suas contas foram quitadas.\nTotal pago: " + total);
    }
}
