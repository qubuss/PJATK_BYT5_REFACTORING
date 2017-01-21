package src.service;

import src.ConfigurationException;

public class ConfigurationService {

    public ConfigurationService() {
    }

    public void checkZero(int value, String arg0) throws ConfigurationException {
        if (value <= 0) {
            throw new ConfigurationException(arg0);
        }
    }

    public void checkNull(String valueString, String arg0) throws ConfigurationException {
        if (valueString == null) {
            throw new ConfigurationException(arg0);
        }
    }

    public void checkIfNotZero(int value, String arg0, int interval) throws ConfigurationException {
        if ((value % interval) != 0) {
            throw new ConfigurationException(arg0);
        }
    }
}
