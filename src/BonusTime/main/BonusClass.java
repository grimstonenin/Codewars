package BonusTime.main;

public class BonusClass {

    public static String bonusTime(final int salary, final boolean bonus) {

        StringBuilder result = new StringBuilder("");

        if(bonus) {
            result.append("£").append(salary * 10);
        } else {
            result.append("£").append(salary);
        }

        return result.toString();
    }
}
