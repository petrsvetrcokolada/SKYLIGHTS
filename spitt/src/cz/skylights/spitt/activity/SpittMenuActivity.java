package cz.skylights.spitt.activity;

import cz.skylights.spitt.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class SpittMenuActivity extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        
        //menu 
       /* ImageButton start = (ImageButton)findViewById(R.id.btnStart);
        start.setOnClickListener(new OnClickListener() {			
			public void onClick(View v) {
				// run game		
				Intent game = new Intent(getApplicationContext(), SpatterGame.class);
				SpittMenuActivity.this.startActivity(game);
			}
		});*/
        
        ImageButton settings = (ImageButton)findViewById(R.id.btnSettings);
        settings.setOnClickListener(new OnClickListener() {			
			public void onClick(View v) {
				// run game		
				Intent sett = new Intent(getApplicationContext(), SpittSettingsActivity.class);
				SpittMenuActivity.this.startActivity(sett);
				
			
			}
		});
        
        ImageButton exit = (ImageButton)findViewById(R.id.btnExit);
        exit.setOnClickListener(new OnClickListener() {			
			public void onClick(View v) {
				//boolean dispose = false;
				//dispose = engine.onExit(v);
				//if (dispose == true)
				//{
					int pid  = android.os.Process.myPid();
					android.os.Process.killProcess(pid);
				//}
				
			}
		});
	}
}
