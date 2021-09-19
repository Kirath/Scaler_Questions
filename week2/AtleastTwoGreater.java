// Elements which have at-least two greater elements
// Problem Description

// You are given an array of distinct integers A, you have to find and return all elements in array which have at-least two greater elements than themselves.

// NOTE: The result should have the order in which they are present in the original array.
// Example Input
// Input 1:

//  A = [1, 2, 3, 4, 5]
// Input 2:

//  A = [11, 17, 100, 5]


// Example Output
// Output 1:

//  [1, 2, 3]
// Output 2:

//  [11, 5]


// Example Explanation
// Explanation 1:

//  Number of elements greater than 1: 4
//  Number of elements greater than 2: 3
//  Number of elements greater than 3: 2
//  Number of elements greater than 4: 1
//  Number of elements greater than 5: 0
//  Elements 1, 2 and 3 have atleast 2 elements strictly greater than themselves.
// Explanation 2:

//  Number of elements greater than 11: 2
//  Number of elements greater than 17: 1
//  Number of elements greater than 100: 0
//  Number of elements greater than 5: 3
//  Elements 5 and 11 have atleast 2 elements strictly greater than themselves.

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList();
        Integer max_e = Collections.max(A);
        A.remove(max_e);
        Integer next_max = Collections.max(A);
        A.remove(next_max);
        if(A.size() == 0)
            return res;
        else{
            for(int i = 0;i< A.size();i++){
                if (A.get(i) < max_e && A.get(i) < next_max)
                    res.add(A.get(i));
            }
        }
        return res;
    }
}
