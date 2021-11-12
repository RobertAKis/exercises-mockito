package exercise04;

import java.util.Calendar;

public class CurrentTime {

    public int getHour() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }
}
