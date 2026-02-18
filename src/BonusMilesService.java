public class BonusMilesService {
    public int calculate(int price) {
        int rubles = 20;
        int miles = price / rubles;
        return miles;
    }
}