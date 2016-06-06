package ru.alexrodionov.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public final static String EXTRA_DRINKNO = "DrinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        Drink drink = null;
        int drinkId = getIntent().getIntExtra(EXTRA_DRINKNO, -1);
        if (drinkId >= 0) {
            drink = Drink.drinks[drinkId];
        }

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImgResource());
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());
    }
}
