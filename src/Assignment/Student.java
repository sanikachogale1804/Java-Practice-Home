package Assignment;

public class Student {
		
		private int rollNum;
		private String stuName;
		private int mark1;
		private int mark2;
		private int mark3;
		private int totalMarks;

		public void setStudentDetails(int rollNum,String stuName,int mark1,int mark2,int mark3)
		{
			this.rollNum=rollNum;
			this.stuName=stuName;
			this.mark1=mark1;
			this.mark2=mark2;
			this.mark3=mark3;
		}
		
		int calculateTotal()
		{
			return totalMarks=mark1+mark2+mark3;
		}
		
		void displayStudDetails()
		{
			System.out.println("Roll Numbers: "+rollNum);
			System.out.println("Student Name: "+stuName);
			System.out.println("Total Marks: "+totalMarks);
		}
	}


