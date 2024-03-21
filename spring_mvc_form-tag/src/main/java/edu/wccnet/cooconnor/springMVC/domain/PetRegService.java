package edu.wccnet.cooconnor.springMVC.domain;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PetRegService {
	public Map<String, String> populateSpecies(){
		Map<String,String> speciesList = new LinkedHashMap<String,String>();
		speciesList.put("none", "---SELECT---");
		speciesList.put("dog","dog");
		speciesList.put("cat","cat");
		speciesList.put("bird","bird");
		speciesList.put("rabbit","rabbit");
		return speciesList;
	}
	public Map<String, String> populateGender(){
		Map<String,String> genderList = new LinkedHashMap<String,String>();
		genderList.put("Male","Male");
		genderList.put("Female","Female");
		genderList.put("Neutered","Neutered");
		genderList.put("Spayed","Spayed");
		return genderList;
	}
	public Map<String, String> populateSources(){
		Map<String,String> sourceList = new LinkedHashMap<String,String>();
		sourceList.put("Google","Google");
		sourceList.put("Neighbor","Neighbor");
		sourceList.put("Family and Friends","Family and Friends");
		sourceList.put("Other","Other");
		return sourceList;
	}
}
