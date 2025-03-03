import java.util.HashSet;
import java.util.Set;

public class L36ValidSudoko {
//TC =O(n^2)=> {n=9 so TC=O(81)=O(1)} SC =O(3n)=> {n=9 so SC=O(81)=O(1) }
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        Set<Character>[] rows= new HashSet[n];
        Set<Character>[] cols= new HashSet[n];
        Set<Character>[] boxes= new HashSet[n];
        for(int r=0; r<n; r++){
            rows[r]= new HashSet<Character>();
            cols[r]= new HashSet<Character>();
            boxes[r]= new HashSet<Character>();
        }

        for(int r=0; r<n; r++){
            for(int c=0; c<n; c++){
                char val= board[r][c];

                if(val=='.') continue;
                if(rows[r].contains(val)) return false;
                 rows[r].add(val);

                if(cols[c].contains(val)) return false;
                 cols[c].add(val);

                int idx=(r/3)*3+(c/3);
                if(boxes[idx].contains(val)) return false;
                 boxes[idx].add(val);
            }
        }
        return true;
    } 
} 