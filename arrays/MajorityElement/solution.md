## Majority Element

```java
int majority = nums[0];
int count = 1;
```

We initialize the majority at the first index of the array, and its count to 1

```java
for (int i = 1; i < nums.length; i++) {
  if (nums[i] == majority) {
    count++;
  }
}
```

We iterate through the array starting from the second element.
For each element, if it's the same as the majority, we increment the count.

```java
else {
  count--;
  if (count == 0) {
    majority = nums[i];
    count = 1;
  }
}

```

If it's different, we decrement the count. If count becomes 0, we update the majority to the current element and set the count to 1.

```java
return majority;
```

At the end of the iteration, the majority variable will contain the majority element.
