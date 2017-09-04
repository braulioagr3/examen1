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
        int Acc;
        Acc = buscaPlacas(placas);
        int Tarifa;
        if(Acc != -1)
        {
            Tarifa = calaculaTarifa(Capacidad[Acc],Hora,Minuto,Acc);
            System.out.println(Tarifa);
        }
        else
        {
            System.out.println("vehículo no se encuentra registrado y no podrá calcular el costo del estacionamiento.");
        }
    }
    private int buscaPlacas(String placas)
    {
        for(int i  = 0;i<Capacidad.length;i++)
        {
            if(placas == Capacidad[i].damePlacas())
            {
                return i;
            }
        }
        return -1;
    }
    public int calaculaTarifa(vehiculo auto, int Hora, int Minuto, int Acc)
    {
        int tarifa = 0;
        int horasTotales;
        int minutosTotales;
        horasTotales = Hora - Capacidad[Acc].dimeHora();
        minutosTotales = Hora - Capacidad[Acc].dimeMinuto();
        tarifa = horasTotales * 15;
        //Esta indeciso con la validacion
        /*if(minutosTotales != 0)
        {
            tarifa+=15;
        }*/
        tarifa+=15;
        return tarifa;
    }
}