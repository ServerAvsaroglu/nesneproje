import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class menü {

    private Map<String, Integer> menu;
    private Map<String, Integer> icecekler;

    public menü() {
        menu = new HashMap<>();
        icecekler = new HashMap<>();

        // Menüyü ve fiyatları tanımla
        menu.put("Kuşbaşı", 150);
        menu.put("Adana", 120);
        menu.put("Ciğer", 120);
        menu.put("Urfa", 150);
        menu.put("Patlıcanlı", 120);

        // İçecekleri ve fiyatları tanımla
        icecekler.put("Cola", 25);
        icecekler.put("Açık Ayran", 20);
        icecekler.put("Kapalı Ayran", 20);
    }

    public void menuGoster() {
        System.out.println("---- Ciğer Dünyası Menüsü ----");
        System.out.println("Kebap Çeşitleri:");
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " TL");
        }

        System.out.println("\nİçecekler:");
        for (Map.Entry<String, Integer> entry : icecekler.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " TL");
        }
    }

    public int toplamFiyatHesapla(String secilenKebap, String secilenIcecek) {
        int kebapFiyat = menu.getOrDefault(secilenKebap, 0);
        int icecekFiyat = icecekler.getOrDefault(secilenIcecek, 0);

        if (kebapFiyat == 0 || icecekFiyat == 0) {
            return -1; // Geçersiz seçim
        }

        return kebapFiyat + icecekFiyat;
    }

    public static void main(String[] args) {
        menü cigerDunyasi = new menü();
        cigerDunyasi.menuGoster();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hangi kebap çeşidini seçersiniz? ");
        String secilenKebap = scanner.nextLine();

        System.out.print("Hangi içeceği seçersiniz? ");
        String secilenIcecek = scanner.nextLine();

        int toplamFiyat = cigerDunyasi.toplamFiyatHesapla(secilenKebap, secilenIcecek);

        if (toplamFiyat != -1) {
            System.out.println("Toplam fiyat: " + toplamFiyat + " TL");
        
        }
    }
}
