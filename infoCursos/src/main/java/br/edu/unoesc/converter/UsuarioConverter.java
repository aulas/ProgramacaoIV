package br.edu.unoesc.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.edu.unoesc.model.Usuario;
import br.edu.unoesc.services.UsuarioService;

@FacesConverter(forClass=Usuario.class, value = "usuarioConverter")
public class UsuarioConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String valor) {
		if (valor == null ||valor.length() == 0){
			return null;
		}
		UsuarioService usuarioService = new UsuarioService();
		List<Usuario> usuarios = usuarioService.localizaNome(valor);
		if (usuarios.size() < 0){
			return null;
		}
		return usuarios.get(0);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object valor) {
		if (valor == null){
			return null;
		}
		UsuarioService usuarioService = new UsuarioService();
		Usuario usuario = null;
		if (valor instanceof Usuario){
			usuario = (Usuario) valor;
		}else{
			return null;
		}
		usuario = usuarioService.localizaCodigo(usuario.getCodigo());
		return usuario.getNome();
	}
}