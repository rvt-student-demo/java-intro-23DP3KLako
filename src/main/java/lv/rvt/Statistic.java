package lv.rvt;

public class Statistic {
    private int count;
    private int suma;
    private int even;
    private int odd;

    public Statistic(){
        this.count = 0;
        this.suma = 0;
        this.even = 0;
        this.odd = 0;     
    }

    public void addNumber(int number) {
        this.count++;
        this.suma += number;
        if (number % 2 == 0){
            this.even += number;
        }
        else{
            this.odd += number;
        }

    }

    public int getCount(){
        return this.count;
    }

    public int suma(){
        return this.suma;
    }

    public double average(){
        if(this.count == 0){
            return 0.0;
        }
        return (double) this.suma / this.count;
    }

    public int even(){
        return this.even;
    }

    public int odd(){
        return this.odd;
    }
}
