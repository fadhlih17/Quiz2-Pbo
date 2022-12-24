package Number4;

public class Manager extends Karyawan {
    int positionAllowance = 2000000;
    int salaryAllowance = 1500000;
    String allowance = "Manager";
    String clas = "Golongan c";

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
