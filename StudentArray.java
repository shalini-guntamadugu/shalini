import java.util.Date;

/**
 * An interface that provide a number of operations for any array of students
 *
 */
public interface StudentArrayOperation {

	/**
	 * Returns the array of students
	 * 
	 * @return the array of students
	 * 
	 */
	Student[] getStudents();
	

	/**
	 * Sets the array of students
	 * if students == null method should throw IllegalArgumentException
	 *
	 * @param students
	 * 
	 * @throws IllegalArgumentException
	 */
	void setStudents(Student[] students);
	

	/**
	 * if index lower than 0 or index higher/equal students.length method should
	 * throw IllegalArgumentException
	 *
	 * @param index
	 */
	Student getStudent(int index);

	
	/**
	 * Replaces the element at the specified position in this array with the
	 * specified element. if student == null method should throw
	 * IllegalArgumentException if index lower than 0 or index higher/equal
	 * students.length method should throw IllegalArgumentException
	 *
	 * @param student
	 *            the student to be stored at the specified position
	 * @param index
	 *            the index of the element to replace
	 * 
	 * 
	 * @throws IllegalArgumentException
	 */
	void setStudent(Student student, int index);

	
	/**
	 * Appends the specified element to the specified position of this array if
	 * student == null method should throw IllegalArgumentException if index
	 * lower than 0 or index higher/equal students.length method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element to be appended to this array at the specified
	 *            position
	 * @param index
	 *            the specified position
	 * 
	 * @throws IllegalArgumentException
	 */
	void add(Student student, int index);

	
	/**
	 * Inserts the specified element at the beginning of this array if student
	 * == null method should throw IllegalArgumentException
	 *
	 * @param student
	 *            the element to add
	 * 
	 * @throws IllegalArgumentException
	 */
	void addFirst(Student student);
	

	/**
	 * Appends the specified element to the end of this array. if student ==
	 * null method should throw IllegalArgumentException
	 *
	 * @param student
	 *            the element to add
	 * 
	 * @throws IllegalArgumentException
	 */
	void addLast(Student student);
	

	/**
	 * Removes the element at the specified position in this array if index
	 * lower than 0 or index higher/equal students.length method should throw
	 * IllegalArgumentException
	 *
	 * @param index
	 *            the index of the element to be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void remove(int index);
	

	/**
	 * Removes the first occurrence of the specified element from this array, if
	 * it is present. If this array does not contain the element, it is
	 * unchanged and should throw IllegalArgumentException with "Student not
	 * exist" message if student == null method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element to remove
	 * 
	 * @throws IllegalArgumentException
	 */
	void remove(Student student);

	
	/**
	 * Removes all elements from the specified index (except the element with
	 * specified index) from this array if index lower than 0 or index
	 * higher/equal students.length method should throw IllegalArgumentException
	 *
	 * @param index
	 *            the index elements from should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeFromIndex(int index);

	
	/**
	 * Removes all elements from the specified element (except the specified
	 * element) from this array if student == null method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element from elements should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeFromElement(Student student);

	
	/**
	 * Removes all elements to the specified index (except the element with the
	 * specified index) from this array if index lower than 0 or index
	 * higher/equal students.length method should throw IllegalArgumentException
	 *
	 * @param index
	 *            the index elements to should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeToIndex(int index);

	
	/**
	 * Removes all elements to the specified element (except the specified
	 * element) from this array if student == null method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element to elements should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeToElement(Student student);
	

	/**
	 * Performs Bubble Sort to this array
	 *
	 */
	void bubbleSort();

	
	/**