package Number1.Overriding;

public class Tabung extends Lingkaran{
    int tinggi;

    public double luasTabung (int tinggi) {
        this.tinggi = tinggi;
        return 3.14 * Math.pow(jariJari, 2) * this.tinggi;
    }
}
