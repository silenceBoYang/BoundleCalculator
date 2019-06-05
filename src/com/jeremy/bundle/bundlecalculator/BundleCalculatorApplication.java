package com.jeremy.bundle.bundlecalculator;
import com.jeremy.bundle.bundlecalculator.model.FilledBundle;

import java.io.IOException;

public class BundleCalculatorApplication {
    FilledBundle  filledBundle = new FilledBundle();

    public static void main(String[] args) {
        BundleCalculatorApplication bundleCalculatorApplication = new BundleCalculatorApplication();
        bundleCalculatorApplication.show();
    }

    public void show(){
        filledBundle.getUserInput();

    }



}
