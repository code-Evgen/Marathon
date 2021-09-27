package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        businessProcess(picker);
        businessProcess(courier);
        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);
        System.out.println("//------");
            //------
        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse);
        Courier courier2 = new Courier(warehouse);
        picker2.doWork();
        courier2.doWork();
        System.out.println(warehouse2);
        System.out.println(picker2);
        System.out.println(courier2);
        System.out.println("//------");
            //------ Check warehouse, picker, courier
        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);
    }

    static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
