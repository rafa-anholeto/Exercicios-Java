package application;

import entities.JuridicalPerson;
import entities.Payers;
import entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Payers> list = new ArrayList<>();
        Payers payers = new Payers();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            System.out.println("Tax payer #"+ (i+1) +" data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            if(ch == 'i'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: $ ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health Expenditures: $ ");
                double healthTax = sc.nextDouble();
                payers = new PhysicalPerson(name, anualIncome, healthTax);
                list.add(payers);

            }else {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: $ ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int workers = sc.nextInt();
                payers = new JuridicalPerson(name, anualIncome, workers);
                list.add(payers);
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for(Payers taxes: list){
            System.out.println(taxes.getName()+":" + "  $ "+ String.format("%.2f", taxes.tax()));
        }

        double sum = 0.0;
        for(Payers taxes: list){
            sum += taxes.tax();
        }
        
        System.out.println();
        System.out.println("TOTAL TAXES:  $ "+ String.format("%.2f", sum));


    }
}
