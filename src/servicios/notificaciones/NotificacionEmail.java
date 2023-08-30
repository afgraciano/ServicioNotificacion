package servicios.notificaciones;

public class NotificacionEmail implements Notificacion {

    @Override
    public void notificar() {
      
        System.out.println("Enviando un mensaje de correo");
    }
    
}
