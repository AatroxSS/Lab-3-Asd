public class Student {
    private String lastName;
    private String firstName;
    private int course;
    private long studentId;
    private boolean militaryService;

    public Student(String lastName, String firstName, int course, long studentId, boolean militaryService) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.course = course;
        this.studentId = studentId;
        this.militaryService = militaryService;
    }

    public long getKey() {
        return studentId;
    }

    public String toString() {
        return String.format("%-12s %-10s %d курс    %d    %s",
                lastName, firstName, course, studentId,
                militaryService ? "served" : "not served");
    }
}
