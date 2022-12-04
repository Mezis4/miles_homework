public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        /* в куске кода из описания дз используется price, но перед этим говорится использовать
            параметр cost, что, как я поняла, и есть price, поэтому я заменила в части Main price на cost
         */
        int cost = 10_000;
        int miles = service.calculate(cost);
        System.out.println(miles);
    }
}