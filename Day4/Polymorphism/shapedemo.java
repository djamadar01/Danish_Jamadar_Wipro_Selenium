package poly;


class Shape {
 void area() {
     System.out.println("Calculating area for a shape...");
 }
}


class Circle extends Shape {
 double radius;

 Circle(double radius) {
     this.radius = radius;
 }


 void area() {
     double area = 3.14 * radius * radius;
     System.out.println("Area of Circle: " + area);
 }
}


class Rectangle extends Shape {
 double length, width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 void area() {
     double area = length * width;
     System.out.println("Area of Rectangle: " + area);
 }
}


public class shapedemo {
 public static void main(String[] args) {
     Shape s1 = new Circle(5);  
     Shape s2 = new Rectangle(4, 6); 

     s1.area(); 
     s2.area(); 
 }
}

