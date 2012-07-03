package br.edu.unoesc.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.edu.unoesc.model.Cidade;
import br.edu.unoesc.services.CidadeService;

@FacesConverter(forClass=Cidade.class, value = "cidadeConverter")
public class CidadeConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String valor) {
		if (valor == null ||valor.length() == 0){
			return null;
		}
		CidadeService cidadeService = new CidadeService();
		List<Cidade> cidades = cidadeService.localizaNome(valor);
		if (cidades.size() < 0){
			return null;
		}
		return cidades.get(0);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object valor) {
		if (valor == null){
			return null;
		}
		CidadeService cidadeService = new CidadeService();
		Cidade cidade = null;
		if (valor instanceof Cidade){
			cidade = (Cidade) valor;
		}else{
			return null;
		}
		cidade = cidadeService.localizaCodigo(cidade.getCodigo());
		return cidade.getNome();
	}
}