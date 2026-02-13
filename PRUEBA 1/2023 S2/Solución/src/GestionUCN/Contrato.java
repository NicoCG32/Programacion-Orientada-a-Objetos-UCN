package GestionUCN;

public class Contrato {
	
	private String rol;
	private Fecha fechaInicio;
	private Fecha fechaTermino;
	private Unidad u;
	private Persona p;
	
	public Contrato(String rol, Fecha fechaInicio, Fecha fechaTermino, Unidad u, Persona p) {
		this.rol = rol;
		this.fechaInicio = fechaInicio;
		this.fechaTermino = fechaTermino;
		this.u = u;
		this.p = p;
	}

	public String getRol() {
		return rol;
	}

	public Fecha getFechaInicio() {
		return fechaInicio;
	}

	public Fecha getFechaTermino() {
		return fechaTermino;
	}

	public Unidad getU() {
		return u;
	}

	public Persona getP() {
		return p;
	}

	@Override
	public String toString() {
		return "Contrato{rol='" + rol + "', persona=" + p + ", unidad=" + u
				+ ", inicio=" + fechaInicio + ", termino=" + fechaTermino + "}";
	}
	
}
