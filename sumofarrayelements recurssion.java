public class Main
{
    public int fun(int []a,int s,int i)
    {
        if(i==a.length)
        {
            return s;
        }
        s=s+a[i];
        return fun(a,s,i+1);
    }
    public static void main(String[] args){
        Main m=new Main();
        int a[]={1,2,3,4,5};
        int sum=0;
        int i=0;
        System.out.println(m.fun(a,sum,i));
    }
}