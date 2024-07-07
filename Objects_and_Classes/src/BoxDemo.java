class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();                                          //Creating a Box object.
        myBox.width = 10;                                               //Assigning the value
        myBox.height = 5;                                               //Assigning the value
        myBox.depth = 4;                                                //Assigning the value

        double volume = myBox.width * myBox.height * myBox.depth;       //Computing volume Vol = l*b*h
        System.out.println("Volume: "+ volume);                         //Displaying the value of volume (computed)
    }
}
