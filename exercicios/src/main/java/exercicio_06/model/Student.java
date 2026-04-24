package exercicio_06.model;

public class Student {
    public Integer studentId;
    private String studentName;
    private Double grade;

    public Student () {
        this(0, "Unknown", 0.0);
    }

    public Student(Integer studentId, String studentName, Double grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Registro (ID): " + studentId +
                ", Nome: " + studentName +
                ", Nota: " + grade;
    }
}
