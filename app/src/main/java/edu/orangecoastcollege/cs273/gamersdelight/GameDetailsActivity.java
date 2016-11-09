package edu.orangecoastcollege.cs273.gamersdelight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


public class GameDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);

        ImageView gameDetailsImageView = (ImageView) findViewById(R.id.gameDetailsImageView);
        TextView gameDetailsNameTextView = (TextView) findViewById(R.id.gameDetailsNameTextView);
        TextView gameDetailsDescriptionTextView = (TextView) findViewById(R.id.gameDetailsDescriptionTextView);
        RatingBar gameDetailsRatingBar = (RatingBar) findViewById(R.id.gameDetailsRatingBar);


        Intent detailsIntent = getIntent();

        Game selectedGame = (Game) detailsIntent.getParcelableExtra("SelectedGame");

        /*
        String name = detailsIntent.getStringExtra("Name");
        String description = detailsIntent.getStringExtra("Description");
        float rating = detailsIntent.getFloatExtra("Rating", 0.0f);
        String imageName = detailsIntent.getStringExtra("ImageName");


        AssetManager am = this.getAssets();
        try {
            InputStream stream = am.open(imageName);
            Drawable event = Drawable.createFromStream(stream, name);
            gameDetailsImageView.setImageDrawable(event);
        }
        catch (IOException ex)
        {
            Log.e("Gamers Delight", "Error loading " + imageName, ex);
        }
        */

        gameDetailsNameTextView.setText(selectedGame.getName());
        gameDetailsDescriptionTextView.setText(selectedGame.getDescription());
        gameDetailsRatingBar.setRating(selectedGame.getRating());
        //gameDetailsImageView.setImageDrawable(selectedGame.getImageName());
    }
}
