package artifactExample.com.integral;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {
		
		File file = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			
			//EXCEL FORMATO .XLS
			file = new File("C:\\Users\\Carlos\\Desktop\\Proyectos Java\\regularExpresion\\regularExpresion\\artifactExample\\src\\main\\java\\artifactExample\\com\\integral\\file.txt");
			fileReader = new FileReader (file);
			bufferedReader = new BufferedReader(fileReader);
			
			String line;
			List<String> listaPalabras = new ArrayList<String>();
			while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                listaPalabras.add(line);
            }
			
			int contador = 0;
			for(String iterator : listaPalabras) {
				System.out.println("Lista [" + contador + "]: " + iterator);
				contador++;
			}
			
			Workbook workbook = new HSSFWorkbook();
			Sheet sheet = workbook.createSheet();
			
			//PRIMERA LINEA
			Row row = sheet.createRow(0);
			Cell cell = row.createCell(0);
			cell.setCellValue(listaPalabras.get(0));
			Cell cell2 = row.createCell(1);
			cell2.setCellValue(listaPalabras.get(1));
			Cell cell3 = row.createCell(2);
			cell3.setCellValue(listaPalabras.get(2));
			Cell cell4 = row.createCell(3);
			cell4.setCellValue(listaPalabras.get(3));
			
			//SEGUNDA LINEA
			Row row2 = sheet.createRow(1);
			Cell cell5 = row2.createCell(0);
			cell5.setCellValue(listaPalabras.get(0));
			Cell cell6 = row2.createCell(1);
			cell6.setCellValue(listaPalabras.get(1));
			Cell cell7 = row2.createCell(2);
			cell7.setCellValue(listaPalabras.get(2));
			Cell cell8 = row2.createCell(3);
			cell8.setCellValue(listaPalabras.get(3));
			
			//TERCERA LINEA
			Row row3 = sheet.createRow(2);
			Cell cell9 = row3.createCell(0);
			cell9.setCellValue("Estoy aprendiendo a generar archivos excel");
			Cell cell10 = row3.createCell(1);
			cell10.setCellValue("Ahora debo aprender a generar archivos .xlsx");
			Cell cell11 = row3.createCell(2);
			cell11.setCellValue("Estoy muy contento");
			Cell cell12 = row3.createCell(3);
			cell12.setCellValue("Me gusta programar");
			
			sheet.autoSizeColumn(0);
			sheet.autoSizeColumn(1);
			sheet.autoSizeColumn(2);
			sheet.autoSizeColumn(3);
			
            FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Carlos\\Desktop\\Proyectos Java\\regularExpresion\\regularExpresion\\artifactExample\\src\\main\\java\\artifactExample\\com\\integral\\ejemplo.xls"));
            workbook.write(out);
            out.close();
            
            
            //EXCEL FORMATO .XLSX
			Workbook workbookXlsx = new XSSFWorkbook();
			Sheet sheetXlsx = workbookXlsx.createSheet();
			Row row4 = sheetXlsx.createRow(0);
			Cell cell13 = row4.createCell(0);
			cell13.setCellValue("Mi primera celda con valor");
			
			FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\Carlos\\Desktop\\Proyectos Java\\regularExpresion\\regularExpresion\\artifactExample\\src\\main\\java\\artifactExample\\com\\integral\\ejemplo2.xlsx"));
			workbookXlsx.write(fileOutputStream);
			workbookXlsx.close();
            
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			bufferedReader.close();
		}
	}
	
}
