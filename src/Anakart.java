public class Anakart {

    private String model;
    private String yonetici;
    private int yuva_sayisi;
    private String isletim_sistemi;

    public Anakart(String model, String yonetici, int yuva_sayisi, String isletim_sistemi) {
        this.model = model;
        this.yonetici = yonetici;
        this.yuva_sayisi = yuva_sayisi;
        this.isletim_sistemi = isletim_sistemi;
    }
    public void isletim_sistemi_yukle(String isletim_sistemi){
        this.isletim_sistemi = isletim_sistemi;

        System.out.println("işletim sistemi yüklendi : "+isletim_sistemi);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYonetici() {
        return yonetici;
    }

    public void setYonetici(String yonetici) {
        this.yonetici = yonetici;
    }

    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }
}
