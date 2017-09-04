public class Estacionamiento
{
    private vehiculo[] Capacidad;
    Estacionamiento()
    {
        Capacidad = new vehiculo[150];
    }
    public void ingresaVehiculo(vehiculo nuevoVehiculo)
    {
        for(int i  = 0;i<Capacidad.length;i++)
        {
            if(Capacidad[i] == null)
            {
                Capacidad[i] = nuevoVehiculo;
                break;
            }
        }
    }
    public void sacaVehiculo(String placas, int Hora, int Minuto)
    {
        boolean Acc;
        Acc = buscaPlacas(placas);
        int Tarifa;
        if(Acc == true)
        {
            Tarifa = calaculaTarifa(Hora,Minuto);
            System.out.println(Tarifa);
        }
        else
        {
            System.out.println("vehículo no se encuentra registrado y no podrá calcular el costo del estacionamiento.");
        }
    }
    public boolean buscaPlacas(String placas)
    {
        for(int i  = 0;i<Capacidad.length;i++)
        {
            if(placas == Capacidad[i].damePlacas())
            {
                return true;
            }
        }
        return false;
    }
    public int calaculaTarifa(int Hora, int Minuto)
    {
        int tarifa;
        
        return tarifa;
    }
}