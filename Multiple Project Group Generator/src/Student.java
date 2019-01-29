import java.util.*;
import java.io.*;
public class Student extends GroupGenerator
	{
		protected ArrayList<Student> group = new ArrayList<Student>();
		public Student(int i, String n, ArrayList<String> p)
		{
			iDNumber = i;
			name = n;
			previousGroups = p;
		}
		@Override
		protected void generateStudentList()
			{
				for (int k = 0; k < students.size(); k++)
					{
						studentList.add(new Student(k, name, previousGroups));
					}
			}
	}
