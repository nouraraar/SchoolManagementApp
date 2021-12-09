/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package App_Frames;

import App_Exceptions.InvalidPwdException;
import App_Exceptions.InvalidUsernameException;
import Dialogs.Message_Dialog;
import Models.*;
import java.awt.Point;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author amir,chedi,nour
 */
public class TeacherHelpFrame extends javax.swing.JFrame {

  
    
    /**
     * Creates new form LoginFrame
     */
    public TeacherHelpFrame() {
      
        initComponents();
        initVisibility();
        initValues();
        setVisible(true);
        setLocationRelativeTo(null);
       
    }

    private void initValues()
    {
    
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        constraintTA = new javax.swing.JTextArea();
        aboutUsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rootPanel.setBackground(new java.awt.Color(33, 35, 35));
        rootPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 255), null));
        rootPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                rootPanelMouseDragged(evt);
            }
        });
        rootPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rootPanelMousePressed(evt);
            }
        });

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_Frames/icons/icons8-delete-30.png"))); // NOI18N
        closeButton.setContentAreaFilled(false);
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.setIconTextGap(0);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        constraintTA.setEditable(false);
        constraintTA.setBackground(new java.awt.Color(64, 70, 74));
        constraintTA.setColumns(20);
        constraintTA.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        constraintTA.setForeground(new java.awt.Color(255, 255, 255));
        constraintTA.setRows(5);
        constraintTA.setText("1: Each teacher must have a unique CIN and it\nmust be an unsigned number formed by 8 digits .\n \n2: First and last name can't be empty \n, can't pass 20 characters length  and must \nbe formed only by letters.\n\n3: Each teacher must have a phone number\nand it must be an unsigned number\nformed by 8 digits.\n\n4: No constraints on the address .\n\n5: Each teacher must have a gender . \n\n6: Each teacher's birthdate can't be empty and \nthe student must be younger than the current date\nof the operating system running this application\n\n7: Email address can't be empty ,can't pass 50\ncharacters length and must have a valid username\nwich can't be empty and can be formed by \nalphanumerics and one dot or one dash or one \nunderscore and domain name wich have the same \nconstraints as the username but it must have at \nleast one dot and can have up to 2 dots.\n\nNotes : \n\t- When adding a new teacher , all of the\nfields must be filled except the address . \n\t- removing or editing a teacher can be \ndone after selecting the teacher .\n\t- you can search for a teacher by filling\nany of his/her infromations and the table below\nthat contains all of the teachers will be \nfiltered , so you can find the teacher you are \nlooking for in that list.\n\t- You can always upload a teacher's \npicture when adding/editing a teacher .\n\t- You can always remove a teacher's \npicture by editing him/her information without\nuploading a new picture.\n\t-You can always export the list of \nteachers contained inner the table to Google\nsheets , so you can manipulate it or send it\nor print it or even use it \nin statics .\n   \n");
        jScrollPane1.setViewportView(constraintTA);

        aboutUsLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        aboutUsLabel.setForeground(new java.awt.Color(144, 153, 164));
        aboutUsLabel.setText("Teacher constraints");

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(aboutUsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutUsLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rootPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rootPanelMousePressed
        // TODO add your handling code here:
        mouseClickPoint = evt.getPoint(); // update the position
    }//GEN-LAST:event_rootPanelMousePressed

    private void rootPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rootPanelMouseDragged
        // TODO add your handling code here:
        Point newPoint = evt.getLocationOnScreen();
        newPoint.translate(-mouseClickPoint.x, -mouseClickPoint.y); // Moves the point by given values from its location
        setLocation(newPoint); // set the new location
    }//GEN-LAST:event_rootPanelMouseDragged

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed


    
 
    
     private void initVisibility() {
     
               }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutUsLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextArea constraintTA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel rootPanel;
    // End of variables declaration//GEN-END:variables

    private Point mouseClickPoint ;

}
