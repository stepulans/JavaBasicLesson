package Homework.secondHomework.Shop;

public class EdekaAndRewe {
    public static void main(String[] args) {

            boolean isEdekaOpen = false;
            boolean isReweOpen = false;
            boolean canBuy = false;

            if (canBuy(false, false)) {
                canBuy = false;
                System.out.println(canBuy);
            }
                if (canBuy(true, false)) {
                canBuy = true;
                System.out.println("I can buy food in Edeka " + canBuy);
            }   else if (canBuy(false, true)) {
                canBuy = true;
                System.out.println("I can buy food in Rewe " + canBuy);
            }   else if (canBuy(true, true)) {
                canBuy = true;
                System.out.println("I can buy food in bouth shops " + canBuy);
            }

        }
        public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
        }






    }
