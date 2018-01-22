/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author jess
 */
public class excel_working {
    
    private static String[] Columns = {"Col_0", "Col_1", "Col_2"};
    
    public static void main() throws IOException {
        
        boolean isExists = new File("month-here.xlsx").isFile();
        if(!isExists){
        System.out.println("record not exists");
        createRecord();
        }
        else
        {
            System.out.println("record exists");
            System.exit(0);
        }
        
        
      

    }
    
    private static void createRecord() throws IOException{
        
        System.out.println("creating record");
        Workbook WrB = new XSSFWorkbook();
        CreationHelper createHelper = WrB.getCreationHelper();
        Sheet Sht = WrB.createSheet("Contents");
        Font FntH = WrB.createFont();
        FntH.setBold(true);
        FntH.setFontHeight((short)11);
        CellStyle FntHCellStle = WrB.createCellStyle();
        FntHCellStle.setFont(FntH);
       
        //creating 
        Row hRow = Sht.createRow(0);
        for(int i =0;i<Columns.length;i++){
            Cell  xCel = hRow.createCell(i);
            xCel.setCellValue(Columns[i]);
            xCel.setCellStyle(FntHCellStle);
        }
                
                
                
                
                
                
        
        
        
        

        
        
        
        
        
        //actual writing to file
        try {
            FileOutputStream create = new FileOutputStream("month-here.xlsx");
            WrB.write(create);
            create.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(excel_working.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    class DataToFeed
    {   
        //stuff like that
        private String S_No;
    }
}
