package com.example.viswambi;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import android.os.AsyncTask;

public class AsyncHttpPost extends AsyncTask<String, String, String>{

	private Map<Integer, String> mData = null;// post data

	public AsyncHttpPost(Map<Integer, String> comp_sub_val) {
		mData = comp_sub_val;
	}

	public void execute(String string) {

	}

	@Override
	protected String doInBackground(String... params) {
		byte[] result = null;
        String str = "";
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(params[0]);// in this case, params[0] is URL
        try {
            // set up post data
            ArrayList<NameValuePair> nameValuePair = new ArrayList<NameValuePair>();
            Iterator<Integer> it = mData.keySet().iterator();
            while (it.hasNext()) {
                Integer key = it.next();
                String key_val_client = String.valueOf(key);
                nameValuePair.add(new BasicNameValuePair(key_val_client, mData.get(key)));
            }
            post.setEntity(new UrlEncodedFormEntity(nameValuePair, "UTF-8"));
            HttpResponse response = client.execute(post);
            StatusLine statusLine = response.getStatusLine();
            if(statusLine.getStatusCode() == HttpURLConnection.HTTP_OK){
                result = EntityUtils.toByteArray(response.getEntity());
                str = new String(result, "UTF-8");
            }
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        catch (Exception e) {
        }

        return str;
	}

	@Override
    protected void onPostExecute(String result) {

	}
}
