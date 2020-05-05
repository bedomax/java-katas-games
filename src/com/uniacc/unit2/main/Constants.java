package com.uniacc.unit2.main;

public class Constants {
    public static final String MODEL_TYPE_TELEVISION = "TV";
    public static final String MODEL_TYPE_IP_CAMARA = "IP_CAMARA";
    public static final int BRAND_NUMBERS_LETTERS_IN_NAME = 4;
    public static final String BRAND_PATTERNS_IN_NAME = "[A-Z]{"+BRAND_NUMBERS_LETTERS_IN_NAME+"}";
    public static final String PATTERNS_REPEAT= "^.*(.).*\\1$";
    public static final String PATTERS_IN_NAME = "([A-Z][A-Z][A-Z][A-Z])";
    public static final int TELEVISION_LIMIT_SUM_NUMBERS = 20;
    public static final int TELEVISION_DELIMETER_POS = 2;
    public static final String TELEVISION_MODEL_PATTERNS_IN_NAME = "([A-Z][A-Z][1-9][0-9][0-9][1,3,5,7,9])";
    public static final String INSIDE = "Interior";
    public static final String OUTSIDE = "Exterior";
    public static final String SPACE = " ";
    public static final int IP_CAMARA_MODEL_NAME_MAX_LENGTH = 7;
    public static final String[] IP_CAMARA_MODEL_NAME_PATTERN = {"H","W","F"};
    public static final String ERROR = "Caracteres no permitidos";
    public static final String IP_CAMERA_CODE_PATTERN_CONSONANTS = "([A-Z][A-Z][A-U][A-U])";
    public static final String IP_CAMERA_CODE_PATTERN_NUMBERS = "([0-9][0-9][0-9])";
    public static final int IP_CAMERA_CODE_LENGTH= 7;
    public static final int IP_CAMERA_CODE_NUM_CONSONANTS = 4;
}
