/**
 *
 * @author AlcastraxGroup
 */

import java.util.*;

public class Main {
    static Karakter karakter = new Karakter(0, 0, 0, 0);
    static Karakter.SiButa sb = karakter.new SiButa();
    static Karakter.RatuKencanaWungu rkw = karakter.new RatuKencanaWungu();
    static Karakter.SiTangkurak st = karakter.new SiTangkurak();
    static Karakter.RadenKianSantang rks = karakter.new RadenKianSantang();
    static Karakter.RajaBrawijaya rb = karakter.new RajaBrawijaya();
    static Karakter.Sangkuriang skg = karakter.new Sangkuriang();
    static Karakter.RaraJonggrang rj = karakter.new RaraJonggrang();
    static Karakter.MalinKundang mk = karakter.new MalinKundang();
    static Karakter.GatotKaca gk = karakter.new GatotKaca();
    static Karakter.NyiRoroKidul nrk = karakter.new NyiRoroKidul();

    static Arena arena = new Arena("", "", 0);
    static Arena.GunungBromo gunungBromo = arena.new GunungBromo();
    static Arena.DanauToba danauToba = arena.new DanauToba();
    static Arena.GuaJatijajar guaJatiJajar = arena.new GuaJatijajar();
    static Arena.TamanLautPulauSeribu tamanLaut = arena.new TamanLautPulauSeribu();
    static Arena.PantaiSelatan pantaiSelatan = arena.new PantaiSelatan();

    static Senjata senjata = new Senjata("", "");
    static Senjata.Keriz keriz = senjata.new Keriz();
    static Senjata.SepatuPeri sepri = senjata.new SepatuPeri();
    static Senjata.TamengDayak tadak = senjata.new TamengDayak();
    static Senjata.KapakEmas kamas = senjata.new KapakEmas();
    static Senjata.Ramune ramun = senjata.new Ramune();

    static Player player1 = new Player();
    static Player player2 = new Player();
    static Giliran giliran = new Giliran();

    static Player.Node current1;
    static Player.Node current2;

    static boolean checkKarakter = true;
    static boolean chooseArena = false;
    static boolean truesenjata = false;
    static int chooseSenjata = 0;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihKarakter = 0, pilihArena = 0, pilihSenjata = 0, pilihSkill = 0;

        System.out.println("          ======================= LEGENDS OF NUSANTARA ======================= \n");
        System.out.println(" ============== Siap bertarung bersama para legenda hidup Nusantara ?  ==============");
        System.out.println(
                "=========== Segera jadikan para legenda pilihanmu sebagai jawara yang paling perkasa di tanah khatulistiwa  ===========");

        System.out.println("\n\nSiap bermain? Masukkan nama player terlebih dahulu!");
        System.out.println("Player 1:");
        String namaPlayer1 = scanner.nextLine();
        System.out.println("\nPlayer 2:");
        String namaPlayer2 = scanner.nextLine();

        System.out.println("\nPilihlah Legenda untuk dijadikan Jawara-mu!");
        while (player1.hitungKarakter() < 2 && player2.hitungKarakter() < 2) {
            while (checkKarakter) {
                getKarakter();
                System.out.print("Jawara Player " + namaPlayer1 + ": ");
        
                try {
                    pilihKarakter = scanner.nextInt();
                    scanner.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan pilihan dalam bentuk angka.");
                    scanner.nextLine(); 
                }

                switch (pilihKarakter) {
                    case 1:
                        sb.statusKarakter();
                        sb.getProfil();
                        JawaraConfirm(sb, 1);
                        break;
                    case 2:
                        rkw.statusKarakter();
                        rkw.getProfil();
                        JawaraConfirm(rkw, 1);
                        break;
                    case 3:
                        st.statusKarakter();
                        st.getProfil();
                        JawaraConfirm(st, 1);
                        break;
                    case 4:
                        rks.statusKarakter();
                        rks.getProfil();
                        JawaraConfirm(rks, 1);
                        break;
                    case 5:
                        rb.statusKarakter();
                        rb.getProfil();
                        JawaraConfirm(rb, 1);
                        break;
                    case 6:
                        skg.statusKarakter();
                        skg.getProfil();
                        JawaraConfirm(skg, 1);
                        break;
                    case 7:
                        rj.statusKarakter();
                        rj.getProfil();
                        JawaraConfirm(rj, 1);
                        break;
                    case 8:
                        mk.statusKarakter();
                        mk.getProfil();
                        JawaraConfirm(mk, 1);
                        break;
                    case 9:
                        gk.statusKarakter();
                        gk.getProfil();
                        JawaraConfirm(gk, 1);
                        break;
                    case 10:
                        nrk.statusKarakter();
                        nrk.getProfil();
                        JawaraConfirm(nrk, 1);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                        checkKarakter = true;
                }
                System.out.println();
            }

            checkKarakter = true;

            while (checkKarakter) {
                getKarakter();
                System.out.print("Jawara Player " + namaPlayer2 + ": ");
        
                try {
                    pilihKarakter = scanner.nextInt();
                    scanner.nextLine(); 
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan pilihan dalam bentuk angka.");
                    scanner.nextLine();
                }

                switch (pilihKarakter) {
                    case 1:
                        sb.statusKarakter();
                        sb.getProfil();
                        JawaraConfirm(sb, 2);
                        break;
                    case 2:
                        rkw.statusKarakter();
                        rkw.getProfil();
                        JawaraConfirm(rkw, 2);
                        break;
                    case 3:
                        st.statusKarakter();
                        st.getProfil();
                        JawaraConfirm(st, 2);
                        break;
                    case 4:
                        rks.statusKarakter();
                        rks.getProfil();
                        JawaraConfirm(rks, 2);
                        break;
                    case 5:
                        rb.statusKarakter();
                        rb.getProfil();
                        JawaraConfirm(rb, 2);
                        break;
                    case 6:
                        skg.statusKarakter();
                        skg.getProfil();
                        JawaraConfirm(skg, 2);
                        break;
                    case 7:
                        rj.statusKarakter();
                        rj.getProfil();
                        JawaraConfirm(rj, 2);
                        break;
                    case 8:
                        mk.statusKarakter();
                        mk.getProfil();
                        JawaraConfirm(mk, 2);
                        break;
                    case 9:
                        gk.statusKarakter();
                        gk.getProfil();
                        JawaraConfirm(gk, 2);
                        break;
                    case 10:
                        nrk.statusKarakter();
                        nrk.getProfil();
                        JawaraConfirm(nrk, 2);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                        checkKarakter = true;
                }
                System.out.println();
            }
            checkKarakter = true;
        }

        String jawara1 = player1.front.karakter.getName();
        String jawara2 = player2.front.karakter.getName();
        String jawara3 = player1.front.next.karakter.getName();
        String jawara4 = player2.front.next.karakter.getName();

        System.out.println("Jawara Player " + namaPlayer1 + ": " + jawara1 + " dan "
                + jawara3);
        System.out.println("Jawara Player " + namaPlayer2 + ": " + jawara2 + " dan "
                + jawara4);

        current1 = player1.front;
        current2 = player2.front;

        System.out.println("");

        while (pilihArena < 1 || pilihArena > 5 || chooseArena == false) {
            System.out.println("Silahkan pilih arena pertarungan: ");
            getArena();
            System.out.print("Pilihan: ");

            try {
                pilihArena = scanner.nextInt();
                scanner.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan pilihan dalam bentuk angka.");
                scanner.nextLine(); 
            }
            
            switch (pilihArena) {
                case 1:
                    arenaConfirm(gunungBromo);
                    break;
                case 2:
                    arenaConfirm(danauToba);
                    break;
                case 3:
                    arenaConfirm(guaJatiJajar);
                    break;
                case 4:
                    arenaConfirm(tamanLaut);
                    break;
                case 5:
                    arenaConfirm(pantaiSelatan);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
            System.out.println();
        }

        current1 = player1.front;
        current2 = player2.front;

        while (pilihSenjata < 1 || pilihSenjata > 5 || chooseSenjata < 4) {
            truesenjata = false;

            while (truesenjata == false) {
                System.out.println("Silahkan pilih senjata untuk jawara " +
                        current1.karakter.getName() + ":");
                getSenjata();
                System.out.print("Pilihan senjata: ");
                try {
                    pilihSenjata = scanner.nextInt();
                    scanner.nextLine(); 
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan pilihan dalam bentuk angka.");
                    scanner.nextLine(); 
                }

                switch (pilihSenjata) {
                    case 1:
                        senjataConfirm(keriz, current1);
                        break;
                    case 2:
                        senjataConfirm(sepri, current1);
                        break;
                    case 3:
                        senjataConfirm(tadak, current1);
                        break;
                    case 4:
                        senjataConfirm(kamas, current1);
                        break;
                    case 5:
                        senjataConfirm(ramun, current1);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                }
                System.out.println();
            }

            truesenjata = false;
            while (truesenjata == false) {
                System.out.println("Silahkan pilih senjata untuk jawara " +
                        current2.karakter.getName() + ":");
                getSenjata();
                System.out.print("Pilih: ");
                pilihSenjata = scanner.nextInt();
                scanner.nextLine();

                switch (pilihSenjata) {
                    case 1:
                        senjataConfirm(keriz, current2);
                        break;
                    case 2:
                        senjataConfirm(sepri, current2);
                        break;
                    case 3:
                        senjataConfirm(tadak, current2);
                        break;
                    case 4:
                        senjataConfirm(kamas, current2);
                        break;
                    case 5:
                        senjataConfirm(ramun, current2);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                }
                System.out.println();
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        giliran.masukJawara(player1.masukJawara());
        giliran.masukJawara(player2.masukJawara());

        System.out.println("Pertarungan antara " + giliran.head.karakter.getName() + " melawan "
                + giliran.head.next.karakter.getName() + ".");

        while (giliran.head.karakter.getHealth() > 0 && giliran.head.next.karakter.getHealth() > 0) {
            if (giliran.head.karakter.getSpeed() > giliran.head.next.karakter.getSpeed()) {
                correctSpeed(giliran.head.next.karakter, giliran.head.karakter);
                correctSpeed(giliran.head.karakter, giliran.head.next.karakter);
                giliran.head.karakter.statusKarakter();

                while (true) {
                    System.out.println("\nGiliran Player " + namaPlayer1 + ".");
                    System.out.println("Pilih gerakan yang anda inginkan :");
                    System.out.println("1. Basic Attack");
                    System.out.println("2. " + giliran.head.karakter.getSkill1Name() + " (CD: "
                            + giliran.head.karakter.getCD1() + ")");
                    System.out.println("3. " + giliran.head.karakter.getSkill2Name() + " (CD: "
                            + giliran.head.karakter.getCD2() + ")");
                    System.out.println("4. " + giliran.head.karakter.getUltimateName() + "(Energi :"
                            + giliran.head.karakter.getEnergy() + ")");
                            System.out.print("Pilih Gerakan: ");

                            try {
                                pilihSkill = scanner.nextInt();
                                scanner.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Input tidak valid. Harap masukkan pilihan dalam bentuk angka.");
                                scanner.nextLine(); 
                            }

                    System.out.println("");
                    switch (pilihSkill) {
                        case 1:
                            giliran.head.karakter.basicAttack(giliran.head.next.karakter);
                            break;
                        case 2:
                            if (giliran.head.karakter.getCD1() > 0) {
                                System.out.println("Skill \"" + giliran.head.karakter.getSkill1Name()
                                        + "\" sedang cooldown selama " + giliran.head.karakter.getCD1() + ".");
                                continue;
                            }
                            giliran.head.karakter.skill1(giliran.head.next.karakter);
                            break;
                        case 3:
                            if (giliran.head.karakter.getCD2() > 0) {
                                System.out.println("Skill \"" + giliran.head.karakter.getSkill2Name()
                                        + "\" sedang cooldown selama " + giliran.head.karakter.getCD2() + ".");
                                continue;
                            }
                            giliran.head.karakter.skill2(giliran.head.next.karakter);
                            break;
                        case 4:
                            if (giliran.head.karakter.getEnergy() < 100) {
                                System.out.println("Energi belum tercukupi. Ultimate \""
                                        + giliran.head.karakter.getUltimateName()
                                        + "\" tidak dapat dipakai.");
                                continue;
                            }
                            giliran.head.karakter.ultimateSkill(giliran.head.next.karakter);
                            break;
                        default:
                            System.out.println("Pilihan anda tidak valid!");
                            continue;
                    }
                    break;
                }

                pilihSkill = 0;
                karakter.endTurn(giliran.head.karakter, giliran.head.next.karakter);
            } else if (giliran.head.next.karakter.getSpeed() > giliran.head.karakter.getSpeed()) {
                correctSpeed(giliran.head.karakter, giliran.head.next.karakter);
                correctSpeed(giliran.head.next.karakter, giliran.head.karakter);
                giliran.head.next.karakter.statusKarakter();

                while (true) {
                    System.out.println("\nGiliran Player " + namaPlayer2 + ".");
                    System.out.println("Pilih gerakan yang anda inginkan :");
                    System.out.println("1. Basic Attack");
                    System.out.println("2. " + giliran.head.next.karakter.getSkill1Name() + " (CD: "
                            + giliran.head.next.karakter.getCD1() + ")");
                    System.out.println("3. " + giliran.head.next.karakter.getSkill2Name() + " (CD: "
                            + giliran.head.next.karakter.getCD2() + ")");
                    System.out.println("4. " + giliran.head.next.karakter.getUltimateName() + "(Energi: "

                            + giliran.head.next.karakter.getEnergy() + ")");
                    System.out.print("Pilih Gerakan: ");
                    pilihSkill = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("");
                    switch (pilihSkill) {
                        case 1:
                            giliran.head.next.karakter.basicAttack(giliran.head.karakter);
                            break;
                        case 2:
                            if (giliran.head.next.karakter.getCD1() > 0) {
                                System.out.println("Skill \"" + giliran.head.next.karakter.getSkill1Name()
                                        + "\" sedang cooldown selama " + giliran.head.next.karakter.getCD1() + ".");
                                continue;
                            }
                            giliran.head.next.karakter.skill1(giliran.head.karakter);
                            break;
                        case 3:
                            if (giliran.head.next.karakter.getCD2() > 0) {
                                System.out.println("Skill \"" + giliran.head.next.karakter.getSkill2Name()
                                        + "\" sedang cooldown selama " + giliran.head.next.karakter.getCD2() + ".");
                                continue;
                            }
                            giliran.head.next.karakter.skill2(giliran.head.karakter);
                            break;
                        case 4:
                            if (giliran.head.next.karakter.getEnergy() < 100) {
                                System.out.println("Energi belum tercukupi. Ultimate \""
                                        + giliran.head.next.karakter.getUltimateName()
                                        + "\" tidak dapat dipakai.");
                                continue;
                            }
                            giliran.head.next.karakter.ultimateSkill(giliran.head.karakter);
                            break;
                        default:
                            System.out.println("Pilihan anda tidak valid!");
                            continue;
                    }
                    break;
                }

                pilihSkill = 0;
                karakter.endTurn(giliran.head.next.karakter, giliran.head.karakter);
            }

            if (giliran.head.karakter.getHealth() <= 0) {
                System.out.println("");
                System.out.println(giliran.head.karakter.getName() + " telah dikalahkan.");
                giliran.keluarJawara(giliran.head.karakter);

                if (player1.front == null) {
                    System.out.println("\nKarakter telah digunakan. Player " + namaPlayer1 + " telah kalah.");
                    System.out.println(namaPlayer2 + " telah memenangkan pertarungan");
                    System.out.println(jawara2 + " dan " + jawara4 + " dinobatkan sebagai jawara pemenang di "
                            + arena.getName() + ".");
                    break;
                }

                giliran.masukJawaraHead(player1.masukJawara());
                System.out.println(giliran.head.next.karakter.getName() + " masuk ke arena pertarungan.");
            } else if (giliran.head.next.karakter.getHealth() <= 0) {
                System.out.println("");
                System.out.println(giliran.head.next.karakter.getName() + " telah dikalahkan.");
                giliran.keluarJawara(giliran.head.next.karakter);

                if (player2.front == null) {
                    System.out.println("\nPertarungan selesai. " + namaPlayer2 + " telah kalah.");
                    System.out.println(namaPlayer1 + " dinyatakan sebagai pemenang pertarungan.");
                    System.out.println(jawara1 + " dan " + jawara3 + " dinobatkan sebagai dua jawara pemenang di "
                            + arena.getName() + ".");
                    break;
                }

                giliran.masukJawara(player2.masukJawara());
                System.out.println(giliran.head.next.karakter.getName() + " masuk ke arena pertarungan.");
            }
        }

        System.exit(1);
    }

    public static void getKarakter() {
        System.out.println("\n1. " + sb.getName());
        System.out.println("2. " + rkw.getName());
        System.out.println("3. " + st.getName());
        System.out.println("4. " + rks.getName());
        System.out.println("5. " + rb.getName());
        System.out.println("6. " + skg.getName());
        System.out.println("7. " + rj.getName());
        System.out.println("8. " + mk.getName());
        System.out.println("9. " + gk.getName());
        System.out.println("10. " + nrk.getName());
    }

    public static void getArena() {
        System.out.println("\n1. " + gunungBromo.getName());
        System.out.println("2. " + danauToba.getName());
        System.out.println("3. " + guaJatiJajar.getName());
        System.out.println("4. " + tamanLaut.getName());
        System.out.println("5. " + pantaiSelatan.getName());
    }

    public static void getSenjata() {
        System.out.println("1. " + keriz.getName());
        System.out.println("2. " + sepri.getName());
        System.out.println("3. " + tadak.getName());
        System.out.println("4. " + kamas.getName());
        System.out.println("5. " + ramun.getName());
    }

    public static void karakterUsed() {
        System.out.println("Maaf, karakter yang anda pilih telah dipakai player lain. Mohon memilih karakter lain! ");
    }

    public static void JawaraConfirm(Karakter karakter, int player) {
        boolean confirm = false;

        while (!confirm) {
            System.out.println("Apakah anda yakin ingin memilih jawara ini? (Y/N)");
            String conf = scanner.nextLine();
            if (conf.equalsIgnoreCase("y")) {
                confirm = true;
                if (player1.cekKarakter(karakter) || player2.cekKarakter(karakter)) {
                    checkKarakter = true;
                    karakterUsed();
                } else {
                    if (player == 1) {
                        player1.pilihJawara(karakter);
                    } else {
                        player2.pilihJawara(karakter);
                    }

                    checkKarakter = false;
                }
            } else if (conf.equalsIgnoreCase("n")) {
                confirm = true;
            } else {
                System.out.println(
                        "Maaf, input anda salah. Silahkan masukkan input yang benar untuk dapat memilih karakter!");
            }
        }
    }

    public static void arenaConfirm(Arena arenaPilih) {
        boolean confirm = false;

        System.out.println(arenaPilih.getName());
        System.out.println(arenaPilih.getDescription());

        while (!confirm) {
            System.out.println("Apakah anda yakin ingin memilih Arena ini? (Y/N)");
            String conf = scanner.nextLine();

            if (conf.equalsIgnoreCase("y")) {
                while (current1 != null && current2 != null) {
                    switch (arenaPilih.getName()) {
                        case "Gunung Bromo":
                            current1.karakter.setSpeed(current1.karakter.getSpeed() + arenaPilih.getEffect());
                            current2.karakter.setSpeed(current2.karakter.getSpeed() + arenaPilih.getEffect());
                            break;
                        case "Danau Toba":
                            current1.karakter.setAttack(current1.karakter.getAttack() + arenaPilih.getEffect());
                            current1.karakter.setSpeed(current1.karakter.getSpeed() - arenaPilih.getEffect());
                            current2.karakter.setAttack(current2.karakter.getAttack() + arenaPilih.getEffect());
                            current2.karakter.setSpeed(current2.karakter.getSpeed() - arenaPilih.getEffect());
                            break;
                        case "Gua Jatijajar":
                            current1.karakter.setAttack(current1.karakter.getAttack() + arenaPilih.getEffect());
                            current1.karakter.setSpeed(current1.karakter.getSpeed() - arenaPilih.getEffect());
                            current2.karakter.setAttack(current2.karakter.getAttack() + arenaPilih.getEffect());
                            current2.karakter.setSpeed(current2.karakter.getSpeed() - arenaPilih.getEffect());
                            break;
                        case "Taman Laut Pulau Seribu":
                            current1.karakter.setDefend(current1.karakter.getDefend() + arenaPilih.getEffect());
                            current1.karakter.setSpeed(current1.karakter.getSpeed() - arenaPilih.getEffect());
                            current2.karakter.setDefend(current2.karakter.getDefend() + arenaPilih.getEffect());
                            current2.karakter.setSpeed(current2.karakter.getSpeed() - arenaPilih.getEffect());
                            break;
                        case "Pantai Selatan":
                            current1.karakter.setSpeed(current1.karakter.getSpeed() + arenaPilih.getEffect());
                            current1.karakter.setDefend(current1.karakter.getDefend() - arenaPilih.getEffect());
                            current2.karakter.setSpeed(current2.karakter.getSpeed() + arenaPilih.getEffect());
                            current2.karakter.setDefend(current2.karakter.getDefend() - arenaPilih.getEffect());
                            break;
                    }
                    current1 = current1.next;
                    current2 = current2.next;
                }

                confirm = true;
                chooseArena = true;
                arena = arenaPilih;
            } else if (conf.equalsIgnoreCase("n")) {
                confirm = true;
            } else {
                System.out.println(
                        "Maaf, input anda salah. Silahkan masukkan input yang benar untuk dapat memilih karakter!");
            }
        }
    }

    public static void senjataConfirm(Senjata senjata, Player.Node current) {
        boolean confirm = false;

        System.out.println(senjata.getName());
        System.out.println(senjata.getDescription());

        while (!confirm) {
            System.out.println("Apakah anda yakin ingin memilih senjata ini? (Y/N)");
            String conf = scanner.nextLine();

            if (conf.equalsIgnoreCase("y")) {
                switch (senjata.getName()) {
                    case "Keriz":
                        current.karakter.setAttack(current.karakter.getAttack() + senjata.getEffect1());
                        current.karakter.setSpeed(current.karakter.getSpeed() + senjata.getEffect2());
                        break;
                    case "Sepatu Peri":
                        current.karakter.setAttack(current.karakter.getAttack() + senjata.getEffect1());
                        current.karakter.setSpeed(current.karakter.getSpeed() + senjata.getEffect2());
                        break;
                    case "Tameng Dayak":
                        current.karakter.setSpeed(current.karakter.getSpeed() + senjata.getEffect2());
                        current.karakter.setDefend(current.karakter.getDefend() + senjata.getEffect3());
                        break;
                    case "Kapak Emas":
                        current.karakter.setAttack(current.karakter.getAttack() + senjata.getEffect1());
                        current.karakter.setSpeed(current.karakter.getSpeed() + senjata.getEffect2());
                        break;
                    case "Ramune":
                        current.karakter.setAttack(current.karakter.getAttack() + senjata.getEffect1());
                        current.karakter.setSpeed(current.karakter.getSpeed() + senjata.getEffect2());
                        current.karakter.setHealth(current.karakter.getHealth() + senjata.getEffect4());
                        break;
                }

                confirm = true;
                chooseSenjata++;
                truesenjata = true;
            } else if (conf.equalsIgnoreCase("n")) {
                confirm = true;
            } else {
                System.out.println(
                        "Maaf, input anda salah. Silahkan masukkan input yang benar untuk dapat memilih karakter!");
            }
        }
    }

    public static void correctSpeed(Karakter karakter1, Karakter karakter2) {
        if (karakter1.getSpeed() > 200) {
            karakter1.setSpeed(karakter1.getSpeed() - 200);
            karakter2.setSpeed(karakter2.getSpeed() + 200);
        } else if (karakter2.getSpeed() > 200) {
            karakter1.setSpeed(karakter1.getSpeed() + 200);
            karakter2.setSpeed(karakter2.getSpeed() - 200);
        }
    }
}