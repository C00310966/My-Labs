/*
 Name: Cian Howard
 StudentID: C00310966
 */

package lab6;

import java.util.Arrays;

public class Student extends Person{ //establishes inheritance

private int numCourses = 0;
private String[] courses = new String[10];
private int[] grades = new int[10];

public Student(String name, String address) {
	super(name, address); //creates student using Person variables
	
}

public void addCourseGrade(String course, int grade) {//adds grade and course to arrays then increments count
	courses[numCourses] = course;
	grades[numCourses] = grade;
	numCourses++;
}

public void printGrades() {
	for(int i = 0; i < numCourses; i++)//uses for loop to print course followed by grade
	{
		System.out.print(courses[i] +":" +grades[i] + " ");
	}
}

public double getAverageGrade() {
	int gradeTotal = 0;
	for (int i = 0; i < numCourses; i ++)
	{
		gradeTotal += grades[i];//calculates grade total
	}
	return gradeTotal/numCourses; //returns the gradeTotal divided by number of classes to get average
}

@Override
public String toString() { //prints courses and grades
	return "Student [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + ", grades="
			+ Arrays.toString(grades) + "]";
}






	
}
