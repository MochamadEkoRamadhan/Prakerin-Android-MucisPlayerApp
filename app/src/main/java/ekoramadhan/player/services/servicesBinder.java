package ekoramadhan.player.services;

import ekoramadhan.linedeer.player.musicPlayer;

import android.os.Binder;

public class servicesBinder extends Binder{
	musicPlayer services;
	public servicesBinder(musicPlayer services) {
		this.services = services;
	}
	
	public musicPlayer getServices(){
		return services;
	}
	
}
