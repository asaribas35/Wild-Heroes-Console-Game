public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYears;

    Employee(String name,double salary,int workHours,int hireYears){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYears=hireYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYears() {
        return hireYears;
    }

    public void setHireYears(int hireYears) {
        this.hireYears = hireYears;
    }

    double tax(){
        double salaryTax;
        if (this.salary>1000){
            salaryTax=this.salary*0.03;
        }else{
            salaryTax=0;
        }
        return salaryTax;
    }

    double bonus(){
        double bonusSalary;
        if (this.workHours>40){
            bonusSalary=(this.workHours-40)*30;
        }else {
            bonusSalary=0;
        }
        return bonusSalary;
    }

    double raiseSalary(){
        double expBonus;
        if (this.hireYears<2021){
            if((2021-this.hireYears)>19){
                expBonus=this.salary*0.15;
            }else if ((2021-this.hireYears)>9){
                expBonus=this.salary*0.10;
            }else {
                expBonus=this.salary*0.05;
            }

        }else {
            expBonus=0;
        }
        return expBonus;
    }

    @Override
    public String toString(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYears);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile maaş : " + (this.salary-tax()+bonus()) );
        System.out.println("Toplam Maaş : " + (this.salary-tax()+bonus()+raiseSalary()) );
        System.out.println("-----------------------------------------------");
        return null;
    }



}
