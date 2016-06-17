package br.com.novaroma.easycon.presentation.view.syndic;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

public class DesktopSyndic extends javax.swing.JFrame {

    public DesktopSyndic() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //jDesktopPane1.setBackground(Color.red);
        //jDesktopPane1.setForeground(Color.red);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane(){
            ImageIcon ii = new ImageIcon(getClass().getResource("/br/com/novaroma/easycon/presentation/view/images/Sem título.png"));
            Image i = ii.getImage();
            public void paintComponent(Graphics g){
                g.drawImage(i, 0, 0, getWidth(), getHeight(), this);
            }
        }
        ;
        jLabelLogo = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuResident = new javax.swing.JMenu();
        jMenuItemRegister = new javax.swing.JMenuItem();
        jMenuItemRList = new javax.swing.JMenuItem();
        jMenuItemRemove = new javax.swing.JMenuItem();
        jMenuMessages = new javax.swing.JMenu();
        jMenuItemMessage = new javax.swing.JMenuItem();
        jMenuItemInbox = new javax.swing.JMenuItem();
        jMenuItemExitBox = new javax.swing.JMenuItem();
        jMenuSurvey = new javax.swing.JMenu();
        jMenuItemCSurvey = new javax.swing.JMenuItem();
        jMenuItemSList = new javax.swing.JMenuItem();
        jMenuComplaint = new javax.swing.JMenu();
        jMenuItemComplaint = new javax.swing.JMenuItem();
        jMenuItemCList = new javax.swing.JMenuItem();
        jMenuFinances = new javax.swing.JMenu();
        jMenuItemFinances = new javax.swing.JMenuItem();
        jMenuExit = new javax.swing.JMenu();
        jMenuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Area de trabalho");

        jDesktopPane1.setBackground(java.awt.Color.white);

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/easycon/presentation/view/images/logo.jpg"))); // NOI18N

        jDesktopPane1.setLayer(jLabelLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(137, 137, 137))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );

        jMenuResident.setText("Morador");

        jMenuItemRegister.setText("Cadastrar");
        jMenuItemRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegisterActionPerformed(evt);
            }
        });
        jMenuItemRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemRegisterKeyPressed(evt);
            }
        });
        jMenuResident.add(jMenuItemRegister);

        jMenuItemRList.setText("Lista de moradores");
        jMenuItemRList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRListActionPerformed(evt);
            }
        });
        jMenuItemRList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemRListKeyPressed(evt);
            }
        });
        jMenuResident.add(jMenuItemRList);

        jMenuItemRemove.setText("Remover");
        jMenuItemRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRemoveActionPerformed(evt);
            }
        });
        jMenuItemRemove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemRemoveKeyPressed(evt);
            }
        });
        jMenuResident.add(jMenuItemRemove);

        jMenuBar.add(jMenuResident);

        jMenuMessages.setText("Mensagens");

        jMenuItemMessage.setText("Enviar mensagem");
        jMenuItemMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMessageActionPerformed(evt);
            }
        });
        jMenuItemMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemMessageKeyPressed(evt);
            }
        });
        jMenuMessages.add(jMenuItemMessage);

        jMenuItemInbox.setText("Caixa de entrada");
        jMenuItemInbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInboxActionPerformed(evt);
            }
        });
        jMenuItemInbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemInboxKeyPressed(evt);
            }
        });
        jMenuMessages.add(jMenuItemInbox);

        jMenuItemExitBox.setText("Caixa de saida");
        jMenuItemExitBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitBoxActionPerformed(evt);
            }
        });
        jMenuItemExitBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemExitBoxKeyPressed(evt);
            }
        });
        jMenuMessages.add(jMenuItemExitBox);

        jMenuBar.add(jMenuMessages);

        jMenuSurvey.setText("Enquetes");

        jMenuItemCSurvey.setText("Criar enquetes");
        jMenuItemCSurvey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCSurveyActionPerformed(evt);
            }
        });
        jMenuItemCSurvey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemCSurveyKeyPressed(evt);
            }
        });
        jMenuSurvey.add(jMenuItemCSurvey);

        jMenuItemSList.setText("Lista de enquetes");
        jMenuItemSList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSListActionPerformed(evt);
            }
        });
        jMenuItemSList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemSListKeyPressed(evt);
            }
        });
        jMenuSurvey.add(jMenuItemSList);

        jMenuBar.add(jMenuSurvey);

        jMenuComplaint.setText("Reclamação");

        jMenuItemComplaint.setText("Reclamações");
        jMenuItemComplaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemComplaintActionPerformed(evt);
            }
        });
        jMenuItemComplaint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemComplaintKeyPressed(evt);
            }
        });
        jMenuComplaint.add(jMenuItemComplaint);

        jMenuItemCList.setText("Lista de reclamações");
        jMenuItemCList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCListActionPerformed(evt);
            }
        });
        jMenuItemCList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemCListKeyPressed(evt);
            }
        });
        jMenuComplaint.add(jMenuItemCList);

        jMenuBar.add(jMenuComplaint);

        jMenuFinances.setText("Finanças");

        jMenuItemFinances.setText("Finanças");
        jMenuItemFinances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFinancesActionPerformed(evt);
            }
        });
        jMenuItemFinances.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemFinancesKeyPressed(evt);
            }
        });
        jMenuFinances.add(jMenuItemFinances);

        jMenuBar.add(jMenuFinances);

        jMenuExit.setText("Sair");
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });

        jMenuItemExit.setText("Sair");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuItemExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemExitKeyPressed(evt);
            }
        });
        jMenuExit.add(jMenuItemExit);

        jMenuBar.add(jMenuExit);

        setJMenuBar(jMenuBar);

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

    private void jMenuItemRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegisterActionPerformed
        register();
    }//GEN-LAST:event_jMenuItemRegisterActionPerformed

    private void jMenuItemRegisterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemRegisterKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            register();
        }
    }//GEN-LAST:event_jMenuItemRegisterKeyPressed

    private void jMenuItemRListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRListActionPerformed
        roster();
    }//GEN-LAST:event_jMenuItemRListActionPerformed

    private void jMenuItemRListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemRListKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            roster();
        }
    }//GEN-LAST:event_jMenuItemRListKeyPressed

    private void jMenuItemRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRemoveActionPerformed
        remove();
    }//GEN-LAST:event_jMenuItemRemoveActionPerformed

    private void jMenuItemRemoveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemRemoveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            remove();
        }
    }//GEN-LAST:event_jMenuItemRemoveKeyPressed

    private void jMenuItemMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMessageActionPerformed
        send();
    }//GEN-LAST:event_jMenuItemMessageActionPerformed

    private void jMenuItemMessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemMessageKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            send();
        }
    }//GEN-LAST:event_jMenuItemMessageKeyPressed

    private void jMenuItemInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInboxActionPerformed
        inbox();
    }//GEN-LAST:event_jMenuItemInboxActionPerformed

    private void jMenuItemInboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemInboxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            inbox();
        }
    }//GEN-LAST:event_jMenuItemInboxKeyPressed

    private void jMenuItemCSurveyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCSurveyActionPerformed
        polls();
    }//GEN-LAST:event_jMenuItemCSurveyActionPerformed

    private void jMenuItemCSurveyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemCSurveyKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            polls();
        }
    }//GEN-LAST:event_jMenuItemCSurveyKeyPressed

    private void jMenuItemSListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSListActionPerformed
        pollslist();
    }//GEN-LAST:event_jMenuItemSListActionPerformed

    private void jMenuItemSListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemSListKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pollslist();
        }
    }//GEN-LAST:event_jMenuItemSListKeyPressed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        exit();
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemExitKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            exit();
        }
    }//GEN-LAST:event_jMenuItemExitKeyPressed

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuExitActionPerformed

    private void jMenuItemComplaintKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemComplaintKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            complaint();

        }
    }//GEN-LAST:event_jMenuItemComplaintKeyPressed

    private void jMenuItemComplaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemComplaintActionPerformed
        complaint();
    }//GEN-LAST:event_jMenuItemComplaintActionPerformed

    private void jMenuItemFinancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinancesActionPerformed
        finances();
    }//GEN-LAST:event_jMenuItemFinancesActionPerformed

    private void jMenuItemFinancesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemFinancesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            finances();
        }
    }//GEN-LAST:event_jMenuItemFinancesKeyPressed

    private void jMenuItemExitBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitBoxActionPerformed
        exitBox();
    }//GEN-LAST:event_jMenuItemExitBoxActionPerformed

    private void jMenuItemExitBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemExitBoxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            exitBox();
        }
    }//GEN-LAST:event_jMenuItemExitBoxKeyPressed

    private void jMenuItemCListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCListActionPerformed
        listComplaint();
    }//GEN-LAST:event_jMenuItemCListActionPerformed

    private void jMenuItemCListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemCListKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            listComplaint();
        }
    }//GEN-LAST:event_jMenuItemCListKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuComplaint;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JMenu jMenuFinances;
    private javax.swing.JMenuItem jMenuItemCList;
    private javax.swing.JMenuItem jMenuItemCSurvey;
    private javax.swing.JMenuItem jMenuItemComplaint;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemExitBox;
    private javax.swing.JMenuItem jMenuItemFinances;
    private javax.swing.JMenuItem jMenuItemInbox;
    private javax.swing.JMenuItem jMenuItemMessage;
    private javax.swing.JMenuItem jMenuItemRList;
    private javax.swing.JMenuItem jMenuItemRegister;
    private javax.swing.JMenuItem jMenuItemRemove;
    private javax.swing.JMenuItem jMenuItemSList;
    private javax.swing.JMenu jMenuMessages;
    private javax.swing.JMenu jMenuResident;
    private javax.swing.JMenu jMenuSurvey;
    // End of variables declaration//GEN-END:variables

    private void register() { 
        Register r = new Register();
        jDesktopPane1.add(r);
        r.setVisible(true);
    }

    private void roster() { 
        DwellerList dl = new DwellerList();
        jDesktopPane1.add(dl);
        dl.setVisible(true);
    }

    private void remove() { 
        Remove r = new Remove();
        jDesktopPane1.add(r);
        r.setVisible(true);
    }

    private void send() { 
        Message m = new Message();
        jDesktopPane1.add(m);
        m.setVisible(true);
    }

    private void inbox() { 
        Inbox i = new Inbox();
        jDesktopPane1.add(i);
        i.setVisible(true);
    }

    private void exitBox() {
        ExitBox eb = new ExitBox();
        jDesktopPane1.add(eb);
        eb.setVisible(true);
    }

    private void polls() { 
        Polls p = new Polls();
        jDesktopPane1.add(p);
        p.setVisible(true);
    }

    private void pollslist() { 
        PollsList pl = new PollsList();
        jDesktopPane1.add(pl);
        pl.setVisible(true);
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
    
    private void listComplaint(){
        ComplaintList cl = new ComplaintList();
        jDesktopPane1.add(cl);
        cl.setVisible(true);
    }

   private void exit() {
        this.dispose();
    }
}
