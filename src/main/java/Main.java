import com.google.common.base.CaseFormat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static final String PATH = "/Users/mohammed/camel_case_convertor/input.txt";

    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            String line;
            String[] strings = new String[2];
            System.out.println("**************************************  X  *********************************************");
            System.out.println();
            System.out.println();
            while ((line = br.readLine()) != null) {
                String newLine = line.trim();
                if (newLine.contains("_")){
                    strings =newLine.split(" ");
                    System.out.println(ConsoleColors.YELLOW+"@SerializedName(\""+strings[2].replaceAll(";", "")+"\")"
                    +ConsoleColors.RESET);
                    strings[2] = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, strings[2]);
                    System.out.println(ConsoleColors.PURPLE + strings[0]+" "+strings[1]+" "+strings[2] +
                            ConsoleColors.RESET);
                }else {
                    System.out.println(ConsoleColors.PURPLE + newLine +
                            ConsoleColors.RESET);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println();
        System.out.println("**************************************  X  *********************************************");

    }
}
