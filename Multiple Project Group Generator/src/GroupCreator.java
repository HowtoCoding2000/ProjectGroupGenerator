import java.util.*;
import java.io.*;
public class GroupCreator
	{
		static int maxGroupSize;
		static int numberOfGroups;
		static int numberOfStudents = 1;
		static int iDNumber = 0;
		static boolean teamatesMatch;
		protected String name;
		static ArrayList<String> group = new ArrayList<String>();
		static ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();
		static ArrayList<Student2> student2Group = new ArrayList<Student2>();
		static ArrayList<String> students = new ArrayList<String>();
		static ArrayList<Student2> studentList = new ArrayList<Student2>();
		static ArrayList<Integer> previousTeamates = new ArrayList<Integer>();
		public static void main(String[] args) throws IOException
			{
				Scanner file = new Scanner(new File( "StudentList.txt"));
				Scanner userInput = new Scanner(System.in);
				students.add(file.nextLine());
//				file.nextLine();
				do
					{
						students.add(file.nextLine());
						studentList.add(new Student2(numberOfStudents - 1, file.nextLine(), previousTeamates));
//						file.nextLine();
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
				int studentIndex = randomNumber;
				for (int n = 1; n <= numberOfGroups; n++)
					{
						for (int i = 0; i < maxGroupSize; i++)
							{
								while (teamatesMatch)
									{
										if (studentIndex < students.size())
											{
												group.add(students.get(studentIndex));
												student2Group.add(studentList.getName(studentIndex));
												for (Student2 s: student2Group)
													{
														
													}
//												for (int p : previousTeamates)
//													{
//														if ()
//													}
											}
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
		public static int getiDNumber()
			{
				return iDNumber;
			}
		public static void setiDNumber(int iDNumber)
			{
				GroupCreator.iDNumber = iDNumber;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public static ArrayList<Student2> getStudent2Group()
			{
				return student2Group;
			}
		public static void setStudent2Group(ArrayList<Student2> student2Group)
			{
				GroupCreator.student2Group = student2Group;
			}
		public static ArrayList<Integer> getPreviousTeamates()
			{
				return previousTeamates;
			}
		public static void setPreviousTeamates(ArrayList<Integer> previousTeamates)
			{
				GroupCreator.previousTeamates = previousTeamates;
			}
		
	}
