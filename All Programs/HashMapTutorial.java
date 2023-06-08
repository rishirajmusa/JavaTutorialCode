import java.util.HashMap;

public class HashMapTutorial {

	public static void main(String[] args) {
		HashMap<String, String> funny = new HashMap<String, String>();
		funny.put("Rishi", "Male");
		funny.put("Manoj", "Male");
		funny.put("Rahul", "Male");
		System.out.println(funny);
		HashMap<String, String> funnyCopy;
		funnyCopy=funny;
		funnyCopy.clear();
		System.out.println(funnyCopy);
		funnyCopy.put("BhagatSingh", "Male");
		funnyCopy.put("RaniLaxmiBai", "Female");
		funnyCopy.put("NarendraModi", "Male");
		System.out.println(funnyCopy);
		System.out.println(funnyCopy.isEmpty());
		System.out.println(funnyCopy.keySet());
		System.out.println(funnyCopy.values());
		System.out.println(funnyCopy.size());
		funnyCopy.put("Savarkar", "Male");
		System.out.println(funnyCopy);
	}

}
