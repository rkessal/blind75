## Insert Interval

```java
List<int[]> result = new ArrayList<>();
```

We create an empty ArrayList result to store the resulting intervals after the insertion of newInterval.

```java
int i = 0, n = intervals.length;
```

We define two variables i and n, where i is initialized to 0 and n is assigned the length of intervals.

```java
while (i < n && intervals[i][1] < newInterval[0]) {
result.add(intervals[i]);
i++;
}
```

We loop through intervals until we find an interval whose end is greater than or equal to the start of newInterval, or until we reach the end of intervals. We add all intervals before this to result.

```java
int[] mergedInterval = newInterval;
```

We initialize an integer array mergedInterval with the values of newInterval.

```java
while (i < n && intervals[i][0] <= newInterval[1]) {
mergedInterval[0] = Math.min(mergedInterval[0], intervals[i][0]);
mergedInterval[1] = Math.max(mergedInterval[1], intervals[i][1]);
i++;
}
```

We loop through intervals starting from where the first loop left off, until we find an interval whose start is greater than the end of newInterval, or until we reach the end of intervals. If the current interval overlaps with newInterval, we merge them by updating the start and end of mergedInterval.

```java
result.add(mergedInterval);
```

We add the merged interval to result.

```java
while (i < n) {
result.add(intervals[i]);
i++;
}
```

We add all the remaining intervals in intervals to result.

```java
return result.toArray(new int[result.size()][]);
```

We convert result to a 2D integer array and return it as the output of the method insert.
