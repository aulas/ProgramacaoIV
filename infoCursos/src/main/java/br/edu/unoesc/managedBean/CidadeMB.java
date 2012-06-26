package br.edu.unoesc.managedBean;


import java.util.ArrayList;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import br.edu.unoesc.model.Cidade;
import br.edu.unoesc.services.CidadeService;

@ManagedBean
@SessionScoped
public class CidadeMB {
	private Cidade cidade;
	private List<Cidade> cidades = new ArrayList<Cidade>();
	private CidadeService servicos = new CidadeService();
	
	public CidadeMB(){
		cidades = servicos.listar();
		cidade = new Cidade();
	}
	public void salvar(){
		if (cidades.contains(cidade)){
			int posicao = cidades.indexOf(cidade);
			servicos.alterar(cidade);
		}
		else{
			cidades.add(cidade);
			servicos.inserir(cidade);
		}
		cidade = new Cidade();
	}
	public String selecionar(){
		return "cadastroCidade.xhtml";
	}
	
	public void excluir() {
		cidades.remove(cidade);
		servicos.remover(cidade);
		cidade = new Cidade();
	}
	
	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Cidade> getcidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}
}

	

	