package Cwiczenie4;

public class Main {

    public static void main(String[] args) {

        System.out.println("Zadanie 1: Obliczanie oceny");
        int liczbaDoOceny = 75;
        obliczOcene(liczbaDoOceny);
        System.out.println();

        //Zadanie 2
        System.out.println("Zadanie 2: Konwerter temperatury");
        double wartoscTemperatury = 25.0;
        char jednostkaTemperatury = 'C';
        konwertujTemperature(wartoscTemperatury, jednostkaTemperatury);

        wartoscTemperatury = 68.0;
        jednostkaTemperatury = 'F';
        konwertujTemperature(wartoscTemperatury, jednostkaTemperatury);
        System.out.println();

        // Zadanie 3
        System.out.println(" Zadanie 3-Sprawdzanie liczby parzystej lub mieparzystej");
        int liczbaDoSprawdzenia = 10;
        sprawdzParzystosc(liczbaDoSprawdzenia);

        liczbaDoSprawdzenia = 7;
        sprawdzParzystosc(liczbaDoSprawdzenia);

        liczbaDoSprawdzenia = 25;
        sprawdzParzystosc(liczbaDoSprawdzenia);
    }

    public static void obliczOcene(int liczba) {
        if (liczba < 0 || liczba > 100) {
            System.out.println("Błąd: Liczba musi być między 0 a 100.");
        } else if (liczba >= 90) {
            System.out.println("Ocena: A");
        } else if (liczba >= 80) {
            System.out.println("Ocena: B");
        } else if (liczba >= 70) {
            System.out.println("Ocena: C");
        } else if (liczba >= 60) {
            System.out.println("Ocena: D");
        } else {
            System.out.println("Ocena: F");
        }
    }

    public static void konwertujTemperature(double wartosc, char jednostka) {
        double przeliczonaTemperatura;
        if (jednostka == 'F' || jednostka == 'f') {
            przeliczonaTemperatura = (wartosc - 32) * 5.0 / 9.0;
            System.out.println(wartosc + "°F to " + przeliczonaTemperatura + "°C");
        } else if (jednostka == 'C' || jednostka == 'c') {
            przeliczonaTemperatura = (wartosc * 9.0 / 5.0) + 32;
            System.out.println(wartosc + "°C to " + przeliczonaTemperatura + "°F");
        } else {
            System.out.println("Nieznana jednostka temperatury. Proszę użyć 'C' lub 'F'.");
        }
    }

    public static void sprawdzParzystosc(int liczba) {
        if (liczba % 2 == 0) {
            System.out.print("Liczba " + liczba + " jest parzysta.");
            if (liczba % 5 == 0) {
                System.out.println(" I jest również wielokrotnością 5.");
            } else {
                System.out.println();
            }
        } else {
            System.out.println("Liczba " + liczba + " jest nieparzysta.");
        }
    }
}

