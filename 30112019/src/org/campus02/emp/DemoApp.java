package org.campus02.emp;

public class DemoApp {
    public static void main(String[] args) {
        //ja lol,  vergleichen dies das

        Employee e1 = new Employee(1,"gurke",2000,"aussendienst");
        System.out.println(e1.getDepartment());
        e1.getEmpNumber();
        e1.getName();
        e1.getSalary();
    }
}
