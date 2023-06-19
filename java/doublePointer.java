// public void slidingWindow(String s, String t){
//     HashMap<Character, Integer> need = new HashMap<>();
//     HashMap<Character, Integer> window = new HashMap<>();
//
//     for(char ch: t.toCharArray()){
//         need.put(ch, need.getOrDefault(ch,0) + 1);
//     }
//
//     int left = 0, right = 0;
//     int valid = 0;
//     while(right < s.length()){
//         char ch = s.charAt(right);
//         right++;
//
//         if(need.containsKey(ch){
//             window.put(ch, need.getOrDefault(ch, 0)+1);
//             if(window.get(ch).equals(need.get(ch))) valid++;
//         }
//         
//         while(window needs shrink){
//             char d = s.charAt(left);
//             left++;
//
//             if(need.containsKey(d){
//                 if(window.get(d).equals(need.get(ch))) valid--;
//                 window.put(d, window.getOrDefault(d, 0)-1);
//             }
//
//         }
//
//     }
// }
//
int binarySearch(int[] nums, int target){
    int left = 0, right = nums.length - 1;
    
    while(left <= right){
        int mid = (left + right)/2;

        if(mid == target) return mid;
        else if(nums[mid] > target){
            right = mid-1;
        }else if{
            left = mid+1;
        }
    }

    return -1;
}
