package jeden;

import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class main {
	public static void main(String[] args) {
		Map<String, String> Lematyzacja = new TreeMap<>();

		Lematyzacja.put("Wszed�","Wlaz�");
		Lematyzacja.put("kotek", "kot");
		Lematyzacja.put("na", "");
		Lematyzacja.put("p�otek" , "p�ot");
		Lematyzacja.put("i", "");
		Lematyzacja.put("mru�y", "mruga");

		String zdanie = "Wszed� kotek na p�otek i mru�y";

		StringTokenizer dzieltekst;
		dzieltekst = new StringTokenizer(zdanie, " ", true);
		while(dzieltekst.hasMoreTokens()){
			String lzdanie = dzieltekst.nextToken();
			System.out.print(lzdanie);	
		}
		System.out.println();
		dzieltekst = new StringTokenizer(zdanie, " ", true);
		while(dzieltekst.hasMoreTokens()){
			String lzdanie = dzieltekst.nextToken();
			if(!lzdanie.equals(" ")){	
				System.out.print(Lematyzacja.get(lzdanie) + " ");
			}
		}

	}
}
