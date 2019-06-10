/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Set OnclickListener on Numbers view and define its body in order to openNumbersList
        final TextView numbersView = (TextView) findViewById(R.id.numbers);
        numbersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumbersList(numbersView);
            }
        });

        // Set OnClickListener on Phrases view and define its body to openPhrasesList
        final TextView phrasesView = (TextView) findViewById(R.id.phrases);
        phrasesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPhrasesList(phrasesView);
            }
        });

        // Set OnClickListener on Colors view and set it to open up the {@link ColorsActivity}
        final TextView colorsView = (TextView) findViewById(R.id.colors);
        colorsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openColorsList(colorsView);
            }
        });

        // Set OnClickListener on Family view to open up the {@link FamilyActivity}
        final TextView familyView = (TextView) findViewById(R.id.family);
        familyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFamilyList(familyView);
            }
        });
    }

    //Opens the {@link NumbersActivitiy}
    public void openNumbersList(View view) {
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }

    //Opens the {@link PhrasesActivitiy}
    public void openPhrasesList(View view) {
        Intent intent = new Intent(this, PhrasesActivity.class);
        startActivity(intent);
    }

    //Opens the {@link FamilyActivitiy}
    public void openFamilyList(View view) {
        Intent intent = new Intent(this, FamilyActivity.class);
        startActivity(intent);
    }

    //Opens the {@link ColorsActivitiy}
    public void openColorsList(View view) {
        Intent intent = new Intent(this, ColorsActivity.class);
        startActivity(intent);
    }
}
