package selenium.module4;  
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.OutputStream;  
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.CellStyle;  
import org.apache.poi.ss.usermodel.CreationHelper;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;  
public class ExcelWriteAndRead {  
      
	private static String date;
    @SuppressWarnings("resource")
    @Test
	public static void excel() throws FileNotFoundException, IOException { 
  //  Logger log = LogManager.getLogger(ExcelWriteAndRead.class.getName());

    
    /** xls - HSSF 
     *  xlsx - XSSf
     * Interface - Workbook, Sheet, Row Cell
     * Classes - HSSFWoorkbook, HSSFSheet, HSSFRow, HSSFCell
     * Classes - XSSFWoorkbook, XSSFSheet, XSSFRow, XSSFCell
     */
    	//String date;
    
        Workbook wb = new HSSFWorkbook();  
        CreationHelper createHelper = wb.getCreationHelper();  
        try(OutputStream os = new FileOutputStream("DataCreation.xls")){  
            Sheet sheet = wb.createSheet("New Sheet");  
            Row row     = sheet.createRow(0);  
            Cell cell   = row.createCell(0);  
            CellStyle cellStyle = wb.createCellStyle();  
            cellStyle.setDataFormat(  
                createHelper.createDataFormat().getFormat("d/m/yy h:mm"));  
            cell = row.createCell(0);  
            cell.setCellValue(new Date());  
            cell.setCellStyle(cellStyle);  
            wb.write(os);  
        }catch(Exception e) {  
            System.out.println(e.getMessage());  
        }  
        System.out.println("Date written in Excel");
        
        File file =    new File("./DataCreation.xls");

        //Create an object of FileInputStream class to read excel file
        //Create an object of File class to open xlsx file

        File file1 =    new File("./DataCreation.xls");

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook guru99Workbook =null;
     
      //Read sheet inside the workbook by its name
        guru99Workbook = new HSSFWorkbook(inputStream);
        Sheet guru99Sheet = guru99Workbook.getSheet("New Sheet");

        //Find number of rows in excel file

        int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

        //Create a loop over all the rows of excel file to read it

        for (int i = 0; i < rowCount+1; i++) {

            Row row = guru99Sheet.getRow(i);

            //Create a loop to print cell values in a row

            for (int j = 0; j < row.getLastCellNum(); j++) {

                //Print Excel data in console

            	
            System.out.println(row.getCell(j).getDateCellValue().toString());
            date= row.getCell(j).getDateCellValue().toString();
           
            

            }

            System.out.println();
        } 

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://codewithsushil.in/4.03readWriteExcel.html");
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys(date);
		System.out.println(driver.getTitle());
    }  
}  