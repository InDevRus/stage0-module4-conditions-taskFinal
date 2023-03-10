package school.mjc.stage0.conditions.finalTask;

import java.util.Objects;
import java.util.Optional;

public class DaysInMonth {
    public void printDays(int year, int month) {
//        var INVALID_DATE = "invalid date";
//
//        if (year < 0) {
//            System.out.println(INVALID_DATE);
//            return;
//        }
//
//        var isYearLeap = (year % 4 == 0) && (!(year % 100 == 0) || year % 400 == 0);
//
//        var daysCount = switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12 -> 31;
//            case 4, 6, 9, 11 -> 30;
//            case 2 -> isYearLeap ? 29 : 28;
//            default -> null;
//        };
//
//        System.out.println(Objects.requireNonNullElse(daysCount, INVALID_DATE));
        var INVALID_DATE = "invalid date";
        Optional.of(year)
                .filter(givenYear -> givenYear > 0)
                .map(givenYear -> (givenYear % 4 == 0) && (!(givenYear % 100 == 0) || givenYear % 400 == 0))
                .map(isYearLeap -> switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 4, 6, 9, 11 -> 30;
                    case 2 -> isYearLeap ? 29 : 28;
                    default -> null;
                })
                .ifPresentOrElse(System.out::println, () -> System.out.println(INVALID_DATE));
    }
}
