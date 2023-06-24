int binarySearch(int[] nums, int target) {
    int left = 0, right = ...;

    while(...) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            ...
        } else if (nums[mid] < target) {
            left = ...
        } else if (nums[mid] > target) {
            right = ...
        }
    }
    return ...;
}


int binarySearch(int[] nums, int target) {
    int left = 0; 
    int right = nums.length - 1; 

    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target)
            return mid; 
        else if (nums[mid] < target)
            left = mid + 1; 
        else if (nums[mid] > target)
            right = mid - 1; 
            }
    return -1;
}



// Binary search to find the left boundary using [low, high)
int leftBoundBinarySearch(int[] nums, int target){
    int left = 0;
    int right = nums.length;

    while(left < right){
        int mid = left + (right - left)/2;
        if(nums[mid] == target) 
            right = mid;
        else if(target < nums[mid])
            right = mid;
        else if(target > nums[mid])
            left = mid+1;
    }
    if(left < 0 || left >= nums.length)
        return -1;
    return (nums[left] == target) ? left : -1;
}

// // to convert first binarySearch code for left boundary
        // if (nums[mid] < target) {
        //     left = mid + 1;
        // } else if (nums[mid] > target) {
        //     right = mid - 1;
        // } else if (nums[mid] == target) {
        //     right = mid - 1;
        // }

// Binary search to find the right boundary using (low, high]
int rightBoundBinarySearch(int[] nums, int target){
    int left = 0;
    int right = nums.length;

    while(left < right){
        int mid = left + (right - left)/2;
        if(target == nums[mid])
            left = mid+1;
        else if(target < nums[mid])
            right = mid;
        else if (target > nums[mid])
            left = mid+1;
    }
    if(left-1 < 0 || left-1 >= nums.length)
        return -1;
    return (nums[left-1] = target) ? (left-1) : -1;
}

// to convert first binarySearch code for right boundary 
// since the end condition is when left-1 == right we push left-1 to the right
        // if (nums[mid] < target) {
        //     left = mid+1;
        // } else if (nums[mid] > target) {
        //     right = mid-1;
        // } else if (nums[mid] == target) {
        //     left = mid+1;
        // }
//  if (right < 0 || right >= nums.length) {
    //     return -1;
    // }
    // return nums[right] == target ? right : -1;


