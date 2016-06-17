package br.com.novaroma.easycon.presentation.view.syndic;

import br.com.novaroma.easycon.entities.Resident;
import br.com.novaroma.easycon.structures.AvlLink;
import br.com.novaroma.easycon.structures.Structures;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

public class DwellerList extends javax.swing.JInternalFrame {

    public DwellerList() {
        initComponents();
        residentList(Structures.getTree().getRoot());
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResidentList = new javax.swing.JTable();
        jButtonExit = new javax.swing.JButton();

        setTitle("Lista de moradores");

        jTableResidentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Senha", "Idade", "Telefone", "Inadimplencia", "Bloco", "Numero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableResidentList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableResidentListKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableResidentList);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExit)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableResidentListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableResidentListKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            //Pega o cpf do morador para remover do condominio
            String cpf = jTableResidentList.getValueAt(jTableResidentList.getSelectedRow(), 1).toString();
            //TODO metodo para remover o morador
        }
    }//GEN-LAST:event_jTableResidentListKeyPressed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        exit();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonExitKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            exit();
        }
    }//GEN-LAST:event_jButtonExitKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResidentList;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        this.dispose();
    }

    private void residentList(AvlLink temp) {

        if (temp != null) {
            residentList(temp.getLeft());

            Resident residentTemp = (Resident) temp.getEntity();
            DefaultTableModel residentList = (DefaultTableModel) jTableResidentList.getModel();

            residentList.addRow(new String[]{residentTemp.getName(), residentTemp.getCpf(), residentTemp.getPassword(), residentTemp.getAge(),
                residentTemp.getPhoneNumber(), residentTemp.getOwe(), residentTemp.getAdrdress().getBlock(), residentTemp.getAdrdress().getNumber()});

            residentList(temp.getRight());
        }
    }

}
