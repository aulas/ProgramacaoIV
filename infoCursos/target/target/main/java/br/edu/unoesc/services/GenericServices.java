/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unoesc.services;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.edu.unoesc.model.GenericModel;

public class GenericServices<T extends GenericModel> {

	private Class<T> classe;

	// padrão singleton
	@SuppressWarnings("unchecked")
	private Class<T> getClasse() {
		if (this.classe == null) {
			Type[] tipos = ((ParameterizedType) getClass()
					.getGenericSuperclass()).getActualTypeArguments();

			this.classe = (Class<T>) tipos[0];
			return this.classe;
		}
		return this.classe;
	}

	public void inserir(T modelo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(modelo); // executa o comando insert do sql
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
	}

	public void remover(T modelo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			modelo = em.find(getClasse(), modelo.getCodigo());
			em.remove(modelo); // executa o comando insert do sql
			tx.commit();

		} catch (Exception ex) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
	}

	public void alterar(T modelo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.merge(modelo); // executa o comando alterar do sql
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<T> listar() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		List<T> dados = null;
		try {

			dados = em.createQuery("from " + getClasse().getSimpleName())
					.getResultList();

		} finally {
			em.close();
			emf.close();
		}
		return dados;
	}

}
