package com.techinicalembromation.repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techinicalembromation.util.TeConstants;

public class TeRepositorio {

	private static TeRepositorio instance;

	private Map<String, List<String>> colunas;

	private List<String> coluna1 = Arrays.asList("Caros colegas, ", "Por outro lado, ", "Não podemos esquecer que ",
			"Do mesmo modo, ", "A prática mostra que ", "Nunca é demais insistir que ", "A experiência mostra que ",
			"É fundamental ressaltar que ", "O incentivo ao avanço tecnológico, assim como ", "Assim mesmo, ");
	private List<String> coluna2 = Arrays.asList("a execução deste projeto ", "a complexidade dos estudos efetuados ",
			"a atual estrutura de organização ", "o novo modelo estrutural aqui preconizado ",
			"o desenvolvimento de formas distintas de atuação ", "a constante divulgação das informações ",
			"a consolidação das estruturas ", "a análise dos diversos resultados ",
			"o início do programa de formação de atitudes ", "a expansão de nossa atividade ");
	private List<String> coluna3 = Arrays.asList("nos obriga à análise ", "cumpre um papel essencial na formulação ",
			"auxilia a preparação e a estruturação ", "contribui para a correta determinação ",
			"assume importantes posições na definição ", "facilita a definição ",
			"prejudica a percepção da importância ", "oferece uma boa oportunidade de verificação ",
			"acarreta um processo de reformulação ", "exige precisão e definição ");
	private List<String> coluna4 = Arrays.asList("das nossas opções de desenvolvimento futuro. ",
			"das nossas metas financeiras e administrativas. ", "das atitudes e das atribuições da diretoria. ",
			"das novas proposições. ", "das opções básicas para o sucesso do programa. ",
			"do nosso sistema de formação de quadros. ", "das condições apropriadas para os negócios. ",
			"dos índices pretendidos. ", "das formas de ação. ", "dos conceitos de participação geral ");

	private TeRepositorio() {
		this.colunas = new HashMap<>();
		this.colunas.put(TeConstants.COLUNA_1, coluna1);
		this.colunas.put(TeConstants.COLUNA_2, coluna2);
		this.colunas.put(TeConstants.COLUNA_3, coluna3);
		this.colunas.put(TeConstants.COLUNA_4, coluna4);
	}

	public static TeRepositorio getInstance() {
		if (instance == null) {
			instance = new TeRepositorio();
		}
		return instance;
	}

	public List<String> getFrasesPara(String coluna) {
		return colunas.get(coluna);
	}

}
