package com.jeremy.bundle.bundlecalculator.model;
import java.util.*;

public class FilledBundle {
    FilledOrder filledOrder = new FilledOrder();
    FilledOrderItem filledOrderItem = new FilledOrderItem();
    Order order = new Order();
    OrderItem orderItem = new OrderItem();
    SubmissionBundle submissionBundle = new SubmissionBundle();

    public void getUserInput() {
        boolean isFlag = true;
        while(isFlag) {
            menu();
            Scanner console = new Scanner(System.in);
            try {
                int userChoice = console.nextInt();

                switch (userChoice) {
                    case 1:
                        order.setOrder(filledOrder.getUserOrder());
                        orderItem.setOrderItem(filledOrderItem.userInputForItem());
                        submissionBundle.dealWithUserInput(order,orderItem);
                        break;
                    case 2:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please input the right number");
                }
            }catch(InputMismatchException e) {
                System.out.println("Please input a number");
            }

        }
    }

    public void menu(){
        System.out.println("");
        System.out.println("======================================");
        System.out.println("Welcome to our amazing order system");
        System.out.println("1. Make your order");
        System.out.println("2. Exit");
        System.out.println("======================================");

    }
}
