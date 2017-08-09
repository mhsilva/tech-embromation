package com.techinicalembromation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techinicalembromation.util.TeFraseBuilder;

@RestController
@RequestMapping(value = "/")
public class TeFrases {

	@Autowired
	private TeFraseBuilder builder;

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String getFrase() {
		return builder.constroiFrase();
	}

}
