package com.mafideju.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		List<String> fortuna = new ArrayList<String>();
		fortuna.add("Hoje � seu dia de sorte!!! =)");
		fortuna.add("Vai que vai da p�!");
		fortuna.add("Have a lucky day...");
		fortuna.add("Vai nessa porra!");

		Random random = new Random();
		String sorteada = fortuna.get(random.nextInt(fortuna.size()));
		
		System.out.println(sorteada);
		
		return sorteada;
	}

}
