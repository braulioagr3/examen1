public class vehiculo
{
    private String placas = "";
    private int Hora;
    private int Minuto;
    vehiculo(String placas, int Hora, int Minuto)
    {
        this.placas = placas;
        this.Hora = Hora;
        this.Minuto = Minuto;
    }
    public String damePlacas()
    {
        return placas;
    }
    public int dimeHora()
    {
        return Hora;
    }
    public int dimeMinuto()
    {
        return Minuto;
    }
}