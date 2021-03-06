package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course {
        
    @Override
    public void getCourseName() {
        System.out.println("Course Name:    Advanced Java Programming");
    }

    @Override
    public void getCourseNumber() {
        System.out.println("Course Number:  " + 20135);
    }

    @Override
    public void getCredits() {
        System.out.println("Credits:    "+4);
    }

    @Override
    public void getPrerequisites() {
        System.out.println("Prerequisites:  Introduction to Programming, Java Programming");
    }
    
}
