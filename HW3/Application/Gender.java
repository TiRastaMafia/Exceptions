package Application;

public class Gender {
    private String gender;

    public Gender(String userSex){
        if (userSex.toLowerCase().equals("f") || userSex.toLowerCase().equals("m")){
            this.gender = userSex.toLowerCase();
        }
    }

    @Override
    public String toString() {
        return gender;
    }

    public String getGender() {
        return gender;
    }

    
}
