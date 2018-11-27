public class quickSort
{
    private int[] arr;
    private int left;
    private int right;
    public quickSort(int[] test1, int left, int right)
    {
        this.left = left;
        this.right = right;
    }

    public void quickSort(int[] arr, int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
        this.arr = arr;
    }
    public int partition(int[] arr, int left, int right)
    {
        int pivot = right;
        int i = left -1;
        for(int j = left; j<right; j++)
        {
            if(arr[j] <= pivot)
            {
                i+=1;
                int swap = arr[j];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        arr[i+1] = arr[right];
        return i+1;
    }
    public String toString()
    {
        String str = "";
        for(int j = 0; j<arr.length;j++)
        {
            str+= arr[j];
        }
        return str;
    }
}
