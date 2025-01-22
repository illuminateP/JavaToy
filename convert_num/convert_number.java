import java.util.Scanner;

public class convert_num {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[5];
		
		int max = 0;
		System.out.println("insert 5 positive numbers");
		
		int i=0;
		while(i<5) 
		{
			arr[i]=scanner.nextInt();
			if(arr[i]<0) 
			{
				System.out.println("please insert a number over 0");
				continue;
			}
			
			if(arr[i]>max)
				max=arr[i];
			i++;
		}
		
		System.out.println("max is "+max+"!");
			
	}
}