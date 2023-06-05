public class Hufflepuff extends Hogwards{
    public int diligence;
    public int loyalty;
    public int honesty;

    public Hufflepuff(String name, int spellPower, int teleportDistance, int diligence, int loyalty, int honesty) {
        super(name, spellPower, teleportDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + " ," +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty              ;
    }

    public void compareTo(Hufflepuff student) {
        int thisStudent = this.diligence + this.honesty + this.loyalty;
        int secondStudent = student.diligence + student.honesty + student.loyalty;

        if (thisStudent > secondStudent) {
            System.out.println(this.getName() + " stronger Hufflepuff student than " + student.getName());
        } else if (thisStudent == secondStudent) {
            System.out.println("Power of students is same");
        } else {
            System.out.println(student.getName() + " stronger Hufflepuff student than " + this.getName());

        }
    }
}
