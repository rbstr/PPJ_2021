package ppj.assignments;

import java.util.List;
import java.util.stream.IntStream;

/***
 *  You are allowed to use only java 8 streams API - especially for-loops and mutable state is not allowed
 */
public class Assignment3Impl implements Assignment3 {
    public int deepSumOfEvenSquaredNumbers(List<List<Integer>> src){

        return src.stream()
                .flatMap(t -> t.stream())
                .filter(i -> i%2 ==0)
                .map(b -> b*b)
                .reduce((a, b) -> a+b)
                .orElse(0);
    }

    public int sumOfDivisibleInRange(int from, int to, List<Integer> divisibleBy){

        return IntStream.range(from, to).boxed()
                .filter(number ->
			divisibleBy.stream().allMatch(div -> number % div == 0)
			)
                .mapToInt(i -> i).sum();

    }
}
