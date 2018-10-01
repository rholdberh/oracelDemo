package demo.oracle;

import com.poiji.bind.Poiji;

import java.io.File;
import java.util.List;

public class ExcelUtils {

    public ExcelUtils() {
    }

    public static List<TicketObject> getTestObject(String filePath) {
        return Poiji.fromExcel(new File(filePath), TicketObject.class);

    }

}