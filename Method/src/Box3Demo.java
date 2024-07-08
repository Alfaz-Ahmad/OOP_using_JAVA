public class Box3Demo {
    public static void main(String[] args) {
        Box3 myBox1 = new Box3();
        Box3 myBox2 = new Box3();

        myBox1.getDim(10, 5, 4);
        myBox2.getDim(5, 4, 2);

        double vol1 = myBox1.volume();            //method call
        System.out.println("Volume: "+vol1);

        double vol2 = myBox2.volume();            //method call
        System.out.println("Volume: "+vol2);
    }
}
