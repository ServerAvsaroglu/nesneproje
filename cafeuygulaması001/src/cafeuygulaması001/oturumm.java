
package cafeuygulaması001;

public class oturumm {
    private static oturumm instance;
    private String kullaniciAdi;
    private oturumm() {
        
    }   
    
     public static synchronized oturumm getInstance() {
        if (instance == null) {
            instance = new oturumm();
        }
        return instance;
    }
    
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
}
