public class BonusMilesService {
    public int calculate(int cost) {
        int miles = 20;
        int bonus = cost / miles;
        return bonus;
    }
}
