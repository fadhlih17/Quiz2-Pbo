package Number1.Interface;

public class KaryawanGol1 implements Perusahaan{

    String nama, divisi, alamat;
    int gajiPokok = 4500000;
    int gajiLembur;

    public void getData(String nama, String divisi, String alamat){
        this.nama = nama;
        this.divisi = divisi;
        this.alamat = alamat;
    }

    public int getGajiLembur(int jumlahJam){
        this.gajiLembur =  40000 * jumlahJam;
        return gajiLembur;
    }

    @Override
    public void data() {
        System.out.println("##### Data Karyawan Golongan 1 #####");
        System.out.println("Nama : " + nama);
        System.out.println("Divisi : " + divisi);
        System.out.println("Alamat : " + alamat);
    }

    @Override
    public void gaji() {
        System.out.println("===== Total Gaji =====");
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Lembur : Rp " + gajiLembur);
        System.out.println("Total gaji : Rp " + (gajiPokok + gajiLembur));
    }
}
