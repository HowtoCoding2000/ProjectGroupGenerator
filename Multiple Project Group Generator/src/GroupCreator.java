import java.util.*;
import java.io.*;
public class GroupCreator
	{
		static int maxGroupSize;
		static int numberOfGroups;
		static int numberOfStudents = 22;
		static int[] group = new int[maxGroupSize];
		static ArrayList<String> groups = new ArrayList<String>();
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("You have " + numberOfStudents + " students.");
				System.out.println("Input the maximum group size.");
				maxGroupSize = userInput.nextInt();
				if (numberOfStudents / maxGroupSize == 0)
					{
						numberOfGroups = numberOfStudents / maxGroupSize;
					}
				else
					{
						numberOfGroups = (numberOfStudents / maxGroupSize) + 1;
					}
				System.out.println("You will have " + numberOfGroups + " groups.");
				int randomNumber = (int)(Math.random()*22 + 1);
				for (int i = 0; i < maxGroupSize; i++)
					{
						group[i] = randomNumber;
					}
			}
	}
