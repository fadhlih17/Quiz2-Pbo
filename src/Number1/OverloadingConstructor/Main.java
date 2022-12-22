package Number1.OverloadingConstructor;

public class Main {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Andika");
        mahasiswa1.print();

        System.out.println();

        Mahasiswa mahasiswa2 = new Mahasiswa("Anggi" , "Teknik Informatika" ,"Bekasi" );
        mahasiswa2.print();

        System.out.println();

        Mahasiswa mahasiswa3 = new Mahasiswa("Doni", "DKV", "Jakarta", 95);
        mahasiswa3.print();

    }
}
//mendefinisikan lebih dari satu constructor
//tetapi parameter yang dideklarasikan
//harus berbeda baik itu jumlahnya ataupun tipe parameternya.