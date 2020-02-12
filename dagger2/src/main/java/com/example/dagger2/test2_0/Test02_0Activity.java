package com.example.dagger2.test2_0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dagger2.R;
import com.example.dagger2.test2_0.bean.Student;

import javax.inject.Inject;

public class Test02_0Activity extends AppCompatActivity {
    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        两种方法都可以
//        DaggerTest02_1Component.builder().build().inject(this);
//        DaggerTest02_1Component.create().inject(this);


        DaggerTest02_0Component.builder().build().inject(this);


        Test02_0Component test02_0Component = DaggerTest02_0Component.create();
        Student student1 = test02_0Component.getStudent();
        Student student2 = test02_0Component.getStudent();


/*

        student2和student1是两个类


 public final class DaggerTest02_0Component implements Test02_0Component {

  public static Test02_0Component create() {
    return new Builder().build();
  }

//这里每次都创建一个新的
  @Override
  public Student getStudent() {
    return new Student(new Student2());}
}

         */


//        也可以这样获取student
        Student student = DaggerTest02_0Component.builder().build().getStudent();

        Toast.makeText(this, this.student.study(), Toast.LENGTH_SHORT).show();
    }
}
