package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labList;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labList = labs;

    }

    public Lab getLab(String labName) {
        for (int i = 0; i < labList.size(); i++) {
            if (labList.get(i).getName().equals(labName)) {
                return labList.get(i);
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        lab.setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labList.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        for (int i = 0; i < labList.size(); i++) {
            if (labList.get(i).getName().equals(labName)) {
                return labList.get(i).getStatus();
            }
        }
        return null;
    }



}
