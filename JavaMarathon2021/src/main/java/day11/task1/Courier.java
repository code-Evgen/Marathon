package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed = false;
    private Warehouse warehouse;
    private static int bonus;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary + bonus;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString(){
        return "Зарплата " + salary + bonus;
    }

    public void doWork(){
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
        if (warehouse.getCountDeliveredOrders() == 10000)
            bonus();
//        else{
//            if (deliveredSum % 10000 == 1)
//                isPayed = false;
//        }
    }

    public void bonus(){
        if (warehouse.getCountDeliveredOrders() >= 10000){
            if (!isPayed) {
                bonus += 50000;
                isPayed = true;
            }
            else
                System.out.println("Бонус уже был выплачен");
        }
        else
            System.out.println("Бонус пока не доступен");
    }
}
