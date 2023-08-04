public class _sumOfDigits{
    public static int sumOfDigits(int number){
        int result=0;
        if(number==0){
            return 0;
        }
        else{
            result=number%10+sumOfDigits(number/10);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(4321));
    }
}