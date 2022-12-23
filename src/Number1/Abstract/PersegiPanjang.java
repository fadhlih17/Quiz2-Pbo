package Number1.Abstract;

public class PersegiPanjang extends BangunDatar{

    int resultLuas, resultKeliling;
    public PersegiPanjang(){
     super("Persegi Panjang");
    }

    public int setLuas(int panjang, int lebar){
        super.getPanjang(panjang);
        super.getLebar(lebar);
        this.resultLuas = this.panjang * this.lebar;
        return resultLuas;
    }

    public int setKeliling(int panjang, int lebar) {
        super.getPanjang(panjang);
        super.getLebar(lebar);
        this.resultKeliling = 2 * (this.panjang + this.lebar);
        return resultKeliling;
    }

    public void printHasil(){
        System.out.println("Menghitung " + this.name);
        System.out.println("Luas : " + this.resultLuas);
        System.out.println("Keliling : " + this.resultKeliling);
    }
}
