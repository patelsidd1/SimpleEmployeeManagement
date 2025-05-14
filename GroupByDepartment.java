package question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupByDepartment {
    public static void main(String[] args) {

      List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Kishan","Java"));
        employeeList.add(new Employee(2,"Ashwani","Python"));
        employeeList.add(new Employee(3,"Aniket","Java"));
        employeeList.add(new Employee(4,"Shivam","Python"));
        employeeList.add(new Employee(5,"Satyam","Java"));
        employeeList.add(new Employee(6,"Ashish","Python"));

      List<Employee> collect1 = employeeList.stream().filter(e -> e.getDepartment().equals("Java")).collect(Collectors.toList());
      collect1.forEach(e-> System.out.println("Java : " +e));

      List<Employee> collect2 = employeeList.stream().filter(e -> e.getDepartment().equals("Python")).collect(Collectors.toList());
      collect2.forEach(employee -> System.out.println("Python : " +employee));


      Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment()));

        collect.forEach((a,b)-> {
          System.out.println(a+" = " +b);
        });
    }



}
