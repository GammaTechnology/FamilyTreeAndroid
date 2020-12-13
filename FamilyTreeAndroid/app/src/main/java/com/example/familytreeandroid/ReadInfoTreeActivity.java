package com.example.familytreeandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.IOException;

public class ReadInfoTreeActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageButton imageButton;
    private EditText surname;
    private EditText name;
    private EditText patronymic;
    private EditText date;
    private EditText city;
    private EditText biography;
    static final int GALLERY_REQUEST = 1;
    Bitmap newImage;

    public int id = CreateTreeFragment.check;

    public static String[] iMass = new String[6];
    public static String[] dedMass = new String[6];
    public static String[] mumMass = new String[6];
    public static String[] gmdMass = new String[6];
    public static String[] gfdMass = new String[6];
    public static String[] gmmMass = new String[6];
    public static String[] gfmMass = new String[6];
    public static String[] ggmdMass = new String[6];
    public static String[] ggfdMass = new String[6];
    public static String[] ggmd1Mass = new String[6];
    public static String[] ggfd1Mass = new String[6];
    public static String[] ggmmMass = new String[6];
    public static String[] ggfmMass = new String[6];
    public static String[] ggmm1Mass = new String[6];
    public static String[] ggfm1Mass = new String[6];
    public static Bitmap[] photo = new Bitmap[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_info_tree);

        surname = findViewById(R.id.surname);
        name = findViewById(R.id.name);
        patronymic = findViewById(R.id.patronymic);
        date = findViewById(R.id.date);
        city = findViewById(R.id.city);
        biography = findViewById(R.id.biography);

        toolbar = findViewById(R.id.toolbar_read_info);
        toolbar.setTitle("Подробнее");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageButton = findViewById(R.id.image_button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, GALLERY_REQUEST);
            }
        });

        if(id == 0){
            surname.setText(iMass[0]);
            name.setText(iMass[1]);
            patronymic.setText(iMass[2]);
            date.setText(iMass[3]);
            city.setText(iMass[4]);
            biography.setText(iMass[5]);
            imageButton.setImageBitmap(photo[0]);
        }else if(id == 1){
            surname.setText(mumMass[0]);
            name.setText(mumMass[1]);
            patronymic.setText(mumMass[2]);
            date.setText(mumMass[3]);
            city.setText(mumMass[4]);
            biography.setText(mumMass[5]);
            imageButton.setImageBitmap(photo[1]);
        }else if(id == 2){
            surname.setText(dedMass[0]);
            name.setText(dedMass[1]);
            patronymic.setText(dedMass[2]);
            date.setText(dedMass[3]);
            city.setText(dedMass[4]);
            biography.setText(dedMass[5]);
            imageButton.setImageBitmap(photo[2]);
        }else if(id == 3){
            surname.setText(gmmMass[0]);
            name.setText(gmmMass[1]);
            patronymic.setText(gmmMass[2]);
            date.setText(gmmMass[3]);
            city.setText(gmmMass[4]);
            biography.setText(gmmMass[5]);
            imageButton.setImageBitmap(photo[3]);
        }else if(id == 4){
            surname.setText(gfmMass[0]);
            name.setText(gfmMass[1]);
            patronymic.setText(gfmMass[2]);
            date.setText(gfmMass[3]);
            city.setText(gfmMass[4]);
            biography.setText(gfmMass[5]);
            imageButton.setImageBitmap(photo[4]);
        }else if(id == 5){
            surname.setText(gmdMass[0]);
            name.setText(gmdMass[1]);
            patronymic.setText(gmdMass[2]);
            date.setText(gmdMass[3]);
            city.setText(gmdMass[4]);
            biography.setText(gmdMass[5]);
            imageButton.setImageBitmap(photo[5]);
        }else if(id == 6){
            surname.setText(gfdMass[0]);
            name.setText(gfdMass[1]);
            patronymic.setText(gfdMass[2]);
            date.setText(gfdMass[3]);
            city.setText(gfdMass[4]);
            biography.setText(gfdMass[5]);
            imageButton.setImageBitmap(photo[6]);
        }else if(id == 7){
            surname.setText(ggfmMass[0]);
            name.setText(ggfmMass[1]);
            patronymic.setText(ggfmMass[2]);
            date.setText(ggfmMass[3]);
            city.setText(ggfmMass[4]);
            biography.setText(ggfmMass[5]);
            imageButton.setImageBitmap(photo[7]);
        }else if(id == 8){
            surname.setText(ggmmMass[0]);
            name.setText(ggmmMass[1]);
            patronymic.setText(ggmmMass[2]);
            date.setText(ggmmMass[3]);
            city.setText(ggmmMass[4]);
            biography.setText(ggmmMass[5]);
            imageButton.setImageBitmap(photo[8]);
        }else if(id == 9){
            surname.setText(ggfm1Mass[0]);
            name.setText(ggfm1Mass[1]);
            patronymic.setText(ggfm1Mass[2]);
            date.setText(ggfm1Mass[3]);
            city.setText(ggfm1Mass[4]);
            biography.setText(ggfm1Mass[5]);
            imageButton.setImageBitmap(photo[9]);
        }else if(id == 10){
            surname.setText(ggmm1Mass[0]);
            name.setText(ggmm1Mass[1]);
            patronymic.setText(ggmm1Mass[2]);
            date.setText(ggmm1Mass[3]);
            city.setText(ggmm1Mass[4]);
            biography.setText(ggmm1Mass[5]);
            imageButton.setImageBitmap(photo[10]);
        }else if(id == 11){
            surname.setText(ggfdMass[0]);
            name.setText(ggfdMass[1]);
            patronymic.setText(ggfdMass[2]);
            date.setText(ggfdMass[3]);
            city.setText(ggfdMass[4]);
            biography.setText(ggfdMass[5]);
            imageButton.setImageBitmap(photo[11]);
        }else if(id == 12){
            surname.setText(ggmdMass[0]);
            name.setText(ggmdMass[1]);
            patronymic.setText(ggmdMass[2]);
            date.setText(ggmdMass[3]);
            city.setText(ggmdMass[4]);
            biography.setText(ggmdMass[5]);
            imageButton.setImageBitmap(photo[12]);
        }else if(id == 13){
            surname.setText(ggfd1Mass[0]);
            name.setText(ggfd1Mass[1]);
            patronymic.setText(ggfd1Mass[2]);
            date.setText(ggfd1Mass[3]);
            city.setText(ggfd1Mass[4]);
            biography.setText(ggfd1Mass[5]);
            imageButton.setImageBitmap(photo[13]);
        }else if(id == 14){
            surname.setText(ggmd1Mass[0]);
            name.setText(ggmd1Mass[1]);
            patronymic.setText(ggmd1Mass[2]);
            date.setText(ggmd1Mass[3]);
            city.setText(ggmd1Mass[4]);
            biography.setText(ggmd1Mass[5]);
            imageButton.setImageBitmap(photo[14]);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.create_tree) {
            if(id == 0){
                iMass[0] = surname.getText().toString();
                iMass[1] = name.getText().toString();
                iMass[2] = patronymic.getText().toString();
                iMass[3] = date.getText().toString();
                iMass[4] = city.getText().toString();
                iMass[5] = biography.getText().toString();
                photo[0] = newImage;
            }else if(id == 1){
                mumMass[0] = surname.getText().toString();
                mumMass[1] = name.getText().toString();
                mumMass[2] = patronymic.getText().toString();
                mumMass[3] = date.getText().toString();
                mumMass[4] = city.getText().toString();
                mumMass[5] = biography.getText().toString();
                photo[1] = newImage;
            }else if(id == 2){
                dedMass[0] = surname.getText().toString();
                dedMass[1] = name.getText().toString();
                dedMass[2] = patronymic.getText().toString();
                dedMass[3] = date.getText().toString();
                dedMass[4] = city.getText().toString();
                dedMass[5] = biography.getText().toString();
                photo[2] = newImage;
            }else if(id == 3){
                gmmMass[0] = surname.getText().toString();
                gmmMass[1] = name.getText().toString();
                gmmMass[2] = patronymic.getText().toString();
                gmmMass[3] = date.getText().toString();
                gmmMass[4] = city.getText().toString();
                gmmMass[5] = biography.getText().toString();
                photo[3] = newImage;
            }else if(id == 4){
                gfmMass[0] = surname.getText().toString();
                gfmMass[1] = name.getText().toString();
                gfmMass[2] = patronymic.getText().toString();
                gfmMass[3] = date.getText().toString();
                gfmMass[4] = city.getText().toString();
                gfmMass[5] = biography.getText().toString();
                photo[4] = newImage;
            }else if(id == 5){
                gmdMass[0] = surname.getText().toString();
                gmdMass[1] = name.getText().toString();
                gmdMass[2] = patronymic.getText().toString();
                gmdMass[3] = date.getText().toString();
                gmdMass[4] = city.getText().toString();
                gmdMass[5] = biography.getText().toString();
                photo[5] = newImage;
            }else if(id == 6){
                gfdMass[0] = surname.getText().toString();
                gfdMass[1] = name.getText().toString();
                gfdMass[2] = patronymic.getText().toString();
                gfdMass[3] = date.getText().toString();
                gfdMass[4] = city.getText().toString();
                gfdMass[5] = biography.getText().toString();
                photo[6] = newImage;
            }else if(id == 7){
                ggfmMass[0] = surname.getText().toString();
                ggfmMass[1] = name.getText().toString();
                ggfmMass[2] = patronymic.getText().toString();
                ggfmMass[3] = date.getText().toString();
                ggfmMass[4] = city.getText().toString();
                ggfmMass[5] = biography.getText().toString();
                photo[7] = newImage;
            }else if(id == 8){
                ggmmMass[0] = surname.getText().toString();
                ggmmMass[1] = name.getText().toString();
                ggmmMass[2] = patronymic.getText().toString();
                ggmmMass[3] = date.getText().toString();
                ggmmMass[4] = city.getText().toString();
                ggmmMass[5] = biography.getText().toString();
                photo[8] = newImage;
            }else if(id == 9){
                ggfm1Mass[0] = surname.getText().toString();
                ggfm1Mass[1] = name.getText().toString();
                ggfm1Mass[2] = patronymic.getText().toString();
                ggfm1Mass[3] = date.getText().toString();
                ggfm1Mass[4] = city.getText().toString();
                ggfm1Mass[5] = biography.getText().toString();
                photo[9] = newImage;
            }else if(id == 10){
                ggmm1Mass[0] = surname.getText().toString();
                ggmm1Mass[1] = name.getText().toString();
                ggmm1Mass[2] = patronymic.getText().toString();
                ggmm1Mass[3] = date.getText().toString();
                ggmm1Mass[4] = city.getText().toString();
                ggmm1Mass[5] = biography.getText().toString();
                photo[10] = newImage;
            }else if(id == 11){
                ggfdMass[0] = surname.getText().toString();
                ggfdMass[1] = name.getText().toString();
                ggfdMass[2] = patronymic.getText().toString();
                ggfdMass[3] = date.getText().toString();
                ggfdMass[4] = city.getText().toString();
                ggfdMass[5] = biography.getText().toString();
                photo[11] = newImage;
            }else if(id == 12){
                ggmdMass[0] = surname.getText().toString();
                ggmdMass[1] = name.getText().toString();
                ggmdMass[2] = patronymic.getText().toString();
                ggmdMass[3] = date.getText().toString();
                ggmdMass[4] = city.getText().toString();
                ggmdMass[5] = biography.getText().toString();
                photo[12] = newImage;
            }else if(id == 13){
                ggfd1Mass[0] = surname.getText().toString();
                ggfd1Mass[1] = name.getText().toString();
                ggfd1Mass[2] = patronymic.getText().toString();
                ggfd1Mass[3] = date.getText().toString();
                ggfd1Mass[4] = city.getText().toString();
                ggfd1Mass[5] = biography.getText().toString();
                photo[13] = newImage;
            }else if(id == 14){
                ggmd1Mass[0] = surname.getText().toString();
                ggmd1Mass[1] = name.getText().toString();
                ggmd1Mass[2] = patronymic.getText().toString();
                ggmd1Mass[3] = date.getText().toString();
                ggmd1Mass[4] = city.getText().toString();
                ggmd1Mass[5] = biography.getText().toString();
                photo[14] = newImage;
            }
            onSupportNavigateUp();
            Toast.makeText(this, "Сохранено", Toast.LENGTH_SHORT).show();
        }else {
            onSupportNavigateUp();
        }

        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);

        Bitmap bitmap = null;

        switch(requestCode) {
            case GALLERY_REQUEST:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = imageReturnedIntent.getData();
                    try {
                        bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), selectedImage);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    newImage = Bitmap.createScaledBitmap(bitmap, 400,
                            300, false);
                    imageButton.setBackgroundColor(Color.parseColor("#E1E1E1"));
                    bitmap.getHeight();
                    imageButton.setImageBitmap(newImage);
                }
        }
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.toolbar_read_info_tree_meu, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}