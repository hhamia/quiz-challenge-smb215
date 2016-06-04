package com.example.skynete10.quiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.HttpResponse;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Register extends AppCompatActivity {
  String usernamevar;
    String passwordvar;
    String emailvar;
    TextView place;
    private String jsonResult;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button btnreg=(Button)findViewById(R.id.button3);
        TextView title=(TextView)findViewById(R.id.welcome);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "Jonquilles.ttf");
        title.setTypeface(custom_font);
        EditText unametext=(EditText)findViewById(R.id.editText);
        EditText passtext=(EditText)findViewById(R.id.editText2);
        EditText emailtext=(EditText)findViewById(R.id.editText3);
        usernamevar=unametext.getText().toString();
        passwordvar=passtext.getText().toString();
        emailvar=emailtext.getText().toString();
        url= "http://localhost/quiz_web.php?q="+usernamevar+"&q1="+passwordvar+"&q2="+emailvar;
        try{
            accessWebService();}
        catch(Exception e){
            Toast.makeText(getApplicationContext(),
                    "no connection", Toast.LENGTH_LONG).show();
        }


    }
    private class JsonReadTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            HttpClient httpclient = new DefaultHttpClient();

            HttpPost httppost = new HttpPost(params[0]);
            try {
                HttpResponse response = httpclient.execute(httppost);
            }

            catch (ClientProtocolException e) {
                Toast.makeText(getApplicationContext(),
                        "not found", Toast.LENGTH_LONG).show();
            }
            catch (IOException e) {
                Toast.makeText(getApplicationContext(),
                        "not found", Toast.LENGTH_LONG).show();
            }
            return null;
        }





    }// end async task

    public void accessWebService() {
        JsonReadTask task = new JsonReadTask();
        // passes values for the urls string array
        task.execute(new String[] { url });
    }

    // build hash set for list view




    private HashMap<String, String> createEmployee(String name, String number) {
        HashMap<String, String> employeeNameNo = new HashMap<String, String>();
        employeeNameNo.put(name, number);
        return employeeNameNo;
    }

    }

