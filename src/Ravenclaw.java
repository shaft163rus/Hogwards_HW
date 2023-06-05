public class Ravenclaw extends Hogwards {
    public int intelligence;
    public int knowledge;
    public int wittiness;
    public int creativity;

    public Ravenclaw(String name, int spellPower, int teleportDistance, int intelligence, int knowledge, int wittiness, int creativity) {
        super(name, spellPower, teleportDistance);
        this.intelligence = intelligence;
        this.knowledge = knowledge;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }


    public String toString() {
        return super.toString() + " ," +
                "intelligence=" + intelligence +
                ", knowledge=" + knowledge +
                ", wittiness=" + wittiness +
                ", creativity=" + creativity;
    }

    public void compareTo(Ravenclaw student) {
        int thisStudent = this.creativity + this.intelligence + this.knowledge +this.wittiness;
        int secondStudent = student.creativity + student.intelligence + student.knowledge +student.wittiness;

        if (thisStudent > secondStudent) {
            System.out.println(this.getName() + " stronger Ravenclaw student than " + student.getName());
        } else if (thisStudent == secondStudent) {
            System.out.println("Power of students is same");
        } else {
            System.out.println(student.getName() + " stronger Ravenclaw student than " + this.getName());

        }
    }
}
