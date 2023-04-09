//  Personal Finance Control - PFC
//      Author - Diego Oliveira

package pfc;

import java.util.Scanner;

public class PFC {

    public static void main(String[] args) {
        Scanner inputStr = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);
        Debit_List debit = new Debit_List();
        Form form = new Form();
        byte option;
        byte suboption;

        System.out.println(form.header);
        do {
            System.out.println(form.menu_1);
            System.out.print(form.pointer);
            option = inputNum.nextByte();
            switch (option) {
                case 1:
                    System.out.println("    - Insert Expenses:");
                    System.out.println(form.separator);

                    do {
                        System.out.println("- Name: ");
                        String name = inputStr.nextLine();
                        System.out.println("- Description: ");
                        String description = inputStr.nextLine();
                        System.out.println("- Price: ");
                        double value = inputNum.nextDouble();
                        System.out.println(form.menu_2);
                        System.out.print(form.pointer);
                        byte debitChoice = inputNum.nextByte();
                        switch (debitChoice) {
                            case 1:
                                Food foodInsert = new Food(name, description, value);
                                debit.InsertFood(foodInsert);
                                break;
                            case 2:
                                Home homeInsert = new Home(name, description, value);
                                debit.InsertHome(homeInsert);
                                break;
                            case 3:
                                Services servicesInsert = new Services(name, description, value);
                                debit.InsertServices(servicesInsert);
                                break;
                            case 4:
                                Health healthInsert = new Health(name, description, value);
                                debit.InsertHealth(healthInsert);
                                break;
                            case 5:
                                Leisure leisureInsert = new Leisure(name, description, value);
                                debit.InsertLeisure(leisureInsert);
                                break;
                            case 6:
                                Other otherInsert = new Other(name, description, value);
                                debit.InsertOther(otherInsert);
                                break;
                        }

                        System.out.println(form.menu_3);
                        System.out.print(form.pointer);
                        suboption = inputNum.nextByte();
                    } while (suboption == 1);
                    break;
                case 2:
                    System.out.println("    - View Expenses:");
                    System.out.println(form.separator);
                    debit.ListAllFood();
                    debit.ListAllHome();
                    debit.ListAllServices();
                    debit.ListAllHealth();
                    debit.ListAllLeisure();
                    debit.ListAllOther();
                    break;
                case 3:
                    System.out.println("    - Spending Chart:");
                    System.out.println(form.separator);
                    debit.FoodGraphic();
                    debit.HomeGraphic();
                    debit.ServicesGraphic();
                    debit.HealthGraphic();
                    debit.LeisureGraphic();
                    debit.OtherGraphic();
                    break;
            }

        } while (option != 4);
        System.out.println("Registration closed! Have a nice day.");
    }

}
