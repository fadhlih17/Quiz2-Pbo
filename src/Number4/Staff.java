package Number4;

public class Staff extends Karyawan {
    int positionAllowance = 0;
    int salaryAllowance = 500000;
    String allowance = "Staff";
    String clas = "Golongan a";

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
