/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package App_Frames;

import Models.User;
import java.awt.Point;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author amir,chedi,nour
 */
public class Connected_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Connected_Frame
     */
    public Connected_Frame(String userName,String pwd ,String ipAddress ) {
       
        
        this.ipAddress = ipAddress ;
        this.pwd = pwd ; 
        this.userName = userName ;  
        initComponents();
        connectedLabel.setText("Connected to "+ipAddress+" as " + userName  ); 
        universityButtonMouseClicked(null);
        setInvisibilty(); 
        // File img = new File("src/app_icon.png");
        //if(img.exists())
        this.setIconImage(new ImageIcon(getClass().getResource("/app_icon.png")).getImage());
        setVisible(true);
        setLocationRelativeTo(null);
        
        
    }
    public void setInvisibilty()
    {
     logoutLabel.setVisible(false);
     teacherLabel.setVisible(false); 
     studentLabel.setVisible(false); 
     subjectLabel.setVisible(false);
     logoutLabel.setVisible(false); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRoot = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LeftPanel = new javax.swing.JPanel();
        StudentButton = new javax.swing.JButton();
        EnseignantButton = new javax.swing.JButton();
        SubjectButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        universityButton = new javax.swing.JButton();
        studentLabel = new javax.swing.JLabel();
        teacherLabel = new javax.swing.JLabel();
        subjectLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        TopPanel = new javax.swing.JPanel();
        minimizeButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        connectedLabel = new javax.swing.JLabel();
        CenterPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(834, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        PanelRoot.setBackground(new java.awt.Color(34, 40, 44));
        PanelRoot.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 255), null));
        PanelRoot.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(34, 40, 44));

        LeftPanel.setBackground(new java.awt.Color(21, 25, 28));
        LeftPanel.setPreferredSize(new java.awt.Dimension(75, 459));

        StudentButton.setBackground(new java.awt.Color(21, 25, 28));
        StudentButton.setForeground(new java.awt.Color(34, 40, 44));
        StudentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Frames/icons/icons8-student-male-64.png"))); // NOI18N
        StudentButton.setText("jButton1");
        StudentButton.setContentAreaFilled(false);
        StudentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentButton.setIconTextGap(0);
        StudentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StudentButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StudentButtonMouseExited(evt);
            }
        });

        EnseignantButton.setBackground(new java.awt.Color(21, 25, 28));
        EnseignantButton.setForeground(new java.awt.Color(21, 25, 28));
        EnseignantButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Frames/icons/physician.png"))); // NOI18N
        EnseignantButton.setContentAreaFilled(false);
        EnseignantButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EnseignantButton.setIconTextGap(0);
        EnseignantButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnseignantButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EnseignantButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EnseignantButtonMouseExited(evt);
            }
        });

        SubjectButton.setBackground(new java.awt.Color(21, 25, 28));
        SubjectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Frames/icons/icons8-open-book-48.png"))); // NOI18N
        SubjectButton.setContentAreaFilled(false);
        SubjectButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubjectButton.setIconTextGap(0);
        SubjectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubjectButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubjectButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubjectButtonMouseExited(evt);
            }
        });
        SubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectButtonActionPerformed(evt);
            }
        });

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Frames/icons/icons8-logout-rounded-left-48.png"))); // NOI18N
        logoutButton.setBorder(null);
        logoutButton.setBorderPainted(false);
        logoutButton.setContentAreaFilled(false);
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.setIconTextGap(0);
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButtonMouseExited(evt);
            }
        });

        universityButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Frames/icons/icons8-school-building-48.png"))); // NOI18N
        universityButton.setBorderPainted(false);
        universityButton.setContentAreaFilled(false);
        universityButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        universityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                universityButtonMouseClicked(evt);
            }
        });

        studentLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        studentLabel.setForeground(new java.awt.Color(144, 153, 164));
        studentLabel.setText("  Student");

        teacherLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        teacherLabel.setForeground(new java.awt.Color(144, 153, 164));
        teacherLabel.setText("  Teacher");

        subjectLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subjectLabel.setForeground(new java.awt.Color(144, 153, 164));
        subjectLabel.setText("  Subject");

        logoutLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(144, 153, 164));
        logoutLabel.setText("Logout");

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(universityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(StudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(studentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(EnseignantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(teacherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(subjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logoutLabel))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(universityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(StudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(studentLabel)
                .addGap(33, 33, 33)
                .addComponent(EnseignantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(teacherLabel)
                .addGap(33, 33, 33)
                .addComponent(SubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(subjectLabel)
                .addGap(103, 103, 103)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(logoutLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TopPanel.setBackground(new java.awt.Color(34, 40, 44));
        TopPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TopPanelMouseDragged(evt);
            }
        });
        TopPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TopPanelMousePressed(evt);
            }
        });

        minimizeButton.setBackground(new java.awt.Color(34, 40, 44));
        minimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Frames/icons/icons8-minimize-window-30.png"))); // NOI18N
        minimizeButton.setContentAreaFilled(false);
        minimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeButton.setIconTextGap(0);
        minimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeButtonActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(34, 40, 44));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Frames/icons/icons8-delete-30.png"))); // NOI18N
        closeButton.setBorderPainted(false);
        closeButton.setContentAreaFilled(false);
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.setIconTextGap(0);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        connectedLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        connectedLabel.setForeground(new java.awt.Color(144, 153, 164));
        connectedLabel.setText("<UserName>");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addComponent(connectedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(minimizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(connectedLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CenterPanel.setBackground(new java.awt.Color(34, 40, 44));
        CenterPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        PanelRoot.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED); 
    }//GEN-LAST:event_minimizeButtonActionPerformed

    private void StudentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentButtonMouseEntered
        // TODO add your handling code here:
       studentLabel.setVisible(true); 
    }//GEN-LAST:event_StudentButtonMouseEntered

    private void StudentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentButtonMouseExited
        // TODO add your handling code here:
        studentLabel.setVisible(false); 
    }//GEN-LAST:event_StudentButtonMouseExited

    private void EnseignantButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnseignantButtonMouseExited
        // TODO add your handling code here:
        teacherLabel.setVisible(false); 
        
    }//GEN-LAST:event_EnseignantButtonMouseExited

    private void EnseignantButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnseignantButtonMouseEntered
        // TODO add your handling code here:
        teacherLabel.setVisible(true); 
    }//GEN-LAST:event_EnseignantButtonMouseEntered

    private void SubjectButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubjectButtonMouseEntered
        // TODO add your handling code here:
        subjectLabel.setVisible(true) ; 
    }//GEN-LAST:event_SubjectButtonMouseEntered

    private void SubjectButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubjectButtonMouseExited
        // TODO add your handling code here:
        subjectLabel.setVisible(false) ; 
    }//GEN-LAST:event_SubjectButtonMouseExited

    private void logoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseEntered
        // TODO add your handling code here:
        logoutLabel.setVisible(true); 
    }//GEN-LAST:event_logoutButtonMouseEntered

    private void logoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseExited
        // TODO add your handling code here:
        logoutLabel.setVisible(false) ; 
    }//GEN-LAST:event_logoutButtonMouseExited

    private void TopPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMousePressed
        // TODO add your handling code here:
        mouseClickPoint = evt.getPoint();
    }//GEN-LAST:event_TopPanelMousePressed

    private void TopPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMouseDragged
        // TODO add your handling code here:
        Point newPoint = evt.getLocationOnScreen();
                newPoint.translate(-mouseClickPoint.x, -mouseClickPoint.y); // Moves the point by given values from its location
                setLocation(newPoint); // set the new location
    }//GEN-LAST:event_TopPanelMouseDragged

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void SubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubjectButtonActionPerformed

    private void disposeFrames()
    {
        if(studentPanel!=null)
        studentPanel.disposeFrames();
        if(teacherPanel!=null)
        teacherPanel.disposeFrames();
        if(subjectPanel!=null)
        subjectPanel.disposeFrames();
        
    }
    
    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        disposeFrames();
        dispose();
        LoginFrame loginFrame = new LoginFrame(userName,ipAddress);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowActivated

    private void StudentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentButtonMouseClicked
        // TODO add your handling code here:
        resetCenterPanel(studentPanel = new StudentPanel(ipAddress,PORT, new User(userName,pwd)));
       
            
    }//GEN-LAST:event_StudentButtonMouseClicked

    private void universityButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_universityButtonMouseClicked
        // TODO add your handling code here:
       resetCenterPanel(new HomePanel(ipAddress,PORT, new User(userName,pwd)));
     
        
    }//GEN-LAST:event_universityButtonMouseClicked

    private void EnseignantButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnseignantButtonMouseClicked
        // TODO add your handling code here:
          resetCenterPanel(teacherPanel = new TeacherPanel(ipAddress,PORT, new User(userName,pwd)));
    }//GEN-LAST:event_EnseignantButtonMouseClicked

    private void SubjectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubjectButtonMouseClicked
        // TODO add your handling code here:
          resetCenterPanel(subjectPanel  = new SubjectPanel(ipAddress,PORT, new User(userName,pwd)));
    }//GEN-LAST:event_SubjectButtonMouseClicked

    private void resetCenterPanel(JPanel newPanel)
    {
         CenterPanel.removeAll();
         disposeFrames();
         if(newPanel!=null)
             CenterPanel.add(newPanel);
         CenterPanel.revalidate();
         CenterPanel.repaint();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Connected_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connected_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connected_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connected_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connected_Frame("user","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JButton EnseignantButton;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel PanelRoot;
    private javax.swing.JButton StudentButton;
    private javax.swing.JButton SubjectButton;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel connectedLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JLabel teacherLabel;
    private javax.swing.JButton universityButton;
    // End of variables declaration//GEN-END:variables
    private Point mouseClickPoint ;
    private static String userName ; 
    private static String pwd; 
    private static String ipAddress ;
    private static final int  PORT = 1234;
    private boolean centerPanelOccupied =false;
    private static StudentPanel studentPanel =null;
    private static TeacherPanel teacherPanel =null;
    private static SubjectPanel subjectPanel = null;
    
}
