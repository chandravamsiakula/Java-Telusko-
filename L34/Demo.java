public class Demo {
    public static void main(String[] args) {
        String name = new String("Chandu");
        System.out.println(name);
        String n1 = "Chandu";
        String n2 = "Chandu";
        System.out.println(name.hashCode());
        System.out.println(n1.hashCode());
        System.out.println(name == n1);

        // System.out.println("Before  modfiying n2");

        // System.out.println(n2.hashCode());
        n2 = n2+" Chandra";
        // System.out.println(n2 == n1);
        // System.out.println(n1.hashCode());
        // System.out.println("After modfiying n2");
        // System.out.println(n2.hashCode());

        // System.out.println(name.hashCode());
        // System.out.println(name == n1);


    }

    
}
