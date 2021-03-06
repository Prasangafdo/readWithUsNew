/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.awt.event.*;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import static javaassignment.Login.Search;
import static javaassignment.MemberReg.Updater;
import javax.swing.*;

/**
 *
 * @author Prasanga Fernando
 */
public class BookReservation extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public BookReservation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMemberID = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        dtpDate = new org.jdesktop.swingx.JXDatePicker();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnReserve = new javax.swing.JButton();
        btnCompleteReservation = new javax.swing.JButton();
        btnCheckreservation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 370));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Member ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 110, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("ISBN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 140, 40, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Reservation  Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 210, 130, 17);

        txtMemberID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMemberIDKeyPressed(evt);
            }
        });
        getContentPane().add(txtMemberID);
        txtMemberID.setBounds(160, 70, 170, 30);

        txtISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISBNActionPerformed(evt);
            }
        });
        txtISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtISBNKeyPressed(evt);
            }
        });
        getContentPane().add(txtISBN);
        txtISBN.setBounds(160, 130, 170, 30);

        dtpDate.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(dtpDate);
        dtpDate.setBounds(160, 200, 170, 25);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel1.setText("Book Reservation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 60);

        btnReserve.setBackground(new java.awt.Color(42, 185, 68));
        btnReserve.setText("Reserve the Book");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });
        getContentPane().add(btnReserve);
        btnReserve.setBounds(290, 270, 130, 40);

        btnCompleteReservation.setBackground(new java.awt.Color(153, 48, 48));
        btnCompleteReservation.setText("Complete/ Cancel Reservation");
        btnCompleteReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteReservationActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompleteReservation);
        btnCompleteReservation.setBounds(30, 270, 210, 40);

        btnCheckreservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaassignment/f286c9a5f88adc84611943dd55daaeea_best-sat-prep-books-2017-picures-of-books_460-276.jpeg"))); // NOI18N
        getContentPane().add(btnCheckreservation);
        btnCheckreservation.setBounds(0, 0, 460, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMemberIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberIDKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){//Code by Miss Malsha
            getsqlMember();
        }
    }//GEN-LAST:event_txtMemberIDKeyPressed

    private void txtISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBNActionPerformed

    private void txtISBNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISBNKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            getsqlISBN();
        }
    }//GEN-LAST:event_txtISBNKeyPressed

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        try{
            //Working
            bookReserve();
            reportBookReservation();
            String borrowedDate = getDate();

            String sql = "INSERT INTO bookreservation (MemberID,ISBN,RESERVEDDATE) values('"+ txtMemberID.getText() +"', '"+ txtISBN.getText() +"', '"+borrowedDate+"')";

            Updater(sql);
            JOptionPane.showMessageDialog(null, "Successfully reserved");
             deleteBook();
        }

        catch( Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnReserveActionPerformed

    private void btnCompleteReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteReservationActionPerformed
       
       recoverBook();//Working
       deleteReservation();
    }//GEN-LAST:event_btnCompleteReservationActionPerformed

    private void reportBookReservation(){
         try{
            String resDate = getDate();
            String sql = "INSERT INTO bookreservationreports (ISBN, MemberID, ReservedDate)"
                    + "values('"+ txtISBN.getText() +"', '"+ txtMemberID.getText() 
                    +"','"+resDate+"')";

            Updater(sql);
            }

        catch( Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
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
            java.util.logging.Logger.getLogger(BookReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookReservation().setVisible(true);
            }
        });

    }
    private void deleteBook(){
                
        try{
            String sql = "DELETE from `bookreg` WHERE `ISBN` = '"+txtISBN.getText()+"'";
          Updater(sql);
          JOptionPane.showMessageDialog(null, "Sucessful");
        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
         }
    }
 
    private void getsqlMember(){
    //Created in a seperate method
    try{               
            String sqlUsername = "SELECT MemberID FROM Member where MemberID = '"+txtMemberID.getText()+"'";
            ResultSet rs = Search(sqlUsername);
            
            String ID = ""; 
            if(rs.first()){
            ID = (rs.getString("memberID"));
           
            }
            if(ID.equals(txtMemberID.getText())){//If the Member ID is in the system
                txtISBN.requestFocus();//Focusing to the next txt Field
            }
           else if(!ID.equals(txtMemberID.getText())){//If the Member ID is not the system
                JOptionPane.showMessageDialog(null, "Member not registered!");
    
       
            }
        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    
}

    private void bookReserve(){
   
     try{               
            String sqlBookDetails = "SELECT ISBN, TITLE, AUTHOR, PUBLISHER,EDITION, CATEGORY, YEAR FROM BOOKREG WHERE ISBN ='"+txtISBN.getText()+"'";
            ResultSet rs = Search(sqlBookDetails);
          
            
            String ISBN = ""; 
            String TITLE = ""; 
            String AUTHOR = ""; 
            String PUBLISHER = ""; 
            String EDITION = ""; 
            String CATEGORY = ""; 
            String YEAR = ""; 
           
            rs.first();//Does the searching
 
            ISBN = (rs.getString("ISBN"));
            TITLE = (rs.getString("TITLE"));
            AUTHOR = (rs.getString("AUTHOR"));
            PUBLISHER = (rs.getString("PUBLISHER"));
            EDITION = (rs.getString("EDITION"));
            CATEGORY = (rs.getString("CATEGORY"));
            YEAR = (rs.getString("YEAR"));
            
            String sqlinsert = "INSERT INTO reservedbooks (ISBN, BOOKTITLE, AUTHOR, PUBLISHER, EDITION, CATEGORY, YEAR) "
                    + "values('"+ISBN +"','"+ TITLE +"', '"+ AUTHOR +"', '"+PUBLISHER+"', '"+EDITION+"', '"+CATEGORY+"', '"+YEAR+"')";
            Updater(sqlinsert);
           }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
           
           
}

    private  void getsqlISBN(){
    
             try{     
            String sqlUsername = "SELECT ISBN FROM bookreg where ISBN = '"+txtISBN.getText()+"'";
            ResultSet rs = Search(sqlUsername);
            
            String sqlISBN = ""; 
           
            sqlISBN = (rs.getString("ISBN"));

            if(sqlISBN.equals(txtISBN.getText())){
                dtpDate.requestFocus();
            }
           else if(!sqlISBN.equals(txtISBN.getText())){//If the Book ID is not in the system
                JOptionPane.showMessageDialog(null, "Book not registered!");
    
       
            }
        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
}
                                         
   
    private String getDate(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        dtpDate.setFormats(df);
        DateFormat sysDate = new SimpleDateFormat("yyyy/MM/dd");
        String Date = sysDate.format(dtpDate.getDate());
        return Date;
     }

    private void deleteReservation(){
        try{
            String sql1 = "DELETE from `reservedbooks` WHERE ISBN ='"+getISBN()+"'";
          Updater(sql1);
            String sql = "DELETE from `bookreservation` WHERE `ISBN` = '"+getISBN()+"'";
          Updater(sql);
          
          JOptionPane.showMessageDialog(null, "Value deleted successfully");
        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
         }
    }
    
    private void recoverBook(){//working
        String BookTitle = "";
        String Author = "";
        String Publisher = "";
        String Edition = "";
        String Category = "";
        String Year = "";
        
         try{               
            String sql = "SELECT BookTitle,Author,Publisher,Edition,Category,Year FROM `reservedbooks` WHERE ISBN ='"+getISBN()+"'";
            ResultSet rs = Search(sql);
    
            rs.first();
            BookTitle = rs.getString("BookTitle");
            Author = rs.getString("Author");
            Publisher = rs.getString("Publisher");
            Edition = rs.getString("Edition");
            Category = rs.getString("Category");
            Year = rs.getString("Year");
             
             String sql1 = "INSERT INTO Bookreg (ISBN,TITLE, AUTHOR, PUBLISHER, EDITION, CATEGORY, YEAR) "
                     + "values('"+getISBN()+"', '"+BookTitle+"', '"+Author+"', '"+Publisher+"', '"+Edition+"', '"+Category+"', '"+Year+"')";
            Updater(sql1);
        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    
    }
       
    private String getISBN(){
        String ISBN = "";
         try{               
            String sqlUsername = "SELECT ISBN FROM `bookreservation` WHERE MemberID ='"+txtMemberID.getText()+"'";
            ResultSet rs = Search(sqlUsername);
    
            rs.first();
            ISBN = rs.getString("ISBN");
        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
        return ISBN;
    }
    
   /* private String getBorrowID(){ //Uncomment this only if you need to check the borrowID for debugging purposes.
        String BorrowID = "";
         try{               
            String sql = "SELECT BorrowID FROM `bookreservation` WHERE MemberID ='"+txtMemberID.getText()+"'";
            ResultSet rs = Search(sql);
    
            rs.first();
            BorrowID = rs.getString("BorrowID");
    
        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
        return BorrowID;
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCheckreservation;
    private javax.swing.JButton btnCompleteReservation;
    private javax.swing.JButton btnReserve;
    private org.jdesktop.swingx.JXDatePicker dtpDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtMemberID;
    // End of variables declaration//GEN-END:variables
}
