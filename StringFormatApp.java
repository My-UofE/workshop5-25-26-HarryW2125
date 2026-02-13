public class StringFormatApp{
    public static void main(String[] args){
        String name =new String(args[0]);
        int age = Integer.parseInt(args[1]);
        float height = Float.parseFloat(args[2]);
        System.out.println("name: "+name+" Age: "+age+" Height: "+height +"m");

    }
}