package sarasa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.google.common.collect.Sets;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<String> resultado = new ArrayList<String>();
//		resultado = Sets.cartesianProduct(Listas.unaLista);
		
		List<String> s1 = Arrays.asList("abc", "def","ghi");
		List<String> s2 = Arrays.asList("001", "002","003");
		List<String> s3 = Arrays.asList("991","992","993");
		
		
		List<Set<String>> sets = new ArrayList<Set<String>>();
		
		 sets.add(new HashSet(s1));
	     sets.add(new HashSet(s2));
	     sets.add(new HashSet(s3));
	     
	     Set<List<String>> cartesianSet = Sets.cartesianProduct(sets);
	     
	     
	     List<String> listaAux= new ArrayList<String>();
    	 
	     for(List<String> element : cartesianSet ){
	    	 
	    	 listaAux.add(element.toString());
	     }

	     System.out.println(getRandomList(listaAux));
	}
	
	public static String getRandomList(List<String> list) {
	    Random random = new Random();
	    int index = random.nextInt(list.size());
	    System.out.println("\nIndex :" + index );
	    return list.get(index);
	}

}


//https://sanjeevtrivedi.wordpress.com/2013/01/25/generating-cartesian-product-set-in-java/