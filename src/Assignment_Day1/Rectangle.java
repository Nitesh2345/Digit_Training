package Assignment_Day1;
import java.util.*;
public class Rectangle {
     double length;
     double width;
     Rectangle(double l,double w){
         this.length=l;
         this.width=w;
     }
     public void Area(){
         double areaOfRectangle;
         areaOfRectangle = this.length * this.width;
         System.out.println("Area of Rectangle :" +areaOfRectangle);
     }
     public void perimeter(){
         double perimeterOfRectangle;
         perimeterOfRectangle = 2*(this.length + this.width);
         System.out.println("Perimeter of Rectangle :"+perimeterOfRectangle);
     }
}
