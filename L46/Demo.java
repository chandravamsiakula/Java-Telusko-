class Human{
    int age = 20;
    String name = "Chandu";
    public Human(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("In object");
    }   
}


class Demo{
    public static void main(String[] args) {
        new Human().show();



    }

}
