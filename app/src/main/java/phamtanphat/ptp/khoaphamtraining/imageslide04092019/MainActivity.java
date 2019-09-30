package phamtanphat.ptp.khoaphamtraining.imageslide04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mimg;
    Button mbtnSlide;
    int[] mArrayanimal = {R.drawable.ic_cat,
            R.drawable.ic_dog,
            R.drawable.ic_fish,
            R.drawable.ic_lion,
            R.drawable.ic_monkey};
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        event();
    }

    private void event() {
        mbtnSlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                view.setVisibility(View.GONE);
                CountDownTimer countDownTimer = new CountDownTimer(60000, 1000) {
                    @Override
                    public void onTick(long l) {
                        if (index == mArrayanimal.length) {
                            index = 0;
                            view.setVisibility(View.VISIBLE);
                        }
                        mimg.setImageResource(mArrayanimal[index++]);
                    }

                    @Override
                    public void onFinish() {
                        this.start();
                    }
                };
                countDownTimer.start();
            }
        });
    }

    private void init() {
        mimg = findViewById(R.id.imaeview);
        mbtnSlide = findViewById(R.id.buttonSlideImage);
    }
}
