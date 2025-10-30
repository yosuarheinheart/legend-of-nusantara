/**
 *
 * @author AlcastraxGroup
 */

public class Arena {
    private String namaArena, description;
    private double efek;

    public Arena(String namaArena, String description, double efek) {
        this.namaArena = namaArena;
        this.description = description;
        this.efek = efek;
    }

    public double getEffect() {
        return efek;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return namaArena;
    }

    public class GunungBromo extends Arena {
        public GunungBromo() {
            super("Gunung Bromo",
                    "Gunung bromo dipenuhi dengan lahar panas dan volume letusan uap di berbagai kawah berlubang sehingga dapat sehingga jawaramu harus selalu berhati-hati dalam melangkah. Oleh karena itu, kecepatan langkah-pun akan ikut berkurang"
                            + "Dilengkapi dengan panorama alam yang indah dan udara mengangkan yang memberikan semangat membara kepada para jawara.",
                    5); 
        }
    }

    public class DanauToba extends Arena {
        public DanauToba() {
            super("Danau Toba",
                    "Danau Toba dengan aura mistisnya akan memberikan tambahan kemampuan serangan sekaligus mengurangi kecepatan karena lapisan lumpur yang cukup tebal."
                            + "Pemandangan danau yang luas dengan pulau-pulau kecil di tengahnya"
                            + "memberikan suasana yang tenang namun penuh dengan kekuatan alam."
                            + "Karakter-karakter legenda Indonesia yang bertarung di sini akan"
                            + "merasakan energi positif dari keindahan alam danau serta perlindungan"
                            + "alamiah dari serangan magis.",

                    5);
        }
    }

    public class GuaJatijajar extends Arena {
        public GuaJatijajar() {
            super("Gua Jatijajar",
                    "Gua Jatijajar yang sempit dapat menyulitkan mobilitas para jawara sebab arena ini  tersembunyi di dalam kompleks gua yang luas"
                            + "dilengkapi dengan stalaktit dan stalagmit yang indah. Atmosfer gua yang misterius"
                            + "menciptakan suasana magis yang kuat di arena ini. Karakter-karakter"
                            + "legenda Indonesia yang bertarung di sini akan merasakan kenaikan kekuatan"
                            + "magis dan perlindungan dari serangan magis yang kuat.",
                    10);
        }
    }

    public class TamanLautPulauSeribu extends Arena {
        public TamanLautPulauSeribu() {
            super("Taman Laut Pulau Seribu",
                    "Taman Laut Pulau Seribu adalah representasi arena yang penuh rintangan di bawah laut karena ketika ingin melakukan tiap aksi, jawara harus mempertimbanngkan langkah dengan seksama agar  adalah arena bawah laut yang indah dengan keanekaragaman"
                            + "hayati laut yang memukau. Terumbu karang yang warna-warni dan ikan-ikan eksotis"
                            + "menciptakan suasana yang magis di arena ini. Efek dari arena ini meningkatkan"
                            + "kepekaan terhadap lingkungan bawah laut bagi karakter-karakter legenda Indonesia,"
                            + "sambil memberikan perlindungan tambahan dari serangan jarak dekat di dalam air.",
                    10);
        }
    }

    public class PantaiSelatan extends Arena {
        public PantaiSelatan() {
            super("Pantai Selatan",
                    "Pantai yang membentang pada bagian selatan pulau jawa yang menawarkan pemandangan tetapi me"
                            + "yang indah disana, disertai dengan desiran ombaknya yang dashyat, disertai dengan"
                            + "angin selatan yang sangat kencang menciptakan suasana yang menegangkan di arena ini.",
                    10);
        }
    }
}