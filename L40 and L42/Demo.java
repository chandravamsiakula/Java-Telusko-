class Human{
    private int age ;           //instance variable 
    private String name;        //instance variable
    public void setAge(int age){
        // Human o1 = new Human();
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
        Human o = new Human();
        // o.age = 20;
        // o.name = "Chandu";
        // System.out.println(o.name + " : "+o.age);
        o.setAge(20);
        o.setName("Chandu");
        System.out.println(o.getName()+" : "+o.getAge());

    }
}