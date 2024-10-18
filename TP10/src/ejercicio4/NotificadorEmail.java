package ejercicio4;

public class NotificadorEmail implements Notificador {

	private String email_envio;
	
	private String email_recepcion;
	
	public NotificadorEmail(String email_envio, String email_recepcion) {
		this.email_envio = email_envio;
		this.email_recepcion = email_recepcion;
	}
	
	
	
	public String getemail_envio() {
		return email_envio;
	}


	public void setemail_envio(String email_envio) {
		this.email_envio = email_envio;
	}



	public String getemail_recepcion() {
		return email_recepcion;
	}



	public void setemail_recepcion(String email_recepcion) {
		this.email_recepcion = email_recepcion;
	}







	@Override
	public void enviarNotificacion(String s) {
		// TODO Auto-generated method stub
		System.out.println("Notificacndo...");

	}

	@Override
	public String getNotificacion() {
		// TODO Auto-generated method stub
		return "Soy la Notificacion";
	}


}
