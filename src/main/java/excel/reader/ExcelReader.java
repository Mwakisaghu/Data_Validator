package excel.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public void readExcelFile (String filePath) {
        try {
            FileInputStream file = new FileInputStream(new File(filePath));
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // Getting the first sheet
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterating through each row in the Excel sheet
            for(Row row : sheet) {
                // Iterating through each cell in the rows
                for(Cell cell : row) {
                    // Printing the cell value
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
            // Closing the output stream
            file.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
