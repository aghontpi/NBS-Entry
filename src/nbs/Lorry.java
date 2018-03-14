/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Zero
 */
public class Lorry extends javax.swing.JFrame {

    /**
     * Creates new form Lorry
     */
    public Lorry() {
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

        aaa = new javax.swing.JLabel();
        bbbb = new javax.swing.JLabel();
        vvvv = new javax.swing.JLabel();
        sakm = new javax.swing.JTextField();
        vvvvdd = new javax.swing.JLabel();
        clkm = new javax.swing.JTextField();
        ldate = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mdes = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lother = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        nol = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lds = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ldq = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lre = new javax.swing.JTextField();
        lorry = new javax.swing.JComboBox<>();
        ma = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aaa.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        aaa.setText("Lorry");

        bbbb.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        bbbb.setText("Date");

        vvvv.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        vvvv.setText("Starting KM");

        sakm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sakmActionPerformed(evt);
            }
        });

        vvvvdd.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        vvvvdd.setText("Closing KM ");

        clkm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clkmActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        jLabel6.setText("Maintance Rate");

        jLabel7.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        jLabel7.setText("Description");

        mdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdesActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        jLabel8.setText("Other Alvance");

        lother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotherActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        jLabel9.setText("No. Load");

        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        jLabel10.setText("Diesel Rate");

        lds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ldsActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        jLabel11.setText("Diesel Quantity");

        ldq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ldqActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        jLabel12.setText("Rent");

        lorry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L1", "L2", "L3", "L4" }));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aaa)
                    .addComponent(bbbb)
                    .addComponent(vvvv)
                    .addComponent(vvvvdd)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sakm)
                    .addComponent(ldate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clkm)
                    .addComponent(mdes)
                    .addComponent(lorry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ma))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jButton2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lother, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(nol)
                    .addComponent(lds)
                    .addComponent(ldq)
                    .addComponent(lre)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lorry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bbbb)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sakm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vvvv)
                            .addComponent(jLabel10)
                            .addComponent(lds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clkm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vvvvdd)
                            .addComponent(jLabel11)
                            .addComponent(ldq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(105, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aaa)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(lother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(36, 36, 36))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sakmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sakmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sakmActionPerformed

    private void clkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clkmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clkmActionPerformed

    private void mdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdesActionPerformed

    private void lotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotherActionPerformed

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nolActionPerformed

    private void ldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ldsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ldsActionPerformed

    private void ldqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ldqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ldqActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
               // lorry name
              String lname=(String)lorry.getSelectedItem();
              //date
               Date oDate = ldate.getDate();        
               DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
               String ldate = sdf.format(oDate);
               // st is strating km
          int skm=Integer.parseInt(sakm.getText());
          // cl is closing km
          int ckm=Integer.parseInt(clkm.getText());
          // r is rent
          int rent=Integer.parseInt(lre.getText());
          //  is diesel rate
          int drate=Integer.parseInt(lds.getText());
          //dq is diesel quantity 
          int dquant=Integer.parseInt(ldq.getText());
          
           // maintance rate
           int marate=Integer.parseInt(ma.getText());
           // maintance Description
           String mades=mdes.getText();
           // other alvance
           int other=Integer.parseInt(lother.getText());
           // no of load 
            int no=Integer.parseInt(nol.getText());
            //total income
            int tot=(no*rent)-(drate*dquant)-other; 
            // milage
            int m=(ckm-skm)/dquant;
           
            
             FileInputStream FILE_NAME = null; 
        try {
            FILE_NAME = new FileInputStream("lorry.xlsx");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mainf.class.getName()).log(Level.SEVERE, null, ex);
        }

        XSSFWorkbook workbook = null;
        XSSFSheet sheet = null ;
        try {
                workbook = new XSSFWorkbook(FILE_NAME ); //If there is already data in a workbook
                sheet = workbook.getSheetAt(0);
           
        } catch (IOException ex) {
            Logger.getLogger(Mainf.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        Object[][] datatypes = {
                {ldate,lname,skm,ckm,rent,drate,dquant,m,marate,tot,mades}              
        };

        int rowNum =sheet.getLastRowNum();
        System.out.println("Creating excel");
        

       for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum+1);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            FILE_NAME.close(); //Close the InputStream
        } catch (IOException ex) {
            Logger.getLogger(Mainf.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileOutputStream outputStream = new FileOutputStream("lorry.xlsx");
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }

           try
    {
      // create a mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/test";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
    
      // create a sql date object so we can use it in our INSERT statement
      Calendar calendar = Calendar.getInstance();
      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

      // the mysql insert statement
      String query = " insert into lor (Date,Skm,Ckm,Rent,drate,dquant,mrate,other,no,total,milage,MDes)"
        + " values (?, ?, ?,?,?,?,?,?,?,?,?,?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
          preparedStmt.setString(1,ldate);
          preparedStmt.setInt(2, skm);
          preparedStmt.setInt(3, ckm);
          preparedStmt.setInt(4, rent);
          preparedStmt.setInt(5, drate);
          preparedStmt.setInt(6, dquant);
          preparedStmt.setInt(7, marate);
          preparedStmt.setInt(8,  other);
          preparedStmt.setInt(9,no);
          preparedStmt.setInt(10, tot);
          preparedStmt.setInt(11, m);
          preparedStmt.setString(12, mades);

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  
        
        System.out.println("Done");
        setVisible(false);
        
        
       exit(0);
                                         
                                    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Start main = new Start();
        main.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Lorry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lorry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lorry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lorry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lorry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aaa;
    private javax.swing.JLabel bbbb;
    private javax.swing.JTextField clkm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private org.jdesktop.swingx.JXDatePicker ldate;
    private javax.swing.JTextField ldq;
    private javax.swing.JTextField lds;
    private javax.swing.JComboBox<String> lorry;
    private javax.swing.JTextField lother;
    private javax.swing.JTextField lre;
    private javax.swing.JTextField ma;
    private javax.swing.JTextField mdes;
    private javax.swing.JTextField nol;
    private javax.swing.JTextField sakm;
    private javax.swing.JLabel vvvv;
    private javax.swing.JLabel vvvvdd;
    // End of variables declaration//GEN-END:variables
}
