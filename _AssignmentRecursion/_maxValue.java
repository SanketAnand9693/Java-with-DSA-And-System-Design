public class _maxValue {
    public static int maxValue(int arr[],int max){
        if(arr.length==0){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=maxValue(arr, arr[i]);
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int arr[]={13,1,-3,22,5};
        System.out.println(maxValue(arr, 0));
    }
}
