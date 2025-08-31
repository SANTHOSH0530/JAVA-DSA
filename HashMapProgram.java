package java_project_1;
import java.util.HashMap;
public class HashMapProgram {
	public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<>();
	//Put()
	map.put(1, "Coimbatore");
	map.put(2, "Thanjavur");
	map.put(3, "Thiruvarur");
	System.out.println(map);
	
	//PutAll
	HashMap<Integer, String> newMap = new HashMap<>();
    newMap.put(5, "karur");
    newMap.put(6, "Manargudi");
    map.putAll(newMap);
    System.out.println(map); 
	
	//Get()
	System.out.println(map.get(2));
	
	//ContainsKey
	System.out.println(map.containsKey(2));
	System.out.println(map.containsKey(4));
	
	//ContainsValue
	System.out.println(map.containsValue("Thiruvarur"));
	System.out.println(map.containsValue("Tirupur"));
	
	// size()
    System.out.println(map.size());
    
    //keySet
    System.out.println(map.keySet());
    
    //Values
    System.out.println(map.values());
    
    //EntrySet
    System.out.println(map.entrySet());
    
    //Remove(key)
    map.remove(3);
    System.out.println(map);
    
    //Remove(Key,Value)
    map.remove(2, "Thanjavur");
    
    //PutIfAbsent
    map.putIfAbsent(2, "pollachi");
    map.putIfAbsent(3, "Chennai");
    System.out.println(map);
    
    //replace
    map.replace(1, "Trichy");
    System.out.println(map);
    
    //GetOrdefault
    System.out.println(map.getOrDefault(10, null));
    
    //Clear and isEmpty()
    map.clear();
    System.out.println(map.isEmpty());
	}
}
