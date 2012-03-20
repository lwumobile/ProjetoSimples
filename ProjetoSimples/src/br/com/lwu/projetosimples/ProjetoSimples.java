package br.com.lwu.projetosimples;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.*;


public class ProjetoSimples extends Activity {
    /** Called when the activity is first created. */
	
 	FrameLayout Splash;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        Splash = (FrameLayout) findViewById(R.id.FrameSplash);        
        
        // Muda a cor do Splash:
        Splash.setBackgroundColor(Color.WHITE);
        
    }
}