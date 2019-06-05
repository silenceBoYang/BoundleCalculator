package com.jeremy.bundle.bundlecalculator.model;
import java.util.*;
public class FilledOrderItem {
    OrderItem orderItem = new OrderItem();
    public int userInputForItem(){
        boolean isFlag = true;
        while(isFlag) {
            System.out.println("Please enter the items that you what");
            Scanner console = new Scanner(System.in);
            try{
                int userInput = console.nextInt();
                if(userInput>0) {
                    orderItem.setOrderItem(userInput);
                    isFlag = false;
                }else{
                    System.out.println("Please enter a positive number");
                }
            } catch(InputMismatchException e) {
                System.out.println("Please input a number");
            }
        }
        return orderItem.getOrderItem();
    }
}
