package servicios.notificaciones;

public class NotificacionWhatsapp implements Notificacion {

    @Override
    public void notificar() {
      
        System.out.println("Eviando un mensaje de Whatsapp");
    }
    
    
}
