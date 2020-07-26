package com.katas.crossword.main;

public class Crossword implements MatrizRequirements {
    private static final String CHAR_EMPTY = "";
    private String text = CHAR_EMPTY;
    private Integer numRow = 0;
    private Integer colFirstPosition = 0;
    private Integer colLastPosition = 0;
    private boolean present = false;

    private char matriz[][] ={
                        {'X','M','A','N','T','I','J','E'},
                        {'G','U','S','A','S','U','H','O'},
                        {'M','A','N','Z','A','N','A','R'},
                        {'E','N','T','O','N','E','L','M'},
                        {'L','B','O','A','D','R','V','E'},
                        {'O','G','F','W','I','G','E','I'},
                        {'N','T','U','V','A','Z','R','Y'},
                        {'U','V','O','R','L','O','M','E'}
                    };
    public void process(String text){
        int i;
        String searchWord;
        i = 0;
        for (char[] row : this.matriz)
        {
            searchWord = String.copyValueOf(row);
            if (searchWord.contains(text))
            {
                this.present = true;
                this.numRow = i;
                this.colFirstPosition = this.findFirstPosition(row, text);
                this.colLastPosition = this.findLastPosition(row, text);
            }
            i++;
        }
    }
    private Integer findFirstPosition(char row[], String text) {
        char first = text.charAt(0);
        return new String(row).indexOf(first);
    }
    private Integer findLastPosition(char row[], String text){
        char last = text.charAt(text.length() - 1);
        return new String(row).lastIndexOf(last);
    }

    public String getFirstPositionArray() {
        return "["+this.numRow+","+this.colFirstPosition+"]";
    }

    public String getLastPositionArray() {
        return "["+this.numRow+","+this.colLastPosition+"]";
    }

    public Integer numRow() {
        return numRow;
    }

    public boolean isPresent() {
        return present;
    }

    public char[][] getMatriz(){
        return this.matriz;
    }

    public String printMatriz(){
        return "";
    }
}
