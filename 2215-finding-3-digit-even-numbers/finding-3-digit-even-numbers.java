import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] mp = new int[10];

        for (int ele : digits) {
            mp[ele]++;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            if (mp[i] == 0) continue;
            mp[i]--;
            for (int j=0;j<=9;j++) {
                if (mp[j]==0) continue;
                mp[j]--;

                for (int k=0;k<=8;k+=2) {
                    if (mp[k] == 0) continue;
                    mp[k]--;

                int num = i * 100 + j * 10 + k;
                    result.add(num);
                    mp[k]++;
                }
                mp[j]++;
            }
            mp[i]++;
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}