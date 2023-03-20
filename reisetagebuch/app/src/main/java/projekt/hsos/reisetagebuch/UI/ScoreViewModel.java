package projekt.hsos.reisetagebuch.UI;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class ScoreViewModel extends AndroidViewModel {

    // Das ist unsere ViewModel Klasse wo wir unsere Daten speichern und wieder rausholen

    // Wir brauchen diesen ViewModel weil wenn wir z.B. die App minimieren, die Daten verloren gehen.
    // "SafeState geht verloren wie bei alten GameBoy spielen"

    public int scoreA = 10;
    public int ScoreB = 0;

    public ScoreViewModel(@NonNull Application application) {
        super(application);
    }
}
