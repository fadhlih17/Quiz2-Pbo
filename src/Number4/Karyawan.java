package Number4;

public abstract class Karyawan {
    private String name, allowance, clas;
    private int positionAllowance, classAllowance, total;
    private int attendanceBonuses = 100000;

    protected void setName(String name) {
        this.name = name;
    }

    protected void setAllowance(String allowance) {
        this.allowance = allowance;
    }

    protected void setClas(String clas){
        this.clas = clas;
    }

    protected int calculateSalary(int positionAllowance, int classAllowance) {
        this.positionAllowance = positionAllowance;
        this.classAllowance = classAllowance;
        this.total = this.positionAllowance + this.classAllowance + this.attendanceBonuses;

        return total;
    }

    protected void print() {
        System.out.println("Nama Karyawan : " + name);
        System.out.println("Jabatan : " + allowance);
        System.out.println("Golongan : " + clas);
        System.out.println("===== Print Gaji =====");
        System.out.println("Tunjangan Jabatan : Rp " + positionAllowance);
        System.out.println("Tunjangan Golongan : Rp " + classAllowance);
        System.out.println("Tunjangan Kehadiran Rp " + attendanceBonuses);
        System.out.println("Total Gaji : Rp " + total);
    }
}
