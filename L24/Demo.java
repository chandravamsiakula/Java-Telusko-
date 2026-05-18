class Calculator{
    int a;
    public void playMusic(){
        System.out.println("Music is Playing");
    }
    public String giveMeAPen(int cost){
        if(cost >= 10){
            return "Take the Pen";
        }
        return "Nothing";
    }
}

class Demo{
    public static void main(){
        Calculator c = new Calculator();
        c.playMusic();
        System.out.println(c.giveMeAPen(2));
        System.out.println(c.giveMeAPen(10));


    }
}