package Builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder
{
    public StudentBuilder setSubjects()
    {
        List<String> list = new ArrayList<>();
        list.add("Economics");
        list.add("Micro Economics");
        list.add("Macro Economics");
        this.subjects=list;
        return this;
    }
}
