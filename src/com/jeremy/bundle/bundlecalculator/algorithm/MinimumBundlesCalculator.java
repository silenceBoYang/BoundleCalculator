package com.jeremy.bundle.bundlecalculator.algorithm;

public class MinimumBundlesCalculator {
    FilledResult filledResult = new FilledResult();
    public void calculateUserInput(int [] orders, int number, String order){
        if(order.equalsIgnoreCase("IMG")){
            IMG(orders, number);
        }
        if(order.equalsIgnoreCase("FLAC")){
            FLAC(orders,number);
        }
        if(order.equalsIgnoreCase("VID")){
            VID(orders,number);
        }
    }

    public void IMG(int [] orders, int items){
        int [] newResult = filledResult.minChange(orders,items);
        double total = 0;
        for(int i=0; i<newResult.length; i++) {
            if(newResult[i]==5) {
                System.out.println("$"+450+" 1*"+newResult[i]);
                total+=450;
            }
            if(newResult[i]==10) {
                System.out.println("$"+800+" 1*"+newResult[i]);
                total+=800;
            }
        }
        System.out.println(items+" IMG"+ " $"+total);

    }
    public void FLAC(int [] orders, int items){
        int [] newResult = filledResult.minChange(orders,items);
        double total = 0;
        for(int i=0; i<newResult.length; i++) {
            if(newResult[i]==3) {
                System.out.println("$"+427.50+" 1*"+newResult[i]);
                total+=427.50;
            }
            if(newResult[i]==6) {
                System.out.println("$"+810+" 1*"+newResult[i]);
                total+=810;
            }
            if(newResult[i]==9) {
                System.out.println("$"+1147.50+" 1*"+newResult[i]);
                total+=1147.50;
            }
        }
        System.out.println(items+" FLAC"+ " $"+total);

    }
    public void VID(int [] orders, int items){
        int [] newResult = filledResult.minChange(orders,items);
        double total = 0;
        for(int i=0; i<newResult.length; i++) {
            if(newResult[i]==3) {
                System.out.println("$"+570+" 1*"+newResult[i]);
                total+=570;
            }
            if(newResult[i]==5) {
                System.out.println("$"+900+" 1*"+newResult[i]);
                total+=900;
            }
            if(newResult[i]==9) {
                System.out.println("$"+1530+" 1*"+newResult[i]);
                total+=1530;
            }
        }
        System.out.println(items+" VID"+ " $"+total);
    }

}
