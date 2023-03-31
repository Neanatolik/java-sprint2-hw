import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class YearlyReport {
    ArrayList<YearData> sortedData = new ArrayList<>();

        void getYearData () {
        String unsortedYearData = readFileContents("resources/y.2021.csv");
        String [] lines = unsortedYearData.split("\r?\n");//заменил регулярное выражение
        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            String[] data = line.split(",");
            int month = Integer.parseInt(data[0]);
            int amount = Integer.parseInt(data[1]);
            boolean is_expense = Boolean.parseBoolean(data[2]);
            YearData yearData = new YearData(month, amount, is_expense);
            sortedData.add(yearData);
        }
            System.out.println("Данные за год добавлены.");
    }


    static String readFileContents(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно файл не находится в нужной директории.");
            return "";
        }
    }
}
