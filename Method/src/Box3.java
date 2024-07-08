public class Box3 {
    double width;
    double height;
    double depth;

    double volume(){
        return width*height*depth;
    }

    void getDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
