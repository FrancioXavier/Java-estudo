public class ex06 {
    public long fibo(int n){
        if(n == 1){
            return 0;
        } else if(n == 2){
            return 1;
        } else if(n == 3){
            return 1;
        } else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String[] args) {
        ex06 fib = new ex06();
        for(int i = 1; i < 100; i++){
            System.out.println(fib.fibo(i));
        }
    }
}
