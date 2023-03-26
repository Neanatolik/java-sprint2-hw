import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonthlyReport mReport = new MonthlyReport();
        YearlyReport yReport = new YearlyReport();
        boolean isVetification = false;

        while (true) {
            printmenu();
            String userInput = scanner.nextLine();
            System.out.println("Вы выбрали команду: " + userInput);
            if(userInput.equals("1")) {
                mReport.getMonthData();
            } else if(userInput.equals("2")) {
                yReport.getYearData();
            } else if(userInput.equals("3")) {
                if (new IsDataEmpty(mReport, yReport).isDataEmpty()) {
                    if(isVetification = new Verifivation(mReport.sortedData, yReport.sortedData).check());
                    else System.out.println("В отчетах содержится ошибка");
                }
            } else if(userInput.equals("4")) {
                if (new IsDataEmpty(mReport).isMonthDataEmpty()) {
                    if(isVetification) {
                        new PrintMonthData(mReport.sortedData).print();
                    } else System.out.println("Выполните сверку отчетов!");
                }
            } else if(userInput.equals("5")) {
                if (new IsDataEmpty(yReport).isYearDataEmpty()) {
                    if(isVetification) {
                        new PrintYearData(yReport.sortedData).print();
                    } else System.out.println("Выполните сверку отчетов!");
                }
            } else if(userInput.toLowerCase().equals("выход")) {
                System.out.println("До новых встреч!");
                return;
            }
            else System.out.println("Такой команды нет.");
        }
    }
    static void printmenu() {
        System.out.println("-----------------------------------------------");
        System.out.println("Выберите действие:");
        System.out.println("1. Считать все месячные отчёты");
        System.out.println("2. Считать годовой отчёт");
        System.out.println("3. Сверить отчёты");
        System.out.println("4. Вывести информацию о всех месячных отчётах");
        System.out.println("5. Вывести информацию о годовом отчёте");
        System.out.println("Для окончания работы введите Выход");
        System.out.println("-----------------------------------------------");
    }
}


