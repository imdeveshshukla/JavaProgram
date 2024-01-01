import java.lang.*;
class TempCode {
    public static String convertOptimal(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
    public static String convert(String s, int numRows) {
        int pattern = 0;
        String str = "";
        System.out.println("I am At function");
        if(numRows>=3)
        {
            for(int i=3;i<=numRows;i++)
            {
                pattern += 1;
            }
            
            pattern =pattern + numRows;
            int k = pattern-2;
            System.out.println(pattern);
            for (int i = 0; i < numRows; i++) {
                int j = i;
                int l = i;
                boolean sw = true; 
                if(i==(numRows-1) || i==0){
                    while(j<s.length()){
                        str+= s.charAt(j);
                        j = j+pattern;
                    }
                }
                else{
                    
                    while (j<s.length()) {
                        str+=s.charAt(j);
                        if(sw)
                        {
                            j = j+k;
                            sw = false;
                        }
                        else
                        {
                            l = l + pattern;
                            j = l;
                            sw = true;
                        }
                        
                    }
                    System.out.println();
                    k = k - 2;
                }
            }
            return str;
        }
        else if(numRows == 2)
        {
            for (int i = 0; i < s.length(); i=i+2) 
                str+=s.charAt(i);
            for (int i = 1; i < s.length(); i=i+2) 
                str+=s.charAt(i);

            return str;
        }
        else{
            return s;
        }

    }
    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        System.out.println("____________Actual Ans____________ "+s);
        // convert("PAYPALISHIRING", 3);
        System.out.println(convertOptimal(s, 6));
    }
}