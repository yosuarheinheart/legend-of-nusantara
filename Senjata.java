/**
 *
 * @author AlcastraxGroup
 */

public class Senjata {
    private String namaSenjata, description;
    private double efek1, efek2, efek3, efek4;

    public Senjata(String namaSenjata, String description) {
        this.namaSenjata = namaSenjata;
        this.description = description;
        this.efek1 = efek1;
        this.efek2 = efek2;
        this.efek3 = efek3;
        this.efek4 = efek4;
    }

    public String getName() {
        return namaSenjata;
    }

    public String getDescription() {
        return description;
    }

    public void setEffect1(double newEfek1) {
        this.efek1 = newEfek1;
    }

    public void setEffect2(double newEfek2) {
        this.efek2 = newEfek2;
    }

    public void setEffect3(double newEfek3) {
        this.efek3 = newEfek3;
    }

    public void setEffect4(double newEfek4) {
        this.efek4 = newEfek4;
    }

    public double getEffect1() {
        return efek1;
    }

    public double getEffect2() {
        return efek2;
    }

    public double getEffect3() {
        return efek3;
    }

    public double getEffect4() {
        return efek4;
    }

    public class Keriz extends Senjata {
        public Keriz() {
            super("Keriz",
                    "Keriz adalah pedang legendaris yang terkenal dengan ketajamannya. Dengan ukiran mistis di bilahnya, Kerizz meningkatkan serangan pengguna dengan signifikan dan memberikan kecepatan tambahan saat bertarung.");
            setEffect1(10); // Attack
            setEffect2(5); // Speed
        }
    }

    public class SepatuPeri extends Senjata {
        public SepatuPeri() {
            super("Sepatu Peri",
                    "Sepatu Peri adalah sepatu ajaib yang dibuat oleh peri hutan. Sepatu ini memberikan kelincahan luar biasa kepada pemakainya, memungkinkan mereka bergerak dengan sangat cepat di medan perang. Selain itu, sepatu ini juga menambah sedikit kekuatan serangan.");
            setEffect1(5); // Attack
            setEffect2(20); // Speed
        }
    }

    public class TamengDayak extends Senjata {
        public TamengDayak() {
            super("Tameng Dayak",
                    "Tameng Dayak adalah tameng tradisional suku Dayak yang terbuat dari bahan-bahan alami yang kuat. Tameng ini memberikan perlindungan luar biasa terhadap serangan musuh namun sedikit mengurangi kecepatan gerak pengguna karena beratnya");
            setEffect2(-5); // Speed
            setEffect3(25); // Defend
        }
    }

    public class KapakEmas extends Senjata {
        public KapakEmas() {
            super("Kapak Emas",
                    "Kapak Emas adalah senjata yang menggabungkan kekuatan dan kecepatan dengan sempurna. Dengan bilah emas yang kuat, kapak ini meningkatkan kekuatan serangan, memberikan kecepatan tambahan, dan meningkatkan daya tahan tubuh pengguna.");
            setEffect1(20); // Attack
            setEffect2(-10); // Speed
        }
    }

    public class Ramune extends Senjata {
        public Ramune() {
            super("Ramune",
                    "Ramune adalah ramuan ajaib yang dapat diminum untuk memulihkan kesehatan. Selain itu, ramuan ini memberikan peningkatan kecil pada kecepatan dan kekuatan serangan, menjadikannya pilihan serba guna di medan perang.");
            setEffect1(5); // Attack
            setEffect2(5); // Speed
            setEffect4(50); // Healthh
        }
    }
}