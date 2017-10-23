package com.pin91.wallet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

	@RequestMapping(value="/heathcheck", method = RequestMethod.GET)
	public String healthCheck(){
		return null;
	}
}

