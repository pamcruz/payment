package br.com.alura.payment.entity;

public class UserDto {

	private String nome;
	
	public UserDto(String nome) {
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
