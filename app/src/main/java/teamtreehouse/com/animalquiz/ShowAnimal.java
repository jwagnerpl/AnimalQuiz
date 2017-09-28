package teamtreehouse.com.animalquiz;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowAnimal extends AppCompatActivity {

    @BindView(R.id.animalText) TextView animalText;
    @BindView(R.id.animalImage) ImageView animalImage;
    @BindView(R.id.animalDescription) TextView animalDescription;
    @BindView(R.id.caption) TextView captionTextView;

    public Animal matchAnimal(double gameTotal){

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
                gameTotal= extras.getString("GAME_TOTAL" + "");
                caption= extras.getString("CAPTION");
            }
        } else {
            gameTotal= (String) savedInstanceState.getSerializable("GAME_TOTAL");
            caption = (String) savedInstanceState.getSerializable("CAPTION");
        }
        Animal matchedAnimal = matchAnimal(Double.parseDouble(gameTotal));
        String matchedAnimalName = matchedAnimal.getAnimalName();
        animalText.setText(matchedAnimalName);
        animalImage.setImageResource(matchedAnimal.getAnimalImage());
        animalDescription.setText(matchedAnimal.getAnimalDescription());
        captionTextView.setText(caption);
        String verticalProperty = matchedAnimal.getVertAlign();
        String horizontalProperty = matchedAnimal.getHorizAlign();
        String bubbleOrientation = matchedAnimal.getBubbleOrientation();

        setBubbleProperties(verticalProperty,horizontalProperty,bubbleOrientation);

    }
    private void setBubbleProperties(String verticalProperty, String horizontalProperty, String bubbleOrientation){
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)captionTextView.getLayoutParams();

        if (verticalProperty.equals("top")) {
            params.addRule(RelativeLayout.ALIGN_PARENT_TOP, R.id.animalImage);
        }
        if (verticalProperty.equals("bottom")) {
            params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, R.id.animalImage);
        }
        if (verticalProperty.equals("center")) {
            params.addRule(RelativeLayout.CENTER_VERTICAL);
        }

        if (horizontalProperty.equals("left")) {
            params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        }
        if (horizontalProperty.equals("center")) {
            params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        }
        if (horizontalProperty.equals("right")) {
            params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        }

        if (bubbleOrientation.equals("right")) {
            captionTextView.setBackgroundResource(R.drawable.speech_bubble_right);
        }
        if (bubbleOrientation.equals("left")) {
            captionTextView.setBackgroundResource(R.drawable.speech_bubble_left);
        }
        if (bubbleOrientation.equals("down")) {
            captionTextView.setBackgroundResource(R.drawable.speech_bubble_bottom);
        }
        if (bubbleOrientation.equals("up")) {
            captionTextView.setBackgroundResource(R.drawable.speech_bubble_top);
        }
        captionTextView.setLayoutParams(params);
    }

}
