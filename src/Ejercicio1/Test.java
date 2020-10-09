package Ejercicio1;

public class Test {

    public static void main(String[] args) {
        EmployeeSalaried salaried = new EmployeeSalaried("José", 30, 10000);
        EmployeeOutsourced outsourced = new EmployeeOutsourced("Carlos", 23, 100, 50);

        System.out.println(salaried);
        System.out.println(outsourced);
    }
}
