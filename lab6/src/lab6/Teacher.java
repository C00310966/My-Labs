/*
 Name: Cian Howard
 StudentID: C00310966
 */
package lab6;

public class Teacher extends Person {

	private int numCourses;
	private String[] courses = new String[10];
	
	public Teacher(String name, String address) {
		super(name, address);
	}
	
	public boolean addCourse(String course) {
		if (numCourses < courses.length)
		{
			courses[numCourses] = course;
			numCourses++;
			return true; 
			
		}
		return false;
		
	}

	public boolean removeCourse(String course) {
		for(int i=0; i < numCourses; i++) {
			if (courses[i].equals(course) )
			{
				courses[i] = "";
				for( int j = i; j < numCourses; j++)
				{
					courses[j] = courses[j+1];
				}
				numCourses--;
				return true;
			}
		}
		return false;
	}
	
	

}
