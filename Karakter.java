/**
 *
 * @author AlcastraxGroup
 */

public class Karakter extends Esensi {

    public Karakter(double health, double speed, double defend, double attack) {
        this.health = health;
        this.speed = speed;
        this.defend = defend;
        this.attack = attack;
    }

    @Override
    public void basicAttack(Karakter karakterDiserang) {
        if (karakterDiserang.getDefend() > getAttack()) {
            setDamage(0.3 * getAttack());
        } else {
            setDamage(getAttack());
        }
        karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
        setEnergy(getEnergy() + 10);

        System.out.println(
                getName() + " memberikan damage sebesar " + getDamage() + " kepada " + karakterDiserang.getName()
                        + ".");
    }

    @Override
    public void skill1(Karakter karakterDiserang) {
    }

    @Override
    public void skill2(Karakter karakterDiserang) {
    }

    @Override
    public void ultimateSkill(Karakter karakterDiserang) {
    }

    @Override
    public void statusKarakter() {
        System.out.println("\n" + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Attack: " + getAttack());
        System.out.println("Defence: " + getDefend());
        System.out.println("Speed: " + getSpeed() + "\n");
    }

    public class SiButa extends Karakter {
        public SiButa() {
            super(900, 60, 45, 45);
            setName("Si Buta Gua Hantu");
            setProfil(
                    "Si Buta dari Gua Hantu adalah karakter legendaris dalam cerita rakyat Indonesia yang dikenal karena keberaniannya dalam menghadapi berbagai rintangan di gua hantu yang misterius. "
                            + "Dia memiliki kekuatan fisik yang luar biasa dan kepekaan yang tajam terhadap setiap ancaman yang mengintai.");
            setSkill1Name("Bola energi Ghaib");
            setSkill2Name("Surya Prayanama");
            setUltimateName("Gelap Terang");
        }

        @Override
        public void skill1(Karakter karakterDiserang) {
            setDamage(150);

            if (getCD1() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setEnergy(getEnergy() + 20);
                setCD1(5);

                System.out.println(
                        "Dengan kecepatan kilat, " + getName()
                                + " muncul di depan musuh dengan tendangan keras, menghantamnya dengan kekuatan yang tak terduga.");
                System.out.println(getName() + " memberikan " + getDamage() + " kepada " + karakterDiserang.getName());
            }
        }

        @Override
        public void skill2(Karakter karakterDiserang) {
            setDamage(80);
            if (getCD2() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setEnergy(getEnergy() + 40);
                setCD2(5);

                System.out.println(getName()
                        + " menyerap energi alam dan memfokuskannya di pankreas secara maksimal hingga menambahkan energi sebesar"
                        + "40 poin" + "dan melepaskan pancaran kafir yang menyebabkan pengurangan hp"
                        + karakterDiserang.getName()
                        + " sebesar " + getDamage());
            }
        }

        @Override
        public void ultimateSkill(Karakter karakterDiserang) {
            setDamage(250);

            if (getEnergy() >= 100) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setEnergy(0);

                System.out.println(
                        getName()
                                + " memanggil kekuatan mistis dari gua hantu, menyerap kegelapan dan menyalurkannya dalam serangan hebat yang menyala terang, menghancurkan musuh-musuhnya. ");
                System.out.println(getName() + " memberikan damage sebesar " + getDamage() + ".");
            }
        }
    }

    public class RatuKencanaWungu extends Karakter {
        public RatuKencanaWungu() {
            super(850, 35, 25, 35);
            setName("Ratu Kencana Wungu");
            setProfil(
                    "Ratu Kencana Wungu adalah karakter legendaris dalam mitos Jawa yang dikenal karena kecantikannya yang luar biasa serta kekuatan magisnya yang dahsyat. Dia adalah simbol kebaikan dan kebijaksanaan, namun juga memiliki kemampuan bertarung yang hebat.");
            setSkill1Name("Gemuruh Kilat");
            setSkill2Name("Pesona Gemilang");
            setUltimateName("Kilauan Permata Indera");
        }

        @Override
        public void skill1(Karakter karakterDiserang) {
            setDamage(150);

            if (getCD1() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setEnergy(getEnergy() + 20);
                setCD1(6);

                System.out.println(
                        getName()
                                + " memanggil energi petir yang dahsyat untuk menyerang musuh dengan kekuatan alam yang mengagumkan. ");
                System.out.println(getName() + " memberikan damage sebesar " + getDamage());
            }
        }

        @Override
        public void skill2(Karakter karakterDiserang) {

            if (getCD2() <= 0) {
                setHealth(getHealth() + 100);
                setEnergy(getEnergy() + 20);
                setCD2(5);

                System.out.println(
                        "Dengan keindahan dan keanggunannya, "
                                + getName() + " mempesona musuh-musuhnya, melemahkan mereka dengan pesona magisnya.");
                System.out.println(getName() + " menyembuhkan 100 HP pada dirinya.");
            }
        }

        @Override
        public void ultimateSkill(Karakter karakterDiserang) {
            setDamage(200);

            if (getEnergy() >= 100) {
                setHealth(getHealth() + 150);
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setEnergy(0);

                System.out.println(
                        getName()
                                + " mengeluarkan kekuatan penuh dari permata indahnya, menyebabkan serangan magis yang dahsyat serta menyembuhkan dirinya sendiri. ");
                System.out.println(
                        getName() + " menyembuhkan dirinya sendiri sebesar 150 poin dan memberikan damage sebesar "
                                + getDamage() + " kepada " + karakterDiserang.getName());
            }
        }
    }

    public class SiTangkurak extends Karakter {
        public SiTangkurak() {
            super(800, 60, 40, 40);
            setName("Si Tangkurak yang Sakti");
            setProfil(
                    "Si Tangkurak adalah makhluk legendaris dalam mitologi Indonesia yang dikenal karena kecepatan dan kelincahannya yang luar biasa. Dia selalu siap untuk melindungi hutan dan makhluk makhluk kecil di dalamnya dari ancaman yang datang.");
            setSkill1Name("Serangan Kilat");
            setSkill2Name("Makan Ligat");
            setUltimateName("Hujan Panah Ranting");
        }

        @Override
        public void skill1(Karakter karakterDiserang) {
            setDamage(125);

            if (getCD1() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setEnergy(getEnergy() + 20);
                setCD1(5);

                System.out.println(getName() + " meluncur seperti kilat, menyerang dengan kecepatan yang luar biasa. ");
                System.out.println(getName() + " memberikan damage sebesar " + getDamage());
            }
        }

        @Override
        public void skill2(Karakter karakterDiserang) {

            if (getCD2() <= 0) {
                setHealth(getHealth() + 75);
                setEnergy(getEnergy() + 20);
                setCD2(4);

                System.out.println(getName() + " mengambil seblak dan memakannya dengan ligat.");
                System.out.println(getName() + " memulihkan 75 HP .");
            }
        }

        @Override
        public void ultimateSkill(Karakter karakterDiserang) {
            setDamage(400);

            if (getEnergy() >= 100) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setEnergy(0);

                System.out.println(
                        getName()
                                + " memanggil kekuatan alam, membuat hujan panah ranting yang meluncur ke arah musuh dengan kecepatan tinggi. ");
                System.out.println(getName() + " memberikan memberikan damage sebesar " + getDamage() + " kepada "
                        + karakterDiserang.getName() + ".");
            }
        }
    }

    public class RadenKianSantang extends Karakter {
        public RadenKianSantang() {
            super(800, 80, 30, 30);
            setName("Raden Kian Santang");
            setProfil(
                    "Raden Kian Santang adalah putra prabu siliawangi yang terkenal cerdik dan pandai dalam menyusun strategi dan bertarung dengan kemampuan fisik maupun kemampuan magisnya.");
            setSkill1Name("Siasat Licik");
            setSkill2Name("Seni Silat");
            setUltimateName("Triwulan Licik");
        }

        @Override
        public void skill1(Karakter karakterDiserang) {
            setDamage(130);

            if (getCD1() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setEnergy(getEnergy() + 20);
                setCD1(5);

                System.out.println(
                        getName()
                                + " memanfaatkan tipu daya untuk menipu musuhnya, menyebabkan mereka bingung dan membuka celah untuk serangan.");
                System.out.println(
                        getName() + " memberikan damage sebesar "
                                + getDamage() + " kepada " + karakterDiserang.getName());
            } else {
                System.out.println("Skill \"" + getSkill1Name() + "\" sedang cooldown selama " + getCD1() + ".");
            }
        }

        @Override
        public void skill2(Karakter karakterDiserang) {
            setDamage(50);

            if (getCD2() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                karakterDiserang.setSpeed(karakterDiserang.getSpeed() - 200);
                setSpeed(getSpeed() + 200);
                setEnergy(getEnergy() + 20);
                setCD2(6);

                System.out.println(
                        getName()
                                + " menciptakan hentakan kuntao sekaligus meninggalkan ilusi bayangan yang  menimbulkan luka kritis dan membingungkan pandangan "
                                + karakterDiserang.getName());
                System.out.println(
                        getName() + " berhasil memberikan dampak pengurangan hp sebesar " + getDamage() + " kepada "
                                + karakterDiserang.getName());
            }
        }

        @Override
        public void ultimateSkill(Karakter karakterDiserang) {
            setDamage(300);

            if (getEnergy() >= 100) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                karakterDiserang.setSpeed(karakterDiserang.getSpeed() - 200);
                setSpeed(getSpeed() + 200);
                setEnergy(0);

                System.out.println(
                        getName()
                                + " mengatur sebuah tipuan besar-besaran, membuat musuh-musuhnya jatuh ke dalam perangkap yang dia siapkan. ");
                System.out.println(getName() + " memberikan memberikan damage sebesar " + getDamage()
                        + " dan menipu " + karakterDiserang.getName() + ".");
            }
        }
    }

    public class RajaBrawijaya extends Karakter {
        public RajaBrawijaya() {
            super(850, 60, 70, 40);
            setName("Raja Brawijaya");
            setProfil(
                    "Raja Brawijaya adalah tokoh legendaris dari kerajaan Majapahit yang dikenal karena kebijaksanaan dan kekuasaannya. Dia memiliki kekuatan magis yang kuat serta kemampuan bertempur yang mematikan.");
            setSkill1Name("Kilatan Magis");
            setSkill2Name("Cahaya Kebijaksanaan");
            setUltimateName("Keagungan Raja");
        }

        @Override
        public void skill1(Karakter karakterDiserang) { // Ada stun pada skill 2
            setDamage(70);

            if (getCD1() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                karakterDiserang.setSpeed(karakterDiserang.getSpeed() - 200);
                setSpeed(getSpeed() + 200);
                setEnergy(getEnergy() + 20);
                setCD1(5);

                System.out.println(
                        getName()
                                + " melemparkan kilatan magis yang kulit " + karakterDiserang.getName()
                                + ", sekaligis menyilaukan musuh yang menyebabkan penglihatan terganggu dan memanfaatkan moentum untuk menusuk dengan pedang keagungannya.");
                System.out.println(
                        getName() + " memberikan damage sebesar " + getDamage() + " kepada "
                                + karakterDiserang.getName());
            }
        }

        @Override
        public void skill2(Karakter karakterDiserang) {

            if (getCD2() <= 0) {
                setAttack(getAttack() + (getAttack() * 0.3));
                setEnergy(getEnergy() + 20);
                setCD2(3);

                System.out.println(
                        getName()
                                + " memanggil cahaya untuk menyinari medan pertempuran, memberikan panduan ilahi sehingga musuh tidak dapat maju untuk menyerangnya.");
                System.out.println(
                        getName()
                                + " meningkatkan attack sebesar 30%.");
            }
        }

        @Override
        public void ultimateSkill(Karakter karakterDiserang) {
            setDamage(300);

            if (getEnergy() >= 100) {
                setAttack(getAttack() + 10);
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setEnergy(0);

                System.out.println(
                        getName()
                                + " mengeluarkan kekuatan magis yang mengguncang medan pertempuran, menghancurkan musuh dengan kekuatan yang tak terbantahkan.");
                System.out.println(
                        getName() + " meningkatkan attack sebesar 10 poin dan memberikan damage sebesar "
                                + getDamage() + " kepada " + karakterDiserang.getName());
            }
        }
    }

    public class Sangkuriang extends Karakter {
        public Sangkuriang() {
            super(800, 60, 40, 50);
            setName("Sangkuriang");
            setProfil(
                    "Sangkuriang adalah karakter yang terinspirasi Anak dari Raja Sunda yang tidak sengaja jatuh cinta pada ibunya sendiri. Dia adalah pejuang yang kuat dengan kekuatan supernatural, tetapi terkadang terkendala oleh emosinya yang bergejolak.");
            setSkill1Name("Serangan Emosional");
            setSkill2Name("Kuasa Ibu");
            setUltimateName("Amarah anak raja");
        }

        @Override
        public void skill1(Karakter karakterDiserang) { // Menyebabkan stun selama satu putaran
            setDamage(100);

            if (getCD1() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                karakterDiserang.setSpeed(karakterDiserang.getSpeed() - 200);
                setSpeed(getSpeed() + 200);
                setEnergy(getEnergy() + 20);
                setCD1(6);

                System.out.println(
                        getName()
                                + " melepaskan serangan kuat yang dipengaruhi oleh emosinya yang bergejolak, meningkatkan kekuatan serangannya.");
                System.out.println(
                        getName() + " memberikan damage sebesar " + getDamage() + " kepada "
                                + karakterDiserang.getName() + " serta menjatuhkan mereka.");
            }
        }

        @Override
        public void skill2(Karakter karakterDiserang) {

            if (getCD2() <= 0) {
                setDefend(getDefend() + (getDefend() * 0.2));
                setEnergy(getEnergy() + 20);
                setCD2(4);

                System.out.println(
                        getName()
                                + " mendapatkan kekuatan perlindungan dari ibunya, meningkatkan pertahanannya terhadap serangan musuh.");
                System.out.println(
                        getName()
                                + " meningkatkan defense karakter sebesar 20%.");
            }
        }

        @Override
        public void ultimateSkill(Karakter karakterDiserang) {
            setDamage(200);

            if (getEnergy() >= 100) {
                setHealth(getHealth() - 40);
                setDefend(getDefend() * 0.4);
                setEnergy(0);

                System.out.println(
                        getName()
                                + " memanggil kekuatan terakhirnya, membebaskan amarahnya yang terpendam yang dipengaruhi oleh konflik batinnya sehingga menghasilkan gelombang energi yang menghancurkan musuh sekitarnya.");
                System.out.println(
                        getName() + " mengorbankan HP-nya sebesar 40 untuk memberikan memberikan damage sebesar "
                                + getDamage() + " kepada " + karakterDiserang.getName()
                                + " dan mengurangi defensenya sebesar 40%.");
            }
        }
    }

    public class RaraJonggrang extends Karakter {
        public RaraJonggrang() {
            super(750, 80, 50, 65);
            setName("Rara Jonggrang");
            setProfil(
                    "Rara Jonggrang adalah putri kerajaan Jawa yang cerdas dan kuat. Dia dikenal karena kecantikannya dan keberaniannya dalam menghadapi tantangan. Rara Jonggrang adalah pejuang yang memadukan keahlian bertarung dengan kebijaksanaan. ");
            setSkill1Name("Pancaran Kebijaksanaan Abadi");
            setSkill2Name("Aura Penakluk");
            setUltimateName("Amarah anak raja");
        }

        @Override
        public void skill1(Karakter karakterDiserang) {
            setDamage(75);

            if (getCD1() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                karakterDiserang.setAttack(karakterDiserang.getAttack() * 0.1);
                setEnergy(getEnergy() + 20);
                setCD1(5);

                System.out.println(
                        getName()
                                + " Rara Jonggrang menggabungkan kekuatan mistis dari warisan leluhurnya, memicu ledakan energi yang dahsyat yang merusak musuh dalam jangkauan luas");
                System.out.println(
                        getName() + " mengurangi hp musuh " + getDamage() + " kepada "
                                + karakterDiserang.getName() + " mengurangi Attack musuh sebesar 10%.");
            }
        }

        @Override
        public void skill2(Karakter karakterDiserang) {
            setDamage(90);

            if (getCD2() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setEnergy(getEnergy() + 20);
                setCD2(4);

                System.out.println(
                        getName()
                                + "  mengeluarkan aura mistis yang memberikan semangat juang kepada sekutunya dan melemahkan semangat musuh.");
            }
        }

        @Override
        public void ultimateSkill(Karakter karakterDiserang) { // KASIH STUN 1 PUTARAN
            setDamage(270);

            if (getEnergy() >= 100) {
                setHealth(getHealth() - 20);
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                karakterDiserang.setSpeed(karakterDiserang.getSpeed() - 200);
                setSpeed(getSpeed() + 200);
                setDefend(getDefend() * 0.15);
                setEnergy(0);

                System.out.println(
                        getName()
                                + " Rara Jonggrang mengambil kekuatan dari tanah Jawa yang suci dan untuk memberikan serangan dahsyat kepada musuh-musuhnya. ");
                System.out.println(
                        getName() + " mengorbankan HP-nya sebesar 20 untuk memberikan memberikan damage sebesar "
                                + getDamage() + " kepada " + karakterDiserang.getName()
                                + " dan meningkatkan defense " + getName() + " sebesar 15%.");
            }
        }
    }

    public class MalinKundang extends Karakter {
        public MalinKundang() {
            super(780, 75, 40, 55);
            setName("Malin Kundang");
            setProfil(
                    "Malin Kundang adalah pemuda Minangkabau tentang anak kapal yang durhaka. Dia adalah pejuang yang kuat namun sombong, yang pada akhirnya dia harus menghadapi konsekuensi dari perbuatannya. Malin Kundang memiliki kekuatan fisik yang luar biasa tetapi kurangnya kesadaran akan kebaikan membuatnya menjadi lebih kontroversial.  ");
            setSkill1Name("Gelombang Besar");
            setSkill2Name("Hantaman Patung Batu");
            setUltimateName("Kutukan Durhaka");
        }

        @Override
        public void skill1(Karakter karakterDiserang) {
            setDamage(50);

            if (getCD1() <= 0) {
                karakterDiserang.setAttack(karakterDiserang.getAttack() - 10);
                setEnergy(getEnergy() + 20);
                setCD1(5);

                System.out.println(
                        getName()
                                + " memanggil energi alam yang didapatinya untuk menjadikan dirinya sebagai patung batu yang menyebabkannya kebal terhadap serangan musuh sekaligus menimpa lawan dengan wujud batu tersebut.");
            }
        }

        @Override
        public void skill2(Karakter karakterDiserang) {
            setDamage(110);

            if (getCD2() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setDefend(getDefend() + 10);
                setEnergy(getEnergy() + 20);
                setCD2(5);

                System.out.println(
                        getName()
                                + "  memanggil energi alam yang didapatinya untuk menambahkan lapisan batu yang menambahkan perlindungan terhadap serangan musuh sekaligus menimpa lawan dengan wujud batu tersebut ");
                System.out.println(
                        getName()
                                + " Memberikan damage sebesar  " + getDamage() + " kepada " + karakterDiserang.getName()
                                + " meningkatkan defense sebanyak 10.");
            }
        }

        @Override
        public void ultimateSkill(Karakter karakterDiserang) { // KASIH STUN 1 PUTARAN
            setDamage(280);

            if (getEnergy() >= 100) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                karakterDiserang.setSpeed(karakterDiserang.getSpeed() - 200);
                setSpeed(getSpeed() + 200);
                setEnergy(0);

                System.out.println(
                        getName()
                                + " melepaskan kemarahan dan penyesalannya, menciptakan teriakan bergema yang menggetarkan mental dan ketahanan musuh secara drastis. ");
                System.out.println(
                        getName() + " mengurangi HP musuh sebesar "
                                + getDamage() + " kepada " + karakterDiserang.getName());
            }
        }
    }

    public class GatotKaca extends Karakter {
        public GatotKaca() {
            super(950, 30, 95, 45);
            setName("Gatot Kaca");
            setProfil(
                    "Gatot Kaca adalah karakter yang terinspirasi dari legenda Jawa tentang pahlawan yang memiliki kekuatan luar biasa dan kesetiaan yang tak tergoyahkan. Dia dikenal karena keberaniannya dalam melawan musuh-musuhnya untuk melindungi kerajaan dan rakyatnya sekaligus menjadi simbol keadilan dan keberanian.  ");
            setSkill1Name("Tangan Besi");
            setSkill2Name("Langkah Pemberani");
            setUltimateName("Kekuatan Sakti");
        }

        @Override
        public void skill1(Karakter karakterDiserang) {
            setDamage(65);

            if (getCD1() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setEnergy(getEnergy() + 20);
                setCD1(3);

                System.out.println(
                        getName()
                                + " melancarkan serangan pukulan yang kuat dan mematikan kepada musuh-musuhnya. ");
                System.out.println(
                        getName() + " Mengurangi HP musuh sebesar " + getDamage() + " Kepada "
                                + karakterDiserang.getName());
            }
        }

        @Override
        public void skill2(Karakter karakterDiserang) {// ADA STUN 1
            setDamage(150);

            if (getCD2() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                karakterDiserang.setSpeed(karakterDiserang.getSpeed() - 200);
                setSpeed(getSpeed() + 200);
                setEnergy(getEnergy() + 20);
                setCD2(5);

                System.out.println(
                        getName()
                                + " mendobrak musuh dengan keberanian yang membara sehingga melumpuhkan musuh di sepanjang jalannya hingga menyebabkan kerusakan besar pada musuh yang dilaluinya");
                System.out.println(
                        getName()
                                + " Memberikan damage sebesar  " + getDamage() + " kepada "
                                + karakterDiserang.getName());
            }
        }

        @Override
        public void ultimateSkill(Karakter karakterDiserang) { // KASIH STUN 1 PUTARAN
            setDamage(300);

            if (getEnergy() >= 100) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                karakterDiserang.setSpeed(karakterDiserang.getSpeed() - 200);
                setSpeed(getSpeed() + 200);
                setEnergy(0);

                System.out.println(
                        getName()
                                + " mengeluarkan kekuatan saktinya yang luar biasa, menciptakan gelombang energi yang menghancurkan musuh-musuhnya.");
                System.out.println(
                        getName() + " mengurangi HP musuh sebesar "
                                + getDamage() + " dan menyebabkan musuh tidak dapat menyerang selama satu putaran.");
            }
        }
    }

    public class NyiRoroKidul extends Karakter {
        public NyiRoroKidul() {
            super(750, 55, 60, 45);
            setName("Nyi Roro Kidul");
            setProfil(
                    "Nyi Roro Kidul adalah karakter yang terinspirasi dari legenda Jawa tentang ratu laut yang kuat dan misterius. Dia dianggap sebagai penguasa laut selatan yang memiliki kekuatan gaib dan kebijaksanaan yang luar biasa. Hal ini menjadikannya karakter yang penuh misteri dan kemegahan, menjebak pemain dengan aura keangkerannya.");
            setSkill1Name("Gelombang gaib");
            setSkill2Name("Tarian angin laut");
            setUltimateName("Kemarahan Samudera");
        }

        @Override
        public void skill1(Karakter karakterDiserang) {
            setDamage(75);

            if (getCD1() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setEnergy(getEnergy() + 20);
                setCD1(4);

                System.out.println(
                        getName()
                                + " memanggil kekuatan laut untuk menciptakan gelombang besar secara mendadak yang menghantam musuh-musuhnya, memberikan efek hipotermia pada "
                                + karakterDiserang.getName());
                System.out.println(
                        getName()
                                + " memberikan damage sebesar 150 kepada"
                                + karakterDiserang.getName());
            }
        }

        @Override
        public void skill2(Karakter karakterDiserang) {
            setDamage(150);

            if (getCD2() <= 0) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                setDefend(getDefend() + 15);
                setEnergy(getEnergy() + 20);
                setCD2(5);

                System.out.println(
                        getName()
                                + "  menari dengan gemulai, menciptakan angin laut yang membingungkan "

                                + karakterDiserang.getName());
                System.out.println(
                        getName()
                                + " Memberikan damage sebesar  " + getDamage() + " kepada " + karakterDiserang.getName()
                                + " dan meningkatkan defense sebanyak 15");
            }
        }

        @Override
        public void ultimateSkill(Karakter karakterDiserang) { // stun selama dua putaran
            setDamage(300);

            if (getEnergy() >= 100) {
                karakterDiserang.setHealth(karakterDiserang.getHealth() - getDamage());
                karakterDiserang.setSpeed(karakterDiserang.getSpeed() - 200);
                setSpeed(getSpeed() + 200);
                setEnergy(0);

                System.out.println(
                        getName()
                                + " melepaskan kekuatan penuhnya sebagai penguasa laut mengerahkan armada seluruh makhluk laut memancarkan aura gelombang yang menghambat pergerakanyang menghancurkan di sekelilingnya.  ");
                System.out.println(
                        getName() + " mengurangi HP musuh sebesar "
                                + getDamage() + " kepada " + karakterDiserang.getName());
            }
        }
    }
}