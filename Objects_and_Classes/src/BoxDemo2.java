class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        //for myBox1
        myBox1.width = 10;
        myBox1.height = 5;
        myBox1.depth = 4;
        double volume1 = myBox1.width * myBox1.height * myBox1.depth;

        //for myBox2
        myBox2.width = 5;
        myBox2.height = 4;
        myBox2.depth = 2;
        double volume2 = myBox2.width * myBox2.height * myBox2.depth;

        System.out.println("First Volume: "+ volume1);
        System.out.println("Second Volume: "+ volume2);
    }
}
