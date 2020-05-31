package homework.nine.rbt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

public class ReadFromFile {

	public static void readCSV(String filePath, List<Student> studentList) {
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new FileReader(filePath));
			System.out.println("Loading File");
			
			while ((line = br.readLine()) != null) {

				StringTokenizer stringTokenizer = new StringTokenizer(line, ";");
				Student student = new Student();
				
				while (stringTokenizer.hasMoreElements()) {
					student.setStudentID(Integer.parseInt(stringTokenizer.nextElement().toString()));
					student.setStudentName(stringTokenizer.nextElement().toString());
					student.setDOB(stringTokenizer.nextElement().toString());
					student.setUniversityName(stringTokenizer.nextElement().toString());
					student.setDepartmentCode(stringTokenizer.nextElement().toString());
					student.setDepartmentName(stringTokenizer.nextElement().toString());
					student.setYearOfEnrolment(Integer.parseInt(stringTokenizer.nextElement().toString()));
				}
				studentList.add(student);
				
			}

			System.out.println("Successfully completed");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}