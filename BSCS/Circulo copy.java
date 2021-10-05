public class Circulo {
      

    final double PI = 3.14;

     double radius;

     double area;

     double perimeter;

 

    //constructorS of the circle class.

     public Circulo()

     {

         this.radius=50;

     }

      

      

     public Circulo(double radius, double area, double perimeter)

     {

         this.radius=radius;

         this.area=area;

         this.perimeter=perimeter;

     }

     public double area()

     {

        return PI*radius*radius;

     }

      

     public double perimeter()

     {

        return 2*PI*radius;

     }

     

      

      

    //getters and setters for RADIUS

     public double getRadius() {

        return radius;

    }

    public void setRadius(double radius) {

        this.radius = radius;

    }

     

     

    //getters and setters for AREA

    public double getArea() {

        return area;

    }

    public void setArea(double area) {

        this.area = area;

    }

     

     

    //getters and setters for PERIMETER

    public double getPerimeter() {

        return perimeter;

    }

    public void setPerimeter(double perimeter) {

        this.perimeter = perimeter;

    }

      

     

      

     public static void main(String[]Args)

         {

      

           Circle myCircle = new Circle();

           double circleRadius;

           double circleArea;

           double circlePerimeter;

            

//        

           System.out.println("The area of the circle is " + myCircle.getArea());

           System.out.println("The perimeter of the circle is " + myCircle.getPerimeter());

          

         }     

 

      

}
