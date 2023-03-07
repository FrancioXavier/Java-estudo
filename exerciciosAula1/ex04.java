public class ex04 {
    public long fatorial(long n){
        if(n == 1){
            return 1;
        } else{
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        ex04 fato = new ex04();
        for(long i = 1; i < 21; i++){
            System.out.println(fato.fatorial(i));
        }
    }
}
