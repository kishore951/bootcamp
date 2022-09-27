package com.nest.coffeeshop;

import java.util.ArrayList;
import java.util.Scanner;





    public class CoffeeShop {
        public static void main(String[] args) {
            int choice;

            ArrayList<String> itemName = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            ArrayList<Integer> price = new ArrayList<>();

            while (true) {


                Scanner in = new Scanner(System.in);
                choice = in.nextInt();
                int qty;
                switch (choice) {
                    System.out.println(itemName.get('i') + "" + quantity.get('i') + ":" + price.get('i'));
                        case 1:
                        System.out.println("Enter the qty");
                        qty = in.nextInt();
                        itemName.add("Coffee");
                        quantity.add(qty);
                        price.add(qty * 10);
                        break;
                    case 2:
                        System.out.println("Enter the qty");
                        qty = in.nextInt();
                        itemName.add("Tea");
                        quantity.add(qty);
                        price.add(qty * 5);
                        break;
                    case 3:
                        System.out.println("Enter the quantity");
                        qty = in.nextInt();
                        itemName.add("Green Tea");
                        quantity.add(qty);
                        price.add(qty * 15);
                        break;
                    case 4:
                        System.out.println("Enter the quantity");
                        qty = in.nextInt();
                        itemName.add("Cake");
                        quantity.add(qty);
                        price.add(qty * 10);
                        break;
                    case 5:
                        System.out.println("Enter the quantity");
                        qty = in.nextInt();
                        itemName.add("puffs");
                        quantity.add(qty);
                        price.add(qty * 8);
                        break;
                    case 6:
                        System.out.println("Enter the quantity");
                        qty = in.nextInt();
                        itemName.add("Samosa");
                        quantity.add(qty);
                        price.add(qty * 5);
                        break;
                    case 7:
                        System.out.println("Item Qty Price");
                        int sum = 0;
                        for (int i = 0; i <= itemName.size() - 1; i++) ;
                        sum += price.get('i');

                    case 8:
                        System.out.println("Total is" +sum);
                        System.exit(0);
                }


            }

        }
    }



