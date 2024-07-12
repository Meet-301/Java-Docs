package Program_96_and_97;

class DayTesting {
    public static void main(String[] args) {
        System.out.println("WeekDays are as follows");
        for (Day v : Day.values()) {
            System.out.printf("%s : %s\n", v, v.getDayType());
        }
    }
}
