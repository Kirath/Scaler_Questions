// Smaller and Greater
// You are given an Array A of size N.
// Find for how many elements, there is a strictly smaller element and a strictly greater element.
// Example Input:
//     A = [1, 2, 3]

// Example Output:
//     1

// Explanation:
//     only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.

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
