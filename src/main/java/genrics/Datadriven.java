package genrics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;




public class Datadriven<Workbook> {

 public String read() throws FileNotFoundException {
	 FileInputStream fis=new FileInputStream("./Data1.xlsx");
	 Workbook wb=WorkbookFactory.creat(fis);
	 
     
	

 }
}
