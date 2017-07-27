import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

/**
 * @author sedad
 *
 */
public class Hastanebean {
	
	private String ilce;
	private String il;
	private String hastaneAd;
	private String klinik;
	private String doktor;
	private boolean goster=false;
	private boolean goster1=true;
	private boolean goster2=false;
	private boolean goster3=false; 
	
	public void degistir(){
		goster=!goster;
		
	}
	public void degistir1(){
		goster1=!goster1;
		
	}
	public void degistir2(){
		goster2=!goster2;
		
	}
	public void degistir3(){
		goster3=!goster3;
		
	}
	private List<SelectItem> ilceListesi=new ArrayList<SelectItem>();
	private List<SelectItem> hastaneAdListesi=new ArrayList<SelectItem>();
	private List<SelectItem> doktorListesi=new ArrayList<SelectItem>();
 	
	public void ilceYukle(ValueChangeEvent event){
		ilceListesi.clear();
		hastaneAdListesi.clear();
		String secilenSehir=event.getNewValue().toString();
		
		if(secilenSehir.equalsIgnoreCase("DIYARBAKIR")){
			ilceListesi.add(new SelectItem("lice"));
			ilceListesi.add(new SelectItem("egil"));
			hastaneAdListesi.add(new SelectItem("MEDIPOL HASTANESI "));
			hastaneAdListesi.add(new SelectItem("SULTAN HASTANESI "));
			hastaneAdListesi.add(new SelectItem("METROPOL HASTANESI "));
			
		}else if(secilenSehir.equalsIgnoreCase("hatay")){
			ilceListesi.add(new SelectItem("dortyol"));
			ilceListesi.add(new SelectItem("erzin"));
			hastaneAdListesi.add(new SelectItem("HATAY DEVLET HASTANESI "));
			hastaneAdListesi.add(new SelectItem("DOGU HASTANESI "));
			hastaneAdListesi.add(new SelectItem("ERZIN HASTANESI "));
		}else if(secilenSehir.equalsIgnoreCase("ADANA")){
			ilceListesi.add(new SelectItem("yumurta"));
			ilceListesi.add(new SelectItem("yuregir"));
			hastaneAdListesi.add(new SelectItem("YUMURTALIK ARASTIRMA HASTANESI "));
			hastaneAdListesi.add(new SelectItem("YUREGIR DEVLET HASTANESI "));
			
		}
	}
	
	public void doktorYukle(ValueChangeEvent event){
		doktorListesi.clear();
		String secilenKlinik=event.getNewValue().toString();
		if(secilenKlinik.equalsIgnoreCase("GENEL CERRAHI")){
			doktorListesi.add(new SelectItem("Prof. Dr. Faruk Coþkun"));
			doktorListesi.add(new SelectItem("Uzm. Dr. Tolga Dinç"));
			doktorListesi.add(new SelectItem("Op. Dr. Mükkerem Cete "));
		}
		else if(secilenKlinik.equalsIgnoreCase("BEYIN CERRAHI KLINIGI")){
			doktorListesi.add(new SelectItem("Prof. Dr. Ahmet Deniz Belen "));
			doktorListesi.add(new SelectItem("Op. Dr. Ömer Fatih Gürsoy "));
			doktorListesi.add(new SelectItem("Doç. Dr. Ergün Daðlýoðlu "));
		}else if(secilenKlinik.equalsIgnoreCase("DAHILIYE KLINIGI")){
			doktorListesi.add(new SelectItem("Uzm. Dr. Pýrýl Akýncýoðlu  "));
			doktorListesi.add(new SelectItem("Uzm. Dr. Selma Karaahmetoðlu "));
			doktorListesi.add(new SelectItem("Uzm. Dr. Nisbet Yýlmaz"));
		}
		
	}
	
	
	private Hastane hastane=new Hastane();
	private List<Hastane> hastaneListesi=new ArrayList<Hastane>();
	
	public void kaydet(){
		hastaneListesi.add(hastane);
		hastane=new Hastane();
		
	}
	public void sil(){
		hastaneListesi.remove(hastane);
		hastane=new Hastane();
	}
	public void duzenle(){
		hastane=new Hastane();
		
	}
	public String hesapBilgileri(){
		return "hesapBilgileri";
	}
	
	public String giris(){
		return "giris";
	}
	public String kaydol(){
		return "kaydol";
	} 
	public List<Hastane> getHastaneListesi() {
		return hastaneListesi;
	}
	public void setHastaneListesi(List<Hastane> hastaneListesi) {
		this.hastaneListesi = hastaneListesi;
	}
	public Hastane getHastane() {
		return hastane;
	}
	public void setHastane(Hastane hastane) {
		this.hastane = hastane;
	}
	

	private String message;
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
    public void saveMessage() {
    	
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Successful") );
       
    }
	
	public String getIlce() {
		return ilce;
	}
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public List<SelectItem> getIlceListesi() {
		return ilceListesi;
	}
	public void setIlceListesi(List<SelectItem> ilceListesi) {
		this.ilceListesi = ilceListesi;
	}


	public String getHastaneAd() {
		return hastaneAd;
	}


	public void setHastaneAd(String hastaneAd) {
		this.hastaneAd = hastaneAd;
	}


	public List<SelectItem> getHastaneAdListesi() {
		return hastaneAdListesi;
	}


	public void setHastaneAdListesi(List<SelectItem> hastaneAdListesi) {
		this.hastaneAdListesi = hastaneAdListesi;
	}


	public String getKlinik() {
		return klinik;
	}


	public void setKlinik(String klinik) {
		this.klinik = klinik;
	}


	public String getDoktor() {
		return doktor;
	}


	public void setDoktor(String doktor) {
		this.doktor = doktor;
	}


	public List<SelectItem> getDoktorListesi() {
		return doktorListesi;
	}


	public void setDoktorListesi(List<SelectItem> doktorListesi) {
		this.doktorListesi = doktorListesi;
	}

	public boolean isGoster() {
		return goster;
	}

	public void setGoster(boolean goster) {
		this.goster = goster;
	}
	public boolean isGoster1() {
		return goster1;
	}
	public void setGoster1(boolean goster1) {
		this.goster1 = goster1;
	}
	public boolean isGoster2() {
		return goster2;
	}
	public void setGoster2(boolean goster2) {
		this.goster2 = goster2;
	}
	public boolean isGoster3() {
		return goster3;
	}
	public void setGoster3(boolean goster3) {
		this.goster3 = goster3;
	}

	
	
}
	
	
	