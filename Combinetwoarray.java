import java.util.*;
public class Combinetwoarray
{
    public static void main(String[] args){
      int[] a=new int[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<a.length;i++)
      {
          a[i]=sc.nextInt();
      }
      int[] b=new int[a.length];
      for(int i=0;i<a.length;i++)
      {
         b[i]=a[i];
      }
      for(int i=0;i<a.length;i++){
             System.out.println(b[i]);
              
         
      }
    }
}
