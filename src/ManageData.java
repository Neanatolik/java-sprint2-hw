public class ManageData {
    MonthlyReport mReport = new MonthlyReport();
    YearlyReport yReport = new YearlyReport();
    //IsDataEmpty удалил, добавил сюда его методы
    boolean isDataEmpty () {
        if ((!mReport.sortedData.isEmpty()) && (!yReport.sortedData.isEmpty()))  return true;
        if (mReport.sortedData.isEmpty()) System.out.println("Введите данные за месяц!");
        if (yReport.sortedData.isEmpty()) System.out.println("Введите данные за год!");
        return false;
    }
    boolean isMonthDataEmpty () {
        if (!mReport.sortedData.isEmpty())  return true;
        else System.out.println("Введите данные за месяц!");
        return false;
    }

    boolean isYearDataEmpty() {
        if (!yReport.sortedData.isEmpty())  return true;
        else System.out.println("Введите данные за год!");
        return false;
    }

}
