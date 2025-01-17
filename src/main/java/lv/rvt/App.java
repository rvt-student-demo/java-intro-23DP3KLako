package lv.rvt;

public class App {

public static void main( String[] args ){

    Box box = new  Box(2.5, 5.0, 6.0 );
    Box box1 = new Box(2.0, 5.0, 6.0 );
    Box box2 = new Box(3.0, 6.0, 7.0);

    Box biggerBox = box.biggerBox(box);
    Box smallerBox = box.smallerBox(box);

    System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );

    System.out.println( "topArea: "  + box.topArea() );

    System.out.println("Area: " + box.area() + "volume: " + box.volume());

    System.out.println("topArea: " + box.topArea());

    System.out.println("Bigger Box Area: " + biggerBox.area() + "volume: " + biggerBox.volume());

    System.out.println("Smaller Box Area: " + smallerBox.area() + "volume: " + smallerBox.volume());

    System.out.println("Can box1 nests imside box2? " + box1.nests(box2));



}



}



