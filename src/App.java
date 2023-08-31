/*PATRON METODO FABRICA O METHOD FACTORY que devuelve objetos llamados productos */

import servicios.notificaciones.Canal;
import servicios.notificaciones.Notificacion;
import servicios.notificaciones.NotificacionFactory;

public class App {
  public static void main(String[] args) throws Exception {
    /* System.out.println("Hello, World!"); */

    NotificacionFactory notificacionFactory = new NotificacionFactory();

    //Notificacion notificacion = notificacionFactory.crearNotificacion(Canal.WHATSAPP);

    Notificacion notificacion = notificacionFactory.crearNotificacion(Canal.SMS);
    notificacion.notificar();

  }
}
