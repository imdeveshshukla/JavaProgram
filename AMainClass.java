public class AMainClass {
    public static void main(String[] args) {
        int arr[] = {2,3,5,82,40};
        // IntroToArray.Array2.update(arr);
        // for(int i = 0; i < arr.length; i++)
        //     System.out.print(arr[i]+" ");
        int smallVal = IntroToArray.Array4.getSmallest(arr);
        int larVal = IntroToArray.Array4.getLargest(arr);
        System.out.print(smallVal+" "+larVal);
    }
}
