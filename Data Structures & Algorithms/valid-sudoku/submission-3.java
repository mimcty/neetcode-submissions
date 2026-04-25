class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] grid = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            grid[i] = new HashSet<>();
        }

        HashSet<Integer>[] cols = new HashSet[9];   
        for (int i = 0; i < 9; i++) {
            cols[i] = new HashSet<>();
        }
        int gridIdx = 0;

        for (int row = 0; row < 9; row++) {
            HashSet<Integer> set = new HashSet<>();
            for (int idx = 0; idx < 9; idx++) {
                if (set.contains(Character.getNumericValue(board[row][idx]))) {
                    return false;
                } else if ((board[row][idx]) == '.') {
                    continue;
                } else {
                    set.add(Character.getNumericValue(board[row][idx]));
                }

                if (cols[idx].contains(Character.getNumericValue(board[row][idx]))) {
                    return false;
                } else if ((board[row][idx]) == '.') {
                    continue;
                } else {
                    cols[idx].add(Character.getNumericValue(board[row][idx]));
                }
            }

            for (int idx = 0; idx < 9; idx++) {
                gridIdx = (row / 3) * 3 + (idx / 3);
                char num = board[row][idx];
                if (grid[gridIdx].contains(num - '0')) {
                    return false;
                } else if ((board[row][idx]) == '.') {
                    continue;
                } else {
                    grid[gridIdx].add(num - '0');
                }
            }              
        }
        return true;
    }
}

