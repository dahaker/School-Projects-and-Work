/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fcarella
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c[]=new Circle[10];
        
        Integer cx=new Integer(10);
        Circle circle1=new Circle();
        circle1.setRadius(1.0);
        
        System.out.println(circle1.getArea());
        
        Circle circle2=new Circle(2.0);
        circle2.setRadius(1.0);
        
        System.out.println(circle2.getArea());
        
        System.out.println(circle2);
        cx=0;
        for(double i=0.0;i<10.0;i+=.1){
            c[cx]=new Circle(i);
            System.out.println(c[cx++]);
        }

    }
}
 
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fcarella
 */
public class Circle {
    //properties, attributes, instance variables.  MAKE THEM PRIVATE!!
    private double radius;
    private double circumference;
    private Color lineColor;
    private double area;
    private Point center;
    public Circle(double radius) {
        this();
        setRadius(radius);
        
    }
    @Override
    public String toString() {
        String s="Area="+getArea()+", Circuference="+getCircumference()+", Radius="+getRadius()+", Point="+getCenter();
        return s;
    }
    
    
    // default constructor
    public Circle(){
        setRadius(0.0);
        setCircumference(0.0);
        setLineColor(Color.BLACK);
        setArea(0.0);
        center=new Point();
    }
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * @return the circumference
     */
    public double getCircumference() {
        return circumference;
    }
    /**
     * @param circumference the circumference to set
     */
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
    /**
     * @return the lineColor
     */
    public Color getLineColor() {
        return lineColor;
    }
    /**
     * @param lineColor the lineColor to set
     */
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
    /**
     * @return the area
     */
    public double getArea() {
        setArea(Math.PI*radius*radius);
        return area;
    }
    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }
    /**
     * @return the center
     */
    public Point getCenter() {
        return center;
    }
    /**
     * @param center the center to set
     */
    public void setCenter(Point center) {
        this.center = center;
    }
    
    
}
 
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fcarella
 */
public class Point {
    private double x;
    private double y;
    public Point() {
        x=0.0;
        y=0.0;
    }
    /**
     * @return the x
     */
    public double getX() {
        return x;
    }
    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }
    /**
     * @return the y
     */
    public double getY() {
        return y;
    }
    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
    
}