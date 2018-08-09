public class ClassAndObjects{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setUser("Aika");


        System.out.println("Get user name: "+person1.getUser());

        person1.setAge(23);

        System.out.println("Get user age: "+ person1.getAge());


//        person1.age = 23;
        person1.speak();
    }
}
