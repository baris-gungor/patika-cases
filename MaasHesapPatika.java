public class MaasHesapPatika {
    String name;
    int salary, workHours, hireYear;

    MaasHesapPatika(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void taxmethod() {
        if (salary > 999) {
            System.out.println("Aylık Vergisi: " + salary * 0.03);

        } else {
            System.out.println("Aylık Vergisi: " + salary * 0.0);
        }
    }

    void overTime() {
        if (workHours > 40) {
            int bonus = 30 * (workHours - 40);
            System.out.println("Mesai ucreti: " + bonus);
        }
    }

    void raiseSalary() {
        int currentYear = 2022;
        Double raise = 0.0;
        int workYear = currentYear - hireYear;
        if (workYear > 0 && workYear < 10) {
            raise = 0.05;
        } else if (workYear > 9 && workYear < 20) {
            raise = 0.10;
        } else if (workYear > 19) {
            raise = 0.15;
        }
        System.out.println("Zam miktari: "+raise);
    }

    void printInfo() {
        System.out.println("Adı Soyadı: "+name);
        System.out.println("Maas: "+salary);
        System.out.println("Calisma saati: "+workHours);
        System.out.println("Baslangic yili: "+hireYear);
        taxmethod();
        overTime();
        raiseSalary();
    }

    public static void main(String[] args) {
        MaasHesapPatika emp = new MaasHesapPatika("Ali Soylu", 2000, 45, 2021);
        emp.printInfo();

    }

}
