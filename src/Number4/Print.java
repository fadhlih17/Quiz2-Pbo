package Number4;
import java.util.Scanner;

public class Print {
    Scanner input = new Scanner(System.in);
    String name;

    public void printMenu() {

        System.out.println("""
                ===== PILIH JABATAN =====
                1. Manager
                2. Kabag
                3. Staff""");
    }

    public void inputAnswer() {
        boolean loop = true;
        while (loop) {
            System.out.print("Pilih dengan angka : ");
            int inputChoice = Integer.parseInt(input.nextLine());
            switch (inputChoice) {
                case 1 :
                    Manager manager = new Manager();
                    System.out.print("Masukkan Nama : ");
                    name = input.nextLine();
                    manager.setName(name);
                    manager.setAllowanceManager();
                    manager.setClasManager();
                    manager.calculateGajiManager();
                    manager.print();
                    loop = false;
                    break;

                case 2:
                    Kabag kabag = new Kabag();
                    System.out.print("Masukkan Nama : ");
                    name = input.nextLine();
                    kabag.setName(name);
                    kabag.setAllowanceManager();
                    kabag.setClasManager();
                    kabag.calculateGajiManager();
                    kabag.print();
                    loop = false;
                    break;

                case 3:
                    Staff staff = new Staff();
                    System.out.print("Masukkan Nama : ");
                    name = input.nextLine();
                    staff.setName(name);
                    staff.setAllowanceManager();
                    staff.setClasManager();
                    staff.calculateGajiManager();
                    staff.print();
                    loop = false;
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia");
                    loop = true;
            }
        }

    }
}
