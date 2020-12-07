package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
In this class what I have to cover is 

0 -  I create one constructor for Loading(fis) and closing(fos) the Excel file

1 - Load the ExcelSheet into this program 
2 - Create New Sheet with Name --- public static void createSheet(String sheetName);// if sheet name is not exists in that workbook then only that sheet is created
3 - Remove the Sheet with Name --- public static void removeSheet(String sheetName);// if sheet is exist then only this operation is performed

4 - get the last row Number of the sheet -- public static getLastRowNumber(String sheetName);// first that sheet is available or not, for that I will use above functions  
5 - get the last column Number of the row -- public static getLastColNumber(String sheetName, int rowNumber);// first I will check that sheet is available or not then after I will perform that operation 

6 - get the Row Data in List<String> format -- public static List<String> getRowList(String sheetName,int rowNumber);// here also If sheet is available then only I will perform  get the row details into List format
7 - get the Cell Data in String format -- public static String getCellData(String sheetName,String column name,int rowNumber);//   

8 - set the List<String> data into Row wise ---public static void setRowDataInRow(String sheetName,List<String> listRow , int rowNumber);
9 - Set the List<String> data into column wise --public static void setRowDataInColumn(String sheetName,List<Strign> listCol, String columnName);



*/
public class ExcelSheetReader {

	 public FileInputStream fis; 
	 public FileOutputStream fos;// I will load these things while object creation



	// I need Apache POI API's for these 
	public  XSSFWorkbook wBook; //for loading and writing the data we will use wb.write() function
	
	public  XSSFSheet sheet;
	public  XSSFRow row;
	public  XSSFCell cell;
	
	private String bookPath=null;
	
	
	public ExcelSheetReader(String path)
	{
		this.bookPath=path;
			try {
			fis=new FileInputStream(this.bookPath);// this is for loading the Excel file
			fos=new FileOutputStream(this.bookPath); // this is for fos.close()
			System.out.println("Excel file is loaded for fis and fos operations ");
		
		} catch (FileNotFoundException e) {
			System.out.println("Excel File is not loaded check the path you specified :: "+this.bookPath);
			System.out.println("And I'm exit from this execution operation like System.exit(0);  ");
			System.out.println("\t Because I don't want to exceute the remaining stuff without File Loading from the path");
			e.printStackTrace();
			System.exit(0);
	
		}// try-catch close bracket 
		
			
	} // this is constructor -  closed bracket
// here declaring the methods to perform the Excel file operations
	
	public  int getLastRowNumber(String SheetName)
	{
		int rowNum=0;
		rowNum=wBook.getSheet(SheetName).getLastRowNum();
		return rowNum;
	}
	public int getLastColumnNumber(String sheetName,int rowNum)
	{
		int colNum=0;
			colNum=wBook.getSheet(sheetName).getRow(rowNum).getLastCellNum();System.out.println("Last Column Number of the = [ "+sheetName+" ] and row Number = [ "+rowNum +" ] Number of column are available in that  = "+colNum );
		return colNum;
	}
	
	
	public void createSheet(String sheetName)
	{
		int sheetNumber=wBook.getSheetIndex(sheetName); // sheet Numbers starts with  [ 0 - index ] in the workbook 
		
		if(sheetNumber==-1) // in that work book that sheetName is not available so we can create a new sheet with sheetName
		{
			wBook.createSheet(sheetName);
			
			try {
				wBook.write(fos);System.out.println("Sheet is created with name :: "+sheetName);
			} catch (IOException e) {
				System.out.println("Sheet is not created check the  createSheet() function");
				e.printStackTrace();
			}
			
		}
		else
		{
			System.out.println(sheetName+" this sheet is already available in at Position of ::= "+sheetNumber);
		}
		
	}
	
	public void removeSheet(String sheetName)
	{
		int sheetNumber=wBook.getSheetIndex(sheetName);
		
		if(sheetNumber==-1) 
		{
			System.out.println("Sheet is not Available in Workbook ");
			System.out.println("Invalid operation  to Remove the Sheet "+sheetName);
		}
		else
		{
			wBook.removeSheetAt(sheetNumber);System.out.println(sheetName+" -- Sheet is removed From the WorkBook");
		}
		
	}
	
}// Class - level close bracket
