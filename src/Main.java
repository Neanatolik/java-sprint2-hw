import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageData manageData = new ManageData();
        boolean isVerification = false;
        while (true) {
            printmenu();
            String userInput = scanner.nextLine();
            System.out.println("Вы выбрали команду: " + userInput);

            if(userInput.equals("1")) {
                manageData.mReport.getMonthData();
                isVerification = false;
            } else if(userInput.equals("2")) {
                manageData.yReport.getYearData();
                isVerification = false;
            } else if(userInput.equals("3")) {
                if (manageData.isDataEmpty()) {
                    isVerification = new Verification(manageData.mReport.sortedData, manageData.yReport.sortedData).check();
                    if(isVerification);
                    else System.out.println("В отчетах содержится ошибка");
                }
            } else if(userInput.equals("4")) {
                if (manageData.isMonthDataEmpty()) {
                    if(!isVerification) {
                        System.out.println("Сверка отчетов не выполнена!");
                    }
                    new PrintMonthData(manageData.mReport.sortedData).print();
                }
            } else if(userInput.equals("5")) {
                if (manageData.isYearDataEmpty()) {
                    if(!isVerification) {
                        System.out.println("Сверка отчетов не выполнена.");
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


