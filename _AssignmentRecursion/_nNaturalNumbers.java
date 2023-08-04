public class _nNaturalNumbers {
    public static int numbers(int number){
        int result=0;
        if(number==0){
            return result;
        }
        if(number%2==0){
            result=-number+numbers(number-1);
        }
        else{
            result=number+numbers(number-1);
        }
        return result;
    }
    public static void main(String[] args) {
        int result=numbers(5);
        System.out.println(result);
    }
}
