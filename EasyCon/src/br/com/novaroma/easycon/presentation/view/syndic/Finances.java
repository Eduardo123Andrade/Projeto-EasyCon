package br.com.novaroma.easycon.presentation.view.syndic;

import br.com.novaroma.easycon.controller.ControllerAdm;
import br.com.novaroma.easycon.controller.IControllerAdm;
import br.com.novaroma.easycon.entities.Receipt;
import br.com.novaroma.easycon.entities.Resident;
import br.com.novaroma.easycon.structures.AvlLink;
import br.com.novaroma.easycon.structures.Hash;
import br.com.novaroma.easycon.structures.Link;
import br.com.novaroma.easycon.structures.Structures;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Finances extends javax.swing.JInternalFrame {

    IControllerAdm conAdm = new ControllerAdm();
    
    public Finances() {
        initComponents();
        getContentPane().setBackground(Color.white);
        
        defaultersList(Structures.getTree().getRoot());
        receiptList(Structures.getHashReceipt());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCash = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDebts1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelExpenses = new javax.swing.JLabel();
        jLabelBalance = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setTitle("Financas");

        jTableCash.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCash);

        jTableDebts1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableDebts1);

        jLabel2.setText("Moradores inadimplentes");

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

        jLabel7.setText("Arrecadações mensais");

        jLabelTotal.setText("Total arrecadado: ");

        jLabelExpenses.setText("Gastos com manutenção: ");

        jLabelBalance.setText("Saldo restante: ");

        jButton2.setText("Abrir recibo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelBalance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelExpenses)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelTotal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTotal))
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabelExpenses)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelBalance)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        // TODO add your handling code here:
        openReceipt();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBalance;
    private javax.swing.JLabel jLabelExpenses;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCash;
    private javax.swing.JTable jTableDebts1;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        this.dispose();
    }

    private void defaultersList(AvlLink temp) {

        if (temp != null) {
            defaultersList(temp.getLeft());

            Resident residentTemp = (Resident) temp.getEntity();

            if (residentTemp.isOwe()) {
                DefaultTableModel residentList = (DefaultTableModel) jTableDebts1.getModel();

                residentList.addRow(new String[]{residentTemp.getCpf(), residentTemp.getName() + " " + residentTemp.getLastName()});
            }

            defaultersList(temp.getRight());
        }
    }

    private void receiptList(Hash hash) {
        
        double total = 0;
        
        for (int i = 0; i < hash.getHash().length; i++) {
            Link temp = hash.getHashOnIndex(i).getFirst();

            while (temp != null) {
                Receipt receiptX = (Receipt) temp.getEntity();

                DefaultTableModel complaintList = (DefaultTableModel) jTableCash.getModel();
                String date[] = receiptX.getDate().toString().split(" ");
                String currentDate[] = new Date().toString().split(" ");

                if (date[1].equals(currentDate[1]) && date[5].equals(currentDate[5]) && receiptX.isPaid()) {
                    complaintList.addRow(new String[]{receiptX.getId(), String.valueOf(receiptX.getValue()), date[2] + "/" + date[1] + "/" + date[5]});
                    total += receiptX.getValue();
                }
                temp = temp.getNext();
            }
        }
        
        setLabels(total);
    }
    
    private void setLabels(double total) {
        
        double expanses = total * (0.05);
        
        jLabelTotal.setText(jLabelTotal.getText() + String.valueOf(total));
        jLabelExpenses.setText(jLabelExpenses.getText() + String.valueOf(expanses));
        jLabelBalance.setText(jLabelBalance.getText() + String.valueOf(total - expanses));
    }
    
    private void openReceipt() {
        
        try {
        String id = jTableCash.getValueAt(jTableCash.getSelectedRow(), 0).toString();
        Receipt receiptX = (Receipt) conAdm.returnEntityHash(id, Structures.getHashReceipt());
        String date[] = receiptX.getDate().toString().split(" ");
        
        JOptionPane.showMessageDialog(null, "RECIBO DE PAGAMENTO" 
            + "\nCodigo: " + receiptX.getId() + "\n" 
                + "\nData: " + date[2] + "/" + date[1] + "/" + date[5]
                    + "\nMorador: " + receiptX.getResident().getName() + " " + receiptX.getResident().getLastName()
                        + "\nValor: " + receiptX.getValue()
                            + "\nDescricao: " + receiptX.getDescription());
        
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Para visualizar um recibo, deve-se primeiro selecionar um dos recibos exibidas na tabela de arrecadações mensais.");
        }
    }
}