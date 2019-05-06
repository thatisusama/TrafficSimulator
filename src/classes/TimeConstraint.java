package classes;

import config.AppConstants;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// this is helper class for time related things
public class TimeConstraint {

    // this will return the current time by the format which is set in AppConstants class
    public String getCurrentHour() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdfHour = new SimpleDateFormat(AppConstants.TIME_FORMAT);
        return sdfHour.format(cal.getTime());
    }

    // this wil verify that the given time is between 06:00 - 23:00 or not
    public boolean isHourInInterval(String current, String start, String end) {
        return ((current.compareTo(start) >= 0) && (current.compareTo(end) <= 0));
    }

}
