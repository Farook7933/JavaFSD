package AssistedPracticeProjects;
import java.util.*;

public class Maps7 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"farook");    
	      hm.put(2,"idris");    
	      hm.put(3,"subhani");   
	       
	      System.out.println("The elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"sumanth");  
	      ht.put(5,"tharak");  
	      ht.put(6,"bobby");  
	      ht.put(7,"karim");  

	      System.out.println("The elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	   
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"khaja");    
	      map.put(9,"khasim");    
	      map.put(10,"khadar vali");       
	      
	      System.out.println("The elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}