package Number9;

public class KaryawanHonorer extends KaryawanTetap{

    @Override
    void golongan(String golongan, int months) {

        this.months = months;

        switch (golongan.toLowerCase()) {
            case "a" -> money = 30000000;
            case "b" -> money = 20000000;
            case "c" -> money = 10000000;
            default -> System.out.println("No money available");
        }
    }

    @Override
    int payment() {
        return super.payment();
    }
}
