package com.jeremy.bundle.bundlecalculator.model;
import com.jeremy.bundle.bundlecalculator.service.BundleCalculator;

import java.io.IOException;

public class SubmissionBundle {
    Order order = new Order();
    OrderItem orderItem = new OrderItem();
    BundleCalculator bundleCalculator = new BundleCalculator();
    public void dealWithUserInput(Order userOrder, OrderItem userOrderItem)  {
        bundleCalculator.calculateOrder(userOrder, userOrderItem);
    }
}
