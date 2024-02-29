package muniemon_actividad;

public class Muniemon {
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private Tipo tipo;
	
	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", tipo=" + tipo + "]";
	}
	

	public Muniemon(String nombre, int vida, int ataque, int defensa, Tipo tipo) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipo = tipo;
	}


	public Muniemon() {
		
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public void atacar(Muniemon objetivo) {
		if (this.vida > 0) {
			int danioRealizado = 0;
            danioRealizado = this.ataque - objetivo.getDefensa();
            if (danioRealizado < 0) {
                danioRealizado = 0; // No puede hacer daño negativo
            }
            objetivo.vida -= danioRealizado;
            System.out.println("==============================================================");
            System.out.println(this.nombre + " ataca a " + objetivo.getNombre() + " y le hace " 
            + danioRealizado + " puntos de daño.");
            System.out.println(objetivo.getNombre() + " tiene " + objetivo.getVida() + " puntos de vida.");
            System.out.println("==============================================================");
            if (objetivo.vida <= 0) {
                System.out.println(objetivo.getNombre() + " ha sido derrotado.");
                objetivo.vida = 0;
            }
        } else {
            System.out.println(this.nombre + " no puede atacar porque está muerto.");
        }
    }
	
	
	
}
