class Demo{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Vyshu");
        // sb.append(" Hello");
        System.out.println(sb.substring(0,5)); // Vyshu
        sb.insert(0,"Chandu ");
        System.out.println(sb); // Chandu Vyshu 
        sb.deleteCharAt(1);
        System.out.println(sb); // Candu Vyshu 
        sb.delete(0,6);
        System.out.println(sb); // Vyshu 




    }
}