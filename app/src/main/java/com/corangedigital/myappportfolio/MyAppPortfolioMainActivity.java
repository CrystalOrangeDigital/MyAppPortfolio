package com.corangedigital.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MyAppPortfolioMainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio_main);
        getWindow().setBackgroundDrawable(null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio_main, menu);
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

    private void cook(String myToast, View view){
        Context context = view.getContext();
        int duration = Toast.LENGTH_SHORT;
        myToast = getString(R.string.toast_base_message) + myToast;
        Toast toast = Toast.makeText(context, myToast, duration);
        toast.show();
    }

    public void spotifyStreamer(View view) {
        String myToast = getString(R.string.button_1);
        cook(myToast, view);
    }

    public void scoresApp(View view) {
        String myToast = getString(R.string.button_2);
        cook(myToast, view);

    }
    public void libraryApp(View view) {
        String myToast = getString(R.string.button_3);
        cook(myToast, view);

    }

    public void buildItBigger(View view) {
        String myToast = getString(R.string.button_4);
        cook(myToast, view);
    }

    public void xyzReader(View view) {
        String myToast = getString(R.string.button_5);
        cook(myToast, view);

    }

    public void capStoneProject(View view) {
        String myToast = getString(R.string.button_6);
        cook(myToast, view);

    }
}
