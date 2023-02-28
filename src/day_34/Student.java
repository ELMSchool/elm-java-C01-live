package day_34;

import java.io.IOException;

public class Student  {
    
    protected int age;

    public int getAge() {
       return this.age;
    }
    public void setAge(int age)  {
           if (age >= 18) {
                  this.age = age;
      } else {
             this.age = 0;
               
       }
    }
    
}