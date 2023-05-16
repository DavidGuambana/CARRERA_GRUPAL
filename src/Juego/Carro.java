
package Juego;

public class Carro {
    private String url;
    private int milisegundos;

    public Carro() {
    }

    public Carro(String url, int milisegundos) {
        this.url = url;
        this.milisegundos = milisegundos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getMilisegundos() {
        return milisegundos;
    }

    public void setMilisegundos(int milisegundos) {
        this.milisegundos = milisegundos;
    }

    @Override
    public String toString() {
        return "Carro{" + "url=" + url + ", milisegundos=" + milisegundos + '}';
    }

    
}
