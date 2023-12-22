import calculate.BonusMilesService;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate (price/20,1); // должно получиться 500
        System.out.println(miles);
    }
}