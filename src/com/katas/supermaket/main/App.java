package com.katas.supermaket.main;

import com.katas.supermaket.main.UI.AppController;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        AppController app = new AppController();
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
