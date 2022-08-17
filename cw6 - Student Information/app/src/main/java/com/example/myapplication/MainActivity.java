package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> studentArrayList = new ArrayList<>();
    int currentStudent = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView studentImgView = findViewById(R.id.imageView);
        Button btn = findViewById(R.id.button);
        TextView stuInfo = findViewById(R.id. stuInfo);


        TextView name = findViewById(R.id.Name);
        TextView stuName = findViewById(R.id.stuName);

        TextView age = findViewById(R.id.Age);
        TextView stuAge = findViewById(R.id.stuAge);

        TextView grade = findViewById(R.id.Grade);
        TextView stuGrade = findViewById(R.id.stuGrade);


        // // // // // // // // // // //



        Student student1 = new Student("Tom in the home", 17, 11, R.drawable.tomy);

        Student student2 = new Student("Jack can hack", 15, 10, R.drawable.jack);

        Student student3 = new Student("Skyler", 13, 8, R.drawable.ss);

        Student student4 = new Student("Suzie", 16, 10, R.drawable.suzie);


        // // // // // // // // // // //


        studentArrayList.add(student1); // 0
        studentArrayList.add(student2); // 1
        studentArrayList.add(student3); // 2
        studentArrayList.add(student4); // 3


        // // // // // // // // // // //




        studentImgView.setImageResource(studentArrayList.get(currentStudent).getStudentImg());
        stuName.setText(studentArrayList.get(currentStudent).getStudentName());
        stuAge.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
        stuGrade.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStudent++;

                if(currentStudent == studentArrayList.size()){

                    currentStudent = 0;
                }





                studentImgView.setImageResource(studentArrayList.get(currentStudent).getStudentImg());
                stuName.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentName()));
                stuAge.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
                stuGrade.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));

            }
        });

    }
}
