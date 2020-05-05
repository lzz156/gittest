import java.io.IOException;
import java.util.Arrays;

public class lzz1 {
    public static void main(String[] args) throws IOException {
       int[] a={1,2,34,5};
       for (int r:a)
           System.out.print(r+" ");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int  b=(int)(Math.random()*4);
        System.out.println(b);
    }
}