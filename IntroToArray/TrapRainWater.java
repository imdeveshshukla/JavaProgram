package IntroToArray;
public class TrapRainWater {
    //------------------------------------------------------------------------
    /*This Method is done by shraddha di she said it is most optimum way
     She done using auxialiary array of leftMax and RightMax
     Time Complexity - O(n)
    */
    public static int findTrapWaterbyDidiMethod(int height[]){
        int width =1;
        int wt = 0;
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        leftMax[0] = height[0];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        for(int i = height.length-2; i >=0 ; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        for(int i = 0; i < height.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            wt += (waterLevel)-height[i]*width;
        }
        return(wt);
    }
    /*This Method is Done by me I don't think about optimization
     it is brute force
     and also it didn't working on all the cases 😂
     SO NEver use this 
     Time Complexity - O(n^2)
    */
    public static void findTrapWaterbyMeraMethod(int height[]){
        int lMax = height[0], rMax = height[0];
        int wt = 0;
        int width =1;
        int start=0,end=0;
        for(int i = 1; i < height.length; i++)
        {
            lMax = height[i];
            rMax = height[i];
            for (int j = i; j >= 0; j--) {
                if(height[j]>lMax){
                    lMax = height[j];
                    start = j;
                }
            }
            for (int k = i; k < height.length; k++) {
                if(height[k]>rMax)
                {
                    rMax = height[k];
                    end = k;
                }
            }
            for(int f = start+1; f < end; f++)
            {
                // System.out.println(start+" "+end);
                // System.out.println("lMax = "+lMax+" rMax = "+rMax+" bar = "+a[f]);
                wt+= (lMax<rMax) ? (lMax-height[f])*width : (rMax-height[f])*width; 
                // System.out.println("Water Trapped = "+wt);
            }
            i=end;
        }
        System.out.println("TOTAL Water Trapped  :  "+wt);
    }
}
