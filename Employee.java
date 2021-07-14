package application;

public class Employee {
    //Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
    //seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
    //salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
    //afetado pela porcentagem) e mostrar novamente os dados do funcionário.

    public String name;
    public double grossSalary, tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
       grossSalary += (grossSalary * percentage / 100);
    }
    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }



}
