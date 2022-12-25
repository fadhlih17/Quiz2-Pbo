package Number9;
import java.util.Scanner;

public class PinjamanUang {
    public static void main(String[] args) {

        display();
    }

    public static void display() {

        Scanner input = new Scanner(System.in);
        KaryawanTetap karyawanTetap = new KaryawanTetap();
        KaryawanHonorer karyawanHonorer = new KaryawanHonorer();

        System.out.print("Masukkan Nama : ");
        String name = input.nextLine();
        System.out.print("Masukkan NIK : ");
        String nik = input.nextLine();

        karyawanTetap.setNameNik(name, nik);

        System.out.println("""
                Pilihan Status :
                1. Karyawan Tetap
                2. Karyawan Honorer""");

        System.out.print("Masukkan Pilihan Status -> ");
        int choice = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan pilihan golongan (A/B/C) : ");
        String golongan = input.nextLine();
        System.out.print("Lama pinjaman (bulan) : ");
        int months = Integer.parseInt(input.nextLine());

        switch (choice) {
            case 1 -> {
                karyawanTetap.golongan(golongan, months);
                karyawanTetap.payment();
                System.out.println("=====================================");
                System.out.println("Nilai bunga setiap bulan Rp : " + karyawanTetap.loanInterest);
                System.out.println("Kewajiban pembayaran setiap bulan Rp : " + karyawanTetap.paymentObligation);
                System.out.println("Total pinjaman : Rp " + karyawanTetap.total);
            }
            case 2 -> {
                karyawanHonorer.golongan(golongan,months);
                karyawanHonorer.payment();
                System.out.println("=====================================");
                System.out.println("Nilai bunga setiap bulan Rp : " + karyawanHonorer.loanInterest);
                System.out.println("Kewajiban pembayaran setiap bulan Rp : " + karyawanHonorer.paymentObligation);
                System.out.println("Total pinjaman : Rp " + karyawanHonorer.total);
            }
            case 3 -> System.out.println("Pilihan tidak tersedia");
        }
    }
}
