package lv.rvt;

public class Decreasingcounter{
     private int Value;

     public Decreasingcounter (int initialValue){
        
        this.Value = initialValue;

     }
     public void printValue(){
        System.out.println("value: " + this.Value);
     }
     public void decrement(){
        this.Value = this.Value - 1;
        if(this.Value < 0){
            this.Value = 0;
        }
     }
     public void reset(){
        this.Value = 0;
     }
}
