package com.example.familytreeandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewInfoTreeActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private int id = ViewTreeFragment.check1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_info_tree);

        TextView surname = findViewById(R.id.TextView3);
        TextView name = findViewById(R.id.TextView2);
        TextView patronymic = findViewById(R.id.TextView4);
        TextView date = findViewById(R.id.TextView5);
        TextView city = findViewById(R.id.TextView6);
        TextView biography = findViewById(R.id.TextView7);
        ImageView image = findViewById(R.id.imageView2);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Подробнее");
        setSupportActionBar(toolbar);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if(id == 0){
            surname.setText(surname.getText() + ReadInfoTreeActivity.iMass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.iMass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.iMass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.iMass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.iMass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.iMass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[0]);
        }else if(id == 1){
            surname.setText(surname.getText() + ReadInfoTreeActivity.mumMass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.mumMass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.mumMass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.mumMass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.mumMass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.mumMass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[1]);
        }else if(id == 2){
            surname.setText(surname.getText() + ReadInfoTreeActivity.dedMass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.dedMass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.dedMass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.dedMass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.dedMass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.dedMass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[2]);
        }else if(id == 3){
            surname.setText(surname.getText() + ReadInfoTreeActivity.gmmMass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.gmmMass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.gmmMass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.gmmMass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.gmmMass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.gmmMass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[3]);
        }else if(id == 4){
            surname.setText(surname.getText() + ReadInfoTreeActivity.gfmMass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.gfmMass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.gfmMass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.gfmMass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.gfmMass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.gfmMass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[4]);
        }else if(id == 5){
            surname.setText(surname.getText() + ReadInfoTreeActivity.gmdMass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.gmdMass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.gmdMass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.gmdMass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.gmdMass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.gmdMass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[5]);
        }else if(id == 6){
            surname.setText(surname.getText() + ReadInfoTreeActivity.gfdMass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.gfdMass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.gfdMass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.gfdMass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.gfdMass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.gfdMass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[6]);
        }else if(id == 7){
            surname.setText(surname.getText() + ReadInfoTreeActivity.ggfmMass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.ggfmMass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.ggfmMass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.ggfmMass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.ggfmMass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.ggfmMass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[7]);
        }else if(id == 8){
            surname.setText(surname.getText() + ReadInfoTreeActivity.ggmmMass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.ggmmMass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.ggmmMass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.ggmmMass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.ggmmMass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.ggmmMass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[8]);
        }else if(id == 9){
            surname.setText(surname.getText() + ReadInfoTreeActivity.ggfm1Mass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.ggfm1Mass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.ggfm1Mass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.ggfm1Mass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.ggfm1Mass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.ggfm1Mass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[9]);
        }else if(id == 10){
            surname.setText(surname.getText() + ReadInfoTreeActivity.ggmm1Mass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.ggmm1Mass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.ggmm1Mass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.ggmm1Mass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.ggmm1Mass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.ggmm1Mass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[10]);
        }else if(id == 11){
            surname.setText(surname.getText() + ReadInfoTreeActivity.ggfdMass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.ggfdMass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.ggfdMass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.ggfdMass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.ggfdMass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.ggfdMass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[11]);
        }else if(id == 12){
            surname.setText(surname.getText() + ReadInfoTreeActivity.ggmdMass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.ggmdMass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.ggmdMass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.ggmdMass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.ggmdMass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.ggmdMass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[12]);
        }else if(id == 13){
            surname.setText(surname.getText() + ReadInfoTreeActivity.ggfd1Mass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.ggfd1Mass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.ggfd1Mass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.ggfd1Mass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.ggfd1Mass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.ggfd1Mass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[13]);
        }else if(id == 14){
            surname.setText(surname.getText() + ReadInfoTreeActivity.ggmd1Mass[0]);
            name.setText(name.getText() + ReadInfoTreeActivity.ggmd1Mass[1]);
            patronymic.setText(patronymic.getText() + ReadInfoTreeActivity.ggmd1Mass[2]);
            date.setText(date.getText() + ReadInfoTreeActivity.ggmd1Mass[3]);
            city.setText(city.getText() + ReadInfoTreeActivity.ggmd1Mass[4]);
            biography.setText(biography.getText() + ReadInfoTreeActivity.ggmd1Mass[5]);
            image.setImageBitmap(ReadInfoTreeActivity.photo[14]);
        }
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}