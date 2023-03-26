public class IsDataEmpty {
    MonthlyReport mReport;
    YearlyReport yReport;

    public IsDataEmpty(MonthlyReport mReport, YearlyReport yReport) {
        this.mReport = mReport;
        this.yReport = yReport;
    }

    public IsDataEmpty(MonthlyReport mReport) {
        this.mReport = mReport;
    }

    public IsDataEmpty(YearlyReport yReport) {
        this.yReport = yReport;
    }

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
