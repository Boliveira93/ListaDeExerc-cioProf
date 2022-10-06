package br.com.vooeairlines.frontend;

import br.com.vooearlines.entities.*;
import br.com.vooearlines.dao.*;
import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		/*Aeronave aeronave = new Aeronave("Embraery", "Bandeirante", "Modelo: EMB-100 ");
		AeronaveDAO aeronaveDAO = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aeronave));
		
		Aeronave aeronave2 = new Aeronave("Embraery", "Bandeirante", "EMB-110");
		AeronaveDAO aeronaveDAO2 = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aeronave2));
		
		Aeronave aeronave3 = new Aeronave("Embraery", "Bandeirante", "EMB-110A");
		AeronaveDAO aeronaveDAO3 = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aeronave3));
		
		Aeronave aeronave4 = new Aeronave("Embraery", "Bandeirante", "EMB-110B");
		AeronaveDAO aeronaveDAO4 = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aeronave4));
		
		Aeronave aeronave5 = new Aeronave("Embraery", "Bandeirante", "EMB-110B1");
		AeronaveDAO aeronaveDAO5 = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aeronave5));
		
		Aeronave aeronave6 = new Aeronave("Embraery", "Bandeirante", "EMB-110C");
		AeronaveDAO aeronaveDAO6 = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aeronave6));
		
		Aeronave aeronave7 = new Aeronave("Embraery", "Bandeirante", "EMB-110C (N)");
		AeronaveDAO aeronaveDAO7 = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aeronave7));
		
		Manutencao manutencao = new Manutencao("Foi feita a revisão", "troca de oleo do motor direito");
		System.out.println(new ManutencaoDAO().cadastrarManutencao(manutencao));
		
		Manutencao manutencao2 = new Manutencao("Troca das poltronas", "troca de oleo do motor esquerdo");
		System.out.println(new ManutencaoDAO().cadastrarManutencao(manutencao2));
		*/
		
		int idade;
		String leiaIdade;
		
		leiaIdade = JOptionPane.showInputDialog("Entre com sua idade: ");
		
		idade = Integer.parseInt(leiaIdade);
		
		if(idade <= 18) {
			JOptionPane.showMessageDialog(null,"Embarque não Autorizado","VoeAirlenes",JOptionPane.ERROR_MESSAGE);
		}else {
			JOptionPane.showConfirmDialog(null, "Boa viagem! VoeAirlines Alcançando novos voos com você","voeAirlines",JOptionPane.INFORMATION_MESSAGE);
		}
		
		

	}

}
