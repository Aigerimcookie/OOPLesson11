public class Person {
    private String user;
    private int age;

    public void setUser(String username){
        user = username;
    }

    public String getUser(){
        return user;
    }

    public void setAge (int userage){
        age = userage;
    }

    public int getAge(){
        return age;
    }

    int CalculateYears(){
        int years = 65 - age;
        return years;
    }

    void speak(){
        for(int i =0; i<3; i++){
            System.out.println("My name is "+user+"I am"+age+"years old");
        }
    }

    void say(){
        System.out.println("Hello");
    }
}

