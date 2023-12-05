package com.mse.lambda;

import java.util.function.Predicate;

public class StringUtils {

   /**
    * A predicate that checks if a string starts with a capital letter.
    */
   private static final Predicate<String> IS_CAPITAL = (a) -> {
       if (a == null || a.isEmpty()) {
           return false;
       }
       return Character.isUpperCase(a.charAt(0));
   };

   /**
    * Checks if a string starts with a capital letter.
    *
    * @param input The string to check.
    * @return True if the string starts with a capital letter, false otherwise.
    */
   public static boolean isCapital(String input) {
       return IS_CAPITAL.test(input);
   }
}
