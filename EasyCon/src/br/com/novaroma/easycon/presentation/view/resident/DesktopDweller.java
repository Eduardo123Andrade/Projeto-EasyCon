package br.com.novaroma.easycon.presentation.view.resident;

import br.com.novaroma.easycon.presentation.view.syndic.PollsList;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class DesktopDweller extends javax.swing.JFrame {

    public DesktopDweller() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
       
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
        jMenuProfile = new javax.swing.JMenu();
        jMenuItemStatus = new javax.swing.JMenuItem();
        jMenuItemUpdate = new javax.swing.JMenuItem();
        jMenuMessages = new javax.swing.JMenu();
        jMenuItemMessage = new javax.swing.JMenuItem();
        jMenuItemInbox = new javax.swing.JMenuItem();
        jMenuItemExitBox = new javax.swing.JMenuItem();
        jMenuPolls = new javax.swing.JMenu();
        jMenuItemCList = new javax.swing.JMenuItem();
        jMenuItemVoteSurvey = new javax.swing.JMenuItem();
        jMenuComplaint = new javax.swing.JMenu();
        jMenuItemComplaints = new javax.swing.JMenuItem();
        jMenuFinances = new javax.swing.JMenu();
        jMenuItemFinances = new javax.swing.JMenuItem();
        jMenuExit = new javax.swing.JMenu();
        jMenuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Area de trabalho");
        setLocationByPlatform(true);
        setMaximizedBounds(getMaximizedBounds());

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

        jMenuProfile.setText("Perfil");

        jMenuItemStatus.setText("Satus");
        jMenuItemStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemStatusActionPerformed(evt);
            }
        });
        jMenuItemStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemStatusKeyPressed(evt);
            }
        });
        jMenuProfile.add(jMenuItemStatus);

        jMenuItemUpdate.setText("Alterar dados");
        jMenuItemUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUpdateActionPerformed(evt);
            }
        });
        jMenuItemUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemUpdateKeyPressed(evt);
            }
        });
        jMenuProfile.add(jMenuItemUpdate);

        jMenuBar.add(jMenuProfile);

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

        jMenuPolls.setText("Enquetes");

        jMenuItemCList.setText("Lista de enquetes");
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
        jMenuPolls.add(jMenuItemCList);

        jMenuItemVoteSurvey.setText("Votar");
        jMenuItemVoteSurvey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVoteSurveyActionPerformed(evt);
            }
        });
        jMenuPolls.add(jMenuItemVoteSurvey);

        jMenuBar.add(jMenuPolls);

        jMenuComplaint.setText("Reclamações");

        jMenuItemComplaints.setText("Reclamações");
        jMenuItemComplaints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemComplaintsActionPerformed(evt);
            }
        });
        jMenuItemComplaints.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItemComplaintsKeyPressed(evt);
            }
        });
        jMenuComplaint.add(jMenuItemComplaints);

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

    private void jMenuItemStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStatusActionPerformed
        status();
    }//GEN-LAST:event_jMenuItemStatusActionPerformed

    private void jMenuItemStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemStatusKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            status();
        }
    }//GEN-LAST:event_jMenuItemStatusKeyPressed

    private void jMenuItemUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUpdateActionPerformed
        update();
    }//GEN-LAST:event_jMenuItemUpdateActionPerformed

    private void jMenuItemUpdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemUpdateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            update();
        }
    }//GEN-LAST:event_jMenuItemUpdateKeyPressed

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

    private void jMenuItemCListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCListActionPerformed
        pollslist();
    }//GEN-LAST:event_jMenuItemCListActionPerformed

    private void jMenuItemCListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemCListKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pollslist();
        }
    }//GEN-LAST:event_jMenuItemCListKeyPressed

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

    private void jMenuItemComplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemComplaintsActionPerformed
        claims();
    }//GEN-LAST:event_jMenuItemComplaintsActionPerformed

    private void jMenuItemComplaintsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemComplaintsKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            claims();
        }
    }//GEN-LAST:event_jMenuItemComplaintsKeyPressed

    private void jMenuItemFinancesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemFinancesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            finances();
        }
    }//GEN-LAST:event_jMenuItemFinancesKeyPressed

    private void jMenuItemExitBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItemExitBoxKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           exitBox();
       }
    }//GEN-LAST:event_jMenuItemExitBoxKeyPressed

    private void jMenuItemExitBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitBoxActionPerformed
       exitBox();
    }//GEN-LAST:event_jMenuItemExitBoxActionPerformed

    private void jMenuItemVoteSurveyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVoteSurveyActionPerformed
        vote();
    }//GEN-LAST:event_jMenuItemVoteSurveyActionPerformed

    private void jMenuItemFinancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinancesActionPerformed
        // TODO add your handling code here:
        finances();
    }//GEN-LAST:event_jMenuItemFinancesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuComplaint;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JMenu jMenuFinances;
    private javax.swing.JMenuItem jMenuItemCList;
    private javax.swing.JMenuItem jMenuItemComplaints;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemExitBox;
    private javax.swing.JMenuItem jMenuItemFinances;
    private javax.swing.JMenuItem jMenuItemInbox;
    private javax.swing.JMenuItem jMenuItemMessage;
    private javax.swing.JMenuItem jMenuItemStatus;
    private javax.swing.JMenuItem jMenuItemUpdate;
    private javax.swing.JMenuItem jMenuItemVoteSurvey;
    private javax.swing.JMenu jMenuMessages;
    private javax.swing.JMenu jMenuPolls;
    private javax.swing.JMenu jMenuProfile;
    // End of variables declaration//GEN-END:variables

    private void status() {
        Status s = new Status(jDesktopPane1);
        jDesktopPane1.add(s);
        s.setVisible(true);
    }

    private void update() { 
        Update u = new Update();
        jDesktopPane1.add(u);
        u.setVisible(true);
    }

    private void send() { 
        Send s = new Send();
        jDesktopPane1.add(s);
        s.setVisible(true);
    }

    private void inbox() { 
        Inbox i = new Inbox();
        jDesktopPane1.add(i);
        i.setVisible(true);
    }

    private void pollslist() {
        PollsList pl = new PollsList();
        jDesktopPane1.add(pl);
        pl.setVisible(true);
    }

    private void finances() {
        Finance f = new Finance(jDesktopPane1);
        jDesktopPane1.add(f);
        f.setVisible(true);
    }

    private void claims() {
        Claims c = new Claims();
        jDesktopPane1.add(c);
        c.setVisible(true);
    }
    
    private void exitBox(){
        ExitBox eb = new ExitBox();
        jDesktopPane1.add(eb);
        eb.setVisible(true);
    }
    
    private void vote() {
        VoteSurvey vs = new VoteSurvey();
        jDesktopPane1.add(vs);
        vs.setVisible(true);
    }

    private void exit() {
        this.dispose();
    }
}
