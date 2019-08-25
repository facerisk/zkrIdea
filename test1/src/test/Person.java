package test;

public class Person {
    public Person(String name,String adrr,int age){
        this.adrr =adrr;
        this.age = age;
        this.name = name;
    }
    private  String name;
    private String adrr;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdrr() {
        return adrr;
    }

    public void setAdrr(String adrr) {
        this.adrr = adrr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
