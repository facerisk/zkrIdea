package test.平安;

import test.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 利用Collections类 排序
 */
public class ListTest {
    public static void main(String [] args){
        List<Person> plist = new ArrayList<Person>();
        plist.add(new Person("lpl2","北京1",12));
        plist.add(new Person("lpl4","北京3",12));
        plist.add(new Person("lpl3","北京2",15));
        plist.add(new Person("lpl1","北京4",14));
        //根据年龄
        Collections.sort(plist, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                int i = o1.getAge() - o2.getAge();
                if(i == 0){
                    return o2.getAdrr().compareTo(o1.getAdrr());
                }
                return i;
            }
        });

        for(Person p : plist){
            System.out.println(p.getAdrr()+" " +p.getAge()+" "+ p.getName());
        }
        System.out.println("=======================");
//根据地址
        Collections.sort(plist, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                int i = o1.getAdrr().compareTo(o2.getAdrr());
                if(i == 0){
                    return 0;
                }
                return i;
            }
        });
        for(Person p : plist){
            System.out.println(p.getAdrr()+" " +p.getAge()+" "+ p.getName());
        }



    }
}
