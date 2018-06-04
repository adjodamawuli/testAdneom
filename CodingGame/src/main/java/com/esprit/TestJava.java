package com.esprit;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Adjoda
 *
 */
public class TestJava implements ITestJava{

	@Override
	public List<List<Integer>> partition(List<Integer> maList, int taille) {
		if(maList !=null && !maList.isEmpty()) {
			List<List<Integer>> listToReturn=new ArrayList<>();
			List<Integer> part=new ArrayList<>();
			for(int i =0; i < maList.size() ; i++) {
				if(part.size() < taille) {
					part.add(maList.get(i));
				}else {
					listToReturn.add(part);
					part=new ArrayList<>();
					part.add(maList.get(i));
				}
				
				if((i==maList.size()-1)) {
					listToReturn.add(part);
				}
				
				
			}
			return listToReturn;
		}
		return null;	
	}

}
