package teamtreehouse.com.animalquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static teamtreehouse.com.animalquiz.R2.id.questionTextView;


public class MainActivity extends AppCompatActivity {

    @BindView(R2.id.questionTextView) TextView questionTextView;
    @BindView(R2.id.animals_spinner) Spinner animalsSpinner;
    @BindView(R2.id.submitButton) Button submitButton;
    @BindView(R2.id.captionEditText) EditText captionEditText;

    int i = 0;
    public static String TAG = "";

    int gameTotal = 0;

    public void scoreAnswer(int selectedItem){
        switch(selectedItem){
            case 0: gameTotal = gameTotal + 5;
                break;
            case 1: gameTotal = gameTotal +10;
                break;
            case 2: gameTotal = gameTotal +15;
                break;
            case 3: gameTotal = gameTotal + 20;
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.animals_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        animalsSpinner.setAdapter(adapter);
        questionTextView.setText(Question.questions[i].questionText);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;

                if(i < 5) {
                    questionTextView.setText(Question.questions[i].questionText);
                    int selectedItem = animalsSpinner.getSelectedItemPosition();
                    scoreAnswer(selectedItem);
                }

                if (i == 5){
                    int selectedItem = animalsSpinner.getSelectedItemPosition();
                    scoreAnswer(selectedItem);
                    Bundle extras = new Bundle();
                    extras.putString("GAME_TOTAL", gameTotal + "");
                    extras.putString("CAPTION", captionEditText.getText().toString());
                    Intent intent = new Intent(getApplicationContext(), ShowAnimal.class);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
            }
        });
    }




}
