public class Main
{
   public static void main (String[] args) {
    {
            String s="abcde";
            String s1="ace";
            int m=s.length();
            int n=s1.length();
            int[][] ar=new int[m+1][n+1];
            for(int i=m-1;i>=0;i--)
            {
                for(int j=n-1;j>=0;j--)
                {
                    if(s.charAt(i)==s1.charAt(j))
                    {
                        ar[i][j]=1+ar[i+1][j+1];
                    }
                    else{
                        ar[i][j]=Math.max(ar[i][j+1],ar[i+1][j]);
                    }
                }
            }
            System.out.println(ar[0][0]);
        }
    }
}