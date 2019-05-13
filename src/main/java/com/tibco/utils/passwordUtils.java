package com.tibco.utils;

import com.tibco.security.ObfuscationEngine;

public class passwordUtils {

    /**
     * Returns decrypted global variable "Password" type
     *
     * @param encriptedString encripted password from "defaultVars.substvar"
     * @return decrypted password
     */
    public static String decryptTibcoPassword(String encriptedString) {
        String password = "";
        try {
            password = new String(ObfuscationEngine.decrypt(encriptedString));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return password;
    }


    /**
     * Returns encrypted tibco "Password" type
     *
     * @param pass password
     * @return decrypted password
     */
    public static String encryptTibcoPassword(char[] pass) {
        String password = "";
        try {
            password =ObfuscationEngine.encrypt(pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return password;
    }


}
