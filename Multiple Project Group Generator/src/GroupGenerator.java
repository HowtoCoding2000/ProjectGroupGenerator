import java.util.*;
import java.io.*;
public class GroupGenerator extends FileReader
	{
//		protected int iDNumber;
//		protected String name;
//		protected ArrayList<Student> studentList = new ArrayList<Student>();
//		protected ArrayList<String> previousGroups = new ArrayList<String>();
		protected ArrayList<Student> group = new ArrayList<Student>();
		protected ArrayList<Student> studentGroups = new ArrayList<Student>();
		@Override
		protected void generateGroups()
			{
				int random = (int)(Math.random()* 22);
				for (int i = 0; i < 5; i++)
					{
						group.add(new Student (studentList.get(random).getiDNumber(), studentList.get(random).getName(), studentList.get(random).getPreviousGroups()));
						random = (int)(Math.random()* 22);
					}
				System.out.println();
				System.out.println("Group 1:");
				for (int j = 0; j < group.size(); j++)
					{
						System.out.println(group.get(j).getName());
					}
			}
//		public static void generateGroups();
//		{
//			int random = (int)(Math.random()* 22);
//			for (int i = 0; i < 5; i++)
//				{
//					group.add(students.get(random));
//				}
//		}
	}
