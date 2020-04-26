package kompjuterIya.lesson250420.homeWork250420;

import kompjuterIya.lesson250420.Person;

public class Main1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFullName("Eva");
        person1.setAge(18);
        person1.move();
        person1.talk();
        System.out.println("Hi! My name is "+person1.getFullName()+", I'm "+person1.getAge()+"\n");

        Person person2 = new Person("Ivan",32);
        person2.talk();
        System.out.println("Hi! My name is "+person2.getFullName()+", I'm "+person2.getAge());
        person2.move();

    }
}
