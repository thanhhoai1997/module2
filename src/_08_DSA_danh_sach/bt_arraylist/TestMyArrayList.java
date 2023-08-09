package _08_DSA_danh_sach.bt_arraylist;

import _08_DSA_danh_sach.th_trienkhai_lopList.MyList;

import java.util.Objects;

public class TestMyArrayList {
    static class Person{
        String name;
        int Age;

        public Person(String name, int age) {
            this.name = name;
            Age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", Age=" + Age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Age == person.Age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, Age);
        }
    }
    public static void main(String[] args) {
       MyArrayList <Person> myArrayList = new MyArrayList<>(2);
       myArrayList.ensureCapacity(5);
       myArrayList.add(new Person("hoai",18));
        myArrayList.add(new Person("hong",19));
        myArrayList.add(new Person("hoai",120));
        myArrayList.add(new Person("thanh", 19), 2);
        myArrayList.remove(2);
        MyArrayList<Person> list = myArrayList.clone();
        for (int i = 0; i < myArrayList.size();i++){
            System.out.println(myArrayList.get(i).toString());
        }
        System.out.println(myArrayList.indexOf(new Person("hoai",18)));



    }

}
