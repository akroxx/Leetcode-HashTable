import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;

        // Declaring HashSets now :
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for(int r =0; r < N;r++){
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for(int r =0; r < N; r++){
            for(int c =0; c < N; c++){
                char val = board[r][c];
                
                if(val == '.'){
                    continue;
                    // Do nothing but skip loop iteration
                }

                // Checking the row
                if(rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);

                if(cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);

                // Checking the box

                int boxIndex = (r/3) * 3 + c / 3;
                if( boxes[boxIndex].contains(val)){
                    return false;
                }
                boxes[boxIndex].add(val);
            }
        }

        return true;
    }
}

/**
 * 1. Every box has only 1 to 9 once
 * 2. Every colums has 1 to 9 once
 * 3. Every row has 1 to 9 once
 * 4. Basically, each row -> each column -> each box should have no duplicate numbers.
 * Maybe HashSets is he answer?
 */