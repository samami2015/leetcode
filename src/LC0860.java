public class LC0860 {
 /*   public boolean lemonadeChange(int[] bills) {
        int sum = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                sum += bills[i];
            } else if (bills[i] % 5 ==0 && sum - bills[i] >= 0) {
                sum -= bills[i];
            }
        }
        return sum >= 0 ? true : false;
    }*/

    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        LC0860 solution = new LC0860();
        //int[] bills = {5,5,5,10,20};
        //int[] bills = {5,5,10};
        //int[] bills = {10,10};
        int[] bills = {5, 5, 10, 10, 20};
        boolean b = solution.lemonadeChange(bills);
        System.out.println(b);
    }
}
