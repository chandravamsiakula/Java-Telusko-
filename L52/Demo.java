class A{
    public void show(){
        System.out.println("This is in A class");
    }

}
class B extends A{
    public void show(){
        System.out.println("This in in B class it overrides A class");
    }

}


class Demo{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }

}