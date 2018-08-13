package com.egedev.metodlarveclasslar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("application started");
        test();
        System.out.println(math(3,4));
        makeMusicians();
        makeSimpsons();
    }

    public void test(){
        int x = 4+4;
        System.out.println("current x values is:" + x);

    }

    public int math(int a, int b){
        return a + b;

    }

    public void makeMusicians(){
        Musician ali = new Musician("Ali", "Saz", 31);

    }

    public void makeSimpsons(){
        Simpsons homer = new Simpsons("Homer Simpson", 40,"Nuclear Chief");
        System.out.println(homer.getName());

    }

    public void makeBlog(){
        Blog egedev = new Blog("Ege'nin Geliştirici Blogu", "https://egedev.wordpress.com", "1234", 15);
        System.out.println(egedev.getTitle());
    }

}
