package com.trustee.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtil {

    public static boolean isValidAmount(String amount) {
        Pattern pattern = Pattern.compile("^\\d+(\\.\\d{1,2})?$");
        Matcher matcher = pattern.matcher(amount);

        return matcher.matches();
    }

    public static boolean isValidAccountNumber(String accountNumber) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher matcher = pattern.matcher(accountNumber);

        return matcher.matches();
    }

    public static Double formatAmount(double amount) {
        // Round the amount to two decimal places
        double roundedAmount = Math.floor(amount * 100.0) / 100.0;
        return roundedAmount;
    }
}
