public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Harry Potter", 50, 51, 52, 53, 54);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 52, 51, 52, 55, 54);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 50, 51, 52, 53, 54);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 40, 41,42,43,44);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 40, 47,42,48,44);
        Hufflepuff justinFinch = new Hufflepuff("Justin Finch", 40, 48,42,43,44);

        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 30, 31, 32, 33, 34, 35);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 40, 41, 72, 23, 4, 25);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 50, 41, 82, 13, 94, 85);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 21, 22,23, 24, 25,26,27);
        Slytherin grahamMontagu = new Slytherin("Graham Montagu", 31, 52,23, 64, 25,76,27);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 41, 32,23, 64, 25,66,27);


        System.out.println(harryPotter);
        System.out.println(zachariasSmith);
        System.out.println(zhouChang);
        System.out.println(gregoryGoyle);

        System.out.println();

        harryPotter.compareTo(hermioneGranger);
        harryPotter.compareBaseStats(zhouChang);

        padmaPatil.compareTo(marcusBelby);

        dracoMalfoy.compareTo(grahamMontagu);




    }




}