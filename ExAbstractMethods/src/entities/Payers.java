package entities;

public class Payers {
    private String name;
    protected Double anualIncome;
    private PhysicalPerson pp;
    private JuridicalPerson jp;

    public Payers(){
    }

    public Payers(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public Double tax(){
        return anualIncome;
    }

    public String toString(){
        return name +" , "+ tax();
    }
}
