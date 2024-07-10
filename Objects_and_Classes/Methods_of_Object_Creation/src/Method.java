class Rectangle2 {
    int length;
    int breadth;

    void setLength(int l){
        length = l;
    }

    void setBreadth(int b){
        breadth = b;
    }

    int getLength(){
        return length;
    }

    int getBreadth(){
        return breadth;
    }
}

public class Method {
    public static void main(String[] args) {
        Rectangle2 myRec = new Rectangle2();

        myRec.setLength(10);
        myRec.setBreadth(5);

        System.out.println("Area : "+ myRec.getLength()* myRec.getBreadth());
    }
}
