import java.util.ArrayList;
import java.util.HashMap;

public class Verification {
    public HashMap<Integer, ArrayList<MonthData>> monthlyReport;
    public ArrayList<YearData> yearlyReport;

    public Verification(HashMap<Integer, ArrayList<MonthData>> monthlyReport, ArrayList<YearData> yearlyReport) {
        this.monthlyReport = monthlyReport;
        this.yearlyReport = yearlyReport;
    }

    public boolean check() {
        boolean check = true;
        for (Integer I: monthlyReport.keySet()) {
            int sumExpense = 0;
            int sumIncome = 0;
            for (MonthData MD : monthlyReport.get(I)) {
                if(MD.is_expensive)
                    sumExpense+=MD.quantity* MD.sum_of_one;
                else
                    sumIncome+=MD.quantity* MD.sum_of_one;
            }
            for (YearData report : yearlyReport) {
                if(I == report.month) {
                    if(report.is_expense) {
                        if(report.amount == sumExpense) System.out.println("Данные трат за месяц " + I + " совпадают с годовым отчетом");
                        else {System.out.println("Данные трат за месяц " + I + " НЕ совпадают с годовым отчетом"); check = false;}
                    } else if (report.amount == sumIncome) System.out.println("Данные прибыли за месяц " + I + " совпадают с годовым отчетом");
                    else {System.out.println("Данные прибыли за месяц " + I + " НЕ совпадают с годовым отчетом"); check = false;}
                }
            }

        }
        return check;
    }


}
