package com.week2.main.question4;

public abstract class Account {
	protected User user;
	//protected boolean AuthenticationStatus=false;
	final void showUserInfo() {
		
	System.out.println("Isim: "+ user.isim + " Soyisim: "+ user.soyisim+ " Email: "+
	user.email + " Şifre: "+user.sifre+" Meslek: "+user.meslek+" Adress: "+ user.stringList+
	"HomeAddress:"+user.HomeAddress+"BusinessAddress:"+user.BusinessAddress);
		
	}
	public enum AuthenticationStatus{
	SUCCESS("Login işlemi başarılı."),
	FAIL("Login işlemi başarısız.");

	AuthenticationStatus(String string) {
		// TODO Auto-generated constructor stub
	}
	}
	//Sigorta Bilgisi
	public String toString(String sigortaBilgisi) {
	StringBuilder sigorta=new StringBuilder();
	sigorta.append(sigortaBilgisi);
	return sigorta.toString();
	}
}
