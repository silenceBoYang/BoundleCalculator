package com.jeremy.bundle.bundlecalculator.service;
import com.jeremy.bundle.bundlecalculator.model.Order;
import com.jeremy.bundle.bundlecalculator.model.OrderItem;
import com.jeremy.bundle.bundlecalculator.algorithm.MinimumBundlesCalculator;

public class BundleCalculator {
    OrderFiller orderFiller = new OrderFiller();
    OrderItemFiller orderItemFiller = new OrderItemFiller();
    OrderParser orderParser = new OrderParser();
    MinimumBundlesCalculator minimumBundlesCalculator = new MinimumBundlesCalculator();
    public void calculateOrder(Order userOrder, OrderItem userOrderItem)  {
        orderFiller.setGetUserOrder(userOrder.getOrder());
        orderItemFiller.setUserOrderItem(userOrderItem.getOrderItem());
        int[] N = orderParser.parserOrderInfo(orderFiller);
        minimumBundlesCalculator.calculateUserInput(N, userOrderItem.getOrderItem(),userOrder.getOrder());

    }
}
