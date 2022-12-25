package Number1.Overriding;

public class Tabung extends Lingkaran{
    int tinggi;

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public double luasTabung () {
        return 3.14 * Math.pow(jariJari, 2) * this.tinggi;
    }

    public void display() {
        System.out.println("Luas tabung : " + luasTabung());
    }
}
