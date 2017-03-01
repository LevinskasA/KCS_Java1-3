package uzd1_8;

import java.util.Scanner;

/**
 * Created by Askew on 2/27/2017.
 */
public class uzd1_8 {
    public static void main(String[] args) {
        uzd1_8 p = new uzd1_8();
        Duomenys duomenys = p.ivestis();

        System.out.println("Vidutines kuro sanaudos: " +
                p.skaiciuotiVidurki(duomenys) + " litru per 100 kilometru");
    }

    private Duomenys ivestis() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotu km kieki:");
        double kilometrai = scanner.nextDouble();
        System.out.println("Iveskite sunaudoto kuro kieki:");
        double kuroKiekis = scanner.nextDouble();

        Duomenys duomenys = new Duomenys(kilometrai, kuroKiekis);
        return duomenys;

    }

    private double skaiciuotiVidurki(Duomenys duomenys) {
        return duomenys.getKuroKiekis() * 100 / duomenys.getKilometrai();
    }

    private class Duomenys {
        private double kilometrai;
        private double kuroKiekis;

        public double getKilometrai() {
            return kilometrai;
        }

        public double getKuroKiekis() {
            return kuroKiekis;
        }

        Duomenys(double kilometrai, double kuroKiekis) {
            this.kilometrai = kilometrai;
            this.kuroKiekis = kuroKiekis;
        }
    }
}
