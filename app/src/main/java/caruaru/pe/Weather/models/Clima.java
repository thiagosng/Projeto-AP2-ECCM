package caruaru.pe.Weather.models;

public class Clima {

    private String cidade;
    private String temperatura,temperatura2;
    private String temperaturaMaxima;
    private String temperaturaMinima;
    private String humidade;
    private String descricao;


    public String getTemperatura2(){return temperatura2;}

    public void setTemperatura2(String temperatura2) {
        this.temperatura2 = temperatura2;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTemperatura() {
        return temperatura;
    }


    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(String temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public String getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(String temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public String getHumidade() {
        return humidade;
    }

    public void setHumidade(String humidade) {
        this.humidade = humidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}


