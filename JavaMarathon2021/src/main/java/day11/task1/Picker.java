package day11.task1;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed = false;
    private Warehouse warehouse;
    private static int bonus;

    public Picker(Warehouse warehouse) {
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
        salary += 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
//        if (warehouse.getCountPickedOrders() == 10000)
//            bonus();
//        else{
//            if (pickedSum % 10000 == 1)
//                isPayed = false;
//        }
    }

    public void bonus(){
        if (warehouse.getCountPickedOrders() >= 10000){
            if (!isPayed) {
                bonus += 70000;
                isPayed = true;
            }
            else
                System.out.println("Бонус уже был выплачен");
        }
        else
            System.out.println("Бонус пока не доступен");
    }
}
