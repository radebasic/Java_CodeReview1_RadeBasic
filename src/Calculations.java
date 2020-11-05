
/**
 * Author: Rade Basic
 * Title: Week1-CodeReview
 * Date :31-10-2020
 */


// 1. (10) Create a Java class with a main() method that can be used for running the program.
/*

public class Calculations {
       public static double main(String[] args) {
*/

// 2. (20) Create a solution for the following problem: given a width and a height of
// a rectangular (image below, left side), calculate the rectangular area.

/*
public class Calculations {
    public static void main(String[] args) {
        int width = 500;
        int height = 200;
        int Area = width * height;
        System.out.println("Area of Rectangle is: " + Area + "cm2");
   }
}
*/


/*
3. (30) Create this solution with the usage of a new Java Method CalculateRectArea, that returns a computed value.
        Call this method with two different sets of arguments: 20cm (width1) and 30cm (height1),
        as well as 40cm (width2) and 50cm (height2)
 */

/*

public class Calculations {
        public static double calcRectArea(double a, double b) {
            return a * b;
        }

        public static void main(String[] args) {
            System.out.println("The area of the first rectangle is " + calcRectArea(20, 30) + " cm2");
            System.out.println("The area of the second rectangle is " + calcRectArea(40, 50) + " cm2");
        }
    }
*/

/*4. (30) Create a solution for the following problem: given a width of a square (image below, right side), calculate
the squareArea (on image below 16 cm²)  and the squarePerimeter (Perimeter:  line forming the boundary of a closed
geometrical figure.  Example: for a square with a width = 4cm, squarePerimeter  is 16 cm; for a square
with a width = 2cm, squarePerimeter  is 8cm)
*/

/*

public class Calculations {
    public static double calcSquareArea(double r) {
        return r * r;
    }
    public static double calcSquarePerimeter(double r) {
        return r * 4;
    }
    public static void main(String[] args) {
        System.out.println("The area of the square is " + calcSquareArea(7) + " cm2");
        System.out.println("The perimeter of the square is " + calcSquarePerimeter(7) + " cm");
    }
}

*/


//*5. (10) Demonstrate solutions from point 3 and 4 with several method calls (at least 3 for each) with different arguments.



public class Calculations {
    public static void main(String[] args) {
        System.out.println("The area of the square is " + calcSquareArea(4) + " cm2");
        System.out.println("The perimeter of the square is " + calcSquarePerimeter(4) + " cm");
        System.out.println("The area of the rectangle is " + calcRectArea(70, 80) + " cm2");

        System.out.println("The area of the square is " + calcSquareArea(5) + " cm2");
        System.out.println("The perimeter of the square is " + calcSquarePerimeter(5) + " cm");
        System.out.println("The area of the rectangle is " + calcRectArea(55, 88) + " cm2");

        System.out.println("The area of the square is " + calcSquareArea(6) + " cm2");
        System.out.println("The perimeter of the square is " + calcSquarePerimeter(6) + " cm");
        System.out.println("The area of the rectangle is " + calcRectArea(77, 99) + " cm2");
    }


    public static double calcRectArea(double a, double b) {
        return a * b;    }
    public static int calcSquareArea (int r) {
        return r * r; }
    public static int calcSquarePerimeter(int r) {
        return r * 4; }

}






/* Bonus points: (10) Save your test data (several widths / heights) for several different rectangles. Think about the data structure you
want to use. Use a for loop to perform rectangular surface calculation and display the results of your calculations.
*/




/* Bonus points: (10) Create a Java program, that accepts width and height of a rectangular as arguments passed to the main() method
and displays the solution in the console. To do that, do some research on “Java main method arguments”.
*/






