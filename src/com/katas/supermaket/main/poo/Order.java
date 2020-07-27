package com.katas.supermaket.main.poo;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderList> orderLists;
    private int tipoDocumento;
    private double total;
    private Client client;
    static final int INVOICE_CODE = 0;
    static final int INVOICE_WITHOUT_CODE = 1;

    public Order(){
        this.orderLists = new ArrayList<OrderList>();
    }
    public void addOrderList(OrderList orderList){
        this.orderLists.add(orderList);
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public double getTotal(){
        if(this.getTipoDocumento() == INVOICE_CODE)
        {
            total = 0;
            for(int i=0;i<orderLists.size();i++){
                    total += orderLists.get(i).getSubtotal();
            }
            return total * Constants.IVA;
        }else{
            total = 0;
            for(int i=0;i<orderLists.size();i++){
                total += orderLists.get(i).getSubtotal();
            }
            return total;
        }
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String printInvoice(){
        String texto = "";
        texto+="Comprobante de pago\n";
        texto+="Nombre:"+this.client.getName()+"\n";
        texto+="Rut:"+this.client.getRut()+"\n";
        if(this.getTipoDocumento() == INVOICE_CODE){
            texto+="Tipo documento: Factura\n";
        }
        if(this.getTipoDocumento() == INVOICE_WITHOUT_CODE){
            texto+="Tipo documento: Boleta\n";
        }
        texto+="Detalle de Productos\n";
        texto+="Nombre | Cantidad | Subtotal\n";
        for(int i=0;i<orderLists.size();i++){
            texto += orderLists.get(i).getProduct().getName()+ " | ";
            texto += String.valueOf(orderLists.get(i).getQuantity())+ " | ";
            texto += String.valueOf(orderLists.get(i).getSubtotal());
            texto += "\n";
        }
        if(this.getTipoDocumento() == INVOICE_CODE){
            texto+="IVA: 16% \n";
        }
        texto+="Total:"+String.valueOf(this.getTotal())+"\n";
        texto+="Gracias por su compra";
        return texto;
    }
}
