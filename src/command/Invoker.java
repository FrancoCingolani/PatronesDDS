package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	private List<IOperacion> operaciones = new ArrayList();
	
	
	public void agregarOperacion(IOperacion operacion) {
		this.operaciones.add(operacion);
	}
	
	public void realizarOperaciones() {
		this.operaciones.forEach(x -> x.execute());
	}

}
