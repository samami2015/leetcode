import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LC0051 {
//    private int n;
//    private boolean[] col;
//    private boolean[] main;
//    private boolean[] sub;

//    private Set<Integer> col;
//    private Set<Integer> main;
//    private Set<Integer> sub;
//
//    private List<List<String>> res;

/*    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        this.col = new boolean[n];
        this.main = new boolean[2 * n - 1];
        this.sub = new boolean[2 * n - 1];
        Deque<Integer> path = new ArrayDeque<>();
        dfs(0, path);
        return res;
    }*/

/*    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        col = new HashSet<>();
        main = new HashSet<>();
        sub = new HashSet<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(0, path);
        return res;
    }

    private void dfs(int row, Deque<Integer> path) {
        if (row == n) {
            List<String> board = convert2board(path);
            res.add(board);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (!col.contains(j) && !main.contains(row - j + n - 1) && !sub.contains(row + j)) {
                path.addLast(j);
                col.add(j);
                main.add(row-j);
                sub.add(row+j);

                dfs(row + 1, path);
                sub.remove(row+j);
                main.remove(row-j);
                col.remove(j);
                path.removeLast();
            }
        }
    }

    private List<String> convert2board(Deque<Integer> path) {
        List<String> board = new ArrayList<>();
        for (Integer num : path) {
            StringBuilder row = new StringBuilder();
            //row.append(".".repeat(Math.max(0,n)));
            row.replace(num, num + 1, "Q");
            board.add(row.toString());
        }
        return board;
    }*/

    private int n;
    private boolean[] col;
    private boolean[] main;
    private boolean[] sub;
    private List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        this.n = n;
        this.col = new boolean[n];
        this.main = new boolean[2 * n - 1];
        this.sub = new boolean[2 * n - 1];
        Deque<Integer> path = new ArrayDeque<>();
        dfs(0, path);
        return res;
    }

    private void dfs(int row, Deque<Integer> path) {
        if (row == n) {
            List<String> board = convert2board(path);
            res.add(board);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (!col[j] && !main[row - j + n - 1] && !sub[row + j]) {
                path.addLast(j);
                col[j] = true;
                main[row - j + n - 1] = true;
                sub[row + j] = true;

                dfs(row + 1, path);
                sub[row + j] = false;
                main[row - j + n - 1] = false;
                col[j] = false;
                path.removeLast();
            }
        }
    }

    private List<String> convert2board(Deque<Integer> path) {
        List<String> board = new ArrayList<>();
        for (Integer num : path) {
            StringBuilder row = new StringBuilder();
            //row.append(".".repeat(Math.max(0,n)));
            row.replace(num, num + 1, "Q");
            board.add(row.toString());
        }
        return board;
    }
}
