package br.com.novaroma.easycon.presentation.view.syndic;

import br.com.novaroma.easycon.dao.IDao;
import br.com.novaroma.easycon.entities.Resident;
import br.com.novaroma.easycon.factories.Factory;
import br.com.novaroma.easycon.structures.AvlLink;
import br.com.novaroma.easycon.structures.Structures;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

public class DwellerList extends javax.swing.JInternalFrame {
  
    private IDao dao = Factory.getDao();
    
    public DwellerList() {
        initComponents();
        residentList(Structures.getTree().getRoot());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        residentTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setTitle("Lista de moradores");

        residentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Senha", "Idade", "Telefone", "Inadimplente", "Bloco", "Numero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        residentTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                residentTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(residentTable);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void residentTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_residentTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            //Pega o cpf do morador para remover do condominio
            String cpf = residentTable.getValueAt(residentTable.getSelectedRow(), 1).toString();
            //TODO metodo para remover o morador
        }
    }//GEN-LAST:event_residentTableKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exit();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            exit();
        }
    }//GEN-LAST:event_jButton1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable residentTable;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        this.dispose();
    }
    
    private void residentList(AvlLink temp) {
        
        if (temp != null) {
            residentList(temp.getLeft());
            
            Resident residentTemp = (Resident)temp.getEntity();
            DefaultTableModel residentList = (DefaultTableModel) residentTable.getModel();
            
            residentList.addRow(new String[] {residentTemp.getName(), residentTemp.getCpf(), residentTemp.getPassword(), residentTemp.getAge(), 
                residentTemp.getPhoneNumber(),residentTemp.getOwe(), residentTemp.getAdrdress().getBlock(), residentTemp.getAdrdress().getNumber()});
            
            residentList(temp.getRight());
        }
    }
}
