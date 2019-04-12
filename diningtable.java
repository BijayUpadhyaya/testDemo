import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
public class diningtable {
   private float Weight;
   private float Length;
   private float Width;
   float cost;
   
   public diningtable() {
	   Weight = 0;
	   Length = 0;
	   Width = 0;
   }
   
   public diningtable(float Length, float Width) {
	   setLength(Length);
	   setWeidth(Width);
   }
   
   
   public diningtable(float Weight, float Length, float Width) {
	   setWeight(Weight);
	   setLength(Length);
	   setWeidth(Width);
   }
   
   public float getWeight() {
   return Weight;
   }
   
   public float getLength() {
   return Length;
   }
   
   public float getWidth() {
   return Width;
   }
   
   public void setWeight(float Weight) {
	   if (Weight > 0 && Weight < 20)  {
	   this.Weight = Weight;
   }

   }
   public void setLength(float Length) {
	   if (Length > 0 && Length < 20) {
	   this.Length = Length;
   }
   }
   
   public void setWeidth(float Width) {
	   if (Width > 0 && Width < 20) {
	   this.Width = Width;
   }
   }
   public float Perimeter() {
	   float newPerimeter;
	   //newPerimeter = Length + Width;
	   newPerimeter = 2*(getLength() + getWidth());
	   return newPerimeter;
   }
   
   public float Area() {
	   float newArea;
	   newArea = Length + Width;
	   newArea = getLength() * getWidth();
	   return newArea;
}
   
   public float Cost() {
	   float newCost;
	   //newCost = Length + Width;
	   newCost = getLength() * getWidth() * getWeight();
	   return newCost;
   }
   public int menu() {   
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("1. Enter For Perimeter");
	   System.out.println("2. Enter for Area");
	   System.out.println("3. Enter for Cost");
	   System.out.println("4. Enter to End");
	   System.out.println("Please Enter the option");
	   int Number = scanner.nextInt();
	   return Number;
	   
   }
   
}
class TestDiningTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Number;
		float Length = 0;
		float Width = 0;
		float Weight = 0;
		diningtable calculation = new diningtable();
		do {
			Number = calculation.menu();
			switch(Number) {
			case 1:
				System.out.println("Please Enter the Length");
				Length = scanner.nextInt();
				System.out.println("Please Enter the Width");
				Width = scanner.nextInt();
				diningtable perimeter= new diningtable(Length, Width);
				System.out.println("Perimeter: " + perimeter.Perimeter());
				break;
			case 2:
				System.out.println("Please Enter the Length");
				Length = scanner.nextInt();
				System.out.println("Please Enter the Width");
				Width = scanner.nextInt();
				diningtable Area= new diningtable(Length, Width);
				System.out.println("Area: " + Area.Area());
				break;
			case 3:
				System.out.println("Please Enter the Length");
				Length = scanner.nextInt();
				System.out.println("Please Enter the Width");
				Width = scanner.nextInt();
				System.out.println("Please Enter the Weight");
				Weight = scanner.nextInt();
;				diningtable cost = new diningtable(Length, Width, Weight);
				System.out.println("Cost: " + cost.Cost());
				break;
				
			
			}
		}while(!(Number == 4));
		
		
	}
}


