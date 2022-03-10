import java.util.Scanner;

public class Company {
    String name ;

    Company(String name){
        this.name=name;
    }

    public void addEmployee(){
        System.out.println("-----------------------------------");
        Scanner inp = new Scanner(System.in);

        System.out.print("Çalışan Adını Giriniz : ");
        String name = inp.nextLine();
        System.out.print("Çalışan Maaşını Giriniz : ");
        int salary = inp.nextInt();
        System.out.println("Haftalık Çalışma Saatini giriniz : ");
        int workHours = inp.nextInt();
        System.out.println("Çalışanın işe giriş yılını yazınız : ");
        int hireYears = inp.nextInt();

        Employee ali = new Employee(name,salary,workHours,hireYears);
        ali.toString();
    }
}
