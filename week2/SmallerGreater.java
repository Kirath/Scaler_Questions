import java.util.*;

public class SmallerGreater{
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            A.add(num);
        }
        System.out.println(Solution.solve(A));

        
    }
}

class Solution {
    public static int solve(ArrayList<Integer> A) {
        Integer max_e = Collections.max(A);
        Integer min_e = Collections.min(A);
        
        int c = 0;
        for(int i = 0;i< A.size();i++){
            if (A.get(i) < max_e && A.get(i) > min_e)
                c += 1;
        }
        return c;
    }
}
