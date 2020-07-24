package com.clark.util;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author in-vinaykumar.gupta on 22/07/20
 * @project IntelliJ IDEA
 */
public class Helper {

    public String generateRandomEmail()
    {
        String generatedstring= RandomStringUtils.randomAlphabetic(8);
        String email=generatedstring+"@gmail.com";
        return email;
    }

}
