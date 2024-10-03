package Construct;

public class Constructor {
    String name;
    int age;
    int grade;

    Constructor(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

        System.out.println("이름 : " + name + "나이 : " + age + " 성적 : " + grade);
    }
}