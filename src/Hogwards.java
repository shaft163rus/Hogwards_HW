abstract public class Hogwards {

    private String name;
    private int spellPower;
    private int teleportDistance;


    public Hogwards(String name, int spellPower, int teleportDistance) {
        this.name = name;
        this.spellPower = spellPower;
        this.teleportDistance = teleportDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTeleportDistance() {
        return teleportDistance;
    }

    public void setTeleportDistance(int teleportDistance) {
        this.teleportDistance = teleportDistance;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", spellPower=" + spellPower +
                ", teleportDistance=" + teleportDistance;
    }



    public void compareBaseStats(Hogwards student){
        int thisStudent = this.spellPower + this.teleportDistance;
        int secondStudent = student.spellPower + student.teleportDistance;

        if (thisStudent > secondStudent) {
            System.out.println(this.getName() + " stronger student than " + student.getName());
        } else if (thisStudent == secondStudent) {
            System.out.println("Power of students is same");
        } else {
            System.out.println(student.getName() + " stronger student than " + this.getName());

        }

    }



}
