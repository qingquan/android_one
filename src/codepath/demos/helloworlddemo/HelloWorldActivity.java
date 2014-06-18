package codepath.demos.helloworlddemo;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hello_world, menu);
		return true;
	}
	
	public void rateAppDialog(View view){
//		 AlertDialog.Builder builder = new AlertDialog.Builder(HelloWorldActivity.this);
//		 // Get the layout inflater
//		 LayoutInflater inflater = HelloWorldActivity.this.getLayoutInflater();
//
//		 // Inflate and set the layout for the dialog
//		 // Pass null as the parent view because its going in the dialog layout
//		 builder.setView(inflater.inflate(R.layout.alert_dialog, null));
//		 
//		 // Add action buttons
//		 builder.setPositiveButton(R.string.fire, new DialogInterface.OnClickListener() {
//			 @Override
//			 public void onClick(DialogInterface dialog, int id) {
//				 Intent internetIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.douban.com"));
//				 internetIntent.setComponent(new ComponentName("com.android.browser","com.android.browser.BrowserActivity"));
//				 internetIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//				 startActivity(internetIntent);
//			 }
//		 });
//		 builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
//			 public void onClick(DialogInterface dialog, int id) {
//				 dialog.cancel();
//			 }
//		 });      
//		 AlertDialog alertDialog = builder.create();
//		 alertDialog.show();
//		 alertDialog.setCanceledOnTouchOutside(false);
		
		
//		final AlertDialog dialog = new AlertDialog.Builder(HelloWorldActivity.this).create();
		 
	    final Dialog dialog = new Dialog(HelloWorldActivity.this);
//	    dialog.setTitle("My Dialog");
	    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
	    View dialog_view = LayoutInflater.from(HelloWorldActivity.this).inflate(R.layout.alert_dialog, null);
	    dialog_view.findViewById(R.id.rate_button).setOnClickListener(new View.OnClickListener() {
	        @Override
	        public void onClick(View v) {
	        	Intent internetIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.douban.com"));
	        	internetIntent.setComponent(new ComponentName("com.android.browser","com.android.browser.BrowserActivity"));
	        	internetIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	        	startActivity(internetIntent);
	        }
	    });
	    dialog_view.findViewById(R.id.remind_later).setOnClickListener(new View.OnClickListener() {
	        @Override
	        public void onClick(View v) {
	            dialog.dismiss();
	        }
	    });
	    dialog_view.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
	        @Override
	        public void onClick(View v) {
	            dialog.dismiss();
	        }
	    });

	    dialog.setContentView(dialog_view);
	    dialog.show();
	    dialog.setCanceledOnTouchOutside(false);
		 
		 
//		 return builder.create();
		 
//		FragmentManager fragmentManager = getFragmentManager();
//	    DialogFragment newFragment = new RateAlterDialog();
//	    newFragment.show(fragmentManager, "missile");
//		this.findViewById(R.string.fire)
	}
	
	public void openGooglePlay(View view){
		Intent internetIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.douban.com"));
		internetIntent.setComponent(new ComponentName("com.android.browser","com.android.browser.BrowserActivity"));
		internetIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(internetIntent);
	}
	
//	this.findViewById(R.string.fire)

}
