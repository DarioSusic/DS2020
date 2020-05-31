package homework.nine.bst;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		String path = "C:\\Users\\Dario Susic\\Desktop\\Global_University_Students.csv";
		
		ArrayList<Student> studentList = new ArrayList<>();
		ReadFromFile.readCSV(path, studentList);
		Student[] arrObjects = studentList.toArray(new Student[studentList.size()]);
		
		
		BinarySearchTree<Integer, Student> bst = new BinarySearchTree<Integer, Student>();
		
		for (Student student : arrObjects) {
			bst.put(student.getStudentID(), student);
		}
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);	//System.in is a standard input stream
		System.out.print("Enter the studen ID you want to search: ");
		String str= sc.nextLine();				//reads string		
		
		System.out.println(bst.get(Integer.parseInt(str)));			// 5
		System.out.println("Number of steps: " + bst.steps());
	}

}

