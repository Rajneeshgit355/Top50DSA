//34...... Cyclic anticlock wise roatation by 1...................................................
// Input = {1,2,3,4,5} || Output = {2,3,4,5,1}
class Test
{
    static void print(int[] arr, int n)
    {
        for(int ele:arr)
        System.out.print(ele+" ");
    }
    static void Cyclicrotby1(int[] arr, int  n)
    {
        int temp = arr[0];
        for(int i=1; i<=n-1; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
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
