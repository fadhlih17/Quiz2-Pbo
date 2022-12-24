package Number7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        print();
    }

    public static void print() {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                1. Menghitung Luas dan Keliling segitiga\040
                2. Menghitung Volume dan Luas Permukaan Prisma Segitiga""");


        boolean loop = true;
        while (loop) {

            System.out.print("Masukkan dengan angka : ");
            int choice = Integer.parseInt(input.nextLine());

            if (choice == 1) {
                printTriangle();
                loop = false;
            }
            else if (choice == 2){
                printPrism();
                loop = false;
            }
            else {
                System.out.println("Pilihan tidak tersedia");
            }
        }
    }

    public static void printTriangle() {
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.println("===== Menu menghitung luas dan keliling segitiga =====");
        System.out.println("""
                1. Menghitung Luas Segitiga
                2. Menghitung Keliling Segitiga""");

        boolean loop = true;
        while (loop) {

            System.out.print("Masukkan pilihan anda dengan angka : ");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.println("### Menghitung Luas segitiga ###");
                    System.out.print("Input alas segitiga : ");
                    double pedestal = Double.parseDouble(input.nextLine());
                    System.out.print("Input tinggi segitiga : ");
                    double height = Double.parseDouble(input.nextLine());

                    triangle.setPedestal(pedestal);
                    triangle.setHeight(height);
                    double result = triangle.triangleArea();

                    System.out.println("Luas segitiga : " + result);
                    loop = false;
                }
                case 2 -> {
                    System.out.println("### Menghitung keliling segitiga ###");
                    System.out.print("Input alas segitiga : ");
                    double pedestal = Double.parseDouble(input.nextLine());
                    System.out.print("Input tinggi segitiga : ");
                    double height = Double.parseDouble(input.nextLine());

                    triangle.setPedestal(pedestal);
                    triangle.setHeight(height);
                    double result = triangle.triangleAround();

                    System.out.println("Keliling Segitiga : " + result);

                    loop = false;
                }
                default -> System.out.println("Tidak ada pilihan");
            }
        }

    }

    public static void printPrism() {
        Scanner input = new Scanner(System.in);
        TriangularPrism triangularPrism = new TriangularPrism();

        System.out.println("===== Menu menghitung volume dan luas permukaan prisma segitiga =====");
        System.out.println("""
                1. Menghitung volume prisma Segitiga
                2. Menghitung luas permukaan prisma Segitiga""");

        boolean loop = true;
        while (loop) {

            System.out.print("Masukkan pilihan anda dengan angka : ");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.println("### Menghitung Volume Prisma ###");
                    System.out.print("Input alas segitiga prisma : ");
                    double pedestal = Double.parseDouble(input.nextLine());
                    System.out.print("Input tinggi segitiga prisma : ");
                    double height = Double.parseDouble(input.nextLine());
                    System.out.print("Input tinggi prisma : ");
                    double prismHeight = Double.parseDouble(input.nextLine());

                    triangularPrism.setPedestal(pedestal);
                    triangularPrism.setHeight(height);
                    triangularPrism.setPrismHeight(prismHeight);
                    double result = triangularPrism.prismVolume();

                    System.out.println("Volume prisma segitiga : " + result);
                    loop = false;
                }
                case 2 -> {
                    System.out.println("### Menghitung Luas Permukaan Prisma ###");
                    System.out.print("Input alas segitiga prisma : ");
                    double pedestal = Double.parseDouble(input.nextLine());
                    System.out.print("Input tinggi segitiga prisma : ");
                    double height = Double.parseDouble(input.nextLine());
                    System.out.print("Input tinggi prisma : ");
                    double prismHeight = Double.parseDouble(input.nextLine());

                    triangularPrism.setPedestal(pedestal);
                    triangularPrism.setHeight(height);
                    triangularPrism.setPrismHeight(prismHeight);
                    double result = triangularPrism.prismArea();

                    System.out.println("Volume prisma segitiga : " + result);

                    loop = false;
                }
                default -> System.out.println("Tidak ada pilihan");
            }
        }

    }
}
