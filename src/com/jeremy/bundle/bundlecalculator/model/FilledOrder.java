package com.jeremy.bundle.bundlecalculator.model;
import java.util.*;
public class FilledOrder {
    Order order = new Order();
    MediaBundles mediaBundles = new MediaBundles();
    ArrayList<String> showlist = new ArrayList<>();
    public String getUserOrder(){
        showlist = mediaBundles.getMediaTypeList();
        String orderItem = "";
        boolean isFlag = true;
        while(isFlag) {
            System.out.println("Please Enter the Format code like IMG, Flac and VID");
            Scanner console = new Scanner(System.in);
            String userInput = console.nextLine();
            order.setOrder(userInput);
            for (String s : showlist) {
                 if (order.getOrder().equalsIgnoreCase(s)) {
                     orderItem = s;
                     isFlag = false;
                    }
                  }
        }
        return orderItem;
    }
}
