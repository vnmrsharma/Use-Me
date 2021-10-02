import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		    for(int i=1;i<=t;i++){
		        int count=0;
		        int n=sc.nextInt();
		        while(n>0){
		            int r=n%10;
		            if(r==4){
		                count++;
		            }
		            n=n/10;
		        }
		        System.out.println(count);
		    }
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
