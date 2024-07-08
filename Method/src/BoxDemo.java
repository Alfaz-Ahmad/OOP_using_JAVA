public class BoxDemo {
    public static void main(String[] args) {
        Box myBox2 = new Box();
        Box myBox1 = new Box();

        //for myBox1
        myBox1.width = 10;
        myBox1.height = 5;
        myBox1.depth = 4;

        //for myBox2
        myBox2.width = 5;
        myBox2.height = 4;
        myBox2.depth = 2;

        myBox1.volume();            //method call
        myBox2.volume();            //method call
    }
}
