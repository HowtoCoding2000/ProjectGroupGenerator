import java.util.*;
import java.io.*;
public class GroupCreator
	{
		static int maxGroupSize;
		static int numberOfGroups;
		static int numberOfStudents = 1;
		protected int iDNumber;
		static ArrayList<String> group = new ArrayList<String>();
		static ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();
		static ArrayList<String> students = new ArrayList<String>();
		public static void main(String[] args) throws IOException
			{
				Scanner file = new Scanner(new File( "StudentList.txt"));
				Scanner userInput = new Scanner(System.in);
				students.add(file.nextLine());
//				 file.nextLine();
				 do
					 {
						 students.add(file.nextLine());
//						 file.nextLine();
						 numberOfStudents++;
					 }
				 while(file.hasNextLine());
				 for (String s : students)
					 {
						 System.out.println(s);
					 }
				 System.out.println();
				System.out.println("You have " + numberOfStudents + " students.");
				System.out.println();
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
				System.out.println();
				int randomNumber = (int)(Math.random()*numberOfStudents);
				int studentIndex = 0;
				for (int n = 1; n <= numberOfGroups; n++)
					{
						for (int i = 0; i < maxGroupSize; i++)
							{
								if (studentIndex < students.size())
									{
										group.add(students.get(studentIndex));
										studentIndex++;
									}
							}
						System.out.println("Group " + n +":");
						for	(String s : group)
							{
								System.out.println(s);
							}
						int groupSizeInt = group.size();
						for (int m = 0; m < groupSizeInt; m++)
							{
								group.remove(0);
							}
						System.out.println();
					}
				//Group 2
//				for (int i = maxGroupSize; i < maxGroupSize * 2; i++)
//					{
//						group.add(students.get(i));
//					}
//				System.out.println("Group 2:");
//				for	(String s : group)
//					{
//						System.out.println(s);
//					}
//				for (int m = 0; m <= group.size(); m++)
//					{
//						group.remove(0);
//					}
//				groups.add(group);	
//				for (int j = 2; j <= groups.size(); j++)
//					{
//						System.out.println("Group" + j + ":");
//						for (int k = 0; k < groups.get(j).size(); k++)
//							{
//								System.out.println(groups.get(k));
//							}
//					}
			}
	}
