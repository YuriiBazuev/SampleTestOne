package Discount;

public class Discount extends Main{

    public static double calculation (int points) {

        if (points >= 0 && points < 100) {
            return 1.0;// скидка 1%
        } else if (points >= 100 && points < 200) {
            return 3.0;// скидка 3%
        } else if (points >= 200 && points < 500) {
            return 5.0;// скидка 5%
        } else if (points >= 500) {
            return 10.0;// скидка 10%
        } else {
            throw new IllegalArgumentException("Некорректное количество баллов");
        }

    }
}
