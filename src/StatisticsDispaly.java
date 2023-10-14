public class StatisticsDispaly implements Observer{
  private double temperature;
  private double humidite;
  private double pression;

  @Override
  public void update(double temperature, double humidite, double pression) {
    this.temperature = temperature;
    this.humidite = humidite;
    this.pression = pression;
    display ();
  }

  public void display() {
    System.out.println("***************************** StatisticsDisplay *************");

    System.out.println("Conditions météo actuelles :");
    System.out.println("Température : " + temperature + " °C");
    System.out.println("Humidité : " + humidite + " %");
    System.out.println("Pression atmosphérique : " + pression + " hPa");
  }
  public void unregister() {
    System.out.println("vous n'êtes plus autorisés a recevoir des notifications !!");

  }
}
