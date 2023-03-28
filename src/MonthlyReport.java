import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.HashMap;

public class MonthlyReport {

    HashMap<Integer, ArrayList<MonthData>> sortedData = new HashMap<>();

    void getMonthData () {
        for (int month = 1; month < 4; month++){
            ArrayList<MonthData> monthDataList = new ArrayList<>();
            String unsortedMonthlyData = readFileContents("resources/m.20210" + month + ".csv");
            String[] lines = unsortedMonthlyData.split("\n?\r"); //заменил регулярное выражение
            for (int i = 1; i < lines.length; i++) {
                String line = lines[i];
                String[] data = line.split(","); //item_name,is_expense,quantity,sum_of_one
                String item_name = data[0];
                boolean is_expense = Boolean.parseBoolean(data[1]);
                int quantity = Integer.parseInt(data[2]);
                int sum_of_one = Integer.parseInt(data[3]);
                MonthData monthData = new MonthData(item_name, is_expense, quantity, sum_of_one, month);
                monthDataList.add(monthData);
            }
            sortedData.put(month, monthDataList);
            System.out.println("Данные за месяц " + month + " добавлены.");
        }

    }

    public String readFileContents(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно файл не находится в нужной директории.");
            return ""; //заменил null
        }
    }
}
