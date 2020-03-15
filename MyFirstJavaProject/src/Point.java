
public class Point {
	int x;
    int y;
    
    Point p = new Point();
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    Point() {
        this(0, 0);
    }
    
    public static void printPoint(Point a) {
        System.out.println("(" + a.x + "," + a.y + ")");
    }

    public Point center(Point other) {
        // Returns the center between this point and the other point
        // Notice we are using integer, we wan't get an accurate value
        return new Point((x + other.x) / 2, (y + other.y) / 2);
    }
    
    public static void main(String[] args) {
   
    	Point a,x = 3;
    	Point a,y = 5;
    	printPoint(a);
    	
    	
    }

}
