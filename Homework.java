// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Пусть дан список сотрудников:Иван Иванов (и остальные)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

// Иван Иванов 88001122333
// Иван Курицин 88001662333
// Иван Курицин 88001112333
// Иван Незлобин 88001122432
// Сергей Потапов 88001112453
// Сергей Потапов 8800163214
// Сергей Курицин 8800142421
// Михаил Незлобин 880012343
// OutPut
// Иван - 3
// Сергей - 2
// Потому как если один сотрудник имеет 2 или более номера , его имя считаем 1 раз

import java.util.Arrays;
import java.util.HashSet;

public class Homework {
   
   
    public static void main(String[] args) {
        Subscriber s1 = new Subscriber();
        s1.firsName = "Иван";
        s1.lastName = "Иванов";
        s1.phoneNumber = 880011223;
        s1.id = 56;

        Subscriber s2 = new Subscriber();
        s2.firsName = "Иван";
        s2.lastName = "Курицин";
        s2.phoneNumber = 880016623;
        s2.id = 69;

        Subscriber s8 = new Subscriber();
        s2.firsName = "Иван";
        s2.lastName = "Курицин";
        s2.phoneNumber = 880011123;
        s2.id = 69;

        Subscriber s3 = new Subscriber();
        s3.firsName = "Иван";
        s3.lastName = "Незлобин";
        s3.phoneNumber = 880011224;
        s3.id = 561;

        Subscriber s4 = new Subscriber();
        s4.firsName = "Сергей";
        s4.lastName = "Потапов";
        s4.phoneNumber = 880011124;
        s4.id = 156;

        Subscriber s5 = new Subscriber();
        s5.firsName = "Сергей";
        s5.lastName = "Потапов";
        s5.phoneNumber = 880016321;
        s5.id = 516;

        Subscriber s6 = new Subscriber();
        s6.firsName = "Сергей";
        s6.lastName = "Курицин";
        s6.phoneNumber = 880014242;
        s6.id = 586;

        Subscriber s7 = new Subscriber();
        s7.firsName = "Михаил";
        s7.lastName = "Незлобин";
        s7.phoneNumber = 880012343;
        s7.id = 576;

        System.out.println(s1.toString()); // В
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);

        System.out.println(s2 == s8);
        System.out.println(s2.equals(s8));
        var Subscriber = new HashSet<Subscriber>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8)); // Создаем колекцию наших Worker
        System.out.println(Subscriber.contains(s8));
    }
}

