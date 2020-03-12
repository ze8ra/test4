import java.util.HashMap;

public class two {
    static int findInteger(int arr[], int n)
    {
        HashMap<Integer,
                Integer> hash = new HashMap<>();
        int maximum = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] < 0)
                hash.put(Math.abs(arr[i]),
                        (hash.get(Math.abs(arr[i])) == null ? 0 :
                                hash.get(Math.abs(arr[i]))) - 1);
            else
                hash.put(Math.abs(arr[i]),
                        (hash.get(Math.abs(arr[i])) == null ? 0 :
                                hash.get(Math.abs(arr[i]))) + 1);
        }
        for (int i = 0; i < n; i++)
            if (hash.get(arr[i]) > 0)
                return arr[i];

        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = { 2, 3, -6, -1, 7, 11 };
        int n = arr.length;
        System.out.println( findInteger(arr, n));
    }
}

