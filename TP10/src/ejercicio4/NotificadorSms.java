package ejercicio4;

public class NotificadorSms implements Notificador {

	private String numero_telefono;
	
	NotificadorSms (String numero){
		 
		this.numero_telefono=numero;
		 }
	
	public String getNumero_telefono() {
		return numero_telefono;
	}

	public void setNumero_telefono(String numero_telefono) {
		this.numero_telefono = numero_telefono;
	}

	@Override
	public void enviarNotificacion(String s) {
		// TODO Auto-generated method stub
		System.out.println("Notificacndo");


	}

	@Override
	public String getNotificacion() {
		// TODO Auto-generated method stub
		return "Soy la Notificacion.";
	}

}
