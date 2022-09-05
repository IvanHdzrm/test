package interfaces;

import java.util.List;

public interface IGeneralCrud<T> {
	
	public T obtenerPorId(Long id);
	
	public T crear (T entidad);
	
	public List<T> obtenerTodos();
}
