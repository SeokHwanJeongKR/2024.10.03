package memberConstruct;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1,"석환",30,80);

        MemberInit member2 = new MemberInit();
        initMember(member2, "Ceren" , 30 , 100);

    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
        System.out.println("이름 : " + member.name + "나이 : " + member.age + " 성적 : " + member.grade);
    }
}
