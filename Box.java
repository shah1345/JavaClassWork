public class Box {
    double h,w,d;

    Box(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { double v;
        v=h*w*d;
        return v;
    }

    public static void main(String[] args) {

        Box bc = new Box(5.8,50.3,6.6);
        Box bX = new Box(5.5,60.3,9.8);
        System.out.println(bc.volume());
        System.out.println(bX.volume());

    }

}
