//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int myInt = 100;
        byte myByte = 127;
        short myShort = -267;
        long myLong = -4567L;
        float myFloat = 1.9F;
        double myDouble = -2.6;

        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);



        float dom = 27.12F;
        long dama = 987678965549L;
        float ruka = 2.786F;
        short sok = 569;
        int kis = -159;
        short ful = 27897;
        byte sol = 67;

        System.out.println("Значение переменной dom с типом float равно " + dom);
        System.out.println("Значение переменной dama с типом long равно " + dama);
        System.out.println("Значение переменной ruka с типом float равно " + ruka);
        System.out.println("Значение переменной sok с типом short равно " + sok);
        System.out.println("Значение переменной kis с типом int равно " + kis);
        System.out.println("Значение переменной ful с типом short равно " + ful);
        System.out.println("Значение переменной sol с типом byte равно " + sol);


        int ludaPavlova = 23;
        int annaSergeevna = 27;
        int ekateAndreeva = 30;
        int paper = 480;
        int vsegoStudent = ludaPavlova + annaSergeevna + ekateAndreeva;
        int bumagaNastudent = paper / vsegoStudent;

        System.out.println("На каждого ученика рассчитано " + bumagaNastudent + " листов бумаги");


        int zaDveMinut = 16;
        int minut = 2;

        int butlVminutu = zaDveMinut / minut;
        int dvadtmin = 20;
        int bultZaDvadtMinut = butlVminutu * dvadtmin;
        int bultZaSutki = butlVminutu * dvadtmin;
        int minutVdne = 24 * 60;
        int butlZaden = butlVminutu * minutVdne;
        int triDna = 3;
        int butlZaTriDna = butlZaden * triDna;
        int dneyVmes = 30;
        int butlZames = butlZaden * dneyVmes;


        System.out.println("За " + dvadtmin + " минут машина произвела " + bultZaDvadtMinut + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + butlZaden + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + butlZaTriDna + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + butlZames + " штук бутылок");




        int vsegoBanok = 120;
        int beloyNaklass = 2;
        int corNaklass = 4;

        int banokNaklass = beloyNaklass + corNaklass;
        int vsegoKlassov = vsegoBanok / banokNaklass;
        int whiteCans = vsegoKlassov * beloyNaklass;
        int brownCans = vsegoKlassov * corNaklass;


        System.out.println("В школе, где " + vsegoKlassov + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");



        int bananov = 5;
        int bananVes = 80;
        int molokoMl = 200;
        int vesMoloka = 105;
        int plombira = 2;
        int vesPlombira = 100;
        int yaco = 4;
        int vesYaco = 70;
        int bananovVsego = bananov * bananVes;
        int vsegoMoloko = molokoMl / 100 * vesMoloka;
        int vsegoPlombira = plombira * vesPlombira;
        int vsegoYaco = yaco * vesYaco;
        int vsegoGram = bananovVsego + vsegoMoloko + vsegoPlombira + vsegoYaco;
        double vsegoKg = vsegoGram / 1000.0;


        System.out.println("Вес завтрака: " + vsegoGram + " грамм");
        System.out.println("Вес завтрака: " + vsegoKg + " кг");




        int vesVkg = 7;
        int vesVgrammah = vesVkg * 1000;
        int teraet250 = 250;
        int teraet500 = 500;
        int dney250 = vesVgrammah / teraet250;
        int dney500 = vesVgrammah / teraet500;
        int srednee = (dney250 + dney500) / 2;

        System.out.println("Если худеть на 250 грамм в день, уйдет " + dney250 + " дней");
        System.out.println("Если худеть на 500 грамм в день, уйдет " + dney500 + " дней");
        System.out.println("В среднем потребуется " + srednee + " дней");


        double zarplataMashi = 67760;
        double zarplataDenisa = 83690;
        double zarplataKristiny = 76230;
        double nadbavkaMashi = zarplataMashi * 10 / 100;
        double novayaZpMashi = zarplataMashi + nadbavkaMashi;
        double raznicaGodMashi = (novayaZpMashi - zarplataMashi) * 12;
        double nadbavkaDenisa = zarplataDenisa * 0.1;
        double novayaZpDenisa = zarplataDenisa + nadbavkaDenisa;
        double raznicaGodDenisa = (novayaZpDenisa - zarplataDenisa) * 12;
        double nadbavkaKristiny = zarplataKristiny * 10 / 100;
        double novayaZpKristiny = zarplataKristiny + nadbavkaKristiny;
        double raznicaGodKristiny = (novayaZpKristiny - zarplataKristiny) * 12;

        System.out.println("Маша теперь получает " + novayaZpMashi + " рублей. Годовой доход вырос на " + raznicaGodMashi + " рублей");
        System.out.println("Денис теперь получает " + novayaZpDenisa + " рублей. Годовой доход вырос на " + raznicaGodDenisa + " рублей");
        System.out.println("Кристина теперь получает " + novayaZpKristiny + " рублей. Годовой доход вырос на " + raznicaGodKristiny + " рублей");

    }
}
