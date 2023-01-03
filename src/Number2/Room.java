package Number2;

public abstract class Room {
    private String name, phoneNumber, address;
    int total;

    public void setData(String name, String phoneNumber, String address, int total) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.total = total;
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
