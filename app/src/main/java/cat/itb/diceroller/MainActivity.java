package cat.itb.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    Button resetButton;
    ImageView resultImageView;
    ImageView resultImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resetButton = findViewById(R.id.reset_button);
        rollButton = findViewById(R.id.roll_button);
        resultImageView = findViewById(R.id.result_textview);
        resultImageView2 = findViewById(R.id.result_textview2);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You clicked the button", Toast.LENGTH_LONG).show();

                int random = (int) (Math.random() * 6);
                int random2 = (int) (Math.random() * 6);
                if (random == 6 && random2 == 6){
                    Toast.makeText(getApplicationContext(), "JACKPOT!", Toast.LENGTH_LONG).show();
                }
                switch (random){
                    case 1:
                        resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2:
                        resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3:
                        resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4:
                        resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5:
                        resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    case 6:
                        resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                        break;
                }
                switch (random2){
                    case 1:
                        resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2:
                        resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3:
                        resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4:
                        resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5:
                        resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    case 6:
                        resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                        break;
                }

            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.empty_dice));
                resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.empty_dice));
            }
        });

        resultImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = (int) (Math.random() * 6);
                switch (random){
                    case 1:
                        resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2:
                        resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3:
                        resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4:
                        resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5:
                        resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    case 6:
                        resultImageView.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                        break;
                }

            }
        });

        resultImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random2 = (int) (Math.random() * 6);
                switch (random2){
                    case 1:
                        resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_1));
                        break;
                    case 2:
                        resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_2));
                        break;
                    case 3:
                        resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_3));
                        break;
                    case 4:
                        resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_4));
                        break;
                    case 5:
                        resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_5));
                        break;
                    case 6:
                        resultImageView2.setImageDrawable(getResources().getDrawable(R.drawable.dice_6));
                        break;
                }
            }
        });
    }
}