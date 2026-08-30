import java.util.ArrayList;

public class ArrayListCRUD {

    public static void main(String[] args) {
        
        ArrayList<String> a = new ArrayList<>(); 

        
    
        a.add("Gaurav");
        a.add("Nidhi");
        a.add("Eesha");
        a.add("Prince");
        a.add("Kavya");
        for(String i: a) {
            System.out.println(i);
        }

        String b = a.get(2);
        System.out.println(b);

        a.set(2, "Kajal");

        a.remove("Nidhi");
        int size = a.size();
        System.out.println(size);

        for(String i: a) {
            System.out.println(i);
        }


    }



    
}
