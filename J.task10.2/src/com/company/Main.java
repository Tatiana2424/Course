package com.company;
import java.util.HashMap;
import java.util.Map;

public class Main {


/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/
public static HashMap<String, String> PersonMap()
{
    //напишите тут ваш код
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("Afford","Bob");
    map.put("Albin","Hanna");
    map.put("Bacote","Hope");
    map.put("Axon","Flora");
    map.put("Ball","Bob");
    map.put("Bason","David");
    map.put("Taylor","Maria");
    map.put("Bason","Anna");
    map.put("Kendle","Frank");
    map.put("Lainson","Robyn");

    return map;
}

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> s : copy.entrySet())
        {
            for (Map.Entry<String, String> s2 : copy.entrySet())
            {
                if(s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())) removeItemFromMapByValue(map,s.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = PersonMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        removeItemFromMapByValue(map,"Anna");
        System.out.println(map);
    }

}
