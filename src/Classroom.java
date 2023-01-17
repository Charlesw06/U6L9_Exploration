public class Classroom
{
    private Student[] classRoster;

    public Classroom(int numStudents)
    {
        classRoster = new Student[numStudents];
    }

    // getter method: returns a reference to classRoster array
    public Student[] getClassRoster()
    {
        return classRoster;
    }

    public boolean addStudent(Student student)
    {
        for (int i = 0; i < classRoster.length; i++) {
            if (classRoster[i] == null) {
                classRoster[i] = student;
                return true;
            }
        }
        return false;
    }

    public double classExamAverage()
    {
        double sum = 0;
        int examNum = 0;
        for (Student student : classRoster) {
            if (student != null) {
                for (int score : student.getExamScores()) {
                    sum += score;
                    examNum++;
                }
            }
        }
        return sum / examNum;
    }

    public void printRoster()
    {
        for (Student student : classRoster) {
            if (student != null) {
                System.out.println(student.getLast() + ", " + student.getFirst());
            }
        }
    }
}