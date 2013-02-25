package com.padraonullobject.option;

public class OptionTest {
	public void test() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Option<Pessoa> pessoa = pessoaDAO.findById(1234L);

		if (pessoa instanceof Some<?>) {
			String nome = ((Some<Pessoa>) pessoa).get().getNome();
			System.out.println("Encontrei pessoa com nome: " + nome);
		} else {
			System.out.println("Não encontrei ninguém");
		}
	}
}
