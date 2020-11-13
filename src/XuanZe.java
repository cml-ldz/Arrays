import java.util.Arrays;

public class XuanZe {
    public static void main(String[] args) {
        int []a={6,5,7,2,3,1};
        for (int i = 0; i < a.length-1; i++) {
            int m = 0;
            for (int j = 1; j < a.length-i; j++) {
                if(a[m]<a[j]){
                    m=j;
                }
            }
            if(m!=a.length-i-1){
                int temp = a[m];
                a[m] = a[a.length-i-1];
                a[a.length-i-1] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
