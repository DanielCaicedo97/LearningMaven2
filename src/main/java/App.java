

import org.apache.log4j.Logger;

// Main class
public class App {
	private static final Logger LOG = Logger.getLogger(App.class);

	// Main driver method
	public static void main(String[] args) {

		
		
		// Creando Exepciones 
		
		
		
		
		
		
		
		
		
		
		
//		// Crear Cita
//		String asunto = "Revision examenes Hemoglobina...";
//		String termino = "1";
//		int usuarioId = 1;
//		int fechaId = 1;
//		int administradorId = 60;
//		
//		boolean cita = new CitaService().create(administradorId, usuarioId, administradorId, fechaId, asunto, termino);
//		
//		System.out.println(cita ? "Creado": "No Creado");
		
		
		
		
		
		
		
		
		
		
//		// Crear un usuario 
//		String nombre = "Juan";
//		String apellido = "Caicedo";
//		String documento = "1234189060";
//		String telefono = "3251275";
//		String correoElectronico = "Juan@gmail.com";
//
//		boolean UsuarioCreate = new UsuarioController().create(0, nombre, apellido, telefono, documento,
//				correoElectronico);
//
//		System.out.println(UsuarioCreate ? "Creado" : "No Creado");

//		// Obtener un Usuario 
//		
//		Usuario usuario = new UsuarioController().get(25);
//		
//		System.out.println(usuario!= null ? usuario.toString(): "valor Nulo");

//		// Actualizar un Usuario
//
//		try {
//
//			Usuario usuarioUpdate = new UsuarioService().get(1);
//			String nombre = usuarioUpdate.getNombre();
//			String apellido = usuarioUpdate.getApellido();
//			String documento = usuarioUpdate.getDocumento();
//			String telefono = "1234567890";
//			String correoElectronico = usuarioUpdate.getCorreoElectronico();
//			
//			new UsuarioService().update(usuarioUpdate.getId(), nombre, apellido, telefono, documento, correoElectronico);
//		} catch (Exception e) {
//			LOG.error(e.getStackTrace(), e);
//		}
//		
		// Borrar Usuario 

		// Actualizar un Usuario

		// Creando un Administrador
//
//		String nombre = "Daniel", Apellido = "Caicedo", telefono = "3251275", documento = "1234189060",
//				correoElectronico = "daniel@correo.com", correoRecuperacion = "alejandro@correo.com";
//
//		int contrasena = 1234;
//		Date ultimaSesion = new Date();

//		boolean admin = new AdministradorController().create(0, nombre, Apellido, telefono, documento,
//				correoElectronico, contrasena, correoRecuperacion, ultimaSesion);
//		
//		System.out.println(admin ? "Creado" : "no creado");
//
//		// Consultando Administrador
//
//		Administrador adminConsulta = new AdministradorController().get(3);
//		System.out.println(adminConsulta != null ? adminConsulta.toString() : "no es posible consultarlo");
//
//		// Eliminando Administrador
//		boolean adminDelete = new AdministradorController().delete(3);
//		System.out.println(adminDelete ? "eliminado" : "no es posible Eliminarlo");
//
//		// Actualizando la hora del sesion del administrador
//
//		try {
//			Administrador adminUpdate = new AdministradorController().get(20);
//
//			Date nuevaSession = new Date();
//
//			String nombre = adminUpdate.getNombre();
//			String apellido = adminUpdate.getApellido();
//			String telefono = adminUpdate.getTelefono();
//			String documento = adminUpdate.getDocumento();
//			String correoElectronico = adminUpdate.getCorreoElectronico();
//			int contrasena = adminUpdate.getContrasena();
//			String correoRecuperacion = adminUpdate.getCorreoRecuperacion();
//
//			boolean adminUpdated = new AdministradorController().Update(adminUpdate.getId(), nombre, apellido, telefono,
//					documento, correoElectronico, contrasena, correoRecuperacion, nuevaSession);
//
//			System.out.println(adminUpdated ? "Actualizado" : "no es posible Actualizar");
//		} catch (Exception e) {
//			LOG.error(e.getMessage(), e);
//			System.out.println("Error Catch: no es posible Actualizar ");
//		}
		/*
		 * 
		 * System.out.println("Iniciando Programa ...");
		 * 
		 * new FechaController().DoubleUpdate(5, 60, "7");
		 */
		/*
		 * // Practicando con Log4j LogJava.debug("LOG DEBUG");
		 * LogJava.info("LOG INFO"); LogJava.warn("LOG WARN");
		 * LogJava.error("LOG ERROR"); LogJava.fatal("LOG FATAL");
		 */
		/*
		 * // Crear FECHA //
		 * 
		 * Date fecha = new Date(); Date hora = new Date(); Fecha fecha1 = new Fecha();
		 * 
		 * fecha1.setFecha(fecha); fecha1.setEstado("1"); fecha1.setHora(hora);
		 * 
		 * boolean crearFecha = new FechaController().Create(fecha1);
		 * System.out.println(crearFecha ? "Fecha creada" : "Fecha no creada");
		 */

		//////////////////// ////////////////////////////////////////////////////////

		// Actualizar Fecha
		/*
		 * Date fecha = new Date(); Date hora = new Date(); String estado = "0";
		 * 
		 * boolean actualizarFecha = new FechaController().Update(2, fecha, hora,
		 * estado); System.out.println(actualizarFecha ? "Fecha actualizada" :
		 * "Fecha no actualizada");
		 * 
		 */

		/*
		 * // Borrar Fecha boolean BorrarFecha = new FechaController().Delete(3);
		 * System.out.println( BorrarFecha? "Fecha Borrada " : "Fecha no Borrada");
		 */

		// Consultar Fecha
		/*
		 * String ConsultarFecha = new FechaController().Get(3);
		 * System.out.println(ConsultarFecha);
		 */

		/*
		 * // Ejercicio 1 agregar 10 registros en un usando for
		 * 
		 * 
		 * Fecha fecha1 = new Fecha();
		 * 
		 * List<Fecha> listaFecha = new ArrayList<>();
		 * 
		 * for (int i = 0; i < 10; i++) {
		 * 
		 * Date fecha = new Date(); Date hora = new Date();
		 * 
		 * fecha1.setFecha(fecha); fecha1.setEstado((i % 2 == 0 ? "1" : "0"));
		 * fecha1.setHora(hora); listaFecha.add(fecha1); pause(1000); }
		 * 
		 * System.out.println(listaFecha.size());
		 * 
		 * for (Fecha fechaFor : listaFecha) { System.out.println(fechaFor); new
		 * FechaController().Create(fechaFor); } ///// Fin ejercicio
		 */
		/*
		 * for(int i = 8;i<38;i++) { boolean BorrarFecha = new
		 * FechaController().Delete(i); }
		 * 
		 */

		// Practicando con Log4j

	}

	public static void pause(int ms) {

		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			System.err.format("IOException: %s%n", e);
		}
	}

}
