package dataStrucrure;

public class q2 {

	public static void main(String[] args) {
int i;
for(i=100;i<=999;i++)
{
	int n1,n2,n3,c;
	  c=i;
	  n1=c%10;
	  c=c/10;
	  n2=c%10;
	  c=c/10;
	  n3=c%10;
	  int result =(n1*n1*n1)+(n2*n2*n2)+(n3*n3*n3);
if(i==result)
  {
	System.out.println(i+"  is armstrong");
  }
}

	}

}
