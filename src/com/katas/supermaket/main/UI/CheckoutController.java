package com.katas.supermaket.main.UI;

import com.katas.supermaket.main.UI.views.checkout.Form;
import com.katas.supermaket.main.poo.Store;

import java.awt.*;

public class CheckoutController {
    private Container checkoutContainer;
    private AppController app;

    public CheckoutController(AppController app){
        this.app = app;
    }

    public void index(){
        Store store = new Store();
        Form form = new Form(store);
        this.loadConfiguration();
        checkoutContainer = this.app.getContentPane();
        checkoutContainer.setLayout(null);
        checkoutContainer.setVisible(true);
        form.render(checkoutContainer);
    }

    private void loadConfiguration(){

    }
}
