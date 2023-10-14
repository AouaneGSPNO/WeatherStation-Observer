public class Main {
  public static void main(String[] args) {

    WeatherStation station = new WeatherStation ();

  CurrentConditionsDisplay disp1 = new CurrentConditionsDisplay ();
  ForeCastDisplay disp2 = new ForeCastDisplay ();

        station.ajouterObserver (disp1);
        station.ajouterObserver (disp2);

  // Simulation de mises à jour météorologiques
        station.setMesures(05.0, 20.0, 1000.7);
        station.setMesures(30.5, 51.0, 1200.1);
}
}
