package com.example.proyectopokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class pokedex_extensa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex_extensa);

        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final Bundle bundle = getIntent().getExtras();


        //Introducir la informacion en la pokedex extensa

        TextView nom = (TextView) findViewById(R.id.tvNombrePokemon);
        final String nombre = bundle.getString("nom");
        nom.setText(nombre);

        TextView numero = (TextView) findViewById(R.id.tvNumeroPokemon);
        final String numero1 = bundle.getString("numero");
        numero.setText(numero1);

        TextView descripcion = (TextView) findViewById(R.id.tvDescripcio);
        String descripcion1 = bundle.getString("descripcion");
        descripcion.setText(descripcion1);

        TextView tipo = (TextView) findViewById(R.id.tvTipo1);
        final String tipo1 = bundle.getString("tipo1");
        tipo.setBackgroundColor(Color.parseColor(colorTipo(tipo1)));
        tipo.setText(tipo1);

        TextView tipo2 = (TextView) findViewById(R.id.tvTipo2);
        String tipo21 = bundle.getString("tipo2");
        tipo2.setBackgroundColor(Color.parseColor(colorTipo(tipo21)));
        tipo2.setText(tipo21);

        TextView altura = (TextView) findViewById(R.id.tvAltura);
        double altura1 = bundle.getDouble("altura");
        altura.setText(String.valueOf(altura1));

        TextView peso = (TextView) findViewById(R.id.tvPeso);
        final double peso1 = bundle.getDouble("peso");
        peso.setText(String.valueOf(peso1));

        TextView habilidad = (TextView) findViewById(R.id.tvHabilidad);
        String habilidad1 = bundle.getString("habilidad");
        habilidad.setText(habilidad1);

        TextView habilidad_oculto = (TextView) findViewById(R.id.tvHabilidad_Oculta);
        String habilidad_oculto1 = bundle.getString("habilidad_oculta");
        habilidad_oculto.setText(habilidad_oculto1);

        TextView especie = (TextView) findViewById(R.id.tvEspecie);
        String especie1 = bundle.getString("especie");
        especie.setText(especie1);

        ImageView foto = (ImageView) findViewById(R.id.ivImagenPokemon);
        String src = bundle.getString("fotografia");
        foto.setImageResource(getResources().getIdentifier(src, "drawable", getOpPackageName()));

        ImageView link = (ImageView) findViewById(R.id.ivImagenPokemon);
        final String link1 = bundle.getString("link");


        // Boton para que els usuario vaya a la wiki
        Button btnWiki = findViewById(R.id.btnWiki);
        btnWiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pokedex_externa = new Intent(Intent.ACTION_VIEW, Uri.parse(bundle.getString("link")));
                startActivity(pokedex_externa);
            }
        });

        // Boton para compartir la informacion
        Button btnShare = findViewById(R.id.btnShare);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mensaje = ""
                        + "Este pokemon se llama " + nombre + "\n"
                        + "El numero de pokedex es " + numero1 + "\n"
                        + "Su tipo principal es " + tipo1 + "\n"
                        + "Su peso es " + peso1 + " Kg" + "\n" + "\n"
                        + "Para mas informacion consulte la Pokedex " + "\n" + "\n"
                        + link1;

                Intent correu = new Intent(Intent.ACTION_SEND);
                correu.setType("text/plain");
                correu.putExtra(Intent.EXTRA_TEXT, mensaje);


                startActivity(correu);
            }
        });

    }



    //Para mostrar el color de los tipos de pokemon
    public String colorTipo(String tipo) {
        String ColorTipo = null;
        switch (tipo) {
            case "Planta":
                ColorTipo="#1ABB0D";
                break;
            case "Veneno":
                ColorTipo="#A90DBB";
                break;
            case "Fuego":
                ColorTipo="#F05030";
                break;
            case "Agua":
                ColorTipo="#3899F8";
                break;
            case "Volador":
                ColorTipo="#98A8F0";
                break;
            case "Roca":
                ColorTipo="#B8A058";
                break;
            case "Tierra":
                ColorTipo="#DEC054";
                break;
            case "Hada":
                ColorTipo="#E79FE7";
                break;
            case "Bicho":
                ColorTipo="#A8B820";
                break;
            case "Siniestro":
                ColorTipo="#7A5848";
                break;
            case "Psiquico":
                ColorTipo="#F870A0";
                break;
            case "Acero":
                ColorTipo="#A8A8C0";
                break;
            case "Hielo":
                ColorTipo="#58C8E0";
                break;
            case "Lucha":
                ColorTipo="#A05038";
                break;
            case "Normal":
                ColorTipo="#A8A090";
                break;
            case "Fantasma":
                ColorTipo="#6060B0";
                break;
            case "Electrico":
                ColorTipo="#F8D030";
                break;
            case "Dragon":
                ColorTipo="#7860E0";
                break;
            default:
                ColorTipo="#00FFFFFF";
                break;
        }
        return ColorTipo;
    }
}
