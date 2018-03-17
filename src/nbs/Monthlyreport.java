/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbs;

import static java.awt.Color.red;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static org.apache.poi.hslf.record.RecordTypes.Document;
import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.LineSpacingRule;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author Zero
 */
public class Monthlyreport extends javax.swing.JFrame {

    /**
     * Creates new form Monthlyreport
     */
    public Monthlyreport() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        m = new javax.swing.JRadioButton();
        r = new javax.swing.JRadioButton();
        fr = new org.jdesktop.swingx.JXDatePicker();
        to = new org.jdesktop.swingx.JXDatePicker();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        vn = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        month = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        jLabel3.setText("vehicle name");

        buttonGroup1.add(m);
        m.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        m.setText("Single day");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        buttonGroup1.add(r);
        r.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r.setText("range");

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        jLabel5.setText("Month");

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 3, 14)); // NOI18N
        jLabel6.setText("Range");

        vn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "v1", "v2", "v3", "v4" }));
        vn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vnActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setToolTipText("");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "V.Name", "Shift", "S.Hour", "C.Hour", "Rent", "R.Hour", "D.Rate", "D.Quant", "Earning", "M.Regular", "M.Rate", "Total", "M.Des"
            }
        ));
        table.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setHeaderValue("Date");
            table.getColumnModel().getColumn(1).setHeaderValue("V.Name");
            table.getColumnModel().getColumn(2).setHeaderValue("Shift");
            table.getColumnModel().getColumn(3).setHeaderValue("S.Hour");
            table.getColumnModel().getColumn(4).setHeaderValue("C.Hour");
            table.getColumnModel().getColumn(5).setHeaderValue("Rent");
            table.getColumnModel().getColumn(6).setHeaderValue("R.Hour");
            table.getColumnModel().getColumn(7).setHeaderValue("D.Rate");
            table.getColumnModel().getColumn(8).setHeaderValue("D.Quant");
            table.getColumnModel().getColumn(9).setHeaderValue("Earning");
            table.getColumnModel().getColumn(10).setHeaderValue("M.Regular");
            table.getColumnModel().getColumn(11).setHeaderValue("M.Rate");
            table.getColumnModel().getColumn(12).setHeaderValue("Total");
            table.getColumnModel().getColumn(13).setHeaderValue("M.Des");
        }

        jButton3.setText("Document");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Myriad Pro", 1, 14)); // NOI18N
        jLabel2.setText("To");

        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(m, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r)
                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fr, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton3)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(m)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mActionPerformed

    private void vnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model;
        model = (DefaultTableModel) table.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(model.getRowCount() - 1);
        }
        String vna = (String) vn.getSelectedItem();

        int z = 0;
        if (m.isSelected()) {
            z = 1;
        }
        if (r.isSelected()) {
            z = 2;
        }

        switch (z) {
            case 1:
                Date edate = month.getDate();
                DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String da = sdf.format(edate);

                ResultSet resultSet = null;

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "")) {
                        //here test is database name, root is username
                        PreparedStatement pst = con.prepareStatement("Select * from hit where Date=? and vn=?");
                        pst.setString(1, da);
                        pst.setString(2, vna);
                        resultSet = pst.executeQuery();

                        ResultSetMetaData md = resultSet.getMetaData();
                        int colnum = md.getColumnCount();
                        String Row[];
                        int flag = 0;
                        String Check = "";
                        Row = new String[colnum];
                        while (resultSet.next()) {
                            for (int i = 1; i <= colnum; i++) {
                                if (i == colnum) {
                                    if (resultSet.getString(i) == null) {
                                        Row[i - 1] = "Not Issued";
                                        model.addRow(Row);
                                    } else {
                                        if (flag == 1) {
                                            continue;
                                        }
                                        Row[i - 1] = "Issued";
                                        model.addRow(Row);
                                    }
                                    System.out.println(resultSet.getString(i));
                                } else {
                                    Row[i - 1] = resultSet.getString(i);
                                }

                            }

                        }

                        // processing returned data and printing into console
                        con.close();

                    } catch (Exception a) {
                        System.err.println("Got an exception!");
                        System.err.println(a.getMessage());
                    }

                } catch (Exception e) {
                    System.err.println("Got an exception!");
                    System.err.println(e.getMessage());
                }
                break;

            //Range selection
            case 2:
                //from date
                Date fdate = fr.getDate();
                DateFormat esdf = new SimpleDateFormat("dd-MM-yyyy");
                String datef = esdf.format(fdate);

                //to date
                Date tate = to.getDate();
                DateFormat asdf = new SimpleDateFormat("dd-MM-yyyy");
                String datet = asdf.format(tate);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "")) {
                        //here test is database name, root is username
                        PreparedStatement pst = con.prepareStatement("SELECT * FROM hit WHERE (Date BETWEEN ? AND ?)AND vn=?");
                        pst.setString(1, datef);
                        pst.setString(2, datet);
                        pst.setString(3, vna);
                        resultSet = pst.executeQuery();
                        ResultSetMetaData md = resultSet.getMetaData();
                        int colnum = md.getColumnCount();
                        String Row[];
                        int flag = 0;
                        String Check = "";
                        Row = new String[colnum];
                        while (resultSet.next()) {
                            for (int i = 1; i <= colnum; i++) {
                                if (i == colnum) {
                                    if (resultSet.getString(i) == null) {
                                       
                                        model.addRow(Row);
                                    } else {
                                        if (flag == 1) {
                                            continue;
                                        }
                                       
                                        model.addRow(Row);
                                    }
                                    System.out.println(resultSet.getString(i));
                                } else {
                                    Row[i - 1] = resultSet.getString(i);
                                }

                            }

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Monthlyreport.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Monthlyreport.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Start main = new Start();
        main.setVisible(true);
        setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String vna = (String) vn.getSelectedItem();
        String toa = add.getText();
        int z = 0;
        int i = 0, j = 0;
        if (m.isSelected()) {
            z = 1;
        }
        if (r.isSelected()) {
            z = 2;
        }
        if (z == 2) {
            //from date
            Date fdate = fr.getDate();
            DateFormat esdf = new SimpleDateFormat("dd-MM-yyyy");
            String datef = esdf.format(fdate);

            //to date
            Date tate = to.getDate();
            DateFormat asdf = new SimpleDateFormat("dd-MM-yyyy");
            String datet = asdf.format(tate);
            ResultSet resultSet = null, r = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Monthlyreport.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con = null;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Monthlyreport.class.getName()).log(Level.SEVERE, null, ex);
            }
            //here test is database name, root is username
            try {
                PreparedStatement pst = con.prepareStatement("SELECT * FROM hit WHERE (Date BETWEEN ? AND ?)AND vn=?");
                pst.setString(1, datef);
                pst.setString(2, datet);
                pst.setString(3, vna);
                r = pst.executeQuery();
                while (r.next()) {
                    System.out.println(r.getString(1) + "\t"
                            + r.getString(2) + "\t"
                            + r.getString(3) + "\t"
                            + r.getInt(4) + "\t"
                            + r.getInt(5) + "\t"
                            + r.getInt(6) + "\t"
                            + r.getInt(7) + "\t"
                            + r.getInt(8) + "\t"
                            + r.getInt(9) + "\t"
                            + r.getInt(10) + "\t"
                            + r.getString(11) + "\t"
                            + r.getInt(12) + "\t"
                            + r.getInt(13) + "\t"
                            + r.getString(14));

                    i = r.getInt(10) + i;
                    j = r.getInt(7) + j;

                }
            } catch (Exception a) {
                System.err.println("Got an exception!");
                System.err.println(a.getMessage());
            }
            XWPFDocument document = null;
            FileOutputStream fileOutputStream = null;
            try {

                document = new XWPFDocument();
                File fileToBeCreated = new File("F:/Bill/" + vna + "." + datef + "to" + datet + ".docx");
                fileOutputStream = new FileOutputStream(fileToBeCreated);

                XWPFParagraph paragraph1 = document.createParagraph();
                XWPFParagraph paragraph2 = document.createParagraph();
                paragraph1.setBorderBottom(Borders.BASIC_THIN_LINES);

                paragraph1.setAlignment(ParagraphAlignment.CENTER);
                XWPFRun run = paragraph1.createRun();
                paragraph1.setWordWrapped(true);
                paragraph1.setPageBreak(true);

                run.setColor("830000");
                run.setFontSize(16);
                run.setBold(true);
                run.setTextPosition(10);

                //paragraph1.setStyle("CUSTOMYNP");
                run.setText("        N.B.S EARTH MOVERS                                                ");
                run.setColor("4b0000");
                run.setText("                                54A, Kallarnatham, S.Kulavaippatti& (PO), Alangudi (TK), Pudukkottai-622001. "
                        + " Monthly bill");
                run.addBreak();

                XWPFRun tor = paragraph2.createRun();
                paragraph2.setAlignment(ParagraphAlignment.LEFT);
                tor.setText("To:" + toa);
                // Create a Simple Table using the document.
                XWPFTable table = document.createTable();

                // Now add Rows and Columns to the Table.
                // Creating the First Row
                XWPFTableRow tableRow0 = table.getRow(0);

                // Creating the First Cell
                XWPFTableCell tableCell0 = tableRow0.getCell(0);
                tableCell0.setText(" Si.No.");

                // Creating the Other Cells for the First Row
                XWPFTableCell tableCell1 = tableRow0.addNewTableCell();
                tableCell1.setText(" Particulars");
                XWPFTableCell tableCell2 = tableRow0.addNewTableCell();
                tableCell2.setText(" Rate");
                XWPFTableCell tableCell3 = tableRow0.addNewTableCell();
                tableCell3.setText(" Amount(Rs.)");

                // Creating the Next Rows and Cells
                XWPFTableRow tableRow1 = table.createRow();
                tableRow1.getCell(0).setText(" 1. ");
                tableRow1.getCell(1).setText("Hiring charges of our excavators period from "
                        + "(" + datef + ".to." + datet + ") Total hours -" + j + "Hr");
                tableRow1.getCell(2).setText(" 180000 ");
                tableRow1.getCell(3).setText("" + i);

                document.write(fileOutputStream);
                System.out.println("print" + i);
                System.out.println("Table created in Word File Succefully !!!");

            } catch (Exception e) {
                System.out.println("We had an error while creating the Word Doc " + e.getMessage());
                e.printStackTrace();
            } finally {
                try {
                    if (document != null) {
                        document.close();
                    }

                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }

                } catch (Exception ex) {
                    System.err.println("Got an exception!");
                    System.err.println(ex.getMessage());
                }
            }

        }

        exit(0);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(Monthlyreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monthlyreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monthlyreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monthlyreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monthlyreport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.ButtonGroup buttonGroup1;
    private org.jdesktop.swingx.JXDatePicker fr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton m;
    private org.jdesktop.swingx.JXDatePicker month;
    private javax.swing.JRadioButton r;
    private javax.swing.JTable table;
    private org.jdesktop.swingx.JXDatePicker to;
    private javax.swing.JComboBox<String> vn;
    // End of variables declaration//GEN-END:variables
}
