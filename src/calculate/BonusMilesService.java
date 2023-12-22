package calculate;

public class BonusMilesService {
    public int calculate(int a, int b) {
        int result;
        if (a >= b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}
