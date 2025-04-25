package com.validator.spring_ethiopian_validators.validators;

import java.util.Locale;
import java.util.ResourceBundle;

public class EthiopianValidationMessages {

    public String getMessage(String key, Locale locale) {
        if (locale.getLanguage().equals("am")) {
            return ResourceBundle.getBundle("messages_am").getString(key);
        }
        return ResourceBundle.getBundle("messages").getString(key);
    }
}