package com.example.viswambi;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class DailyReportPhotoUpload extends Activity {

	Button btndailyphoto1;
	Button btndailyphoto2;
	Button btndailyphoto3;
	Button btndailyphoto4;
	Button btndailyphoto5;
	Button btndailyphoto6;
	Button btndailyphoto7;
	Button btndailyphoto8;

	
	int TAKE_PHOTO_CODE = 0;
	String i;
	private static final int CAMERA_CAPTURE_IMAGE_REQUEST_CODE = 100;
	private static final int MEDIA_TYPE_IMAGE = 1;
	private static final int MEDIA_TYPE_VIDEO = 2;

	// directory name to store captured images and videos
	final String IMAGE_DIRECTORY_NAME = "Viswambi Photos";

	Uri fileUri; // file url to store image/video
	
	File mediaFile;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daily_audit_photo);

		btndailyphoto1 = (Button) findViewById(R.id.btndailyphoto1);
		btndailyphoto2 = (Button) findViewById(R.id.btndailyphoto2);
		btndailyphoto3 = (Button) findViewById(R.id.btndailyphoto3);
		btndailyphoto4 = (Button) findViewById(R.id.btndailyphoto4);
		btndailyphoto5 = (Button) findViewById(R.id.btndailyphoto5);
		btndailyphoto6 = (Button) findViewById(R.id.btndailyphoto6);
		btndailyphoto7 = (Button) findViewById(R.id.btndailyphoto7);
		btndailyphoto8 = (Button) findViewById(R.id.btndailyphoto8);

		btndailyphoto1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				  i = "01";
				captureImage();

			}
		});
		btndailyphoto2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 i = "02" ;
				captureImage();

			}
		});
		btndailyphoto3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 i = "03";
				
				captureImage();

			} 
		});
		btndailyphoto4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 i = "04";
				captureImage();

			}

		});
		btndailyphoto5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				i= "05";
				captureImage();

			}
		});
		btndailyphoto6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				i= "06";
				captureImage();

			}
		});
		btndailyphoto7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				i= "07";
				captureImage();

			}
		});
		btndailyphoto8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				i= "08";
				captureImage(); 

			}
		});

	}

	protected void captureImage() {
		// TODO Auto-generated method stub

		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		Uri fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE);
		intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
		startActivityForResult(intent, CAMERA_CAPTURE_IMAGE_REQUEST_CODE);

	}

	public Uri getOutputMediaFileUri(int type) {
		// TODO Auto-generated method stub
		return Uri.fromFile(getOutputMediaFile(type));
		
	}

	public File getOutputMediaFile(int type) {

		// External sdcard location
		File mediaStorageDir = new File(
				Environment
						.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
				IMAGE_DIRECTORY_NAME);

		// Create the storage directory if it does not exist
		if (!mediaStorageDir.exists()) {
			if (!mediaStorageDir.mkdirs()) {
				Log.d(IMAGE_DIRECTORY_NAME, "Oops! Failed create "
						+ IMAGE_DIRECTORY_NAME + " directory");
				return null;
			}
		}

		// Create a media file name
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss",
				Locale.getDefault()).format(new Date());
		
		if (type == MEDIA_TYPE_IMAGE) {
			mediaFile = new File(mediaStorageDir.getPath() + File.separator
					+ "DailySiteAudit_" + i + ".jpg");
			
			
			
			
			 
		} else if (type == MEDIA_TYPE_VIDEO) {
			mediaFile = new File(mediaStorageDir.getPath() + File.separator
					+ "VID_" + i + ".mp4");
		} else {
			return null;
		}
		
		Log.d("Image Path First", "Path"+mediaFile);

		return mediaFile;
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
//		Log.d("Image Path", "Path"+mediaFile);
//
//		Log.e("onActivity Result", "Image");

		if (requestCode == CAMERA_CAPTURE_IMAGE_REQUEST_CODE) {
			
			if (resultCode == RESULT_OK) {
				
				Log.d("OnActivity Image Path", "Path"+mediaFile);
				btndailyphoto1.setBackgroundColor(0xFF00FF00);
				// successfully captured the image
				// display it in image view
				// previewCapturedImage();
			} else if (resultCode == RESULT_CANCELED) {
				// user cancelled Image capture
				Toast.makeText(getApplicationContext(),
						"User cancelled image capture", Toast.LENGTH_SHORT)
						.show();
			} else {
				// failed to capture image
				Toast.makeText(getApplicationContext(),
						"Sorry! Failed to capture image", Toast.LENGTH_SHORT)
						.show();
			}
		}

	}

}
