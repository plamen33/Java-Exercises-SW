import java.util.ArrayList;
import java.util.List;

public class Class {
    private String className;
    List<Student> students = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();

    Class(String c){
        this.className = c;
    }

    String getClassName() {
        return className;
    }

    void setClassName(String className) {
        this.className = className;
    }

}
