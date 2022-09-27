package com.hotel.nest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {

        int qty,choice,ch,total=0;

        FoodItems foodDinning=new FoodItems(10,15,18,20);
        FoodItems foodDelivery=new FoodItems(12,17,20,25);
        ArrayList<String> item=new ArrayList<>();
        ArrayList<Integer> quantity=new ArrayList<>();

        HashMap<String,String> map=new HashMap<String,String>();
        ArrayList<String>transactionList=new ArrayList<>();


        while (true) {
            System.out.println("1,Normal Case");
            System.out.println("2,Takeway");
            System.out.println("3.view all bills");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();

            switch (choice){

                case 1:

                        System.out.println("choose the items");
                        System.out.println("1. Tea price" + foodDinning.getTea());
                        System.out.println("2. Coffee Price" + foodDinning.getCoffee());
                        System.out.println("3. Idli Price" + foodDinning.getIdli());
                        System.out.println("4. Dosa Price" + foodDinning.getDosa());
                        System.out.println("5. Bill");
                        System.out.println("6. Exit");
                        ch=sc.nextInt();

                    switch (ch){
                        case 1:
                            System.out.println("Enter the qty");
                            qty = sc.nextInt();
                            item.add("Tea");
                            quantity.add(qty);
                            total =(foodDinning.getCoffee()*qty)+total;
                            break;
                        case 2:

                            System.out.println("Enter the qty");
                            qty = sc.nextInt();
                            item.add("Coffee");
                            quantity.add(qty);
                            total = (foodDinning.getTea()*qty)+total;
                            break;
                        case 3:

                            System.out.println("Enter the quantity");
                            qty = sc.nextInt();
                            item.add("Idli");
                            quantity.add(qty);
                            total = (foodDinning.getIdli()*qty)+total;
                            break;

                        case 4:
                            System.out.println("Enter the quantity");
                            qty = sc.nextInt();
                            item.add("Dosa");
                            total = (foodDinning.getDosa()*qty)+total;
                            quantity.add(qty);
                            break;
                        case 5:

                            System.out.println("\t Bill");
                            System.out.println("**************");
                            for(int i=0; i<=item.size()-1;i++) {
                                System.out.println("Item Name:" + item.get(i) + "\tQty:" + quantity.get(i));
                            }

                            System.out.println("Total money you want to pay is\t"+total);

                    }
                    break;
                case 2:
                System.out.println("1. Tea Price" + foodDelivery.getTea());
                System.out.println("2. Coffee Price" + foodDelivery.getCoffee());
                System.out.println("3. Idli Price" + foodDelivery.getIdli());
                System.out.println("4. Dosa Price " + foodDelivery.getDosa());
                System.out.println("Bill");
                System.out.println("Exit");
                case 1:
                    System.out.println("Enter the qty");
                    qty = sc.nextInt();
                    item.add("Tea");
                    quantity.add(qty);
                    total = (foodDinning.getCoffee() * qty + total);
                    break;
                case 2:
                    System.out.println("Enter the qty");
                    qty = sc.nextInt();
                    item.add("Coffee");
                    quantity.add(qty);
                    total = (foodDinning.getTea());
                    break;
                case 3:
                    System.out.println("Enter the quantity");
                    qty = sc.nextInt();
                    item.add("Idli");
                    quantity.add(qty);
                    break;
                case 4:
                    System.out.println("Enter the quantity");


                    qty = sc.nextInt();
                    item.add("Dosa");
                    quantity.add(qty);
                    break;
                case 5:
                    System.out.println("\t Bill");
                    System.out.println("**************");
                    for (int i = 0; i <= item.size() - 1; i++) ;
                {
                    System.out.println("Item Name:" + item.get('i') + "\tQty:" + quantity.get('i'));

                    System.out.println("Total money you want to pay is\t" + total);
                }
                case 6:
                    System.exit(0);
                default:
                    System.out.println("invalid choice");

            }
        }
    }
}
