package com.jeremy.bundle.bundlecalculator.service;

public class OrderParser {
    public int[] parserOrderInfo(OrderFiller order){
        int[] A = {5,10};
        int[] B = {3,6,9};
        int[] C = {3,5,9};
        if (order.getGetUserOrder().equalsIgnoreCase("IMG")){
           return A;
        }
        if (order.getGetUserOrder().equalsIgnoreCase("FLAC")){
           return B;
        }
        if (order.getGetUserOrder().equalsIgnoreCase("VID")){
           return C;
        }
        return null;
    }
}
