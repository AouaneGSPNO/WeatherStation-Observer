import java.util.ArrayList;
import java.util.List;

public class WeatherStation {


    private List<Observer> Observers = new ArrayList<> ();
    private double temperature;
    private double humidite;
    private double pression;

    public void ajouterObserver(Observer Observer) {
      Observers.add(Observer);
    }

    public void supprimerObserver(Observer Observer) {
      Observers.remove(Observer);
    }

    public void notifierObservers() {
      for (Observer Observer : Observers) {
        Observer.update(temperature, humidite, pression);
      }
    }

    public void setMesures(double temperature, double humidite, double pression) {
      this.temperature = temperature;
      this.humidite = humidite;
      this.pression = pression;
      notifierObservers();
    }
}
