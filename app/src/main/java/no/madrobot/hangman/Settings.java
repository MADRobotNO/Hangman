package no.madrobot.hangman;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by marti on 14.11.2018.
 */

public class Settings extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();
    }

}

