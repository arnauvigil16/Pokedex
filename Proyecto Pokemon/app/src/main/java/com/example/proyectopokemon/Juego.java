package com.example.proyectopokemon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;



public class Juego extends AppCompatActivity  {

    private int pos;
    private int puntuacio_real;
    private TextView nom;
    private TextView puntuacio;
    private TextView puntuacionMax;
    private TextView tvEnunciado;
    private Button btnComprovar;
    private cPokemon pokemon_prova;
    private ArrayList<cPokemon> pokemons_juego;
    private Random myRandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        // deshabilita el titol
        getSupportActionBar().hide();

        // deshabilita la barra de notificacions
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final Intent intentJuego = new Intent(this, Pokedex.class);


        pokemons_juego = Pokedex.lista_pokemons;

        Collections.shuffle(pokemons_juego);

        puntuacionMax =  findViewById(R.id.tvPuntosMax);
        puntuacionMax.setText(String.valueOf(Pokedex.puntuacion_maxima));
        puntuacio = findViewById(R.id.tvPuntos);


        nom = (EditText) findViewById(R.id.edNombre);

        random(pokemons_juego);


        btnComprovar = findViewById(R.id.btnComprovar);
        btnComprovar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String resposta = nom.getText().toString().toLowerCase();
                String nom_pokemon = pokemon_prova.getNombre().toLowerCase();

                //Si la respuesta del jugador esta vacia
                if (resposta.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Porfavor introduzca un nombre para poder jugar", Toast.LENGTH_LONG).show();
                }

                // Si el jugador acierta
                else if(resposta.equals(nom_pokemon)){

                    puntuacio_real++;
                    puntuacio.setText(String.valueOf(puntuacio_real));

                    if (puntuacio_real > Pokedex.puntuacion_maxima) {
                        Pokedex.puntuacion_maxima = puntuacio_real;
                        puntuacionMax.setText(String.valueOf(Pokedex.puntuacion_maxima));
                    }

                    if (puntuacio_real == pokemons_juego.size()){

                        Toast.makeText(getApplicationContext(), "HAS GANADO", Toast.LENGTH_SHORT).show();
                        Intent intentJuego = new Intent(Juego.this, Pokedex.class);
                        startActivity(intentJuego);
                    }

                    random(pokemons_juego);

                    nom.setText("");
                }

                // Si el jugador falla
                else {

                    Intent intentJuego = new Intent(Juego.this, Pokedex.class);
                    Toast.makeText(getApplicationContext(), "Has fallado! Ese pokemon era " + pokemon_prova.getNombre(), Toast.LENGTH_LONG).show();
                    startActivity(intentJuego);
                }
            }
        });
    }

    //Controlar el tirar hacia atras
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "No puedes ir hacia atras", Toast.LENGTH_SHORT).show();

    }


    // Hacer random los pokemons que aparecen
   public void random(ArrayList<cPokemon> pokemons){

        ImageView foto = findViewById(R.id.imFoto_Pokemon);

        Collections.shuffle(pokemons);
        pos++;

        pokemon_prova = pokemons.get(pos);
        foto.setImageResource(getResources().getIdentifier(pokemon_prova.getFotografia(), "drawable", getOpPackageName()));
    }
}
