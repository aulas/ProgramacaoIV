package br.edu.unoesc.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private List<Usuario> interessados;
	private List<Destaque> destaques;

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
		result = prime * result
				+ ((anunciante == null) ? 0 : anunciante.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result
				+ ((clicaramLink == null) ? 0 : clicaramLink.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((curtiram == null) ? 0 : curtiram.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((destaques == null) ? 0 : destaques.hashCode());
		result = prime * result
				+ ((detalhes == null) ? 0 : detalhes.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((folder == null) ? 0 : folder.hashCode());
		result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
		result = prime * result
				+ ((interessados == null) ? 0 : interessados.hashCode());
		result = prime * result
				+ ((linkInscricao == null) ? 0 : linkInscricao.hashCode());
		result = prime * result
				+ ((subcategoria == null) ? 0 : subcategoria.hashCode());
		result = prime * result + ((termino == null) ? 0 : termino.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result
				+ ((visualizaram == null) ? 0 : visualizaram.hashCode());
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
		if (anunciante == null) {
			if (other.anunciante != null)
				return false;
		} else if (!anunciante.equals(other.anunciante))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (clicaramLink == null) {
			if (other.clicaramLink != null)
				return false;
		} else if (!clicaramLink.equals(other.clicaramLink))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (curtiram == null) {
			if (other.curtiram != null)
				return false;
		} else if (!curtiram.equals(other.curtiram))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (destaques == null) {
			if (other.destaques != null)
				return false;
		} else if (!destaques.equals(other.destaques))
			return false;
		if (detalhes == null) {
			if (other.detalhes != null)
				return false;
		} else if (!detalhes.equals(other.detalhes))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (folder == null) {
			if (other.folder != null)
				return false;
		} else if (!folder.equals(other.folder))
			return false;
		if (inicio == null) {
			if (other.inicio != null)
				return false;
		} else if (!inicio.equals(other.inicio))
			return false;
		if (interessados == null) {
			if (other.interessados != null)
				return false;
		} else if (!interessados.equals(other.interessados))
			return false;
		if (linkInscricao == null) {
			if (other.linkInscricao != null)
				return false;
		} else if (!linkInscricao.equals(other.linkInscricao))
			return false;
		if (subcategoria == null) {
			if (other.subcategoria != null)
				return false;
		} else if (!subcategoria.equals(other.subcategoria))
			return false;
		if (termino == null) {
			if (other.termino != null)
				return false;
		} else if (!termino.equals(other.termino))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (visualizaram == null) {
			if (other.visualizaram != null)
				return false;
		} else if (!visualizaram.equals(other.visualizaram))
			return false;
		return true;
	}
	
	
}