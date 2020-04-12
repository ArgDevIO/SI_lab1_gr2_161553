class Faculty {
    List<Student> students;
    String facultyName;

    public Faculty(List<Student> students, String facultyName) {
        this.students = students;
        this.facultyName = facultyName;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public double averageGrade() {
        return this.students
                .stream()
                .mapToDouble(Student::getAverage)
                .average()
                .orElse(-1);
    }
}