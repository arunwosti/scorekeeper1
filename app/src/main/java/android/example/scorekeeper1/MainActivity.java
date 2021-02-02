package android.example.scorekeeper1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView scoreTeamA;
    private Button btnTeamA3;
    private Button btnTeamA2;
    private Button btnTeamA1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTeamA = findViewById(R.id.scoreTeamA);
        btnTeamA3 = findViewById(R.id.btn_score3);
        btnTeamA2 = findViewById(R.id.btn_score2);
        btnTeamA1 = findViewById(R.id.btn_score1);

    }
}