package exercise1;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {


        Product milk = new Product(5,"Milk","Good for your everyday coffee",44);

        Cosmetics nailColor = new Cosmetics(20,"Nailer","Your nails will look awesome in this color",67,"red",34);
        Cosmetics thoothpaste = new Cosmetics(12,"Thooth Paste","Shining white",45,"white",55);
        Cosmetics shampoo = new Cosmetics(16,"Shampoo","Smell good again",120,"yellow",80);

        Electronics phone = new Electronics(500,"Iphone","Better than Samsung",2,"Smartphone",100,20,10,50);

        Fridge fridge = new Fridge(700,"Fridge","Cool",11,"Home Essentials",240,80,50,89,-7);

        String response;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter product to print the description: ");
        response = scan.next();

        if(response.equals("Milk"))
            System.out.println(milk);
        if(response.equals("Nail Color"))
            System.out.println(nailColor);
        if(response.equals("Thoothpaste"))
            System.out.println(thoothpaste);
        if(response.equals("Shampoo"))
            System.out.println(shampoo);
        if(response.equals("Iphone"))
            System.out.println(phone);
        if(response.equals("Fridge"))
            System.out.println(fridge);

    }
}
