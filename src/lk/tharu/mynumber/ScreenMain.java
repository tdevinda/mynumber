package lk.tharu.mynumber;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnDragListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ScreenMain extends Activity {
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.layout_screen_main);
		
		Button addNew = (Button)findViewById(R.id.button_main_newPatient);
		
		addNew.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
				final View popupView = inflater.inflate(R.layout.layout_popup_addnew, null);
				
				AlertDialog.Builder builder = new AlertDialog.Builder(ScreenMain.this);
				
				builder.setTitle(R.string.string_addNew_title)
				.setView(popupView)
				.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						Toast.makeText(getApplicationContext(), "Patient Added", Toast.LENGTH_SHORT).show();
					}
				});
				
				builder.create().show();
				
				
			}
			
		});
		
		TextView counter = (TextView) findViewById(R.id.textView_main_currentPatientNumber);
	
	}
}
