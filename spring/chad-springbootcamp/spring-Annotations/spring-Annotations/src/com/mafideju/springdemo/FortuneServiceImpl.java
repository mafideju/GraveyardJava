package com.mafideju.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "Vai dar sorte hoje.";
	}

}
