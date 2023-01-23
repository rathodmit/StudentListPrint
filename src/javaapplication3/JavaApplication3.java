/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;


public class JavaApplication3 {

    public static void main(String[] args) 
    {
        //store and print the student listjgjg
        Student[] list = new Student[3];  //declaration Array of Object
        Student s1 = new Student();
        s1.setName("Yesha");  //s1 = object
        s1.setAge(19);
        
        Student s2 = new Student();
        s2.setName("Mitali");  //s1 = object
        s2.setAge(20);
        
        Student s3 = new Student();
        s3.setName("Arsh");  //s1 = object
        s3.setAge(30);
        
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName() + " " + list[i].getAge());
            System.out.println();
        }
    }
    
}
