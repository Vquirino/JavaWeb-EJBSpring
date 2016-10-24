package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idproduto")
	private Integer idproduto;
	
	@Column(name="nome", length=35, nullable=false)
	private String nome;
	
	@Column(name="preco", nullable=false)
	private Double preco;
	
	public Produto() {
	
	}

	public Produto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto(Integer idproduto, String nome, Double preco) {
		this.idproduto = idproduto;
		this.nome = nome;
		this.preco = preco;
	}

	public Integer getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
		
}
