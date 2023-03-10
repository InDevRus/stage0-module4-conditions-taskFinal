package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        var quarter = x == 0 || y == 0 ? "zero"
                : y > 0 ? (x > 0 ? "first" : "second")
                : x < 0 ? "third" : "fourth";
        System.out.println(quarter);
    }
}
