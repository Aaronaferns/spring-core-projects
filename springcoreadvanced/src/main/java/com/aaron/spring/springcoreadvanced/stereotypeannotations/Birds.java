package com.aaron.spring.springcoreadvanced.stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("birdy")
public class Birds {
	@Value("#{birds}")
	private List<String> birds;

	public List<String> getBirds() {
		return birds;
	}

	public void setBirds(List<String> birds) {
		this.birds = birds;
	}

	@Override
	public String toString() {
		return "Birds [birds=" + birds + "]";
	}
	
	
}
