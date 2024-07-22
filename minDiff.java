import java.util.*;
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {   
        
        Collections.sort(a);
        int diff = a.get(n-1) - a.get(0);
        for(int i=0; i<n && i+m-1<n; i++){
            int first = a.get(i);
            int second = a.get(i+m-1);
            int diff2 = second - first;
            if(diff2<diff){
                diff = Math.abs(a.get(i)-a.get(i+m-1));
            }
        }
        // your code here
        return diff;
    }
}
