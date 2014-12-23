package com.lollypoplab.sraskin.helpfinder;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        WebView web_1 = (WebView) findViewById(R.id.webView);
        web_1.setInitialScale(1);
        web_1.getSettings().setJavaScriptEnabled(true);
        web_1.getSettings().setLoadWithOverviewMode(true);
        web_1.getSettings().setUseWideViewPort(true);
        web_1.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        web_1.setScrollbarFadingEnabled(false);
        web_1.loadUrl("http://flingfalcon.tk/hepfinder/index.html");


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
