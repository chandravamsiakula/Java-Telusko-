public class Demo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
    //  className  objname = keyword  Construtor()
        //calling behavior
        System.out.println(c.add(1,2));
    }
    
}
class Calculator{
    int a = 10;
    public int add(int n1, int n2){
        return n1+n2;
    }
}
