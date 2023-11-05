package serveur;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServeurJWS {
    public static void main(String[] args) {
        // Spécifiez l'URL à laquelle vous souhaitez publier le service web
        String url ="http://localhost:8084/";
        // Utilisez la classe Endpoint pour publier le service web à l'URL spécifiée
        // et utilisez l'implémentation de la classe "CalculatriceWS" pour gérer les requêtes
        Endpoint.publish(url,new CalculatriceWS());
        // Affiche l'URL à laquelle le service web a été publié
        System.out.println(url);
    }
}
