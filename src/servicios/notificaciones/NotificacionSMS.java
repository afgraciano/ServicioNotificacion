package servicios.notificaciones;

public class NotificacionSMS implements Notificacion {

    @Override
    public void notificar() {
        System.out.println("Eviando un mensaje de SMS");
    }
    
}
