public class _sumOfArray{
    public static int sumOfArray(int arr[],int i){
        int result=0;
        if(i>arr.length-1){
            return 0;
        }
        result=arr[i]+sumOfArray(arr,i+1);
        return result;
    }
    public static void main(String[] args) {
        int arr[]={92,23,15,-20,10};
        int result=sumOfArray(arr,0);
        System.out.println(result);
    }
}