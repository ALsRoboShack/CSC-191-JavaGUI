package csc191guilab;

/**
 * Simple data model used by the GUI lab.
 * Students may extend this class during the bonus task.
 */
public class RegistrationModel {
    private String name = "";
    private String email = "";
    private String classStanding = "";
    private String attendanceMode = "";
    private boolean javaWorkshop;
    private boolean aiWorkshop;
    private boolean networkingWorkshop;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassStanding() {
        return classStanding;
    }

    public void setClassStanding(String classStanding) {
        this.classStanding = classStanding;
    }

    public String getAttendanceMode() {
        return attendanceMode;
    }

    public void setAttendanceMode(String attendanceMode) {
        this.attendanceMode = attendanceMode;
    }

    public boolean isJavaWorkshop() {
        return javaWorkshop;
    }

    public void setJavaWorkshop(boolean javaWorkshop) {
        this.javaWorkshop = javaWorkshop;
    }

    public boolean isAiWorkshop() {
        return aiWorkshop;
    }

    public void setAiWorkshop(boolean aiWorkshop) {
        this.aiWorkshop = aiWorkshop;
    }

    public boolean isNetworkingWorkshop() {
        return networkingWorkshop;
    }

    public void setNetworkingWorkshop(boolean networkingWorkshop) {
        this.networkingWorkshop = networkingWorkshop;
    }

    public void clear() {
        name = "";
        email = "";
        classStanding = "";
        attendanceMode = "";
        javaWorkshop = false;
        aiWorkshop = false;
        networkingWorkshop = false;
    }
}
