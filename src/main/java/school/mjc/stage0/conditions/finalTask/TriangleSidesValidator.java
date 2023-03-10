package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        var minimumSide = Math.min(firstSide, Math.min(secondSide, thirdSide));
        var maximumSide = Math.max(firstSide, Math.max(secondSide, thirdSide));
        var middleSide = Math.min(Math.abs(firstSide - minimumSide), Math.abs(firstSide - maximumSide)) < 1e-5
                ? Math.min(Math.abs(secondSide - minimumSide), Math.abs(secondSide - maximumSide)) < 1e-5
                ? thirdSide : secondSide
                : firstSide;

        var isTrianglePossible = minimumSide + middleSide > maximumSide;
        System.out.println(isTrianglePossible ? "this is a valid triangle" : "it's not a triangle");
    }
}
