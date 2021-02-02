import java.util.Scanner; 
// Header:
// Name:Burak Kurt
// Project name: Math Practice
// Date:11/15/2020 
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  
//============================== 
    //CYLINDER VOLUME
  /* double height, radius, radius2, volume, PI = 3.14;
     System.out.print("\n Hello, Let's calculate the volume of a right cylinder! ");

		 System.out.print("\n How long is the height? ");
		 height = input.nextDouble();

		 System.out.print(" How long is the radius? ");
		 radius = input.nextDouble();
     
     radius2 = (radius * radius);
     volume = (height * PI * radius2);

		 System.out.print(" Volume of a Right Cylinder = "+ volume +""); */
//==============================
   //CYLINDER AREA
   /* double area, height, radius, radius2, PI = 3.14; 
		 System.out.print("\n Hello, Let's calculate the surface area of a right cylinder! ");

     System.out.print("\n How long is the height? ");
		 height = input.nextDouble();

     System.out.print(" How long is the radius? ");
		 radius = input.nextDouble();

     radius2 = (radius * radius);
     area = ((2 * PI * radius2) + (2 * PI * radius * height));

     System.out.print(" Area of a Right Cylinder = "+ area +""); */
//==============================
    //CONE AREA
  /* double area, height, height2, SlantHeight, radius, radius2, PI = 3.14; 
    
		 System.out.print("\n Hello, Let's calculate the area of a right cone! ");

		 System.out.print("\n How long is the height? ");
		 height = input.nextDouble();     

     System.out.print(" How long is the radius? ");
		 radius = input.nextDouble();  

     
     radius2 = (radius * radius);
     height2 = (height * height);
     SlantHeight = (Math.sqrt((radius2 + height2)));
     area = ((PI * radius * SlantHeight) + (PI * radius2));

     System.out.print(" Area of a Cone = "+ area +"");  */ 
//==============================
    //CONE VOLUME
  /* double volume, height, radius, radius2, PI = 3.14; 
    
		 System.out.print("\n Hello, Let's calculate volume of a cight circular cone! ");

     System.out.print("\n How long is the height? ");
		 height = input.nextDouble();

     System.out.print(" How long is the radius? ");
		 radius = input.nextDouble(); 

     radius2 = (radius * radius);
     volume = (PI * radius2 * height * 1/3);

     System.out.print(" Volume of a Right Circular Cone = "+ volume +""); */
  }
}