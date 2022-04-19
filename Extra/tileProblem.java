import java.util.*;

interface tileShapeBP {
    public int Rectangle(int width, int height); // interface method (does not have a body)

    public double Circle(int radius); // interface method (does not have a body)

    public int Square(int s); // interface method (does not have a body)
}

class tileShape implements tileShapeBP {
    public int Rectangle(int width, int height) {
        // The body of Rectangle() is provided here
        int area = width * height;
        return area;
    }

    public double Circle(int radius) {
        // The body of Circle() is provided here
        double pi = 3.142, area;
        radius = 5;
        // calculating the area of the circle
        area = pi * radius * radius;
        return area;
    }

    public int Square(int s) {
        // The body of Square() is provided here
        int area=s*s;
        return area;
    }
}

class tileProblem {
    public static void main(String[] args) {

        tileShape obj = new tileShape();
        Scanner sc = new Scanner(System.in); // scanner class object

        while (true) {
            System.out.println("""
                    Choose Your Option
                    1.Square
                    2.Circle
                    3.Rectangle
                    4.Exit
                    """);
            System.out.print("Choose Your tile shape: ");
            int choice = sc.nextInt(); // taking input from the user

            if (choice == 1) {
                System.out.print("Enter radius: ");
                int s = sc.nextInt(); // taking input from the user
                int area = obj.Square(s);
                System.out.println("Area of Square Tiles: " + area);
            } else if (choice == 2) {
                System.out.print("Enter radius: ");
                int radius = sc.nextInt(); // taking input from the user
                double area = obj.Circle(radius);
                System.out.println("Area of Circle Tiles: " + area);
            } else if (choice == 3) {
                System.out.print("Enter Width: ");
                int width = sc.nextInt(); // taking input from the user
                System.out.print("Enter Height: ");
                int height = sc.nextInt(); // taking input from the user
                int area = obj.Rectangle(width,height);
                System.out.println("Area of Rectangle Tiles: " + area);

            } else if (choice == 4) {
                System.exit(0);
            }

        }
    }
}
