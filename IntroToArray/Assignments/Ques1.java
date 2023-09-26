public class Ques1 {
    public static boolean isElementRepeating(int a[]){
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a.length; j++)
            {
                if(i!=j)
                {
                    if(a[i]==a[j])
                        return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] ={1,1,1,3,3,4,3,4,2};
        int nums[] = {1,2,3,4}; 
        System.out.println(isElementRepeating(a));
        System.out.println(isElementRepeating(nums));

    }
}
