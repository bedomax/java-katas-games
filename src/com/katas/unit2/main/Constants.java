package com.katas.unit2.main;

public class Constants {
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
    public static final int TELEVISION_INCH_MIN= 32;
    public static final int TELEVISION_INCH_MAX= 55;
    public static final String YES_OR_NO_PATTERN= "([S,N])";
    public static final String TRUE_ESP= "S";
    public static final float TELEVISION_PRICE_MIN= 0;
    public static final float TELEVISION_PRICE_MAX= 1000;
    public static final int IPCAMERA_DEGREES_MIN= 0;
    public static final int IPCAMERA_DEGREES_MAX= 360;
    public static final double IPCAMERA_MEGAPIXELES_MIN= 5;
    public static final double IPCAMERA_MEGAPIXELES_MAX= 16.3;
    public static final double IPCAMERA_METERSWIFI_MIN= 3;
    public static final double IPCAMERA_METERSWIFI_MAX= 14;
    public static final float IPCAMERA_PRICE_MIN= 0;
    public static final float IPCAMERA_PRICE_MAX= 100;

    public static final String DEVICE_ERROR_BRAND= "Error ingrese una marca ejemplo: ABCD";
    public static final String TELEVISION_ERROR_MODEL= "Error: ingrese una modelo ejemplo: AB1273";
    public static final String TELEVISION_ERROR_INCH= "Error: ingrese una pulgada de 32 a 55";
    public static final String TELEVISION_ERROR_SMART_TV= "Error: ingrese si es S ó N";
    public static final String TELEVISION_ERROR_TVCABLE_NAME= "Error: ingrese un nombre ejemplo: Tvcable (primera mayuscula)";
    public static final String TELEVISION_ERROR_PRICE= "Error: ingrese un valor de 0 a 1000";

    public static final String IPCAMERA_ERROR_CODE= "Error: ingrese una modelo ejemplo: WRAE421";
    public static final String IPCAMERA_ERROR_MODEL= "Error: ingrese una modelo ejemplo: Interior abcdeaa";
    public static final String IPCAMERA_ERROR_TURN_DEGREES= "Error: ingrese un valor de 0 a 360 grados";
    public static final String IPCAMERA_ERROR_MEGAPIXELES= "Error: ingrese un valor de 5.0 a 16.3";
    public static final String IPCAMERA_ERROR_METERS_WIFI= "Error: ingrese un valor de 3 a 14";
    public static final String IPCAMERA_ERROR_PRICE= "Error: ingrese un valor de 0 a 100";
}

