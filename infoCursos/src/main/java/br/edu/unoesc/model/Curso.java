package br.edu.unoesc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Curso implements GenericModel {

	private static final long serialVersionUID = -8059679672411186847L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	private String titulo;
	private String descricao;
	private Date inicio;
	private Date termino;
	private Long visualizaram;
	private Long curtiram;
	private String linkInscricao;
	private Long clicaramLink;
	private String folder;
	private String endereco;
	private String detalhes;
	private Cidade cidade;
	private Empresa anunciante;
	private Subcategoria subcategoria;
	private Hotel hospedagem;
	
	@OneToMany
	private List<Usuario> interessados = new ArrayList<Usuario>();
	
	@OneToMany
	private List<Destaque> destaques = new ArrayList<Destaque>();;

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", titulo=" + titulo
				+ ", descricao=" + descricao + ", inicio=" + inicio
				+ ", termino=" + termino + ", visualizaram=" + visualizaram
				+ ", curtiram=" + curtiram + ", linkInscricao=" + linkInscricao
				+ ", clicaramLink=" + clicaramLink + ", folder=" + folder
				+ ", endereco=" + endereco + ", detalhes=" + detalhes
				+ ", cidade=" + cidade + ", anunciante=" + anunciante
				+ ", subcategoria=" + subcategoria + ", interessados="
				+ interessados + ", destaques=" + destaques + "]";
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getTermino() {
		return termino;
	}
	public void setTermino(Date termino) {
		this.termino = termino;
	}
	public Long getVisualizaram() {
		return visualizaram;
	}
	public void setVisualizaram(Long visualizaram) {
		this.visualizaram = visualizaram;
	}
	public Long getCurtiram() {
		return curtiram;
	}
	public void setCurtiram(Long curtiram) {
		this.curtiram = curtiram;
	}
	public String getLinkInscricao() {
		return linkInscricao;
	}
	public void setLinkInscricao(String linkInscricao) {
		this.linkInscricao = linkInscricao;
	}
	public Long getClicaramLink() {
		return clicaramLink;
	}
	public void setClicaramLink(Long clicaramLink) {
		this.clicaramLink = clicaramLink;
	}
	public String getFolder() {
		return folder;
	}
	public void setFolder(String folder) {
		this.folder = folder;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Empresa getAnunciante() {
		return anunciante;
	}
	public void setAnunciante(Empresa anunciante) {
		this.anunciante = anunciante;
	}
	public Subcategoria getSubcategoria() {
		return subcategoria;
	}
	public void setSubcategoria(Subcategoria subcategoria) {
		this.subcategoria = subcategoria;
	}
	public Hotel getHospedagem() {
		return hospedagem;
	}
	public void setHospedagem(Hotel hospedagem) {
		this.hospedagem = hospedagem;
	}
	public List<Usuario> getInteressados() {
		return interessados;
	}
	public void setInteressados(List<Usuario> interessados) {
		this.interessados = interessados;
	}
	public List<Destaque> getDestaques() {
		return destaques;
	}
	public void setDestaques(List<Destaque> destaques) {
		this.destaques = destaques;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
	
	
	
}