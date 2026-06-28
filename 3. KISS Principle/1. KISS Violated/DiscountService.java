class DiscountService {
    public boolean isEligible(int age,boolean premiumUser) {
        if(age >= 18) {
            if(premiumUser == true) return true;
            else return false;
        } else {
            return false;
        }
    }
}