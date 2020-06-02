package com.katas.exercises.main;

public class Calculadora {

    private int ans;

    public Calculadora(){
        ans = 0;
    }

    public int add(int a, int b){
        ans = a+ b;
        return ans;
    }

    public int add(int v){
        ans += v;
        return ans;
    }

    public int sub(int a, int b){
        ans = a - b;
        return ans;
    }

    public int div(int a, int b){
        if(b==0){
            throw new ArithmeticException("No puede dividirse");
        }
        ans = a/b;
        return ans;
    }

    public void operacionOptima(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }
//        for(;;);
    }

    public int sub(int v){
        ans -= v;
        return ans;
    }

    public int ans(){
        return ans;
    }
    public void clear(){
        ans = 0;
    }

//    public static int suma(int a, int b){
//        return a+b;
//    }
//    public static int resta(int a, int b){
//        return a - b;
//    }
//    public static void main (String args[]){
//        int a = 3, b =2;
//        int res = suma(a,b);
//        System.out.println("3+2 ="+res);
//    }
}
