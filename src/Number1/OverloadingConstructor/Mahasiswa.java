package Number1.OverloadingConstructor;

public class Mahasiswa {
    String name;
    String major = "-";
    String address = "-";
    int examValue;

    public Mahasiswa (String name) {
        this.name = name;
    }

    public Mahasiswa (String name, String major, String address) {
        this.name = name;
        this.major = major;
        this.address = address;
    }

    public Mahasiswa (String name, String major, String address, int examValue){
        this.name = name;
        this.major = major;
        this.address = address;
        this.examValue = examValue;
    }

    public void print() {
        System.out.println("Nama : " + name);
        System.out.println("Jurusan : " + major);
        System.out.println("Alamat : " + address);
        System.out.println("Nilai ulangan : " + examValue);
    }
}
