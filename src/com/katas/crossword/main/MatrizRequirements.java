package com.katas.crossword.main;

public interface MatrizRequirements {
    public void process(String text);
    public Integer numRow();
    public boolean isPresent();
    public String getFirstPositionArray();
    public String getLastPositionArray();
    public String printMatriz();
}
