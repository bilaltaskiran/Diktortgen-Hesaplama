
package dikdortgen;


public class Dikdortgen {

    private int en;
 private int boy;

 public void setEn(int en) {
 this.en = en;
 }
 public void setBoy(int boy) {
 this.boy = boy;
 }
 public int getEn() {
 return en;
 }
 public int getBoy() {
 return boy;
 }

 public int alanHesapla(){
     //alan hesaplama 
 return en*boy;
 }
 public int cevreHesapla(){
     // cevre hesaplama 

 return (en+boy)*2;
 }

    public static void main(String[] args) {
       Dikdortgen sehpa = new Dikdortgen();
 sehpa.setEn(10);
 sehpa.setBoy(15);
 System.out.println("alanı:"+sehpa.alanHesapla());
 // sonuc yazdırma sehpa alanı 
 System.out.println("cevresi:"+sehpa.cevreHesapla());
 //sonuc yazdırma sehpa cevresi
    }
    
}
