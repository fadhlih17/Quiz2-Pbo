package Number1.Polimorphysm;

public class Karyawan extends Perusahaan{
    String division;
    public Karyawan (String name, String address, String division) {
        super(name,address);
        this.division = division;
    }

    public void Data() {
        super.Data();
        System.out.println("Divisi : " + this.division);
    }

    public void Data(String subDivision){
        System.out.println("Sub Divisi : " + subDivision);
    }
}
