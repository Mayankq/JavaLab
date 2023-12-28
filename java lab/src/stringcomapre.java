public class stringcomapre {
    public static int strcmp(String str1, String str2){
        return str1.compareTo(str2);
}
public static int strcmp(String str1, String str2, int numChars){
    return str1.substring(0,numChars).compareTo(str2.substring(0,numChars));
}
public static void main(String[] args){
 String str1 = "HelloWorld!!!!";
 String str2 = "HelloWorld";
 int result1 = strcmp(str1,str2);
 int result2 = strcmp(str1,str2,5);
 System.out.println("Comparison of string in version 1:" +result1);
 System.out.println("Comparison of string in version 2:"+result2);
}
}
