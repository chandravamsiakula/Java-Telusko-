class Mobile{
    String company;
    int price;
    static String name;
    public void show(){
        System.out.println(company+" : "+price+" : "+name);
    }
}

public class Demo {
    public static void main(String[] args) {
        Mobile o1 = new Mobile();
        o1.company = "Apple";
        o1.price = 100000;
        Mobile.name = "SmartPhone";
        Mobile o2 = new Mobile();
        o2.company = "Samsung";
        o2.price = 140000;
        // Mobile.name = "AndroidPhone";
        Mobile o3 = new Mobile();
        o3.company = "Moto";
        o3.price = 50000;
        // Mobile.name = "AndroidPhone"; 
        o1.show();
        o2.show();
        o3.show();
    }
    
}
