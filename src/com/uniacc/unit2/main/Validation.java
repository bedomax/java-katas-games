package com.uniacc.unit2.main;

import java.util.regex.Pattern;

public final class Validation {
    public static  boolean BrandName(String name){
        String pattern_name = Constants.BRAND_PATTERNS_IN_NAME;
        String pattern_repeat=  Constants.PATTERNS_REPEAT;
        boolean valid = name.matches(pattern_name) && !(name.matches(pattern_repeat));
        return valid;
    }

    public static  boolean TelevisionModelName(String name) {
        boolean valid = false;
        String pattern_name = Constants.TELEVISION_MODEL_PATTERNS_IN_NAME;
        valid = name.matches(pattern_name) &&
                validNameBySumElements(name,
                        Constants.TELEVISION_DELIMETER_POS,
                        Constants.TELEVISION_LIMIT_SUM_NUMBERS) &&
                 Util.checkExistElement(name, "7");
        return valid;
    }

    public static  boolean IPCameraModelName(String name){
        //String pattern_name = "([\\SInterior])";
        boolean valid = false;
        valid = (Util.findWordInName(name,Constants.INSIDE) ||
                Util.findWordInName(name,Constants.OUTSIDE)) &&
                validModelNameButSecondWord(name);

        return valid;
    }


    public static boolean IPCameraCode(String code){
        boolean valid = false;
        valid = validIPCameraCodeInParts(code);
        return valid;
    }

    // Private Methods

    private static boolean validNameBySumElements(String name, int pos, int maxSum){
        String onlyNumbers =  name.substring(pos);
        String[] parts =  onlyNumbers.split("(?!^)");
        int total = Util.sumOfArray(parts, parts.length-1);
        return total <= maxSum? true : false;
    }

    private static boolean validModelNameButSecondWord(String name){
        String[] parts = name.split(Constants.SPACE);
        String word = parts[1];

        if(!(word.length()<=Constants.IP_CAMARA_MODEL_NAME_MAX_LENGTH))
            return false;
        if(!(Util.containsWords(word,Constants.IP_CAMARA_MODEL_NAME_PATTERN)))
            return false;
        return true;
    }
    private static boolean validIPCameraCodeInParts(String code){

        if(code.length()>Constants.IP_CAMERA_CODE_LENGTH)
            return false;

        String consonantsOnly =  code.substring(0,Constants.IP_CAMERA_CODE_NUM_CONSONANTS);
        String numbersOnly =  code.substring(Constants.IP_CAMERA_CODE_NUM_CONSONANTS,Constants.IP_CAMERA_CODE_LENGTH);
        String patternConsonant = Constants.IP_CAMERA_CODE_PATTERN_CONSONANTS ;
        String patternNumbers = Constants.IP_CAMERA_CODE_PATTERN_NUMBERS;

        if(!(consonantsOnly.matches(patternConsonant)))
            return false;

        if(!(numbersOnly.matches(patternNumbers)))
            return false;

        if(Util.hasDuplicate(numbersOnly))
            return false;

        if(Util.hasDuplicate(consonantsOnly))
            return false;

        if(Util.hasDuplicate(numbersOnly))
            return false;

        return true;
    }
}
