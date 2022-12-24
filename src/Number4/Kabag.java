package Number4;

public class Kabag extends Karyawan {
    int positionAllowance = 1000000;
    int salaryAllowance = 1000000;
    String allowance = "Kabag";
    String clas = "Golongan b";

    void setAllowanceManager(){
        super.setAllowance(allowance);
    }

    void setClasManager(){
        setClas(clas);
    }

    int calculateGajiManager() {
        return super.calculateSalary(positionAllowance, salaryAllowance);
    }

}
