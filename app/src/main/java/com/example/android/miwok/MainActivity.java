
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Set the content of the activity to use the activity_main.xml layout file
            setContentView(R.layout.activity_main);

            // Find the View that shows the numbers category
            TextView numbers = (TextView) findViewById(R.id.numbers);

            // Find the View that shows the family category
            TextView family = (TextView) findViewById(R.id.family);

            // Find the View that shows the colors category
            TextView colors = (TextView) findViewById(R.id.colors);

            // Find the View that shows the phrases category
            TextView phrases = (TextView) findViewById(R.id.phrases);

            // Set a click listener on number View
            numbers.setOnClickListener(new OnClickListener(){
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@Link NumbersActivity}
                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(numbersIntent);
                }
            });

            // Set a click listener on family View
            family.setOnClickListener(new OnClickListener(){
                // The code in this method will be executed when the family View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@Link FamilyMembersActivity}
                    Intent familyIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                    startActivity(familyIntent);
                }
            });

            // Set a click listener on colors View
            colors.setOnClickListener(new OnClickListener(){
                // The code in this method will be executed when the colors View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@Link ColorsActivity}
                    Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(colorsIntent);
                }
            });

            // Set a click listener on phrases View
            phrases.setOnClickListener(new OnClickListener(){
                // The code in this method will be executed when the phrases View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@Link PhrasesActivity}
                    Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(phrasesIntent);
                }
            });



        }
}