package oop;

import variables.UserProfile;

public class Main {
    int x = 5;
    int y = 0;
    public Main() {
    }

    public Main(int x) {
        this.x = x;
    }

    public Main(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);

        Main myObj2 = new Main(10);
        System.out.println(myObj2.x);


        Main myObj3 = new Main(15,15);
        System.out.println(myObj3.x + " " + myObj3.y);

        UserProfile myObj4 = new UserProfile();

    }
}
