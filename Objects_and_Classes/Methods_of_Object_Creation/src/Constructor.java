class Rectangle3{
    int length;
    int breadth;

    Rectangle3(int l, int b){
        length = l;
        breadth = b;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Rectangle3 myRec = new Rectangle3(10, 5);

        System.out.println("Area: "+ myRec.length* myRec.breadth);
    }
}
