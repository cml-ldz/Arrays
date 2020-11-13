import java.util.Arrays;

public class ChaRu {
    public static void main(String[] args) {
        int []a = {5,6,4,2,1,3,7};

        /*for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = 0;
            for (j = i-1; j >= 0; j--) {
                if(a[j]>temp){
                    a[j+1]=a[j];
                }else {
                    break;
                }
            }
            a[j+1]=temp;
        }*/

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if(a[j]<a[j-1]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
