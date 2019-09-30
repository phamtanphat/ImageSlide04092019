package phamtanphat.ptp.khoaphamtraining.imageslide04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Countdowntimer
        CountDownTimer countDownTimer = new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {
                Log.d("BBB",l + "");
            }

            @Override
            public void onFinish() {

            }
        };
        countDownTimer.start();


    }
}
