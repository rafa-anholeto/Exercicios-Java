package entities;

import entitiies.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Associações, fizemos aqui uma composição de objetos.
    private Department department;
    //Lista impletementada por terem muitos contratos
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){

    }

    //Construtor gerado sem a lista contract, muito importante, ela já foi instanciada por padrão aqui na classe
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    //Tá recebendo uma outra lista e essa outra lista está sendo atribuida pra minha lista de contatos de trabalhador.
    //Muito importante. Eu não posso trocar uma lista por outra lista.
    /*public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }*/

    public void addContract(HourContract contract){
        contracts.add(contract);
        //contrato adicionado na minha lista.
    }
    public void removeContrat(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c: contracts){
            // Peguei a data do meu contrato e defini essa data como sendo a data do calendário.
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1+ cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
