package com.padraonullobject.option;

public class PessoaDAO {

	public Option<Pessoa> findById(long l) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Ze");
		Option<Pessoa> some = Option.of(pessoa); // devolve Some<String>
//		Option<Pessoa> none = Option.of(null); // devolve None
		return some;
	}

}
