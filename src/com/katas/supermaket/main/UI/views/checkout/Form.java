package com.katas.supermaket.main.UI.views.checkout;

import com.katas.supermaket.main.UI.AppController;
import com.katas.supermaket.main.poo.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Form extends JFrame implements ActionListener{
    private JLabel title,lclientName, lrut,tproducts, lcantidad, lcheck, lprice, ldocumento;
    private JTextField fname, frut;
    private JComboBox cdocumento;
    private JCheckBox[] checkboxProducts;
    private JTextField[] textFieldQuatity;
    private JButton submit;
    private JTextArea tregister;
    private Store store;
    public Form(Store store){
        this.store = store;
    }
    public Container render(Container c){
        int location_y = 50;
        int space_y =50;
        int space_x =90;
        int location_x = 330;

        /* Titulo */
        title = new JLabel(Constants.FORM_TITLE);
        title.setFont(new Font("Verdana", Font.PLAIN, 20));
        title.setSize(300, 30);
        title.setLocation(10, 30);
        c.add(title);
        /* Titulo */

        location_y = location_y + space_y;

        /* Titulo */
        lclientName = new JLabel("Nombre:");
        lclientName.setFont(new Font("Verdana", Font.PLAIN, 15));
        lclientName.setSize(100, 20);
        lclientName.setLocation(10, location_y);
        c.add(lclientName);
        /* Titulo */

        /* Textfield */
        fname = new JTextField();
        fname.setFont(new Font("Verdana", Font.PLAIN, 15));
        fname.setSize(160, 20);
        fname.setLocation(100, location_y);
        c.add(fname);
        /* Textfield */


        /* Titulo */
        lrut = new JLabel("Rut:");
        lrut.setFont(new Font("Verdana", Font.PLAIN, 15));
        lrut.setSize(100, 20);
        lrut.setLocation(280, location_y);
        c.add(lrut);
        /* Titulo */

        /* Textfield */
        frut = new JTextField();
        frut.setFont(new Font("Verdana", Font.PLAIN, 15));
        frut.setSize(100, 20);
        frut.setLocation(320, location_y);
        c.add(frut);
        /* Textfield */

        /* Titulo */
        ldocumento = new JLabel("Documento:");
        ldocumento.setFont(new Font("Verdana", Font.PLAIN, 15));
        ldocumento.setSize(100, 20);
        ldocumento.setLocation(430, location_y);
        c.add(ldocumento);
        /* Titulo */

        String s1[] = { "Factura", "Boleta"};
        cdocumento = new JComboBox(s1);
        cdocumento.setSize(100, 20);
        cdocumento.setLocation(540, location_y);
        c.add(cdocumento);

        location_y = location_y + space_y;

        /* Matches */
        tproducts = new JLabel("Productos disponibles");
        tproducts.setFont(new Font("Verdana", Font.PLAIN, 15));
        tproducts.setSize(400, 20);
        tproducts.setLocation(10, location_y);
        c.add(tproducts);
        /* Matches */

        lcheck = new JLabel("Check");
        lcheck.setFont(new Font("Verdana", Font.PLAIN, 15));
        lcheck.setSize(400, 20);
        lcheck.setLocation(location_x, location_y);
        c.add(lcheck);

        location_x = location_x +space_x;

        lcantidad = new JLabel("Cantidad");
        lcantidad.setFont(new Font("Verdana", Font.PLAIN, 15));
        lcantidad.setSize(400, 20);
        lcantidad.setLocation(location_x, location_y);
        c.add(lcantidad);

        location_x = location_x +space_x;

        lprice = new JLabel("Precio");
        lprice.setFont(new Font("Verdana", Font.PLAIN, 15));
        lprice.setSize(400, 20);
        lprice.setLocation(location_x, location_y);
        c.add(lprice);


        location_y = location_y + space_y;

        JLabel[] lproducts = new JLabel[this.store.getProducts().size()];
        checkboxProducts = new JCheckBox[this.store.getProducts().size()];
        textFieldQuatity = new JTextField[this.store.getProducts().size()];
        ArrayList<Product> products = this.store.getProducts();

        for(int i=0;i<products.size();i++){
            location_x = 330;

            lproducts[i] = new JLabel(products.get(i).getName());
            lproducts[i].setFont(new Font("Verdana", Font.PLAIN, 14));
            lproducts[i].setSize(450, 20);
            lproducts[i].setLocation(10, location_y);
            c.add(lproducts[i]);

            checkboxProducts[i] = new JCheckBox();
            checkboxProducts[i].setSize(90, 20);
            checkboxProducts[i].setLocation(location_x, location_y);
            c.add(checkboxProducts[i]);

            location_x = location_x +space_x;

            textFieldQuatity[i] = new JTextField();
            textFieldQuatity[i].setSize(50, 20);
            textFieldQuatity[i].setLocation(location_x, location_y);
            c.add(textFieldQuatity[i]);

            location_x = location_x +space_x;

            lprice = new JLabel("$"+String.valueOf(products.get(i).getPrice()));
            lprice.setFont(new Font("Verdana", Font.PLAIN, 15));
            lprice.setSize(400, 20);
            lprice.setLocation(location_x, location_y);
            c.add(lprice);

            location_y = location_y + space_y-20;
        }

        location_y = location_y + space_y-20;

        submit = new JButton("Comprar ahora");
        submit.setFont(new Font("Verdana", Font.PLAIN, 15));
        submit.setSize(200, 20);
        submit.setLocation(350, location_y);
        submit.addActionListener(this);
        c.add(submit);

        location_y = 30;

        /* Titulo */
        JLabel lregister = new JLabel("Comprobante de Pago:");
        lregister.setFont(new Font("Verdana", Font.PLAIN, 15));
        lregister.setSize(200, 20);
        lregister.setLocation(700, location_y);
        c.add(lregister);
        /* Titulo */

        location_y = location_y + space_y;

        tregister = new JTextArea();
        tregister.setFont(new Font("Verdana", Font.PLAIN, 12));
        tregister.setSize(400, 400);
        tregister.setEditable(false);
        tregister.setLocation(700, location_y);
        tregister.setLineWrap(true);
        c.add(tregister);

        return c;
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit){
            Order order = new Order();
            Client client = new Client();
            client.setName(fname.getText());
            client.setRut(frut.getText());
            order.setClient(client);
            order.setTipoDocumento(this.cdocumento.getSelectedIndex());
            ArrayList<Product> products = this.store.getProducts();
            for(int i=0;i<products.size();i++){
                if(this.checkboxProducts[i].isSelected()){
                    OrderList orderList = new OrderList(products.get(i),Float.parseFloat(textFieldQuatity[i].getText()));
                    order.addOrderList(orderList);
                }
            }
            tregister.setText(order.printInvoice());
        }
    }
    public void reset(){

    }
}
