package Number1.Interface;
public class Main {
    public static void main(String[] args) {

        String nama = "Fadhlih G Putra";
        String divisi = "IT";
        String alamat = "Bekasi";
        int jamLembur = 15;

        KaryawanGol1 karyawanGol1 = new KaryawanGol1();
        karyawanGol1.getData(nama, divisi, alamat);
        karyawanGol1.getGajiLembur(jamLembur);

        karyawanGol1.data();
        karyawanGol1.gaji();
    }
}

