/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbs;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Zero
 */
public class Mainf extends javax.swing.JFrame {

    /**
     * Creates new form mainf
     */
    public Mainf() {
        initComponents();
        getContentPane().setBackground(Color.lightGray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sh = new javax.swing.JTextField();
        ch = new javax.swing.JTextField();
        re = new javax.swing.JTextField();
        ds = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dq = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dayy = new javax.swing.JCheckBox();
        nightt = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        aaa = new javax.swing.JComboBox<>();
        da = new org.jdesktop.swingx.JXDatePicker();
        mregular = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mrate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        mdes = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel1.setText("Date");

        jLabel2.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel2.setText("Starting Hour");

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel3.setText("Closing Hour");

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel4.setText("Rent");

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel5.setText("Diesel Rate");

        sh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shActionPerformed(evt);
            }
        });

        re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reActionPerformed(evt);
            }
        });

        ds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel6.setText("Diesel ");

        dq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dqActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel8.setText("Shift");

        dayy.setFont(new java.awt.Font("Myriad Pro", 1, 11)); // NOI18N
        dayy.setText("Day");

        nightt.setFont(new java.awt.Font("Myriad Pro", 1, 11)); // NOI18N
        nightt.setText("Night");

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel9.setText("Vechical ");

        aaa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "v1", "v2", "v3", "v4" }));
        aaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aaaActionPerformed(evt);
            }
        });

        da.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daActionPerformed(evt);
            }
        });

        mregular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nothing", "Engine oil \t        250", "Hydraulic oil\t        1000", "Hydraulic strainer  250", "Air filter                 250", "Diesel filter\t         250", "Track motor oil       1000", "Swing motor oil       500", "Swing bearing         500" }));
        mregular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mregularActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel11.setText("Maintance Regular ");

        jLabel12.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel12.setText("Maintance RS");

        mrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrateActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Myriad Pro", 3, 16)); // NOI18N
        jLabel13.setText("Description");

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
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(104, 104, 104)
                        .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(90, 90, 90))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(130, 130, 130)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(re, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dq, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ds, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(da, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nightt)
                                            .addComponent(dayy)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sh, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ch, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mdes, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel11))
                                        .addGap(85, 85, 85)
                                        .addComponent(mregular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mrate, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(244, 244, 244))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(da, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(dayy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nightt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel8)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(mregular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(mrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(mdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void shActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shActionPerformed

    private void reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reActionPerformed

    private void dsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsActionPerformed

    private void dqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dqActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date oDate = da.getDate();
        DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String dateS =sdf.format(oDate);
        String vname=(String)aaa.getSelectedItem();
        int shour=Integer.parseInt(sh.getText());
        int chour=Integer.parseInt(ch.getText());
        int rent=Integer.parseInt(re.getText());
        int drate=Integer.parseInt(ds.getText());
        int dquant=Integer.parseInt(dq.getText());
        String maregular=(String)mregular.getSelectedItem();
        int marate=Integer.parseInt(mrate.getText());
        String mades=mdes.getText();
        int i = 0;
        int dif=chour-shour;
        int ea=dif*rent;
        int tot=(ea-(dquant*drate))-marate;
      
        String day="",ni8="";
        if(dayy.isSelected())
            day="Day";
        if(nightt.isSelected())
            ni8="Night";
        String sf=day+"/"+ni8;
        FileInputStream FILE_NAME = null;
        try {
            FileInputStream FILE = new FileInputStream("test.xlsx");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mainf.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FILE_NAME = new FileInputStream("test.xlsx");
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
            {dateS,vname,sf,shour,chour,rent,dif,drate,dquant,ea,maregular,marate,tot,mades}
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
            FileOutputStream outputStream = new FileOutputStream("test.xlsx");
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
      String query = " insert into hit (Date,vn,Shift,Sh,Ch,Rent,RHour,DRate,DQuantity,Earning,MRegular,MRate,total,MDes)"
        + " values (?, ?, ?, ?, ?,?,?,?,?,?,?,?,?,?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
          preparedStmt.setString(1,dateS);
          preparedStmt.setString(2, vname);
          preparedStmt.setString(3, sf);
          preparedStmt.setInt(4, shour);
          preparedStmt.setInt(5, chour);
          preparedStmt.setInt(6, rent);
          preparedStmt.setInt(7, dif);
          preparedStmt.setInt(8, drate);
          preparedStmt.setInt(9, dquant);
          preparedStmt.setInt(10, ea);
          preparedStmt.setString(11, maregular);
          preparedStmt.setInt(12, marate);
          preparedStmt.setInt(13, tot);
          preparedStmt.setString(14, mades);

      // execute the preparedstatement
      preparedStmt.execute();
      System.out.println(maregular);
      try{
      String s1="SELECT * FROM v1 WHERE  vn=? ";
      String f=",",e=",",h=",",a=",",d=",",t=",",s=",",b = ",";int z=0;
        PreparedStatement p = conn.prepareStatement(s1);
        p.setString(1,vname ); 
        ResultSet rq = p.executeQuery(); 
        while(rq.next()){
            if(maregular=="Nothing"){
        if(chour>rq.getInt(2))
        { z=1;f="Engine oil";}
        if(chour>rq.getInt(3))
        { e="Hydraulic oil";z=1;}
        if(chour>rq.getInt(4))
        {h="Hydraulic strainer";z=1;}
        if(chour>rq.getInt(5)) 
        {            a="Air filter";z=1;}        
        if(chour>rq.getInt(6))   
        {d="Diesel filter"; z=1;}  
        if(chour>rq.getInt(7)) 
        {t="Track motor oil";  z=1;} 
        if(chour>rq.getInt(8))
        {s="Swing motor oil";z=1;}
        if(chour>rq.getInt(9))
        {b="Swing bearing";z=1;}
       
            }
        }
         if(z==1)
      {
            JOptionPane.showMessageDialog(null,"Your\t "+ f+","+e+","+h+","+a+","+d+","+ t+","+s+","+b+" \tchange is expire");
      }
      }catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
     
     
       String flag=null;
      try{
      switch(maregular)
      {
          case "Engine oil 	        250"  : 
              String s="SELECT * FROM v1 WHERE  vn=? ";
        PreparedStatement pst = conn.prepareStatement(s);
        pst.setString(1,vname ); 
        ResultSet r = pst.executeQuery(); 
        while(r.next())
        i=r.getInt(2);
            
                if(i<=chour)
          flag="Engine oil";  
        System.out.print(flag);
        String ss="update v1 set en = ? where vn = ?";
         PreparedStatement p22 = conn.prepareStatement(ss);
          chour=chour+250;
         p22.setInt(1,chour); 
           p22.setString(2,vname);
          p22.executeUpdate();
        break;
       case "Hydraulic oil	        1000" : 
      PreparedStatement pst1 = conn.prepareStatement("SELECT * FROM v1 WHERE  vn=? ");
        pst1.setString(1,vname ); 
         ResultSet r1 = pst1.executeQuery(); 
        while(r1.next())
        i=r1.getInt(3);
        if(i<=chour)
          flag="Hydraulic oil 1000"; 
         PreparedStatement p2 = conn.prepareStatement("update v1 set hyo = ? where vn = ?");
           chour=chour+1000;
         p2.setString(2,vname);
           p2.setInt(1,chour); 
          p2.executeUpdate();
         case "Hydraulic strainer  250"  : 
      PreparedStatement pst2 = conn.prepareStatement("SELECT * FROM v1 WHERE  vn=? ");
        pst2.setString(1,vname ); 
         ResultSet rr2r = pst2.executeQuery(); 
       while(rr2r.next())
        i=rr2r.getInt(4);
        if(i<=chour)
          flag="Hydraulic strainer  250"; 
        
             PreparedStatement p2p = conn.prepareStatement("update v1 set hys = ? where vn = ?");
         p2p.setString(2,vname);
         chour=chour+250;
        p2p.setInt(1,chour); 
       p2p.executeUpdate();
       
        break;
          case"Air filter                 250": 
      PreparedStatement pst3 = conn.prepareStatement("SELECT * FROM v1 WHERE  vn=? ");
        pst3.setString(1,vname ); 
         ResultSet r3 = pst3.executeQuery(); 
       while(r3.next())
        i=r3.getInt(5);
        if(i<=chour)
          flag="Air filter 250"; 
        
             PreparedStatement p2a = conn.prepareStatement("update v1 set af = ? where vn = ?");
         p2a.setString(2,vname);
         chour=chour+250;
        p2a.setInt(1,chour); 
        p2a.executeUpdate();
        break;
              case "Diesel filter	         250" : 
      PreparedStatement pst4 = conn.prepareStatement("SELECT * FROM v1 WHERE  vn=? ");
        pst4.setString(1,vname ); 
         ResultSet r4 = pst4.executeQuery(); 
         while(r4.next())
        i=r4.getInt(6);
        if(i<=chour)
          flag="Diesel filter 250";  
        
              PreparedStatement p2z = conn.prepareStatement("update v1 set df = ? where vn = ?");
         p2z.setString(2,vname);
          chour=chour+250;
        p2z.setInt(1,chour); 
        p2z.executeUpdate();
        break;
        
              case"Track motor oil       1000"  : 
      PreparedStatement pst5 = conn.prepareStatement("SELECT * FROM v1 WHERE  vn=? ");
        pst5.setString(1,vname ); 
         ResultSet r5 = pst5.executeQuery(); 
        while(r5.next())
        i=r5.getInt(7);
        if(i<=chour)
          flag="Track motor oil 1000";  
        
                   PreparedStatement p2b = conn.prepareStatement("update v1 set tm = ? where vn = ?");
         p2b.setString(2,vname);
          chour=chour+1000;
        p2b.setInt(1,chour); 
         p2b.executeUpdate();
              case "Swing motor oil       500" : 
      PreparedStatement pst6 = conn.prepareStatement("SELECT * FROM v1 WHERE  vn=? ");
        pst6.setString(1,vname ); 
         ResultSet r6 = pst6.executeQuery(); 
          while(r6.next())
        i=r6.getInt(8);
        if(i<=chour)
          flag="Swing motor oil 500";  
        
                    PreparedStatement p2q = conn.prepareStatement("update v1 set sm = ? where vn = ?");
         p2q.setString(2,vname);
          chour=chour+500;
        p2q.setInt(1,chour); 
     p2q.executeUpdate();
        
                case "Swing bearing         500"  : 
      PreparedStatement pst7 = conn.prepareStatement("SELECT * FROM v1 WHERE  vn=? ");
        pst7.setString(1,vname ); 
         ResultSet r7 = pst7.executeQuery(); 
         while(r7.next())
        i=r7.getInt(9);
        if(i<=chour)
          flag="Swing bearing   500" ; 
         chour=chour+500;
          PreparedStatement p2v = conn.prepareStatement("update v1 set sb = ? where vn = ?");
         p2v.setString(2,vname);
         p2v.setInt(1,chour); 
         p2v.executeUpdate();
        case "Nothing"  : 
                    System.out.print("switch done");
        break;
      }
      conn.close();
      if(flag!=null)
      {
            JOptionPane.showMessageDialog(null,"Your excavator \t"+vname+" \t"+flag+"\t next change is  :\t"+chour+" Hr");
      }
      }catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  
        
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aaaActionPerformed

    private void daActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daActionPerformed

    private void mregularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mregularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mregularActionPerformed

    private void mrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mrateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Start m=new Start();
        m.setVisible(true);
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
            java.util.logging.Logger.getLogger(Mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aaa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField ch;
    private org.jdesktop.swingx.JXDatePicker da;
    private javax.swing.JCheckBox dayy;
    private javax.swing.JTextField dq;
    private javax.swing.JTextField ds;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mdes;
    private javax.swing.JTextField mrate;
    private javax.swing.JComboBox<String> mregular;
    private javax.swing.JCheckBox nightt;
    private javax.swing.JTextField re;
    private javax.swing.JTextField sh;
    // End of variables declaration//GEN-END:variables
}
