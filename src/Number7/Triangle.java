package Number7;

public class Triangle {
    private double height;
    private double pedestal;

    void setHeight (double height) {
        this.height = height;
    }

    void setPedestal(double pedestal) {
        this.pedestal = pedestal;
    }

    double triangleArea() {
        return 0.5 * pedestal * height;
    }

    double triangleAround() {
        return (2 * height) + pedestal;
    }

}
