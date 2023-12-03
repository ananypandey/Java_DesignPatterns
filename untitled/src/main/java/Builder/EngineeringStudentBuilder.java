package Builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> list = new ArrayList<>();
        list.add("DSA");
        list.add("OS");
        list.add("Computer Network");
        this.subjects=list;
        return this;
    }
}
