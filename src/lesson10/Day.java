package lesson10;

import lesson09.Speakable;

public enum Day implements Speakable {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY {
        @Override
        public String getShortName() {
            return "чт";
        }
    },
    FRIDAY(false, "пт"),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean weekendDay;
    private String shortName;


    Day() {
        this.weekendDay = false;
    }

    Day(boolean weekendDay) {
        this.weekendDay = weekendDay;
    }

    Day(boolean weekendDay, String shortName) {
        this.weekendDay = weekendDay;
        this.shortName = shortName;
    }



    public boolean isWeekendDay() {
        return weekendDay;
    }

    public String getShortName() {
        return shortName;
    }

    public static void main(String[] args) {
        Day saturday = Day.SATURDAY;

        Day saturday1 = Day.valueOf("SATURDAY");

        System.out.println(saturday);
        System.out.println(saturday1);
        switch (saturday) {
            case MONDAY -> System.out.println("пн");
            case TUESDAY -> System.out.println("вт");
            case WEDNESDAY -> System.out.println("ср");
            case THURSDAY -> System.out.println("чт");
            case FRIDAY -> System.out.println("пт");
            case SATURDAY, SUNDAY -> System.out.println("вых");
        }


        Day[] values = Day.values();
        String name = saturday.name();
        int ordinal = saturday.ordinal();
    }

    @Override
    public void voice() {
        System.out.println("");
    }

}