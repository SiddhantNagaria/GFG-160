
import java.util.ArrayList;
import java.util.List;

class Solution {


    //time = O(n^2)
    //space = O(1)
    static List<Integer> majorityElementII(int[] arr) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == arr[i]) {
                    cnt+=1;
                }
            }
            if (cnt > (n/3)) {
                if(res.size()==0 ||arr[i]!= res.get(0)){
                    res.add(arr[i]);
                }
            }
            if(res.size()==2){
                if(res.get(0)>res.get(1)){
                    java.util.Collections.swap(res,0,1);
                }
                break;
            }
        }
        return res;
    }

    //boyer-moore voting algorithm
    //time = O(n)
    //space = O(1)
    static List<Integer> findMajority(int[] arr) {
        int n = arr.length;
        int ele1 = -1, ele2 = -1;
        int cnt1 = 0, cnt2 = 0;
        for (int ele : arr) {
            if (ele1 == ele) {
                cnt1++;
            }
            else if (ele2 == ele) {
                cnt2++;
            }
            else if (cnt1 == 0) {
                ele1 = ele;
                cnt1++;
            }
            else if (cnt2 == 0) {
                ele2 = ele;
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for (int ele : arr) {
            if (ele1 == ele) cnt1++;
            if (ele2 == ele) cnt2++;
        }
        if (cnt1 > n / 3) res.add(ele1);
        if (cnt2 > n / 3 && ele1 != ele2) res.add(ele2);
        if (res.size() == 2 && res.get(0) > res.get(1)) {
            int temp = res.get(0);
            res.set(0, res.get(1));
            res.set(1, temp);
        }
        return res;
    }
}
