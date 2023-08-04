public class _armstrongNumber {
    
    public static int armstrongNumber(int number,int count){  
        int result=0;   
        if(number==0){
            return 0;
           }
           result+=(int) Math.pow(number%10, count)+armstrongNumber(number/10,count);
           return result;
        }
    public static void main(String[] args) {
        int count=0;
        int m=134;
        int n=m;
        while(m!=0){
            m=m/10;
            count=count+1;
        }
        int result=armstrongNumber(n, count);
        if(result==n){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
    }
}
