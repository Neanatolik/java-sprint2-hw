import java.util.ArrayList;

public class PrintYearData {
    ArrayList<YearData> yearlyReport;

    public PrintYearData(ArrayList<YearData> yearlyReport) {
        this.yearlyReport = yearlyReport;
    }

    void print() {
        int sumExpenses = 0;
        int sumIncomes = 0;
        System.out.println("Год: 2021");
        for(int month = 1; month < 4; month++) {
            int profit = 0;
            for (YearData YD : yearlyReport) {
                if(month == YD.month) {
                    if(YD.is_expense) {
                        profit -= YD.amount;
                        sumExpenses+=YD.amount;
                    }else {
                        profit += YD.amount;
                        sumIncomes+=YD.amount;
                }
                }
            }
            System.out.println("Прибыль за месяц " + month + " " + profit);
        }
        System.out.println(sumIncomes + " - " + sumExpenses);
        System.out.println("Средний расход за все месяцы: " + (double)sumExpenses/3);
        System.out.println("Средний доход за все месяцы: " + (double)sumIncomes/3);
    }
}
