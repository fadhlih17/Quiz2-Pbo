package Number8my;

public class Order {
    private String name;
    private int price, item, total;

public Order(String name, int price, int item, int total){
    this.name = name;
    this.price = price;
    this.item = item;
    this.total = total;
}
    String getName(){
        return name;
    }

    int getPrice(){
        return price;
    }

    int getItem() {
    return item;
    }

    int getTotal() {
    return total;
    }
}
