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

public class HouseReportPhotoUpload extends Activity {

	Button btnHKPhoto1;
	Button btnHKPhoto2;
	Button btnHKPhoto3;
	Button btnHKPhoto4;
	Button btnHKPhoto5;
	Button btnHKPhoto6;
	Button btnHKPhoto7;
	
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
		setContentView(R.layout.house_keeping_photo);

		btnHKPhoto1 = (Button) findViewById(R.id.btnHKPhoto1);
		btnHKPhoto2 = (Button) findViewById(R.id.btnHKPhoto2);
		btnHKPhoto3 = (Button) findViewById(R.id.btnHKPhoto3);
		btnHKPhoto4 = (Button) findViewById(R.id.btnHKPhoto4);
		btnHKPhoto5 = (Button) findViewById(R.id.btnHKPhoto5);
		btnHKPhoto6 = (Button) findViewById(R.id.btnHKPhoto6);
		btnHKPhoto7 = (Button) findViewById(R.id.btnHKPhoto7);
		
		btnHKPhoto1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				i = "01";
				captureImage();
				
			}
		});
		btnHKPhoto2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				i = "02";
				captureImage();
			}
		});
		btnHKPhoto3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				i = "03";
				captureImage();
				
			}
		});
		btnHKPhoto4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				i = "04";
				captureImage();
				
			}
		});
		btnHKPhoto5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				i = "05";
				captureImage();
				
			}
		});
		btnHKPhoto6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				i = "06";
				captureImage();
				
			}
		});
		btnHKPhoto7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				i = "07";
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
					+ "HouseKeeping_" + i + ".jpg");
			
			
			
			
			 
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
				btnHKPhoto1.setBackgroundColor(0xFF00FF00);
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
