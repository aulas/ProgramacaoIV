package br.edu.unoesc.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.edu.unoesc.model.Estado;
import br.edu.unoesc.services.EstadoService;

@FacesConverter(forClass=Estado.class, value = "estadoConverter")
public class EstadoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String valor) {
		if (valor == null ||valor.length() == 0){
			return null;
		}
		EstadoService estadoService = new EstadoService();
		List<Estado> estados = estadoService.localizaNome(valor);
		if (estados.size() < 0){
			return null;
		}
		return estados.get(0);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object valor) {
		if (valor == null){
			return null;
		}
		EstadoService estadoService = new EstadoService();
		Estado estado = null;
		if (valor instanceof Estado){
			estado = (Estado) valor;
		}else{
			return null;
		}
		estado = estadoService.localizaCodigo(estado.getCodigo());
		return estado.getNome();
	}
	
	
}
