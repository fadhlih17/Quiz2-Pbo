package Number7;

public class TriangularPrism extends Triangle {
    private double prismHeight;

    void setPrismHeight (double prismHeight) {
        this.prismHeight = prismHeight;
    }
    double prismVolume () {
        return triangleArea() * prismHeight;
    }

    double prismArea() {
        return (2 * triangleArea()) + (triangleAround() * prismHeight);
    }

}
