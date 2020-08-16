package com.luizfoli.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DirConfig {

    private Properties properties = new Properties();

    public DirConfig() {
        try (InputStream input = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/dir.properties")) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getDir() {
        return properties.getProperty("dir");
    }
}