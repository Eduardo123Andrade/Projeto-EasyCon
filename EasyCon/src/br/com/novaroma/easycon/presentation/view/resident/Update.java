package br.com.novaroma.easycon.presentation.view.resident;

public class Update extends javax.swing.JInternalFrame {

    public Update() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelNumber = new javax.swing.JLabel();
        jLabelPassWord = new javax.swing.JLabel();
        jLabelPassWord2 = new javax.swing.JLabel();
        jPasswordFieldPassWord = new javax.swing.JPasswordField();
        jPasswordFieldPassWord2 = new javax.swing.JPasswordField();
        jButtonSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabelName.setText("Nome");

        jLabelCpf.setText("CPF");

        jLabelAge.setText("Idade");

        jLabelLogin.setText("Login");

        jLabelAddress.setText("Endereço");

        jLabelNumber.setText("Telefone");

        jLabelPassWord.setText("Senha");

        jLabelPassWord2.setText("Confirmar senha");

        jButtonSave.setText("Salvar");

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
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPassWord)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAddress)
                            .addComponent(jLabelName)
                            .addComponent(jLabelAge)
                            .addComponent(jLabelLogin))
                        .addGap(26, 123, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPassWord2)
                            .addComponent(jPasswordFieldPassWord)
                            .addComponent(jPasswordFieldPassWord2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSave)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jLabelCpf))
                .addGap(18, 18, 18)
                .addComponent(jLabelAge)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddress)
                    .addComponent(jLabelNumber))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLogin)
                        .addGap(26, 26, 26)
                        .addComponent(jLabelPassWord)
                        .addGap(8, 8, 8)
                        .addComponent(jPasswordFieldPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPassWord2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldPassWord2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSave))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
       exit();
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exit();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNumber;
    private javax.swing.JLabel jLabelPassWord;
    private javax.swing.JLabel jLabelPassWord2;
    private javax.swing.JPasswordField jPasswordFieldPassWord;
    private javax.swing.JPasswordField jPasswordFieldPassWord2;
    // End of variables declaration//GEN-END:variables

 private void exit() {
        this.dispose();
    }

}
