package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for(int i = 0;i < n; i++){
            System.out.println("Product #"+ (i+1) +"data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: $ ");
            double price = sc.nextDouble();
            if(ch == 'c'){
                Product pd = new Product(name, price);
                list.add(pd);
            }
            else if(ch == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product ip = new ImportedProduct(name, price, customsFee);
                list.add(ip);
            }
            else{
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                Product up = new UsedProduct(name, price, manufactureDate);
                list.add(up);
            }
        }
        System.out.println("PRICE TAGS: ");
        for(Product product: list) {
            System.out.println(product.priceTag());
        }

    }
}
