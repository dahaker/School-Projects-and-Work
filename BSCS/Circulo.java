//Raul X Gonzalez
//Y00339371
public class Circulo
{
   private double radius;
  private double area;

   public Circulo( )
     {
        radius = 5;
        area = 10;
     }
  public Circulo( double radius )
     {
        this.radius = radius;
     }
  public double getRadius( )
     {
        return radius;
     }
  public void setRadius( double radius )
     {
        this.radius = radius;
     }
  public double getArea( )
     {
        return area;
     }
  public void setArea( double radius )
     {
        area = (radius)*(radius)*Math.PI;
     }
   public String toString( )
     {
        return "El radio del circulo es: " + radius + ", y el area es: " + area;
     }
  
 public static void main(String aa[])
 {
   Circulo c = new Circulo();
   c.setRadius(5);
    c.setArea(20);
   double d=c.getArea();
  
  System.out.println(d);
  System.out.println(c.getRadius()); 
 }
}