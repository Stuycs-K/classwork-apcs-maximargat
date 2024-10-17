public class Demo
{
    /*
    Write this method third. Test it then move on
    to the others.
    */
    public static double distance(Point a, Point b)
    {
        return Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
    }

    public static void main(String[]args)
    {
        Point p1 = new Point(1,1);
        Point p2 = new Point(-1,-1);
        Point p3 = new Point(3,4);
        System.out.println("Point 3: " + p3);
        Point p3copy = new Point (p3);
        System.out.println("Point 3 copy: " + p3copy);
        System.out.println("Same address? " + (p3 == p3copy));
        System.out.println("Static distance() in Demo:   " + distance(p1,p2));
        System.out.println("Static distance() in Point:  " + Point.distance(p1,p2));
        System.out.println("distanceTo() from Point:     " + p1.distanceTo(p2));


        Point tri1 = new Point(-0.5, 0);
        Point tri2 = new Point(0.5, 0);
        Point tri3 = new Point(0, 0.5 * Math.sqrt(3));

        System.out.println(distance(tri1, tri2));
        System.out.println(distance(tri2, tri3));
        System.out.println(distance(tri3, tri1));
    }
}