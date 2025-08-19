package org.example;

public class StringUtilities {
//     Refer to Java Basics 1 for common string methods
//
//
//     Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
//     characters
    public static boolean shortString (String msg) {
        if (5 <= msg.length()) {
            return false;
        } else {
            return true;
        }
    }

//     Add a static function called firstLetter that takes a String parameter and returns the first character of the string
    public static char firstLetter (String msg) {
        char first = msg.charAt(0);
        return first;
    }
//     Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
//     "asparagus" (lowercase only) replaced with 4 stars: "****"
    public static String censorAsparagus (String msg) {
        boolean containsAsparagus = msg.contains("asparagus");
        if(containsAsparagus) {
            String modifiedMsg = msg.replace("asparagus", "****");
            return modifiedMsg;
        }else return msg;
    }
//
//     Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
//     strings are the same length, return the first string.
    public static String bigger (String string1, String string2) {
        if(string1.length() > string2.length()) {
            return string1;
        }else if(string2.length() > string1.length()) {
            return string2;
        }else return string1;
    }
}
