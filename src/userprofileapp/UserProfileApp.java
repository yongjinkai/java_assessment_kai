package userprofileapp;

import variables.GENDER_TYPE;
import variables.UserProfile;

public class UserProfileApp {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("kai",18, GENDER_TYPE.MALE,"developer","sg","O+");
//        user.name = "john smith";
//        System.out.println(user.name);
    }
}
