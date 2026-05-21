class Mobile{
    int price;
    String name;
    static String model;
    public Mobile(){

        price = 100;
        name = "Mobile";
        System.out.println("In Consructor");
    }
    static {
        model = "Android";
        System.out.println("In Static Block");
        
    }
    public void show(){
        System.out.println(price+" : "+name);
    }
}
class Demo{
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        m1.name = "Apple";
        m1.price = 1000;
        m1.show();
        m2.show();

        
    }

}