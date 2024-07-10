class Rectangle1 {
    int length;
    int breadth;
}

public class Reference_Variable {
    public static void main(String[] args) {
        Rectangle1 myRec = new Rectangle1();
        myRec.length = 10;
        myRec.breadth = 5;

        System.out.println("Area: "+ myRec.length* myRec.breadth);
    }
}
