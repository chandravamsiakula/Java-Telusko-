class A{
    // public void show(){
    //     System.out.println("In Parent Class");
    // }
    public A(){
        System.out.println("In A class");
    }
        
    public A(int n){
        System.out.println("In A Int");
    }


}



class B extends A{
    // public void show(){
    //     System.out.println("In Child class");
    // }
    public B(){

        System.out.println("In B class"); 
    }
    public B(int n){
        // this();
        super(n);
        System.out.println("In B int");
    }
    

}



class Demo{
    public static void main(String[] args) {
        B obj = new B(3);
        
    }
}