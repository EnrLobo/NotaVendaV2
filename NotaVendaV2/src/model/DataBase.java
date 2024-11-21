package model;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

	private static Map<String, String[]> products = new HashMap<String, String[]>();
	
	static {
		products.put("ga", new String[]{"Guarana Antartica", "5"});
		products.put("mo", new String[]{"Mortadela", "0.01"});
		products.put("mu", new String[]{"Mussarela", "0.08"});
		products.put("pa", new String[] {"Pao", "0.75"});
		
	}
	
	public static String[] selectProduct(String code) {
		return products.get(code);
	}
}