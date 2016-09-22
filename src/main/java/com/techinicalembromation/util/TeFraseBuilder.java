package com.techinicalembromation.util;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

import com.techinicalembromation.repository.TeRepositorio;

@Component
public class TeFraseBuilder {

	public String constroiFrase() {
		TeRepositorio repositorio = TeRepositorio.getInstance();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 4; i++) {
			String nomeColuna = getNomeColuna(i);
			sb.append(getColunaRandom(repositorio.getFrasesPara(nomeColuna)));
		}
		return sb.toString();
	}

	private Object getColunaRandom(List<String> frasesCollection) {
		return frasesCollection.get(ThreadLocalRandom.current().nextInt(0, frasesCollection.size()));
	}

	private String getNomeColuna(int i) {
		String nomeColuna = "";
		switch (i) {
		case 1:
			nomeColuna = TeConstants.COLUNA_1;
			break;
		case 2:
			nomeColuna = TeConstants.COLUNA_2;
			break;
		case 3:
			nomeColuna = TeConstants.COLUNA_3;
			break;
		case 4:
			nomeColuna = TeConstants.COLUNA_4;
			break;
		default:
			break;
		}
		return nomeColuna;
	}
}
