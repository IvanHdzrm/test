package interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.incidencia.controllers.config.Response;

public interface IGeneralController <T> {
	
	public ResponseEntity<Response<List<T>>>  listarTodos();
	
	public ResponseEntity<Response<T>> obtenerPorId();
	
	public ResponseEntity<Response<T>> crear (T entidad);
	
	public ResponseEntity<Response<T>> eliminar (Long id);
	
	
	
	

}
