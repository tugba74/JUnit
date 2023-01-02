package day12_webtables;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcel {

    @Test
    public void test01() throws IOException {

        FileInputStream fis=new FileInputStream("C:\\Users\\as\\Desktop\\com.team105JUnt\\src\\test\\java\\day12_webtables\\ulkeler.xlsx");
        Workbook book=  WorkbookFactory.create(fis);

        // şuan yuklendi bir sıkıntı yok kullanablırs teşekkürler

    }
}
