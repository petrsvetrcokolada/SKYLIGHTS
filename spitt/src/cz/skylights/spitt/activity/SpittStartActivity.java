package cz.skylights.spitt.activity;


import cz.skylights.spitt.R;
import cz.skylights.spitt.engine.Engine;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.os.Handler;
import android.content.Intent;

public class SpittStartActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_spitt);
		
		Handler handlerTimer = new Handler();
    	handlerTimer.postDelayed(new Runnable(){
            public void run() {
            	ImageView image  = (ImageView)findViewById(R.id.titleImage);
            	image.setImageResource(R.drawable.logooranz);           
          }}, Engine.start_menu_delay);
    	
    	
		
		new Handler().postDelayed(new Thread() { 
            @Override 
            public void run() { 
                Intent mainMenu = 
                    new Intent(SpittStartActivity.this, SpittMenuActivity.class); 
                SpittStartActivity.this.startActivity(mainMenu);         
                SpittStartActivity.this.finish();
            } 
        }, Engine.start_menu_delay);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_start_spitt, menu);
		return true;
	}

}
