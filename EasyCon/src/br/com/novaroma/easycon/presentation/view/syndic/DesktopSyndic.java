package br.com.novaroma.easycon.presentation.view.syndic;

import java.awt.event.KeyEvent;

public class DesktopSyndic extends javax.swing.JFrame {

    public DesktopSyndic() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Area de trabalho");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Morador");

        jMenuItem2.setText("Cadastrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuItem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem2KeyPressed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Lista de moradores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem1KeyPressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Remover");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuItem3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem3KeyPressed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mensagens");

        jMenuItem4.setText("Enviar mensagem");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuItem4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem4KeyPressed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Caixa de mensgens");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuItem5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem5KeyPressed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem12.setText("Caixa de saida");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenuItem12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem12KeyPressed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Enquetes");

        jMenuItem6.setText("Criar enquetes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuItem6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem6KeyPressed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Lista de enquetes");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenuItem7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem7KeyPressed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Alocações");

        jMenuItem9.setText("Editar locação");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuItem9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem9KeyPressed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Reclamação");

        jMenuItem8.setText("Reclamação");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenuItem8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem8KeyPressed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Finanças");

        jMenuItem11.setText("Finanças");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenuItem11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem11KeyPressed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenuBar1.add(jMenu7);

        jMenu5.setText("Sair");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem10.setText("Sair");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenuItem10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem10KeyPressed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        register();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            register();
        }
    }//GEN-LAST:event_jMenuItem2KeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        roster();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            roster();
        }
    }//GEN-LAST:event_jMenuItem1KeyPressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        remove();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            remove();
        }
    }//GEN-LAST:event_jMenuItem3KeyPressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        send();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            send();
        }
    }//GEN-LAST:event_jMenuItem4KeyPressed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        inbox();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            inbox();
        }
    }//GEN-LAST:event_jMenuItem5KeyPressed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        polls();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            polls();
        }
    }//GEN-LAST:event_jMenuItem6KeyPressed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        pollslist();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem7KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pollslist();
        }
    }//GEN-LAST:event_jMenuItem7KeyPressed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        editLocation();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem9KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            editLocation();
        }
    }//GEN-LAST:event_jMenuItem9KeyPressed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        exit();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem10KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            exit();
        }
    }//GEN-LAST:event_jMenuItem10KeyPressed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem8KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            complaint();

        }
    }//GEN-LAST:event_jMenuItem8KeyPressed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        complaint();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        finances();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem11KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            finances();
        }
    }//GEN-LAST:event_jMenuItem11KeyPressed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        exitBox();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem12KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            exitBox();
        }
    }//GEN-LAST:event_jMenuItem12KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

    private void register() { //OK
        Register r = new Register();
        jDesktopPane1.add(r);
        r.setVisible(true);
    }

    private void roster() { //OK
        DwellerList dl = new DwellerList();
        jDesktopPane1.add(dl);
        dl.setVisible(true);
    }

    private void remove() { //OK
        Remove r = new Remove();
        jDesktopPane1.add(r);
        r.setVisible(true);
    }

    private void send() { //OK
        Message m = new Message();
        jDesktopPane1.add(m);
        m.setVisible(true);
    }

    private void inbox() { //OK
        Inbox i = new Inbox();
        jDesktopPane1.add(i);
        i.setVisible(true);
    }

    private void exitBox() { //OK
        ExitBox eb = new ExitBox();
        jDesktopPane1.add(eb);
        eb.setVisible(true);
    }

    private void polls() { //OK
        Polls p = new Polls();
        jDesktopPane1.add(p);
        p.setVisible(true);
    }

    private void pollslist() { //OK
        PollsList pl = new PollsList();
        jDesktopPane1.add(pl);
        pl.setVisible(true);
    }

    private void editLocation() {
        EditLocation el = new EditLocation();
        jDesktopPane1.add(el);
        el.setVisible(true);
    }

    private void complaint() {
        ComplaintScreen c = new ComplaintScreen();
        jDesktopPane1.add(c);
        c.setVisible(true);
    }

    private void finances() {
        Finances f = new Finances();
        jDesktopPane1.add(f);
        f.setVisible(true);
    }

    private void exit() {
        this.dispose();
    }
}
