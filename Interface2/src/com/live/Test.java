package com.live;

import com.music.Playable;
import com.music.string.Veena;
import com.music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Veena v = new Veena();
		Saxophone s = new Saxophone();
		
		v.play();
		s.play();
		
		Playable p1 = v;
		Playable p2 = s;
		
		p1.play();
		p2.play();
	}

}
