package Number1.Overriding;

public class Lingkaran {
    int jariJari;

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    public double luasLingkaran() {
        return 3.14 * Math.pow(jariJari, 2);
    }

    public void display() {
        System.out.println("Luas lingkaran : " + luasLingkaran());
    }
}
