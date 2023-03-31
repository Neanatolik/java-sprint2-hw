import java.util.ArrayList;
import java.util.HashMap;

public class PrintMonthData {
    public HashMap<Integer, ArrayList<MonthData>> monthlyReport;

    public PrintMonthData(HashMap<Integer, ArrayList<MonthData>> monthlyReport) {
        this.monthlyReport = monthlyReport;
    }

    void print() {
        for(Integer I : monthlyReport.keySet()) {
            System.out.println("Месяц: " + I);
            int maxExpense = 0;
            int maxIncome = 0;
            String nameMaxExpense = "";
            String nameMaxIncome = "";
            for(MonthData MD: monthlyReport.get(I)) {
                int multiplication = MD.quantity*MD.sum_of_one;
                if(MD.is_expensive) {
                    if(multiplication > maxExpense) {maxExpense = multiplication; nameMaxExpense = MD.item_name;}
                } else if(multiplication > maxIncome) {maxIncome = multiplication; nameMaxIncome = MD.item_name;}
            }
            System.out.println("Большая трата: " + maxExpense + " - " + nameMaxExpense);
            System.out.println("Большая прибыль: " + maxIncome + " - " + nameMaxIncome);
        }
    }
}
