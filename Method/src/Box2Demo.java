public class Box2Demo {
    public static void main(String[] args) {
        Box2 myBox1 = new Box2();
        Box2 myBox2 = new Box2();

        //for myBox1
        myBox1.width = 10;
        myBox1.height = 5;
        myBox1.depth = 4;

        //for myBox2
        myBox2.width = 5;
        myBox2.height = 4;
        myBox2.depth = 2;

        double vol1 = myBox1.volume();            //method call
        System.out.println("Volume: "+vol1);

        double vol2 = myBox2.volume();            //method call
        System.out.println("Volume: "+vol2);
    }
}
