package entities;

public class JuridicalPerson extends Payers {

    private Integer workers;

    public JuridicalPerson(){

    }

    public JuridicalPerson(String name, Double anualIncome, Integer workers) {
        super(name, anualIncome);
        this.workers = workers;
    }

    public Integer getWorkers() {
        return workers;
    }

    public void setWorkers(Integer workers) {
        this.workers = workers;
    }

    @Override
    public Double tax(){
        Double taxTotalPaid = 0.0;
        if(workers > 10){
            taxTotalPaid = anualIncome * 14/100;
        }
        else{
            taxTotalPaid = anualIncome * 16/100;
        }
        return taxTotalPaid;

    }


}
