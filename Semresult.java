package week1.day2;

public class Semresult {
	public void studentDetail() {
		String studentname = "David Kurup";
		String Branch = "B.E";
		String Dept = "Mechanical Science";
		int Rollnum = 10072022;
		String year = "3rd Year";
		int Batch = 2022;
		System.out.println("Name of the Student - " +studentname );
		System.out.println("Branch              - " +Branch);
		System.out.println("Department          - " +Dept);
		System.out.println("Register Number     - " +Rollnum);
		System.out.println("Year                - " +year);
		System.out.println("Batch               - " +Batch);
	}
	public void cgp() {
		int a=50; int b=63; int c=76; int d=55; int e=81;
		int total = a+b+c+d+e;
		total=total/5 ;
		System.out.println("***Cumulative grade points*** - " +total);
	}
	public static void main(String[] args) {
		Semresult stud = new Semresult() ;
		stud.studentDetail();
		char gradeA ='A';
		char gradeB ='B';
		char gradeC ='C';
		char gradeD ='D';
		char gradeE ='E';
		String gradeU = "U - Fail";
		int mark = 35;	
		if (mark>50 && mark<=60) {
			System.out.println("***Total Marks*** - " +mark);
			System.out.println("***Grade for Marks Scored*** - " +gradeE);
		}
		if (mark>60 && mark<=70) {
			System.out.println("***Total Marks*** - " +mark);
			System.out.println("***Grade for Marks Scored*** - " +gradeD);
		}
		if(mark>70 && mark<=80) {
			System.out.println("***Total Marks*** - " +mark);
			System.out.println("***Grade for Marks Scored*** - " +gradeC);
		}
		if (mark<80 && mark<=90) {
			System.out.println("***Total Marks*** - " +mark);
			System.out.println("***Grade for Marks Scored*** - " +gradeB);
		}
		if (mark<90 && mark<=100) {
			System.out.println("***Total Marks*** - " +mark);
			System.out.println("***Grade for Marks Scored*** - " +gradeA);
		}
		else {
			System.out.println("***Total Marks*** - " +mark);
			System.out.println("***Grade for Marks Scored*** - " +gradeU);
		}
		stud.cgp();
	}
}
