package Number1.OverloadMethod;

public class Main {
    public static void bangunRuang () {
        System.out.println("Menghitung bangun ruang");
    }
    public static int  bangunRuang (int sisi){
        return (int) Math.pow(sisi,3);
    }
    public static int bangunRuang(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }
    public static void main(String[] args) {

        int kubus = bangunRuang(3);
        int balok = bangunRuang(12,5,3);

        bangunRuang();
        System.out.println("Hasil perhitungan kubus " + kubus);
        System.out.printf("Hasil perhitungan balok %d ", balok);

    }
}
// Method overloading : mendefinisikan lebih dari satu method
//dengan nama yang sama tetapi parameter yang dideklarasikan
//harus berbeda baik itu jumlahnya ataupun tipe parameternya.
