package Com.sb.qa.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Com.sb.qa.utils.Xls_Reader;

public class Excel {

	public static void main(String[] args) throws IOException {

 /*		File src = new File("‪C:\Users\avije\Desktop\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int row = sheet1.getLastRowNum();
		int cell = sheet1.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(cell);
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j < cell; j++) {
				String ans = sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.println(ans);

			}
          wb.close();
		} */

		
		Xls_Reader reader=new Xls_Reader("‪C:\\Users\\avije\\Desktop\\TestData.xlsx");
		
		//reader.addSheet("sheet1");
		int totalrow = reader.getRowCount("sheet1");
		int totalcolumn = reader.getColumnCount("sheet1");
		System.out.println(totalrow);
		System.out.println(totalcolumn);
		for(int i=0;i<=totalrow;i++)
		{
			for(int j=0;j<totalcolumn;j++)
			{
				String data = reader.getCellData("sheet1", i, j);
				System.out.println(data);
			}
		}
		
		
		
	}

}
