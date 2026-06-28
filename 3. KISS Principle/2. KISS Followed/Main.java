class Main {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        System.out.println(discountService.isEligible(22,true));
    }
}