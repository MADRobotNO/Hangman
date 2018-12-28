package no.madrobot.hangman;
import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by marti on 14.11.2018.
 */

public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
