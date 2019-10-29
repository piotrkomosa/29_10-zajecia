package demo1;

public class PersonTest {

    public static void main(String[] args) {

//        Person person1= new Person("mateusz", "nowak",28,920820760);
//        Person person2= new Person("mateusz", "nowak",28,920820760);
//        Person person3= new Person("michal", "kowal",27,930325024);
//
//
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
//
//        System.out.println(person1.equals(person2));
//        System.out.println(person2.equals(person3));


        Adress adress1 = new Adress("worclaw","dluga","5a");
        Adress adress2 = new Adress("worclaw","krakowska","7b");

        Person person1 = new Person("olek","mazur",12356, 20,adress1);
        Person person2 = new Person("olek","mazur",12356, 20,adress1);
        Person person3 = new Person("michal","pakula",242542, 22,adress2);


        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person2.equals(person3));

    }
}
