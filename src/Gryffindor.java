public class Gryffindor extends Hogwards {

    public int nobility;
    public int honor;
    public int bravery;

    public Gryffindor(String name, int spellPower, int teleportDistance, int nobility, int honor, int bravery) {
        super(name, spellPower, teleportDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + " ," +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }

    public void compareTo(Gryffindor student) {
        int thisStudent = this.bravery + this.honor + this.nobility;
        int secondStudent = student.bravery + student.honor + student.nobility;

        if (thisStudent > secondStudent) {
            System.out.println(this.getName() + " stronger Gryffindor student than " + student.getName());
        } else if (thisStudent == secondStudent) {
            System.out.println("Power of students is same");
        } else {
            System.out.println(student.getName() + " stronger Gryffindor student than " + this.getName());

        }
    }



}
