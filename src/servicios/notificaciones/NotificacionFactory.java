package servicios.notificaciones;

public class NotificacionFactory {
   
    public Notificacion crearNotificacion(Canal canal) {

     /*  if(canal == null || canal.isEmpty()){
            return null; }*/ 
        
        switch (canal) {
            case SMS:
            return new NotificacionSMS();
             case WHATSAPP:
            return new NotificacionWhatsapp();
             case EMAIL:
            return new NotificacionEmail();
             case PUSH:
            return new NotificacionPush();
            default:
            throw new IllegalArgumentException("Canal"+canal+" desconocido");
        }
    }
}
