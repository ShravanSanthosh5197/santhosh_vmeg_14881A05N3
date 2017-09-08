import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	LinkedList<Student> lists;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		this.lists=new LinkedList<Student>(Arrays.asList(students));
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		Student[] stu1=new Student[students.length] ;
		for(int x=0;x<students.length;x++)
		{
			stu1[x]=students[x];
		}
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		Student[] stu1=new Student[students.length];
		for (int x=0;x<students.length ;x++ )
		 {
			lists.add(x);
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		lists.add(index,student);
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		lists.addFirst(student);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		lists.addLast(student);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		lists.add(student);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		lists.remove(index);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		lists.remove(student);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		lists.removeRange(index,lists.size());
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		lists.removeFromElement(student);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		lists.removeToIndex(index);
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		lists.removeToElement(student);

	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Collections.sort(lists);
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return get(date);
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return get(firstDate,lastDate);
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return get(date,days);
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		Collections.sort(date);
		Date[] d1=new Student[students.length];
		for (int x=0;x<students.length ;x++ ) 
		{
			lists.getCurrentAgeByDate(d1);
		}
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return get(age);
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return student;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return student;
	}
}
