package Number1.Inheritance;
public class Siswa extends Sekolah {
    String name = "Andi";
    String clas = "6B";

    void DataSiswa(){
        System.out.println("Nama : " +name);
        System.out.println("Kelas :  " + clas);
        System.out.println("Asal Sekolah : " + nameSchool);
    }
    public static void main(String[] args) {
        Sekolah sekolah = new Sekolah();
        Siswa siswa = new Siswa();

        System.out.println("Data Sekolah : ");
        sekolah.Data();
        System.out.println();
        System.out.println("Data Siswa : ");
        siswa.DataSiswa();
    }
}
