public class ErFen {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7,8,9};
        int key = 8;
        int x= findKey(a,key);
        System.out.println(x);

    }
    public static int findKey(int []a,int key){
        int low = 0;
        int high = a.length-1;
        int middle = 0;
        while(low<high){
            middle = (low + high)/2;
            if(a[middle]>key){
                high = middle-1;
            }else if(a[middle]<key){
                low = middle+1;
            }else {
                return a[middle];
            }
        }
        return -1;
    }
}
