public class Slytherin extends Hogwards {
    public int trickery;
    public int resoluteness;
    public int decisiveness;
    public int ingenuity;
    public int lustForPower;

    public Slytherin(String name, int spellPower, int teleportDistance, int trickery, int resoluteness, int decisiveness, int ingenuity, int lustForPower) {
        super(name, spellPower, teleportDistance);
        this.trickery = trickery;
        this.resoluteness = resoluteness;
        this.decisiveness = decisiveness;
        this.ingenuity = ingenuity;
        this.lustForPower = lustForPower;
    }

    public int getTrickery() {
        return trickery;
    }

    public void setTrickery(int trickery) {
        this.trickery = trickery;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String toString() {
        return super.toString() + " ," +
                "trickery=" + trickery +
                ", resoluteness=" + resoluteness +
                ", decisiveness=" + decisiveness +
                ", ingenuity=" + ingenuity +
                ", lustForPower=" + lustForPower;
    }


    public void compareTo(Slytherin student) {
        int thisStudent = this.decisiveness + this.ingenuity+ this.lustForPower + this.resoluteness + this.trickery;
        int secondStudent = student.decisiveness + student.ingenuity + student.lustForPower + student.resoluteness + this.trickery;

        if (thisStudent > secondStudent) {
            System.out.println(this.getName() + " stronger Slytherin student than " + student.getName());
        } else if (thisStudent == secondStudent) {
            System.out.println("Power of students is same");
        } else {
            System.out.println(student.getName() + " stronger Slytherin student than " + this.getName());

        }
    }
}
