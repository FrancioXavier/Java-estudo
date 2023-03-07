public class ex07 {
    public int numParOuImpar(int n){
        if(n % 2 == 0){
            return (n/2);
        } else{
            return (n*3)+1;
        }
    }

    public static void main(String[] args) {
        int index = 20;
        ex07 func = new ex07();
        while (index != 1) {
            System.out.println(func.numParOuImpar(index) + " ->");
            index = func.numParOuImpar(index);
        }
    }
}
