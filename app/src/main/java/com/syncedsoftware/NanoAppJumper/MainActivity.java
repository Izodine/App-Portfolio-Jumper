package com.syncedsoftware.NanoAppJumper;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerClickEvents();

    }

    private void registerClickEvents() {
        Button btn_spotifyStreamer = (Button)findViewById(R.id.btn_spotify_streamer);
        btn_spotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToastMessage("This will launch Spotify Streamer" +
                        " in the near future!");
            }
        });

        Button btn_scores = (Button)findViewById(R.id.btn_scores);
        btn_scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToastMessage("This will launch Scores App in the" +
                        " near future!");
            }
        });

        Button btn_library = (Button)findViewById(R.id.btn_library);
        btn_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToastMessage("This will launch the Library app" +
                        " in the near future!");
            }
        });

        Button btn_buildItBigger = (Button)findViewById(R.id.btn_build_it_bigger);
        btn_buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToastMessage("This will launch the Build It Bigger" +
                        " app in the near future!");
            }
        });

        Button btn_xyzReader = (Button)findViewById(R.id.btn_xyz_reader);
        btn_xyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToastMessage("This will launch the XYZ Reader" +
                        " in the near future!");
            }
        });

        Button btn_capstone = (Button)findViewById(R.id.btn_capstone);
        btn_capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToastMessage("This will launch the Capstone" +
                        " app in the near future!");
            }
        });
    }

    public void printToastMessage(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
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
