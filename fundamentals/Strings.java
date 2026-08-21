package fundamentals;

public class Strings {

    public static void main(String[] args) {
        String name = new String("Lakshay");
        System.out.println(name);
        System.out.println(name.length());


        String surname = "Sharma";
        System.out.println(name + " " + surname);


        System.out.println(name.charAt(3));
        // System.out.println(name.charAt(7));  // error

        String name2 = name.replace('a', 'b');
        System.out.println(name2);


        String name3 = name.substring(1, 4);
        System.out.println(name3);
        
    }

}
