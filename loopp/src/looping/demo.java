package looping;

public class demo {

	public static void main(String[] args) 
	{
		System.out.println("Robo....");
		int i=1;
		rajini:while(i<=5)
		{
			int j=1;
			tamana:while(j<=5)
			{
				System.out.print("*");
				j++;
				break rajini;
			
			}
			System.out.println();
			i++;
		}
	}
}	