package abstruction;
class Course {
    void course_details() {
        System.out.println("we are learning multiple courses of CSE this semester");
    }
}
class Discrete_Mathematics extends Course {
    void course_details() {
        System.out.println("we are learning multiple chapters of discrete mathematics this semester");
    }
}
class C_Plus_Plus extends Course {
    void course_details() {
        System.out.println("we are learning various applications of C++ this semester");
    }
}
public class CourseMain {
    public static void main(String[] args) {
        Course c = new Discrete_Mathematics();
        c.course_details();
        Discrete_Mathematics d = new Discrete_Mathematics();
        d.course_details();
        C_Plus_Plus cplus = new C_Plus_Plus();
        cplus.course_details();
    }
}
