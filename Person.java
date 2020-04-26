package kompjuterIya.lesson250420;

//Создать класс Person, который содержит:
//a) поля fullName, age.
//б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то Person говорит".
//в) Добавьте два конструктора - Person() и Person(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).

public class Person {
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String fullName;
    int age;

    public void move() {
        System.out.println("Person " + fullName + " is moving");
    }

    public void talk() {
        System.out.println("Person " + fullName + " is talking");
    }

    public Person(){}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

}
