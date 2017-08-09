package com.techinicalembromation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techinicalembromation.pojo.AngularReturn;
import com.techinicalembromation.util.TeFraseBuilder;

@RestController
@RequestMapping(value = "/")
public class TeFrases {

	@Autowired
	private TeFraseBuilder builder;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String getFrase() {
		return builder.constroiFrase();
	}

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, value="/angular")
	public @ResponseBody AngularReturn getFraseAngular() {
		return new AngularReturn(builder.constroiFrase());
	}

	
}
