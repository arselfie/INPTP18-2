package cz.upce.fei.inptp.zz.entity;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private List<CourseAction> actions;

    public Teacher() {
        actions = new ArrayList<>();
    }

    public List<CourseAction> getActions() {
        return actions;
    }

    public void setActions(List<CourseAction> actions) {
        this.actions = actions;
    }
}
