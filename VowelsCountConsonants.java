import java.util.*;
public class VowelsCountConsonants{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int vo=0;
        int con=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            vo+=1; 
            }
            else{
                con+=1;
            }
            System.out.print(vo);
            System.out.print(con);
        }
    }      

    
}