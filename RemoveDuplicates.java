package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Life My Rules";
		String[] split = str.split("\\s");
	//	String[] newString = new String[split.length];
		int count =0;
		
		for (int i =0; i<split.length; i++)
		{
			count =1;
			for (int j=i+1; j<split.length; j++)
			{
				if (split[i].equalsIgnoreCase(split[j]))
				{
					split[j] = " ";
				}	
			}
			System.out.print(split[i]+" ");
		}

	}

}
