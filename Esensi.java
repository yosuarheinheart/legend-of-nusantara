/**
 *
 * @author AlcastraxGroup
 */

public abstract class Esensi {

    double health, speed, attack, defend, damage;
    private String name, profil, skill1Name, skill2Name, ultimateName;
    private int energy, cd1, cd2;

    public abstract void basicAttack(Karakter karakterDiserang);

    public abstract void skill1(Karakter karakterDiserang);

    public abstract void skill2(Karakter karakterDiserang);

    public abstract void ultimateSkill(Karakter karakterDiserang);

    public abstract void statusKarakter();

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String newProfil) {
        this.profil = newProfil;
    }

    public String getSkill1Name() {
        return skill1Name;
    }

    public void setSkill1Name(String newskill1Name) {
        this.skill1Name = newskill1Name;
    }

    public String getSkill2Name() {
        return skill2Name;
    }

    public void setSkill2Name(String newskill2Name) {
        this.skill2Name = newskill2Name;
    }

    public String getUltimateName() {
        return ultimateName;
    }

    public void setUltimateName(String newultimateName) {
        this.ultimateName = newultimateName;
    }

    public double getHealth() {
        if (health < 0) {
            return 0;
        }
        return health;
    }

    public void setHealth(double newHealth) {
        this.health = newHealth;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double newSpeed) {
        this.speed = newSpeed;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double newAttack) {
        this.attack = newAttack;
    }

    public double getDefend() {
        return defend;
    }

    public void setDefend(double newDefend) {
        this.defend = newDefend;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double newDamage) {
        this.damage = newDamage;
    }

    public int getEnergy() {
        if (energy > 100) {
            energy = 100;
        }
        return energy;
    }

    public void setEnergy(int newEnergy) {
        this.energy = newEnergy;
    }

    public int getCD1() {
        return cd1;
    }

    public void setCD1(int newCD1) {
        this.cd1 = newCD1;
    }

    public int getCD2() {
        return cd2;
    }

    public void setCD2(int newCD2) {
        this.cd2 = newCD2;
    }

    public void endTurn(Karakter sekarang, Karakter selanjut) {
        if (sekarang.getCD1() > 0) {
            sekarang.setCD1(sekarang.getCD1() - 1);
        }

        if (sekarang.getCD2() > 0) {
            sekarang.setCD2(sekarang.getCD2() - 1);
        }

        if (selanjut.getCD1() > 0) {
            selanjut.setCD1(selanjut.getCD1() - 1);
        }

        if (selanjut.getCD2() > 0) {
            selanjut.setCD2(selanjut.getCD2() - 1);
        }

        sekarang.setSpeed(sekarang.getSpeed() - 200);
        selanjut.setSpeed(selanjut.getSpeed() + 200);
    }
}