public class Loops{
    public static void main(String[] args) {
        // while
        // for
        //foreach
        int max = 0;
        int arr []={10,20,30,40,50};
        // for(int x=0;x<arr.length;x++){
        //     if(max<arr[x]){
        //         max = arr[x];
        //     }
        // }
        // System.out.println(max);
        for(int x=arr.length-1;x>=0;x--){
            System.out.println(arr[x]);
        }
    }
}
