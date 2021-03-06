package com.bolsadeideas.springboot.error.app.sevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImplements implements usuarioService{

	private List<Usuario> lista;
	
	
	public UsuarioServiceImplements() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Andres", "Guzman"));
		this.lista.add(new Usuario(2, "Pepa", "Garcia"));
		this.lista.add(new Usuario(3, "Lalo", "Mena"));
		this.lista.add(new Usuario(4, "Luci", "Fernandez"));
		this.lista.add(new Usuario(5, "Pato", "Gonzales"));
		this.lista.add(new Usuario(6, "Vitty", "Pena"));
		this.lista.add(new Usuario(7, "Paco", "Rodrigez"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		
		for ( Usuario usuario : this.lista) {
			if(usuario.getId().equals(id)) {
				resultado = usuario;
				break;
			}
		}
		
		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		Usuario usuario = this.obtenerPorId(id);
		return Optional.ofNullable(usuario);
	}
		
}
