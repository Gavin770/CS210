/**
 * A program that deals with 2D points.
 *
 * @author Textbook, page 507
 *
 * @version 1.0   Fall 2008
 */

public class Client_code{
  
  public static void main(String[] args){
    // create two Point objects
    Point p1 = new Point();
    p1.setXY(7, 2);
    System.out.println(p1.getX()+","+p1.getY());
    
    Point p2 = new Point();
    p2.setXY(4,3);

    // print each point and its distance from origin
    System.out.println("p1 is (" + p1.getX() + ", " + p1.getY() + ")");
    System.out.println("distance from origin = " +
                       p1.distanceFromOrigin());

    System.out.println("p2 is (" + p2.getX() + ", " + p2.getY() + ")");
    System.out.println("distance from origin = " +
                       p2.distanceFromOrigin());

    // translate each point to a new location
    p1.translate(11, 6);
    p2.translate(1, 7);

    // print the points again
    System.out.println("p1 is (" + p1.getX() + ", " + p1.getY() + ")");
    System.out.println("p2 is (" + p2.getX() + ", " + p2.getY() + ")");
    
    // toString test
    System.out.println(p1);
    System.out.println(p2);
    
    // distance test
    System.out.println(p1.distance(p2));
  }
}

