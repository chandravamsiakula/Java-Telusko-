class Human{
    private int age ;           //instance variable 
    private String name;        //instance variable

    public Human(){     //default constructor
        age = 12;
        name = "John";
    }
    public Human(int age,String name){      //parametrized constructor
        this.age = age;
        this.name = name;
    }
    public Human(String name){
        this.name = name;
    }
    public Human(int age){
        this.age = age;
    }



    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
class Demo{
    public static void main(String[] args) {
        Human o1 = new Human();
        System.out.println(o1.getName()+" : "+o1.getAge());
        Human o2 = new Human(20,"Chandu");
        System.out.println(o2.getName()+" : "+o2.getAge());
        Human o3 = new Human(30);
        System.out.println(o3.getName()+" : "+o3.getAge());
        Human o4 = new Human("Vamsi");
        System.out.println(o4.getName()+" : "+o4.getAge());


    }
}