
package br.edu.unoesc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Hotel implements GenericModel  {
	
	private static final long serialVersionUID = -8059679672411186847L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	
	private String link;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Hotel(long codigo, String nome, String link) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.link = link;
	}
	public Hotel() {
		super();
		
	}
	
	

}
