package Number1.Abstract;

public abstract class BangunDatar {
    String name;
    int panjang, lebar, tinggi;

    public BangunDatar(String name){
        this.name = name;
    }

    public int getPanjang (int panjang){
        this.panjang = panjang;
        return this.panjang;
    }

    public int getLebar(int lebar) {
        this.lebar = lebar;
        return this.lebar;
    }

    public int getTinggi(int tinggi) {
        this.tinggi = tinggi;
        return this.tinggi;
    }

    public abstract int setLuas(int a, int b);

    public abstract int setKeliling(int a, int b);

}
