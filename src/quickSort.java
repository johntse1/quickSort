public class quickSort
{
    public void quickSort(int[] arr, int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
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
}
