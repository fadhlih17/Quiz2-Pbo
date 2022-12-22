package Number1.Polimorphysm;

public class Perusahaan {
    String name, address;

    public Perusahaan(String name, String addrress) {
        this.name = name;
        this.address = addrress;
    }

    public void Data(){
        System.out.println("Nama : " + this.name);
        System.out.println("Alamat : " + this.address);
    }
}
