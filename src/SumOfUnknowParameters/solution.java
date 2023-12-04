package SumOfUnknowParameters;

public class solution {
    public int getSum(int... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }
}
