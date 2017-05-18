package ru.sberbank.user7.learnloaders;

import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView name, age, height, specie;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        specie = (TextView) findViewById(R.id.specie);
        age = (TextView) findViewById(R.id.age);
        height = (TextView) findViewById(R.id.height);
        name = (TextView) findViewById(R.id.name);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportLoaderManager().initLoader(1, null, new AnimalsLoaderCallBacks());
                getSupportLoaderManager().getLoader(1).forceLoad();
            }
        });


    }
    private  class AnimalsLoaderCallBacks implements LoaderManager.LoaderCallbacks<Animal>{
        @Override
        public Loader<Animal> onCreateLoader(int id, Bundle args) {
            return new AnimalLoader(MainActivity.this);
        }

        @Override
        public void onLoadFinished(Loader<Animal> loader, Animal data) {
            age.setText(String.valueOf(data.getmAge()));
            name.setText(data.getName());
            specie.setText(data.getmSpecie());
            height.setText(String.valueOf(data.getHeight()));
            Log.e("e","load finish");
        }

        @Override
        public void onLoaderReset(Loader<Animal> loader) {

            Log.e("e","loaderReset");
        }


    }
}
