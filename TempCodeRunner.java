public class TempCodeRunner {
  public static String remA2(String a)
  {
    if(a.isEmpty())
      return "";
    
    char ch = a.charAt(0);
    
    if(ch == 'a')
      return a.substring(1,a.length());
    else
      return (ch +""+ a.substring(1,a.length()));
  } 
  public static String removeA(String ans,String a)
  {
    if(a=="")
      return ans;
    
    if(a.charAt(0)!='a')
    {
      ans+=""+a.charAt(0); 
    }
    return removeA(ans, a.substring(1, a.length()));
  }
    public static void main(String[] args) {
      System.out.println(removeA("","babbac"));
      System.out.println(remA2("babbac"));
    }
}
