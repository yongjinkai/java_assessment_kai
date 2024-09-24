package variables;



public class UserProfile{

     String name;
    int age;
    public GENDER_TYPE gender;
    String job_pref;
    String nationality;
    String bloodtype;

    public UserProfile(String name, int age, GENDER_TYPE gender, String job_pref, String nationality, String bloodtype) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job_pref = job_pref;
        this.nationality = nationality;
        this.bloodtype = bloodtype;
    }

    public UserProfile() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public GENDER_TYPE getGender() {
        return gender;
    }

    public String getJob_pref() {
        return job_pref;
    }

    public String getNationality() {
        return nationality;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(GENDER_TYPE gender) {
        this.gender = gender;
    }

    public void setJob_pref(String job_pref) {
        this.job_pref = job_pref;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }
}

