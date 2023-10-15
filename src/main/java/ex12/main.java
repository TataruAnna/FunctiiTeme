package ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    //Un angajat este caracterizat de nume si salariu. Un departament este caracterizat de nume, cod, si o lista de angajati. Codul este un String
    //
    //Avand o lista de departamente intr-un main, care are fiecare o lista de angajati, scrie o metoda care primeste lista de departamente si un salariu minim.
    //
    //Metoda va returna cati angajati din toate departamentele au salariul mai mare decat salariul minim primit ca parametru.
    //
    //(HINT: stream pe departamente si apoi flatMap pentru a ajunge la angajati, apoi filter pentru a filtra pe cei cu salariul mai mare decat salariul minim si count
    // la final pentru a-i numara)
    //
    //Rezolva problema si fara expresii lambda
    public static void main(String[] args) {
        List<Employee> employees1 = Arrays.asList(new Employee("Ion",10000),new Employee("Marcel",9000));
        List<Employee> employees2 = Arrays.asList(new Employee("Costel",5000),new Employee("Mirel",4000));

        List<Department> departmentList = Arrays.asList(new Department("dep1","1", employees1 ), new Department("dep2","2",employees2));
        System.out.println(getNumberOfEmployeesWithSalaryGraterThan(departmentList, 6000));

        long numberOfEmployeesWithSalaryGraterThan = departmentList.stream()
                .flatMap(department -> department.getEmployees().stream())
                .map(employee -> employee.getSalary())
                .filter(salary -> salary > 6000)
                .count();

        System.out.println(numberOfEmployeesWithSalaryGraterThan);
    }

    public static Integer getNumberOfEmployeesWithSalaryGraterThan(List<Department> departments, Integer baseSalary){
        int count = 0;
        for(Department department: departments){
            for(Employee employee:department.getEmployees()){
                if(employee.getSalary()>baseSalary){
                    count++;
                }
            }
        }
        return count;
    }
}
