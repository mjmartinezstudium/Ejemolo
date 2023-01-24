package es.studium.ejemplo1;

public class Persona
{
	//Atributos
		private String nombre;
		private String apellidos;
		
		
		
		/*Constructor vac�o o constructor por defecto.
		 * */
		public Persona() {
			nombre = "";
			apellidos = "";
		
		}

		//Construtor por par�metros.
		public Persona(String nom, String ap, int ed, boolean haP)  {
			nombre = nom;
			apellidos = ap;
			
			
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		

}
