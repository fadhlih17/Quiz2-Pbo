package Number1.Encapsulation;

public class Perkalian {
    private int input1, input2, result;

    private int Calculate (int a, int b){
        input1 = a;
        input2 = b;
        result = input1 * input2;
        return result;
    }

    public void Result (int c, int d){
        System.out.println("Hasil : " + Calculate(c, d));
    }
}
