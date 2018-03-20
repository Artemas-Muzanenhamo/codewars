package com.artemas.codewars.fundamentals.kyu7;

public class CardIssuer {
  public static String getIssuer(String cardNumber) {
      if ( cardNumber.startsWith("34") || cardNumber.startsWith("37") && cardNumber.length() == 15 ) {
          return "AMEX";
      } else if (cardNumber.startsWith("6011") && cardNumber.length() == 16) {
          return "Discover";
      } else if ( (cardNumber.startsWith("51") || cardNumber.startsWith("52") || cardNumber.startsWith("53") || cardNumber.startsWith("54") || cardNumber.startsWith("55")) && cardNumber.length() == 16) {
          return "Mastercard";
      } else if ( cardNumber.startsWith("4") && (cardNumber.length() == 13 || cardNumber.length() == 16 )) {
          return "VISA";
      }else {
          return "Unknown";
      }
  }
}
