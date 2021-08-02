package entities;

public class PhysicalPerson extends Payers {

    private Double healthTax;

    public PhysicalPerson(){

    }

    public PhysicalPerson(String name, Double anualIncome, Double healthTax) {
        super(name, anualIncome);
        this.healthTax = healthTax;
    }


    public Double getHealthTax() {
        return healthTax;
    }

    public void setHealthTax(Double healthTax) {
        this.healthTax = healthTax;
    }

    @Override
    public Double tax(){
        Double taxTotalPaid = 0.0;
        if(anualIncome < 20000.00){
            taxTotalPaid = anualIncome * 15/100;

        } else if(anualIncome > 20000.00 && healthTax == 0.0){
            taxTotalPaid = anualIncome * 25/100;

        } else {
            taxTotalPaid = anualIncome * 25/100 - healthTax * 50/100;
        }
        return taxTotalPaid;

    }


}
