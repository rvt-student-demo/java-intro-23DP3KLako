package lv.rvt;

public class MainProgram {
    public static void main(String[] args) {
        Decreasingcounter counter = new Decreasingcounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
