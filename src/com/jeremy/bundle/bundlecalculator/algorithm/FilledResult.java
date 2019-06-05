package com.jeremy.bundle.bundlecalculator.algorithm;

public class FilledResult {
    public  int[] minChange(int[] memo, int numbers)
    {
        int n = memo.length;
        int[] count = new int[numbers + 1];
        int[] from = new int[numbers + 1];

        count[0] = 1;
        for (int i = 0 ; i < numbers; i++)
            if (count[i] > 0)
                for (int j = 0; j < n; j++)
                {
                    int p = i + memo[j];
                    if (p <= numbers)
                    {
                        if (count[p] == 0 || count[p] > count[i] + 1)
                        {
                            count[p] = count[i] + 1;
                            from[p] = j;
                        }
                    }
                }
        if (count[numbers] == 0)
            return null;

        int[] result = new int[count[numbers] - 1];
        int k = numbers;
        while (k > 0)
        {
            result[count[k] - 2] = memo[from[k]];
            k = k - memo[from[k]];
        }
        return result;
    }
}
