class Solution {
    boolean isValid(int[] arr, int k, long mid) {

        int stu = 1;
        long pages = 0;

        for (int i = 0; i < arr.length; i++) {
            // Ek single book hi mid se zyada hai
            if (arr[i] > mid) {
                return false;
            }
            // Same student ko book de sakte hain
            if (pages + arr[i] <= mid) {
                pages += arr[i];
            }
            // New student
            else {
                stu++;
                pages = arr[i];
            }
        }

        return stu <= k;
    }
    public int splitArray(int[] arr, int k) {
              int n = arr.length;
        if (k > n) {
            return -1;
        }
        long sum=0;
        for (int i=0;i<n;i++) {
            sum += arr[i];
        }
        long st=0;
        long end=sum;
        long ans=-1;
        while (st<=end) {
            long mid = st+(end - st) / 2;
            if (isValid(arr,k,mid)) {
                // mid possible answer hai
                ans=mid;
                // aur chhota answer try karo
                end=mid-1;
            }
            else {
                // mid possible nahi hai
                // capacity badhao
                st = mid+1;
            }
        }

        return (int)ans;
    }
}