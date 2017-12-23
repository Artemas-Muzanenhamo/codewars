package com.artemas.codewars.fundamentals.kyu8;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
   public static String greet(String language){
      return getWelcomeMessage(language);
   }

   public static String getWelcomeMessage(String language) {

      Map<String, String> welcomeMessage = new HashMap<>();
      
      welcomeMessage.put("english", "Welcome");
      welcomeMessage.put("czech", "Vitejte");
      welcomeMessage.put("danish", "Velkomst");
      welcomeMessage.put("dutch", "Welkom");
      welcomeMessage.put("estonian", "Tere tulemast");
      welcomeMessage.put("finnish", "Tervetuloa");
      welcomeMessage.put("flemish", "Welgekomen");
      welcomeMessage.put("french", "Bienvenue");
      welcomeMessage.put("german", "Willkommen");
      welcomeMessage.put("irish", "Failte");
      welcomeMessage.put("italian", "Benvenuto");
      welcomeMessage.put("latvian", "Gaidits");
      welcomeMessage.put("lithuanian", "Laukiamas");
      welcomeMessage.put("polish", "Witamy");
      welcomeMessage.put("spanish", "Bienvenido");
      welcomeMessage.put("swedish", "Valkommen");
      welcomeMessage.put("welsh", "Croeso");
      welcomeMessage.put("IP_ADDRESS_INVALID", "Welcome");

      return welcomeMessage.get(language);
   }
}