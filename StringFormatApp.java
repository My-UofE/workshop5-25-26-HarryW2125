public class StringFormatApp{
    public static void main(String[] args){
        String name =new String(args[0]);
        int age = Integer.parseInt(args[1]);
        float height = Float.parseFloat(args[2]);
        double spaceHeight = height * 100 *1.023;
        long marsAge = Math.round(age/1.88);

        String nameOutput = String.format("%-20s",name);
        String ageOutput = String.format("%-3d",age);
        String heightOutput = String.format("%-3.2f",height);
        String spaceOutput = String.format("%.1f",spaceHeight);

        System.out.println("name: "+nameOutput + " Age: "+ageOutput + " Height: "+heightOutput+"m");
        System.out.println("My space height would be " + spaceOutput +"cm");
        System.out.println("On Mars I would be approximately " + marsAge + " years old.");

    }
}