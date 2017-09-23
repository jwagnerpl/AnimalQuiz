package teamtreehouse.com.animalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowAnimal extends AppCompatActivity {

    @BindView(R.id.animalText) TextView animalText;
    @BindView(R.id.animalImage) ImageView animalImage;
    @BindView(R.id.animalDescription) TextView animalDescription;
    @BindView(R.id.caption) TextView captionTextView;

    public Animal matchAnimal(int gameTotal){

        ButterKnife.bind(this);
        Animal matchedAnimal = null;

        for(Animal animal: Animal.animalList){
           if(gameTotal >= animal.getMinValue() && gameTotal <= animal.getMaxValue()){
               matchedAnimal = animal;
           }
       }
        return matchedAnimal;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_animal);


        String gameTotal;
        String caption = "";
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                gameTotal= null;
            } else {
                gameTotal= extras.getString("GAME_TOTAL");
                caption= extras.getString("CAPTION");
            }
        } else {
            gameTotal= (String) savedInstanceState.getSerializable("GAME_TOTAL");
            caption = (String) savedInstanceState.getSerializable("CAPTION");
        }
        Animal matchedAnimal = matchAnimal(Integer.parseInt(gameTotal));
        String matchedAnimalName = matchedAnimal.getAnimalName();
        animalText.setText(matchedAnimalName);
        animalImage.setImageResource(matchedAnimal.getAnimalImage());
        animalDescription.setText(matchedAnimal.getAnimalDescription());
        captionTextView.setText(caption);
    }
}
