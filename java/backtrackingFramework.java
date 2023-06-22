// FORM 1: The elements are non repeatable 

// Combination/subset problem backtracking algorithm framework
void backtrack(int[] nums, int start) {

    for (int i = start; i < nums.length; i++) {
        track.addLast(nums[i]);
        backtrack(nums, i + 1);
        track.removeLast();
    }
}

// Array problem backtracking algorithm framework 
void backtrack(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        if (used[i]) {
            continue;
        }
        used[i] = true;
        track.addLast(nums[i]);

        backtrack(nums);
        track.removeLast();
        used[i] = false;
    }
}

// FORM 2: The elements are repeatable 

Arrays.sort(nums);
// Combination/subset problem backtracking algorithm framework
void backtrack(int[] nums, int start) {
    for (int i = start; i < nums.length; i++) {
        if (i > start && nums[i] == nums[i - 1]) {
            continue;
        }
        track.addLast(nums[i]);
        backtrack(nums, i + 1);
        track.removeLast();
    }
}


Arrays.sort(nums);
// Array problem backtracking algorithm framework 
void backtrack(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        if (used[i]) {
            continue;
        }
        if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
            continue;
        }
        used[i] = true;
        track.addLast(nums[i]);

        backtrack(nums);
        track.removeLast();
        used[i] = false;
    }
}
