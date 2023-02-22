## Combination Sum

```java
List<List<Integer>> res = new ArrayList<>();
List<Integer> combination = new ArrayList<>();
backtrack(res, candidates, target, combination, 0);
return res;
```

```java
private void backtrack(List<List<Integer>> res, int[] candidates, int target, List<Integer> combination, int start) {}
```

We define a private method called backtrack() that takes the result list, candidates array, target value, current combination, and starting index as input parameters.

```java
if (target < 0) {
  return;
}
```

If the target value is less than 0, we return from the current level of the recursion.

```java
else if (target == 0) {
  res.add(new ArrayList<>(combination));
}
```

If the target value is equal to 0, we add the current combination to the result list of unique sum combinations.

```java
else {
  for (int i = start; i < candidates.length; i++) {
    combination.add(candidates[i]);
    backtrack(res, candidates, target - candidates[i], combination, i);
    combination.remove(combination.size() - 1);
  }
}
```

Otherwise, we iterate through the candidates array starting from the current index.
We add the current candidate to the combination list and recursively call backtrack() with the updated target value and starting index.
After returning from the recursive call, we remove the last element from the combination list to backtrack to the previous level of the recursion and try other candidates. This allows us to explore all possible combinations that add up to the target value.
