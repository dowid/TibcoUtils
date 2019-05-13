package com.tibco;

import java.util.UUID;

public class TibcoCustomFunctions {

    public static final String[][] HELP_STRINGS = new String[][]
            {
                    {"generateUuid", "generateUuid()<br/><br/>Generate random uuid", "generateUuid()", "9df78b4c-75b4-11e9-8f9e-2a86e4085a59"},
                    {"decryptTibcoPasswordGV", "decryptTibcoPasswordGV(<i>password</i>)<br/><br/>Encrypted password"},
            };


    /**
     * Generate random uuid
     *
     * @return random uuid
     */
    public static String generateUuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * Returns decrypted string for global variable "Password" type
     *
     * @param variableName name of the variable
     * @return decrypted password
     */
    public static String decryptTibcoPasswordGV(String variableName) {
        return com.tibco.pe.plugin.PluginProperties.getProperty("tibco.clientVar." + variableName);
    }

}
