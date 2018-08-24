import java.util.NavigableSet;
import java.util.TreeSet;

public class DemoNavigationalSet {
public static void main(String[] args) {
	NavigableSet<String> set = new TreeSet<>();
	set.add("INDIA");
	set.add("GERMANY");
	set.add("USA");
	set.add("FRANCE");
	System.out.println(set);
	System.out.println(set.headSet("INDIA", true));
	System.out.println(set.tailSet("INDIA", true));
}
}
