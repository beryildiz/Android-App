package projekt.hsos.reisetagebuch.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.lifecycle.ViewModelProvider;

import projekt.hsos.reisetagebuch.Entitaet.User;
import projekt.hsos.reisetagebuch.R;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create instance of the ViewModel Klasse
        ScoreViewModel model = new ViewModelProvider(this).get(ScoreViewModel.class);

        User user = new User.UserBuilder("Cocksoldat", "Schwanz", "Fotz")
                .mitAlter(23)
                .mitEmail("huso@gmail.com")
                .build();

        textView = findViewById(R.id.textView);

        DisplayPoints(model, user);





    }

    private void DisplayPoints(ScoreViewModel model, User user) {
        // Getting Number of points

        textView.setText(user.toString());
        Toast.makeText(this, "Points of A " + model.scoreA, Toast.LENGTH_SHORT).show();
    }


}