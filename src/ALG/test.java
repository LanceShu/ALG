package ALG;

import java.util.LinkedHashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {

        LinkedHashMap<Integer,Integer> hashMap = new LinkedHashMap<>(0,1.0f,true);
        hashMap.put(0,0);
        hashMap.put(1,1);
        hashMap.put(2,2);
        hashMap.put(3,3);
        hashMap.put(4,4);
        hashMap.put(5,5);

        hashMap.get(1);
        hashMap.get(2);


        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
