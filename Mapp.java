import java.util.Map;
import java.util.HashMap;
public class Mapp {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Preetham", 100);
        students.put("Gowtham", 99);
        students.put("JayaAkka", 99);
        students.put("Srichand", 27);
        students.put("Samritha", 99);
        
        for(String key:students.keySet()){
            System.out.println(key+ " : "+ students.get(key));
        }


        // System.out.println(students.get("Preetham"));
        
    }
}
