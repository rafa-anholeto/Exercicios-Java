package entities;

import java.util.List;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    
    public Employee(){
        
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
       
    }

    public Employee(List<Integer> id, String name) {
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public Double getSalary(){
        return salary;
    }

    public Double setSalary(double percentage) {
        salary = getSalary() + (getSalary() * percentage /100);
        return salary;
    }

    public String toString(){
        return id
                + ", "
                + name
                + ", "
                + salary;
    }
}
