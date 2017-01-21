package src;

import src.service.ConfigurationService;

import java.util.Properties;

class Configuration {
    //TODO DONE
    private int interval;

    private int duration;

    private int departure;

    private ConfigurationService configurationService = new ConfigurationService();

    public void load(Properties props) throws ConfigurationException {

        interval = setInterval(props);

        duration = setDuration(props);

        departure = setDeparture(props);

    }

    private int setInterval(Properties props) throws ConfigurationException {
        int value;
        String valueString = props.getProperty("interval");

        configurationService.checkNull(valueString, "monitor interval");

        value = Integer.parseInt(valueString);
        configurationService.checkZero(value, "monitor interval > 0");

        return value;
    }

    private int setDuration(Properties props) throws ConfigurationException {
        int value;
        String valueString = props.getProperty("duration");

        configurationService.checkNull(valueString, "duration");

        value = Integer.parseInt(valueString);
        configurationService.checkZero(value, "duration > 0");

        configurationService.checkIfNotZero(value, "duration % interval", interval);

        return value;
    }

    private int setDeparture(Properties props) throws ConfigurationException {
        int value;
        String valueString = props.getProperty("departure");

        configurationService.checkNull(valueString, "departure offset");

        value = Integer.parseInt(valueString);
        configurationService.checkZero(value, "departure > 0");

        configurationService.checkIfNotZero(value, "departure % interval", interval);
        return value;
    }

    public int getInterval() {
        return interval;
    }

    public int getDuration() {
        return duration;
    }

    public int getDeparture() {
        return departure;
    }


}
