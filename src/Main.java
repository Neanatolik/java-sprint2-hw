import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageData manageData = new ManageData(); //создал новый класс для управляния данными
        boolean isVetification = false;

        while (true) {
            printmenu();
            String userInput = scanner.nextLine();
            System.out.println("Вы выбрали команду: " + userInput);
            if(userInput.equals("1")) {
                manageData.mReport.getMonthData();
            } else if(userInput.equals("2")) {
                manageData.yReport.getYearData();
            } else if(userInput.equals("3")) {
                if (new IsDataEmpty(manageData.mReport, manageData.yReport).isDataEmpty()) {
                    isVetification = new Verifivation(manageData.mReport.sortedData, manageData.yReport.sortedData).check();//вынес создание объекта
                    if(isVetification); //вынес создание объекта
                    else System.out.println("В отчетах содержится ошибка");
                }
            } else if(userInput.equals("4")) {
                if (new IsDataEmpty(manageData.mReport).isMonthDataEmpty()) {
                    if(isVetification) {
                        System.out.println("Сверка отчетов не выполнена!");//теперь сверка отчетов не обязательна
                    }
                    new PrintMonthData(manageData.mReport.sortedData).print();
                }
            } else if(userInput.equals("5")) {
                if (new IsDataEmpty(manageData.yReport).isYearDataEmpty()) {
                    if(isVetification) {
                        System.out.println("Сверка отчетов не выполнена.");//теперь сверка отчетов не обязательна
                    }
                    new PrintYearData(manageData.yReport.sortedData).print();
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


