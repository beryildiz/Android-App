package projekt.hsos.reisetagebuch.UI;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import projekt.hsos.reisetagebuch.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Ausblenden von der Actionbar
        getSupportActionBar().hide();

        Handler handler = new Handler();
        handler.postDelayed(this::switchScreen, 3000);

    }

    private void switchScreen() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

    }


}