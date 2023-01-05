//33.......................... Cyclic clockwise  rotation by 1........................................
// Input = {1,2,3,4,5} || output = {5,1,2,3,4}
class Test
{
    static void print(int[] arr, int n)
    {
        for(int ele:arr)
        System.out.print(ele+" ");
    }
    static void Cyclicrotby1(int[] arr, int  n)
    {
        int temp = arr[n-1];
        for(int i=n-1; i>0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    public static void main(String... args)
    {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        print(arr,n);
        Cyclicrotby1(arr,n);
        System.out.println();
        print(arr,n);
    }
}