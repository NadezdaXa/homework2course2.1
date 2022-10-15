import Person.Person;

import java.util.Arrays;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        //задание 5
        int value = 33;
        changeValue(value);
        System.out.println(value);

        //задание 6
        Integer val = 33;
        changeValue(val);
        System.out.println(val);

        //задание7
        Integer[] integers = new Integer[]{3, 4};
        changeValue(integers);
        Arrays.stream(integers).forEach(System.out::println);
        System.out.println();

        //задание 8
        Integer[] numbers = new Integer[]{3, 4};
        changeValue1(numbers);
        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println();

        //задание 9
        Person person  = new Person ("Иван", "Иванов");
        changePerson(person);
        System.out.println(person);

        //задание 10
        person  = new Person ("Иван", "Иванов");
        changePerson1(person);
        System.out.println(person);



    }

    static void changeValue(int value) {
        value = 22;
    }

    static void changeValue(Integer value) {
        value = 22;
    }

    static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    static void changeValue1(Integer[] value) {
        value[0]=99;

    }
    static void changePerson (Person person){
        person=new Person("Иван", "Иванов");

    }
    static void changePerson1 (Person person){
        person.setName("Иван");
        person.setSurname("Иванов");
    }


}

