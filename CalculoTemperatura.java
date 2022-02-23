public class CalculoTemperatura {
    public static void main (String [] args){
       double temperaturaEmFahrenheit;
       double temperaturaEmKelvin;
       double temperaturaEmReaumur;
       double temperaturaEmRankine;
       double temperaturaEmCelsius = 40.0;
       
 
        temperaturaEmFahrenheit = ((temperaturaEmCelsius * 1.8)+32);
        System.out.println("A temperatura em graus Fahrenheit é " + temperaturaEmFahrenheit);

        temperaturaEmKelvin = (temperaturaEmCelsius + 273.15);
        System.out.println("A temperatura em graus Kelvin é " + temperaturaEmKelvin);

        temperaturaEmReaumur = temperaturaEmCelsius * 0.8;
        System.out.println("A temperatura em graus Reamur é " + temperaturaEmReaumur);

        temperaturaEmRankine =((temperaturaEmCelsius * 1.8) + 32 + 459.67);
        System.out.println("A temperatura em graus Rankine é " + temperaturaEmRankine);
 
}

    
}
