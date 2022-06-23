package daysOfTheWeek;

public enum DayOfTheWeek {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

    private String translate;

    DayOfTheWeek(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

    public String toString() {
        return "Перевод на русский язык: " + translate;
    }
}
