package Number2my;

public abstract class Vehicle {
    private String name, phoneNumber, address;
    int longRent;
    public void setData(String name, String phoneNumber, String address, int longRent) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.longRent = longRent;
    }
    public abstract void menu();
    public abstract void cost ();
    public void print() {
        System.out.println("=========================");
        System.out.println("Nama : " + name);
        System.out.println("No Hp : " + phoneNumber);
        System.out.println("Alamat : " + address);
    }
}
