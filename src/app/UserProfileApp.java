package app;

import variables.GENDER_TYPE;
import variables.UserProfile;

class UserProfileApp{
    public static void main(String[] args) {
        UserProfile user = new UserProfile("kai",21, GENDER_TYPE.MALE,"FSD","singaporean","O+");
        System.out.println(user.getNationality());
    }
}