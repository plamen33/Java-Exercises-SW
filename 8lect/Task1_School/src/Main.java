

public class Main {
    public static void main(String[] args) {
        Class a = new Class("A");
        a.students.add(new Student("Ivancho", 12));
        a.students.add(new Student("Peturcho", 345));
        a.students.add(new Student("Momchill", 112));

        a.teachers.add(new Teacher("Georgi Ivanoff"));

        Teacher t = new Teacher("John Stateman");
        t.disciplines.add(new Discipline("History", 3));
        t.disciplines.add(new Discipline("Mathematics", 12));
        a.teachers.add(t);

        System.out.println("Class: " + a.getClassName());
        System.out.println("Students: ");
        a.students.forEach(nb -> System.out.println(nb.studentName+" - student Number: " + nb.studentNumber));
        System.out.println();
        System.out.println("All Teachers: ");
        a.teachers.stream().map(x->x.teacherName+", ").forEach(System.out::print);
        System.out.println();
        System.out.println("Teachers: ");
        for (Teacher teacher:a.teachers) {
            System.out.println(teacher.teacherName);
            System.out.println("Disciplines:");
            if(teacher.disciplines.size() == 0){
                System.out.println("No data for current teacher");
                continue;
            }
            for (Discipline d: teacher.disciplines) {
                System.out.println(d.disciplineName + ": " +d.hoursPerWeek+" hours per week");
            }
        }


    }
}
