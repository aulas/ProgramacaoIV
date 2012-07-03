package br.edu.unoesc.managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.unoesc.model.Usuario;
import br.edu.unoesc.services.UsuarioService;

/**
 * 
 * @author bruno
 */
@ManagedBean
@SessionScoped
public class UsuarioMB {
   private Usuario usuario;
   private List<Usuario> usuarios = new ArrayList<Usuario>();
   private UsuarioService servicos = new UsuarioService();

   public UsuarioMB() {
      usuarios = servicos.listar();
      usuario = new Usuario();
   }

   public void salvar() {
      // se a lista de usuarios contiver o usuario então vou alterar
      if (usuarios.contains(usuario)) {
	 // pego a posição do usuario dentro da lista
	 int posicao = usuarios.indexOf(usuario);
	 // modifico o usuario
	 usuarios.set(posicao, usuario);
	 servicos.alterar(usuario);
      } else { // incluir
	 usuarios.add(usuario);
	 servicos.inserir(usuario);
      }
	 usuario = new Usuario();
   }

   public String selecionar() {
      return "cadastroUsuario.xhtml";
   }

   public void excluir() {
      usuarios.remove(usuario);
      servicos.remover(usuario);
      usuario = new Usuario();
   }

   public Usuario getUsuario() {
      return usuario;
   }

   public void setUsuario(Usuario usuario) {
      this.usuario = usuario;
   }

   public List<Usuario> getUsuarios() {
      return usuarios;
   }

   public void setUsuarios(List<Usuario> usuarios) {
      this.usuarios = usuarios;
   }
}