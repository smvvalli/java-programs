import java.util.*;
public class RemoveWhitespaceinString{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=" ";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=' '){
            b=b+a.charAt(i);    
            }
            System.out.print(b);
        }
    }      

    
}
