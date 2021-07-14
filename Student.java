package application;

public class Student {
    public String name;
    public double nota1, nota2, nota3;

    public double finalGrade(){
        return nota1 + nota2 + nota3;
    }
    public double missingPoints() {
        if (finalGrade() < 60) {
            return 60 - finalGrade();
        } else {
            return 0.0;
        }
    }
}
