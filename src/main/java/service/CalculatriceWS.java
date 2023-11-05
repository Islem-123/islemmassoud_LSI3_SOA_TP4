package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

// Définition de la classe CalculatriceWS comme un service web
@WebService
public class CalculatriceWS {
    // Définition d'une méthode web appelée "Somme"
    // Elle prend deux paramètres et renvoie un résultat de type double
    @WebMethod
    public double Somme(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        // Additionne les deux paramètres "a" et "b" et renvoie le résultat
        return a + b;
    }
}
