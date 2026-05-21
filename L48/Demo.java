public class Demo {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        System.out.println(c1.add(1, 2));
        VeryAdvCal c2 = new VeryAdvCal();
        System.out.println(c2.add(4,3)+" "+c2.sub(87,1)+" "+c2.mul(43,2)+" "+c2.div(10,3) + " "+c2.power(2, 3));
    }
    
}
