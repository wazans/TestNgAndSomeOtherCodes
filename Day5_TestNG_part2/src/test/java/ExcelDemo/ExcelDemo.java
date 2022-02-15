package ExcelDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
    public ExcelDemo() {
    }

    @SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
        new FileInputStream("C:\\Utilities\\testdata.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook();
        int sheets = wb.getNumberOfSheets();

        for(int i = 0; i < sheets; ++i) {
            if (wb.getSheetName(i).equalsIgnoreCase("Sheet3")) {
                XSSFSheet sheet = wb.getSheetAt(i);
                Iterator<Row> row = sheet.iterator();
                Row firstRow = (Row)row.next();
                Iterator<Cell> cell = firstRow.cellIterator();
                int k = 0;

                int column;
                for(column = 0; cell.hasNext(); ++k) {
                    Cell value = (Cell)cell.next();
                    if (value.getStringCellValue().equalsIgnoreCase("Sheet3")) {
                        column = k;
                    }
                }

                System.out.println(column);
            }
        }

    }
}
