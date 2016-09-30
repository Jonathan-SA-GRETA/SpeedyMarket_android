package utilitaire;

import android.os.AsyncTask;
import android.util.Log;


import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by alex on 27/08/16.
 */
public class AccesHTTP extends AsyncTask<String, Integer, Long> {
    public String ret = "";
    private ArrayList<NameValuePair> parameters;

    public AccesHTTP() {
        parameters = new ArrayList<NameValuePair>();
    }

    public void addParam(String name, String value){
        parameters.add(new BasicNameValuePair(name, value));
    }

    @Override
    protected Long doInBackground(String... urls) {
        HttpClient cnxHttp = new DefaultHttpClient();
        HttpPost paramCnx = new HttpPost(urls[0]);
        Log.d("log","urls[0] : " + urls[0]);

        try {
            paramCnx.setEntity(new UrlEncodedFormEntity(parameters));
            Log.d("log","parametres : "+parameters);
            HttpResponse reponse = cnxHttp.execute(paramCnx);

            ret = EntityUtils.toString(reponse.getEntity());
            Log.d("log","ret : "+ret);

        } catch (ClientProtocolException e) {

        } catch (IOException e) {

        }

        return null;
    }
}
