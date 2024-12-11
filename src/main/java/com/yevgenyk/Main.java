package com.yevgenyk;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class template.
 *
 * @author Yevgeny Kuznetsov
 * @since 1.0.0, 19 August 2019
 **/
public final class Main {

    public static final String PROPERTIES_FILE = "temp.properties";
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(final String[] args) {
        final Properties properties = loadPropertiesFromFile(PROPERTIES_FILE);
        properties.forEach((k, v) -> LOG.info(k + "=" + v));
    }

    /**
     * Loads properties from provided file.
     *
     * @param fileName The file to load the properties from
     * @return The loaded properties
     *
     */
    public static Properties loadPropertiesFromFile(final String fileName) {
        final Properties properties = new Properties();

        try (InputStream resourceAsStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream(fileName)) {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            LOG.error("Unable to load properties file: " + fileName);
        }

        return properties;
    }

    private Main() {
        // This class shouldn't be instantiated
    }
}
