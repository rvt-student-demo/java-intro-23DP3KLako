package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity){
        if (capacity <= 0){
            this.capacity = 0;
            this.balance = 0;
        }else {
            this.capacity = capacity;
            this.balance = 0;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double howMuchSpaceLeft(){
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount){
        if (amount <= 0) {
            return;
        }

        this.balance += amount;
        if (this.balance > this.capacity) {
            this.balance += this.capacity;
        }
    }

    public double takeFromWarehouse(double amount){
        if (amount < 0) {
            return 0;
        }

        if (amount > getBalance()) {
            double allWhatWeCanGive = getBalance();
            this.balance = 0;
            return allWhatWeCanGive;
        }
        this.balance = this.balance - amount;
        return amount;
    }
    @Override
    public String toString(){
        return "balance = " + balance + ",   space left " + howMuchSpaceLeft();
    }

}
