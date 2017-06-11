/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import com.sun.glass.events.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static javaassignment.Login.Search;
import static javaassignment.MemberReg.Updater;
import javax.swing.JOptionPane;

/**
 *
 * @author Prasanga Fernando
 */
public class BookBorrow extends javax.swing.JFrame {

    /**
     * Creates new form BookBorrow
     */
    public BookBorrow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMemberID = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        btnBorrow = new javax.swing.JButton();
        dtpDate = new org.jdesktop.swingx.JXDatePicker();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnReserve = new javax.swing.JButton();
        dtpReturnDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(570, 330));
        getContentPane().setLayout(null);

        jLabel2.setText("Member ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(69, 80, 70, 14);

        jLabel3.setText("ISBN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 120, 40, 14);

        jLabel4.setText("Borrowed Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 170, 80, 14);

        txtMemberID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMemberIDKeyPressed(evt);
            }
        });
        getContentPane().add(txtMemberID);
        txtMemberID.setBounds(140, 80, 150, 30);

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
        txtISBN.setBounds(140, 120, 150, 30);

        btnBorrow.setBackground(new java.awt.Color(204, 204, 0));
        btnBorrow.setText("Borrow the Book");
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrow);
        btnBorrow.setBounds(143, 232, 130, 40);

        dtpDate.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(dtpDate);
        dtpDate.setBounds(140, 160, 150, 25);

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel1.setText("Book Borrowing");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 570, 60);

        btnReserve.setText("Reserve the Book");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });
        getContentPane().add(btnReserve);
        btnReserve.setBounds(300, 230, 130, 40);
        getContentPane().add(dtpReturnDate);
        dtpReturnDate.setBounds(140, 200, 150, 22);

        jLabel6.setText("Return Date");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 200, 70, 14);

        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Do not fill this if reserving a book");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(300, 200, 180, 14);
        getContentPane().add(background);
        background.setBounds(0, 0, 570, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBNActionPerformed

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
    
    
    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
      
        try{
             long temp = getdateDifference(getDate(),getReturnDate());
                          
            if(temp > 0){//Member at least keep the book for a day

        bookBorrow();
        String borrowedDate = getDate();
        String returnDate = getReturnDate();

        String sql = "INSERT INTO BookBorrowing (MemberID,ISBN,BorrowedDate, ReturnDate) values('"+ txtMemberID.getText() +"', '"+ txtISBN.getText() +"', '"+borrowedDate+"','"+returnDate+"')";
        Updater(sql);
        
        deleteBook();
           }
         }
          
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
        
     

    }//GEN-LAST:event_btnBorrowActionPerformed

    private void txtMemberIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberIDKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){//Code by Miss Malsha
        getsqlMember();              
    }         
        
    }//GEN-LAST:event_txtMemberIDKeyPressed
private void getsqlMember(){
    //Created in a seperate method to increase cohesion
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

private void bookBorrow(){//This method also includes insert data to the "borrowedbooks" table in the database
   
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
            
            String sqlinsert = "INSERT INTO borrowedbooks (ISBN, BOOKTITLE, AUTHOR, PUBLISHER, EDITION, CATEGORY, YEAR) values('"+ISBN +"','"+ TITLE +"', '"+ AUTHOR +"', '"+PUBLISHER+"', '"+EDITION+"', '"+CATEGORY+"', '"+YEAR+"')";
            
            Updater(sqlinsert);
           }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
           
           
}
private void bookReserve(){//This method also includes insert data to the "borrowedbooks" table in the database
   
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
            
            String sqlinsert = "INSERT INTO reservedbooks (ISBN, BOOKTITLE, AUTHOR, PUBLISHER, EDITION, CATEGORY, YEAR) values('"+ISBN +"','"+ TITLE +"', '"+ AUTHOR +"', '"+PUBLISHER+"', '"+EDITION+"', '"+CATEGORY+"', '"+YEAR+"')";
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
    private void txtISBNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtISBNKeyPressed
         if(evt.getKeyCode()== KeyEvent.VK_ENTER){
                     getsqlISBN();
         }
    }//GEN-LAST:event_txtISBNKeyPressed

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        try{
        //getsqlMember();
       // getsqlISBN();
        bookReserve();
        String borrowedDate = getDate();
                
        String sql = "INSERT INTO bookreservation (Member_ID,ISBN,RESERVED_DATE) values('"+ txtMemberID.getText() +"', '"+ txtISBN.getText() +"', '"+borrowedDate+"')";
        
        Updater(sql);
        JOptionPane.showMessageDialog(null, "Successfully reserved");
        
       // deleteBook();
         }
          
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnReserveActionPerformed
   
    private String getDate(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        dtpDate.setFormats(df);
        DateFormat sysDate = new SimpleDateFormat("yyyy/MM/dd");
        String Date = sysDate.format(dtpDate.getDate());
        return Date;
     }
 
    private String  getReturnDate(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        dtpReturnDate.setFormats(df);
        DateFormat sysDate = new SimpleDateFormat("yyyy/MM/dd");
        String Date = sysDate.format(dtpReturnDate.getDate());
        return Date;
     }
    public long getdateDifference(String Date1, String Date2) throws IOException{
              
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String firstInput = Date1;
        final String secondInput = Date2;
        final LocalDate firstDate = LocalDate.parse(firstInput, formatter);
        final LocalDate secondDate = LocalDate.parse(secondInput, formatter);
        final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        return days;
    }
    
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
            java.util.logging.Logger.getLogger(BookBorrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookBorrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookBorrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookBorrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookBorrow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnReserve;
    private org.jdesktop.swingx.JXDatePicker dtpDate;
    private org.jdesktop.swingx.JXDatePicker dtpReturnDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtMemberID;
    // End of variables declaration//GEN-END:variables
}
