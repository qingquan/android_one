package codepath.demos.helloworlddemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;

public class RateAlterDialog extends DialogFragment {
	
//	@Override
//	public Dialog onCreateDialog(Bundle savedInstanceState) {
//		// Use the Builder class for convenient dialog construction
//		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//		
//		//builder.setMessage(R.string.rate_app_content)
////		   .setTitle("Alter Dialog")
//	    LayoutInflater inflater = getActivity().getLayoutInflater();
//	    
//		builder.setView(inflater.inflate(R.layout.alert_dialog, null))
//				.setPositiveButton(R.string.fire,
//						new DialogInterface.OnClickListener() {
//							public void onClick(DialogInterface dialog, int id) {
//								// FIRE ZE MISSILES!
//							}
//						})
//				.setNegativeButton(R.string.cancel,
//						new DialogInterface.OnClickListener() {
//							public void onClick(DialogInterface dialog, int id) {
//								// User cancelled the dialog
//							}
//						});
//		// Create the AlertDialog object and return it
//		return builder.create();
		
		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
		    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		    // Get the layout inflater
		    LayoutInflater inflater = getActivity().getLayoutInflater();

		    // Inflate and set the layout for the dialog
		    // Pass null as the parent view because its going in the dialog layout
		    builder.setView(inflater.inflate(R.layout.alert_dialog, null))
		    // Add action buttons
		           .setPositiveButton(R.string.fire, new DialogInterface.OnClickListener() {
		               @Override
		               public void onClick(DialogInterface dialog, int id) {
		            	   Intent internetIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.douban.com"));
		            	   internetIntent.setComponent(new ComponentName("com.android.browser","com.android.browser.BrowserActivity"));
		            	   internetIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		            	   startActivity(internetIntent);
		               }
		           })
		           .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
		               public void onClick(DialogInterface dialog, int id) {
		            	   RateAlterDialog.this.getDialog().cancel();
		               }
		           });      
		    return builder.create();
		}
}