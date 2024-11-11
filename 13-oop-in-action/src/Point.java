public class Point {
    int x;
    int y;
    static int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* This seems okay but there are two problems with this approach
    *   1. This can't be done if the internal state of the instance is encapsulated
    *   2. This doesn't emphasis the true intention of the method invocation
    *      (It is more like a vague method invocation)
    *      (Semantically this doesn't feel okay, and add to that it is not convenient as well)
    *  */
//    public static void print(Point p){
//        System.out.printf("(x,y)=(%d,%d)%n",p.x,p.y);
//    }
//
//    public static void translate(Point p, int dx, int dy){
//        p.x += dx;
//        p.y += dy;
//    }

    public void print(/* Point this */){
        System.out.printf("(x,y)=(%d,%d)%n",this.x,this.y);
    }

    public void translate(/* Point this, */ int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(30, 40);
        p2.print();
        //Point.print(p2);

        p2.translate(5,5);
        //Point.translate(p2, 5,5);

        p2.print();
        //Point.print(p2);
    }
}
