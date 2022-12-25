package Number9;

public class KaryawanTetap {

    protected String name, nik;
    int months, money;
    int loanInterest, paymentObligation, total;

    protected void setNameNik(String name, String nik) {
        this.name = name;
        this.nik = nik;
    }

    void golongan (String golongan, int months) {

        this.months = months;

        switch (golongan.toLowerCase()) {
            case "a" -> money = 100000000;
            case "b" -> money = 75000000;
            case "c" -> money = 50000000;
            default -> System.out.println("No money available");
        }
    }

    int payment() {
        loanInterest = (int) (money * 0.00025);
        paymentObligation = (money / months) + loanInterest;
        total = paymentObligation * months;
        return total;
    }

}
