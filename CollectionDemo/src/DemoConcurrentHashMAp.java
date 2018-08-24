import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class DemoConcurrentHashMAp {
  public static void main(String[] args) {
	Map<String, String> map = new ConcurrentHashMap<>();
	map.put("A", "INDIA");
	map.put("B", "USA");
	map.put("C", "UK");
	System.out.println(map);
	Set<Entry<String,String>> entries = map.entrySet();
	Iterator<Entry<String, String>> iterator = entries.iterator();
	while(iterator.hasNext()) {
		
	}
}
}
