public class MonthData {
    //item_name,is_expense,quantity,sum_of_one
    String item_name;
    boolean is_expensive;
    int quantity;
    int sum_of_one;

    int month;

    public MonthData(String item_name, boolean is_expensive, int quantity, int sum_of_one, int month) {
        this.item_name = item_name;
        this.is_expensive = is_expensive;
        this.quantity = quantity;
        this.sum_of_one = sum_of_one;
        this.month = month;
    }
}
