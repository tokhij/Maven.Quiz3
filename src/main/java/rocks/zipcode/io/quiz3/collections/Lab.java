package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String labname;
    LabStatus labStatus;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labname = labName;
    }

    public String getName() {
        return labname;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
        return labStatus;
    }
}
