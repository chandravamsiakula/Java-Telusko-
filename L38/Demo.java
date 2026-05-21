class Car{
    int price;
    String brand;
    static String model;
    public void show(){
        System.out.println(brand+" : "+price+" : "+model);
    }
    public static void display(Car c1){
        System.out.println(c1.brand+" : "+c1.price+" : "+model);

    }

}

class Demo{
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        c1.price = 1000000;
        c1.brand = "Audi";
        Car.model = "Car";
        c2.price = 800000;
        c2.brand = "Thar";
        c1.show();
        c2.show();
        Car.display(c1);

        /*  ---why main method must consists of static---
        we need to run main method first when ever 
        we dont create a object how can we run main method
        thats why we declare static keyword to run main
        method





        */



        
    }
}