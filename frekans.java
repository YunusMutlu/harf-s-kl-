import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frekans {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Cümle gir:");
        String cumle=inp.nextLine();

        Map<Character,Integer> frekans = new HashMap<Character,Integer>();
        for (int i=0;i<cumle.length();i++){
            char c = cumle.charAt(i);
            if(frekans.containsKey(c)){
                frekans.replace(c,frekans.get(c)+1);
                if (cumle.charAt(i)==cumle.toUpperCase().charAt(i)){
                    frekans.replace(c,frekans.get(c)+1);
                }
            }

            else {frekans.put(c,1);}
        }
        for (Map.Entry<Character,Integer> entry:frekans.entrySet()){
            System.out.println(entry.getValue()+" "+entry.getKey());

        }


    }
}
