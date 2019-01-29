import java.util.*;
import java.io.*;
public abstract class FileReader
	{
		public static ArrayList<String> students = new ArrayList<String>();
		protected ArrayList<Student> studentList = new ArrayList<Student>();
		protected int iDNumber;
		protected String name;
		protected ArrayList<String> previousGroups = new ArrayList<String>();
		protected int numberOfStudents;
		public static void main (String[] args) throws IOException
			 {
				 Scanner file = new Scanner(new File( "StudentList.txt" ));
				 students.add(file.nextLine());
//				 file.nextLine();
				 do
					 {
						 students.add(file.nextLine());
//						 file.nextLine();
					 }
				 while(file.hasNextLine());
				 for (String s : students)
					 {
						 System.out.println(s);
					 }
				 System.out.println();
				 generateGroups();
			 }
		protected abstract void generateGroups();
		protected void generateStudentList()
			{
				for (int k = 0; k < students.size(); k++)
					{
						studentList.add(new Student(k, name, previousGroups));
					}
			}
		public ArrayList<Student> getStudentList()
			{
				return studentList;
			}
		public void setStudentList(ArrayList<Student> studentList)
			{
				this.studentList = studentList;
			}
		public int getiDNumber()
			{
				return iDNumber;
			}
		public void setiDNumber(int iDNumber)
			{
				this.iDNumber = iDNumber;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public ArrayList<String> getPreviousGroups()
			{
				return previousGroups;
			}
		public void setPreviousGroups(ArrayList<String> previousGroups)
			{
				this.previousGroups = previousGroups;
			}
	}