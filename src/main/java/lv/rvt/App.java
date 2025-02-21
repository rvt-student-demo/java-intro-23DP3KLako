package lv.rvt;

public class App {
    public static void main(String[] args) {
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        juice.addToWarehouse(1.0);
        System.out.println(juice);     
    }
}