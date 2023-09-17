package com.hendy.skeleton.ReadProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertis {

    private static final String nopcoomerceUrl = System.getProperty("user.dir")+"/resources/config/testing.properties";


    public static Properties envProperties() throws IOException {
        Properties configProperties = new Properties();
        FileInputStream fis = new FileInputStream(nopcoomerceUrl);
        configProperties.load(fis);
        return configProperties;
    }


}
