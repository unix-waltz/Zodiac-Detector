import java.util.Scanner;
public class JavaZodiacDetector {
    public static void main(String[] args) {
        System.out.println("selamat datang di zodiac detector!!");
  Scanner sc = new Scanner(System.in);
        System.out.println("nama kamu :");
        String nama = sc.next();
System.out.println("tanggal lahir kamu :");
int tangal = sc.nextInt();
        System.out.println("bulan lahir kamu :(pilih 1-12 yaahh)");
        String bulan = sc.next();

switch (bulan){
    case "1" :
        bulan = "january";
        break;
    case "2" :
        bulan = "february";
        break;


    case "3" :
        bulan ="maret";
        break;
    case "4" :
        bulan = "april";
        break;
    case "5":
        bulan ="mei";
        break;
    case  "6" :
        bulan = "juni";
        break;

    case "7" :
        bulan= "juli";
        break;
    case "8" :
        bulan = "agustus";
        break;
    case "9" :
        bulan = "september";
break;
    case "10":
        bulan="oktober";
        break;
    case "11" :
        bulan = "november";
        break;
    default:
        bulan = "desember";


}

System.out.println("!!============ZODIAC============!!");
        System.out.println("Nama :"+" "+nama);
        System.out.println("tangal lahir :"+" "+tangal+" "+bulan);

System.out.println("Zodiac kamu Adalah: ");
if((bulan == "january" || bulan =="desember") && (tangal >= 22 || tangal <=19 )){
    System.out.println("Carpicorn");
    System.out.println("Menaklukkan puncak bukan hanya tentang ketinggian, tapi tentang bagaimana Anda melangkah.");
}
        if((bulan == "january" || bulan =="february") && (tangal >= 20 || tangal <=18 )){
            System.out.println("Aquarius");
            System.out.println("");
        }else
        if((bulan == "february" || bulan =="maret") && (tangal >= 19 || tangal <=20 )){
            System.out.println("Pisces");
            System.out.println("");
        }else
        if ((bulan.equals("maret") || bulan.equals("april")) && (tangal >= 21 || tangal <= 19)) {
            System.out.println("Zodiak Anda adalah Aries.");
            // Tambahkan kata-kata yang relevan untuk Aries
        }else

        if ((bulan.equals("april") || bulan.equals("mei")) && (tangal >= 20 || tangal <= 20)) {
            System.out.println("Zodiak Anda adalah Taurus.");
            // Tambahkan kata-kata yang relevan untuk Taurus
        }else

        if ((bulan.equals("mei") || bulan.equals("juni")) && (tangal >= 21 || tangal <= 20)) {
            System.out.println("Zodiak Anda adalah Gemini.");
            // Tambahkan kata-kata yang relevan untuk Gemini
        }else

        if ((bulan.equals("juni") || bulan.equals("juli")) && (tangal >= 21 || tangal <= 22)) {
            System.out.println("Zodiak Anda adalah Cancer.");
            // Tambahkan kata-kata yang relevan untuk Cancer
        }else

        if ((bulan.equals("juli") || bulan.equals("agustus")) && (tangal >= 23 || tangal <= 22)) {
            System.out.println("Zodiak Anda adalah Leo.");
            // Tambahkan kata-kata yang relevan untuk Leo
        }else

        if ((bulan.equals("agustus") || bulan.equals("september")) && (tangal >= 23 || tangal <= 22)) {
            System.out.println("Zodiak Anda adalah Virgo.");
            // Tambahkan kata-kata yang relevan untuk Virgo
        }else

        if ((bulan.equals("september") || bulan.equals("oktober")) && (tangal >= 23 || tangal <= 22)) {
            System.out.println("Zodiak Anda adalah Libra.");
            // Tambahkan kata-kata yang relevan untuk Libra
        }else

        if ((bulan.equals("oktober") || bulan.equals("november")) && (tangal >= 23 || tangal <= 21)) {
            System.out.println("Zodiak Anda adalah Scorpio.");
            // Tambahkan kata-kata yang relevan untuk Scorpio
        }else

        if ((bulan.equals("november") || bulan.equals("desember")) && (tangal >= 22 || tangal <= 21)) {
            System.out.println("Zodiak Anda adalah Sagittarius.");
            // Tambahkan kata-kata yang relevan untuk Sagittarius
        }else



        if ((bulan.equals("desember") || bulan.equals("january")) && (tangal >= 22 || tangal <= 19)) {
            System.out.println("Zodiak Anda adalah Capricorn.");
            System.out.println("Menaklukkan puncak bukan hanya tentang ketinggian, tapi tentang bagaimana Anda melangkah.");
        }

        System.out.println("Terima kasih telah menggunakan Zodiac Detector!");
        sc.close();
    }
}
