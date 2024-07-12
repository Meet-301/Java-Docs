package Program_96_and_97;

public enum Day {

    MONDAY(true),TUESDAY(true),WEDNESDAY(true),
    THURSDAY(true),FRIDAY(true),SATRUDAY(false),SUNDAY(false);

    boolean  isWeekday;

    String getDayType() {
        return isWeekday ? "Weekday" : "Weekend";
    }

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

}