package com.artemas.codewars.fundamentals.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CardIssuerTest {
    @Test
    public void issuerTests() {
        assertEquals("VISA",       CardIssuer.getIssuer("4111111111111111"));
        assertEquals("AMEX",       CardIssuer.getIssuer("378282246310005"));
        assertEquals("Unknown",    CardIssuer.getIssuer("9111111111111111"));
        assertEquals("Mastercard", CardIssuer.getIssuer("5105105105105100"));
    }
}