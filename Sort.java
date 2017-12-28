import java.util.Scanner;
class Sort
{
	public static void main(String[] args) {
		int[] num={6,3,8,2,54,1};
		int i,j,temp;
		System.out.println("Before");
		for(i=1;i<=num.length;i++)
		{
			System.out.println(+num[i]+" ");
		}
		System.out.println("After Sort");
		for(i=0;i<=num.length-1;i++)
		{
			for(j=i;j<num.length-i-1;i++)
			{
				if(num[j]>num[j+1])
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=num[j];
					System.out.println(i);

				}
			}
		}
		
	}
}
