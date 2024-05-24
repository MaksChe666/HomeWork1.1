public class BonusMilesService {
    public int calculate(int price) {
        int mileOnPrice = 20;
        int miles = price / mileOnPrice;
        return miles;
    }
}
