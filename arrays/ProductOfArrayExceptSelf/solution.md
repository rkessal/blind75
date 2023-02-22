## Product of array except self

```java
int n = nums.length;
int[] answer = new int[n];
```

We declare a variable called "n" and assign it the length of the input array "nums", and a new integer array called "answer" with the same length as the input array "nums".

```java
for (int i = 1; i < n; i++) {
  answer[i] = answer[i-1] * nums[i-1];
}
```

We loop through the array "nums" starting from the second element and for each element, we set the corresponding element of the "answer" array to the product of all the elements to the left of that element.

```java
int suffix = 1;
for (int i = n-1; i >= 0; i--) {
  answer[i] *= suffix;
  suffix *= nums[i];
}
```

We loop through the array "nums" starting from the last element and for each element, we multiply it with the "suffix" variable and then set the corresponding element of the "answer" array to the product of all the elements to the left and right of that element.

```java
return answer;
```

We return the "answer" array as the output of the "productExceptSelf" method.
