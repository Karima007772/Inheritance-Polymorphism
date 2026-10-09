import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Bentuk Geometri ===");

      
        System.out.println("\n--- Persegi (Square) ---");
        System.out.print("Masukkan sisi     : ");
        double side = input.nextDouble();
        input.nextLine(); 
        System.out.print("Masukkan warna    : ");
        String colorSquare = input.nextLine();

        Square square = new Square(side, colorSquare);

      
        System.out.println("\n--- Lingkaran (Circle) ---");
        System.out.print("Masukkan radius   : ");
        double radius = input.nextDouble();
        input.nextLine();
        System.out.print("Masukkan warna    : ");
        String colorCircle = input.nextLine();

        Circle circle = new Circle(radius, colorCircle);

  
        System.out.println("\n--- Silinder (Cylinder) ---");
        System.out.print("Masukkan tinggi   : ");
        double height = input.nextDouble();
        System.out.print("Masukkan radius   : ");
        double radiusCyl = input.nextDouble();
        input.nextLine();
        System.out.print("Masukkan warna    : ");
        String colorCyl = input.nextLine();

        Cylinder cylinder = new Cylinder(height, radiusCyl, colorCyl);


        System.out.println("\n=== Hasil ===");
        square.printInfo();
        circle.printInfo();
        cylinder.printInfo();

        input.close();
    }
}