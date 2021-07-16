package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int manyEmployees = sc.nextInt();

        for(int i =0; i < manyEmployees; i++){
            System.out.println("Employee #"+ (i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            // Essa parte é para pegar o id repetido, caso alguém digite errado.
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));

        }

        // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
        System.out.print("Enter the employee id that will have salary increased: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This id does not exist! ");
        } else {
            System.out.print("Enter the porcentage: ");
            double percentage = sc.nextDouble();
            emp.setSalary(percentage);
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        sc.close();


    }

    private static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
