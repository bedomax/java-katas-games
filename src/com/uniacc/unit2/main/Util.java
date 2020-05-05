package com.uniacc.unit2.main;

public final class Util {
    public static  int sumOfArray(String[] a, int n) {
        if (n == 0)
            return Integer.parseInt(a[n]);
        else
            return Integer.parseInt(a[n]) + sumOfArray(a, n-1);
    }
    public static boolean checkExistElement(String arr, String toCheckValue)
    {
        String[] parts = arr.split("(?!^)");
        boolean found = false;
        for (String element : parts) {
            if (element.equals(toCheckValue)) {
                found = true;
                break;
            }
        }
        return found;
    }
    public static boolean findWordInName(String name, String search){
        return name.contains(search);
    }

    public static boolean containsWords(String inputString, String[] items) {
        boolean found = true;
        for (String item : items) {
            if (!(inputString.indexOf(item) == -1 )) {
                found = false;
                break;
            }
        }
        return found;
    }

    public static boolean hasDuplicate(String text){
        int cont = 0;
        for(int i=0; i<text.length(); i++) {
            for(int j=0;j<text.length();j++){
                if(i!=j){
                    if(text.charAt(i) == text.charAt(j))
                        cont++;
                }
            }
        }
        return cont == 0? false : true;
    }

}
