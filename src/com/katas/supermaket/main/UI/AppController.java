package com.katas.supermaket.main.UI;

import com.katas.supermaket.main.poo.Constants;

import javax.swing.*;

public class AppController extends JFrame {
    private CheckoutController checkoutController;
    private String action = Constants.CHECKOUT_FORM;
    public AppController(){
        setSize(1200, 600);
        setTitle(Constants.TITLE);
        this.route(action);
    }
    public void route(String actionEvent){
        switch (actionEvent){
            case Constants.CHECKOUT_FORM:
                checkoutController = new CheckoutController(this);
                checkoutController.index();
                break;
        }
    }
}
