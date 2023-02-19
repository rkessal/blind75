## 3Sum

```java
List<List<Integer>> res = new ArrayList<>();
```

Initialize the output list

```java
Arrays.sort(nums);
```

Sort the input array

```java
for (int i = 0; i < nums.length - 2; i++) {}
```

Iterate through the input array

```java
if (i == 0 || nums[i] != nums[i - 1]) {}
```

Skip duplicate values of i to avoid duplicate triplets

```java
int left = i + 1;
int right = nums.length - 1;
```

Set two pointers left and right

```java
while(left < right) {}
```

Iterate through the array using the two pointers

```java
int sum = nums[i] + nums[left] + nums[right];
```

Calculate the sum of the three values

```java
if (sum > 0) {
  right--;
}
```

If the sum is greater than 0, move the right pointer to the left

```java
else if (sum < 0) {
  left++;
}
```

If the sum is less than 0, move the left pointer to the right

```java
else {
  res.add(Arrays.asList(nums[i], nums[left], nums[right]));
  while(left < right && nums[left] == nums[left + 1]) left++;
  while(left < right && nums[right] == nums[right - 1]) right--;
  left++;
  right--;
}
```

If the sum is 0, add the triplet to the output list
Skip duplicate values of left and right
Move the left and right pointers to the next unique values

```java
return res;
```

Return the output list
