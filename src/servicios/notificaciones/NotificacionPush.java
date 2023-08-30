package servicios.notificaciones;

public class NotificacionPush implements Notificacion {

    @Override
    public void notificar() {
        System.out.println("Insertando campanita de alarma");
    }
    
}
