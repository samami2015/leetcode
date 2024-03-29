import java.util.Deque;
import java.util.LinkedList;

public class LC0227 {
    public static void main(String[] args) {
        LC0227 solution = new LC0227();
        String s = "3+2*2";
        int ans = solution.calculate(s);
        System.out.println(ans);
    }

    public int calculate(String s) {
        char preSign = '+';
        int n = s.length();
        int num = 0;
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {
                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    default:
                        stack.push(stack.pop() / num);
                }
                preSign = s.charAt(i);
                num = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
