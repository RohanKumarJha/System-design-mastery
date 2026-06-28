class DiscountService {
    public boolean isEligible(int age,boolean premiumUser) {
        return ((age>=18) && premiumUser) ? true : false;
    }
}