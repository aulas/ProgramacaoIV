package br.edu.unoesc.managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.unoesc.model.Hotel;
import br.edu.unoesc.services.HotelService;

/**
 * 
 * @author jean
 */
@ManagedBean
@SessionScoped
public class HotelMB {
	private Hotel hotel;
	private List<Hotel> hoteis = new ArrayList<Hotel>();
	private HotelService servicos = new HotelService();

	public HotelMB() {
		hoteis = servicos.listar();
		hotel = new Hotel();
	}

	public void salvar() {
		// se a lista de hoteis contiver o hotel então vou alterar
		if (hoteis.contains(hotel)) {
			// pego a posição do hotel dentro da lista
			int posicao = hoteis.indexOf(hotel);
			// modifico o hotel
			hoteis.set(posicao, hotel);
			servicos.alterar(hotel);
		} else { // incluir
			hoteis.add(hotel);
			servicos.inserir(hotel);
		}
		hotel = new Hotel();
		
	}

	public String selecionar() {
		return "cadastroHotel.xhtml";
	}

	public void excluir() {
		hoteis.remove(hotel);
		servicos.remover(hotel);
		hotel = new Hotel();
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public List<Hotel> getHoteis() {
		return hoteis;
	}

	public void setHoteis(List<Hotel> hoteis) {
		this.hoteis = hoteis;
	}

}
