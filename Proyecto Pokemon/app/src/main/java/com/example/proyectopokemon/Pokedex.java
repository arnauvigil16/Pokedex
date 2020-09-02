package com.example.proyectopokemon;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;
import java.util.ArrayList;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Pokedex extends AppCompatActivity {

  //  public static ArrayList<cPokemon> lista_juego = new ArrayList<cPokemon>();
    public static ArrayList<cPokemon> lista_pokemons = new ArrayList<cPokemon>();
    public static int puntuacion_maxima = 0;



    private ArrayAdapter<cPokemon> adaptador;
    private ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex);

        lst = findViewById(R.id.listBasic);

        // Toda la informacion sobre los pokemons
        lista_pokemons.clear();
        lista_pokemons.add( new cPokemon( 0,"Victini", "#00", "Cuando Victini comparte su energía ilimitada, esa persona o Pokémon irradia abundante poder.", "Psiquico", "Fuego", 0.4 ,4 ,"Tinovictoria", "------------" ,"Victoria","https://www.pokemon.com/es/pokedex/Victini", "@drawable/victini" ) );
        lista_pokemons.add( new cPokemon(1,"Snivy", "#01", "Cuando recibe los rayos de sol, se mueve mucho más rápido que de costumbre. Usa mejor sus lianas que sus manos.", "Planta", "", 0.6 , 8.1, "Espesura", "Respondón", "Serpiente hierba", "https://pokemon.fandom.com/es/wiki/Snivy", "@drawable/snivy"));
        lista_pokemons.add( new cPokemon(2,"Servine", "#02","Cuando su cuerpo está sucio, no puede realizar la fotosíntesis con sus hojas, así que cuida mucho su higiene personal.","Planta","",0.8,16,"Espesura","Respondón","Serpiente hierba","https://pokemon.fandom.com/es/wiki/Servine","@drawable/servine"));
        lista_pokemons.add( new cPokemon(3,"Serperior", "#03","Tan solo muestra su verdadero poder a quienes no se amedrentan ante su noble pero inquisitoria mirada.","Planta","",3.3,63,"Espesura","Respondón","Realeza","https://pokemon.fandom.com/es/wiki/Serperior","@drawable/serperior"));
        lista_pokemons.add( new cPokemon(4,"Tepig", "#04","Le encanta comer bayas tostadas, pero a veces se emociona demasiado y termina churruscándolas.","Fuego","",0.5,9.9,"Mar llamas","Sebo","Cerdo fuego","https://pokemon.fandom.com/es/wiki/Tepig","@drawable/tepig"));
        lista_pokemons.add( new cPokemon(5,"Pignite", "#05","Cuanto más come, más combustible tiene en su interior para avivar sus llamas, con lo que también aumenta su poder.","Fuego","Lucha",1,55.5,"Mar llamas","Sebo","Cerdo fuego","https://pokemon.fandom.com/es/wiki/Pignite","@drawable/pignite"));
        lista_pokemons.add( new cPokemon(6,"Emboar", "#06","El hecho de que su barba prenda en llamas es indicio de que tiene ganas de luchar. Domina numerosos movimientos.","Fuego","Lucha",1.6,150,"Mar llamas","Audaz","Cerdo ígneo","https://pokemon.fandom.com/es/wiki/Emboar","@drawable/emboar"));
        lista_pokemons.add( new cPokemon(7,"Oshawott", "#07","La vieira de su ombligo no solo sirve como arma, sino también como instrumento para cortar las bayas que estén duras.","Agua","",0.5,5.9,"Torrente","Caparazon","Nutria","https://pokemon.fandom.com/es/wiki/Oshawott","@drawable/oshawott"));
        lista_pokemons.add( new cPokemon(8,"Dewott","#08","Tras un exhaustivo entrenamiento, Dewott puede dominar diversas técnicas para usar con sus vieiras.","Agua","",0.8,24.5,"Torrente","Caparazon","Superacion","https://pokemon.fandom.com/es/wiki/Dewott","@drawable/dewott"));
        lista_pokemons.add( new cPokemon(9,"Samurott","#09","En un abrir y cerrar de ojos, puede desenvainar y envainar los sables que hay en sus patas delanteras.","Agua","",1.5,94.6,"Torrente","Caparazon","Majestuoso","https://pokemon.fandom.com/es/wiki/Samurott","@drawable/samurott"));
        lista_pokemons.add( new cPokemon(10,"Patrat","#10","Aunque es un Pokémon muy precavido y siempre hay uno montando guardia, si se acercan por detrás, no se dará cuenta.","Normal","",0.5,11.6,"Vista lince","Cálculo final","Explorador","https://pokemon.fandom.com/es/wiki/Patrat","@drawable/patrat"));
        lista_pokemons.add( new cPokemon(11,"Watchog","#11","Los componentes luminiscentes de su interior hacen que sus ojos y su cuerpo brillen, y así intimida a sus rivales.","Normal","",1.1,27  ,"Iluminación","Cálculo final","Alerta","https://pokemon.fandom.com/es/wiki/Watchog","@drawable/watchog"));
        lista_pokemons.add( new cPokemon(12,"Lillipup","#12","Aunque se trata de un Pokémon valeroso, también es lo bastante inteligente como para escapar si el rival es muy fuerte.","Normal","",0.4,4.1,"Espíritu vital","Fuga","Perrito","https://pokemon.fandom.com/es/wiki/Lillipup","@drawable/lillipup"));
        lista_pokemons.add( new cPokemon(13,"Herdier","#13","Este Pokémon es muy leal. No solo ayuda a Entrenadores, sino que también se preocupa por otros Pokémon.","Normal","",0.9,14.7,"Intimidación","Intrépido","Leal","https://pokemon.fandom.com/es/wiki/Herdier","@drawable/herdier"));
        lista_pokemons.add( new cPokemon(14,"Stoutland","#14","Un humano podría pasar una noche gélida en las montañas sin pasar frío si se tapara con algo de su largo y tupido pelaje.","Normal","",1.2,61,"Intimidación","Intrépido","Magnánimo","https://pokemon.fandom.com/es/wiki/Stoutland","@drawable/stoutland"));
        lista_pokemons.add( new cPokemon(15,"Purrolin","#15","Su aspecto tierno es una farsa. Lo aprovechan para robar a los humanos y contemplar qué cara ponen.","Siniestro","",0.4,10.1,"Flexibilidad","Bromista","Malicioso","https://pokemon.fandom.com/es/wiki/Purrloin","@drawable/purrloin"));
        lista_pokemons.add( new cPokemon(16,"Liepard","#16","Su bella y grácil silueta le viene dada por su desarrollada musculatura, que le permite andar de noche sin hacer ruido.","Siniestro","",1.1,37.5,"Liviano","Bromista","Calculador","https://pokemon.fandom.com/es/wiki/Liepard","@drawable/liepard"));
        lista_pokemons.add( new cPokemon(17,"Pansage","#17","Es todo un experto en la búsqueda de bayas y es tan gentil que las comparte con todos sus compañeros.","Planta","",0.6,10.5,"Gula","Espesura","Mono Hierba","https://pokemon.fandom.com/es/wiki/Pansage","@drawable/pansage"));
        lista_pokemons.add( new cPokemon(18,"Simisage","#18","Agita su cola revestida de espinas para atacar a su enemigo. La hoja que crece sobre su cabeza es muy amarga.","Planta","",1.1,30.5,"Gula","Espesura","Mono pincho","https://pokemon.fandom.com/es/wiki/Simisage","@drawable/simisage"));
        lista_pokemons.add( new cPokemon(19,"Pansear","#19","Pokémon muy inteligente que tiene la costumbre de tostar las bayas antes de comérselas. Ayuda mucho a los humanos.","Fuego","",0.6,11,"Gula","Mar llamas","Ardiente","https://pokemon.fandom.com/es/wiki/Pansear","@drawable/pansear"));
        lista_pokemons.add( new cPokemon(20,"Simisear","#20","Cuando se emociona, echa chispas por la cola y por la cabeza, y calienta su cuerpo. Por alguna razón le encantan los dulces.","Fuego","",1,28,"Gula","Mar llamas","","https://pokemon.fandom.com/es/wiki/Simisear","@drawable/simisear"));
        lista_pokemons.add( new cPokemon(21,"Panpour","#21","El agua acumulada en su mata de pelo es rica en nutrientes. Usa la cola para regar plantas con esa misma agua.","Agua","",0.6,13.5,"Gula","Torrente","Salpicadura","https://pokemon.fandom.com/es/wiki/Panpour","@drawable/panpour"));
        lista_pokemons.add( new cPokemon(22,"Simipour","#22","Le encantan los lugares con agua limpia. Cuando desciende el nivel de agua de su pelo, se abastece a través de su cola.","Agua","",1,29,"Gula","Torrente","Drenaje","https://pokemon.fandom.com/es/wiki/Simipour","@drawable/simipour"));
        lista_pokemons.add( new cPokemon(23,"Munna","#23","Cuando un humano o un Pokémon sufre una pesadilla, Munna se aparece ante ellos y la engulle.","Psiquico","",0.6,23.3,"Alerta","Telepatia","Comesueeños","https://pokemon.fandom.com/es/wiki/Munna","@drawable/munna"));
        lista_pokemons.add( new cPokemon(24,"Musharna","#24","El color del humo que despide de su abultada frente varía según el contenido de los sueños que haya engullido.","Psiquico","",1.1,60.5,"Alerta","Telepatia","Duermevela","https://pokemon.fandom.com/es/wiki/Musharna","@drawable/musharna"));
        lista_pokemons.add( new cPokemon(25,"Pidove","#25","Es un Pokémon muy despistado. Aunque reciba órdenes de su Entrenador, se le olvidan, y se queda esperando.","Normal","Volador",0.3,2.1,"Sacapecho","Rivalidad","Pichon","https://pokemon.fandom.com/es/wiki/Pidove","@drawable/pidove"));
        lista_pokemons.add( new cPokemon(26,"Tranquill","#26","Puede regresar sin problema alguno a su nido desde cualquier lugar del globo y jamás se separa de quien lo entrena.","Normal","Volador",0.6,15,"Sacapecho","Rivalidad","Torcaz","https://pokemon.fandom.com/es/wiki/Tranquill","@drawable/tranquill"));
        lista_pokemons.add( new cPokemon(27,"Unfezant","#27","Los machos agitan el plumaje para intimidar, mientras que las hembras vuelan mejor.","Normal","Volador",1.2,29,"Sacapecho","Rivalidad","Altanero","https://pokemon.fandom.com/es/wiki/Unfezant","@drawable/unfezant"));
        lista_pokemons.add( new cPokemon(28,"Blitzle","#28","Su crin brilla cuando emite una descargar eléctrica. Se comunica con los suyos mediante el ritmo y número de brillos.","Electrico","",0.8,29.8,"Pararrayos","Herbívoro","Electrizado","https://pokemon.fandom.com/es/wiki/Blitzle","@drawable/blitzle"));
        lista_pokemons.add( new cPokemon(29,"Zebstrika","#29","Es un Pokémon con mucho temperamento. Cuando se enoja, lanza rayos desde su crin en todas direcciones.","Electrico","",1.6,79.5,"Parrarayos","Herbívoro","Rayo","https://pokemon.fandom.com/es/wiki/Zebstrika","@drawable/blitzle"));
        lista_pokemons.add( new cPokemon(30,"Roggenrola","#30","El agujero hexagonal es su oído, y tiene el hábito de caminar en la dirección de donde provienen los sonidos.","Roca","",0.4,18,"Robustez","Poder Arena","Manto","https://pokemon.fandom.com/es/wiki/Roggenrola","@drawable/roggenrola"));
        lista_pokemons.add( new cPokemon(31,"Boldore","#31","Si se encuentra bien, deja entrever su núcleo. Puede cambiar rápidamente la dirección en la que mira sin girarse.","Roca","",0.9,102,"Robustez","Poder arena","Mineral","https://pokemon.fandom.com/es/wiki/Boldore","@drawable/boldore"));
        lista_pokemons.add( new cPokemon(32,"Gigalith","#32","Absorbe los rayos solares, procesa esa energía en su núcleo y lanza poderosas bolas de luz a sus enemigos.","Roca","",1.7,260,"Robustez","Poder arena","Presurizado","https://pokemon.fandom.com/es/wiki/Gigalith","@drawable/gigalith"));
        lista_pokemons.add( new cPokemon(33,"Woobat","#33","Se dice que da buena suerte que un Woobat te deje una marca con forma de corazón.","Psiquico","Volador",0.4,2.1,"Ignorante","Simple","Murciélago","https://pokemon.fandom.com/es/wiki/Woobat","@drawable/woobat"));
        lista_pokemons.add( new cPokemon(34,"Swoobat","#34","Cuando emite ondas ultrasónicas, que incluso pueden reventar el cemento, agita su cola con vehemencia.","Psiquico","Volador",0.9,10.5,"Ignorante","Simple","Galante","https://pokemon.fandom.com/es/wiki/Swoobat","@drawable/swoobat"));
        lista_pokemons.add( new cPokemon(35,"Drilbur","#35","Puede girar su cuerpo a una velocidad de 50 km/h y, si la mantiene, puede perforar el suelo y atravesarlo.","Tierra","",0.3,8.5,"Ímpetu arena","Rompemoldes","Topo","https://pokemon.fandom.com/es/wiki/Drilbur","@drawable/drilbur"));
        lista_pokemons.add( new cPokemon(36,"Excadrill","#36","Coloca sus garras y su cabeza de manera que se convierten en un taladro. Puede incluso taladrar una plancha de acero.","Tierra","Acero",0.7,40.4,"Ímpetu arena","Rompemoldes","Subterráneo","https://pokemon.fandom.com/es/wiki/Excadrill","@drawable/excadrill"));
        lista_pokemons.add( new cPokemon(37,"Audino","#37","Con las antenas de sus oídos, perciben el estado de un rival o predicen cuándo va a eclosionar un Huevo Pokémon.","Normal","",1.1,31,"Alma cura","Zoquete","Escucha","https://pokemon.fandom.com/es/wiki/Audino","@drawable/audino"));
        lista_pokemons.add( new cPokemon(38,"Timburr","#38","Siempre lleva una viga de madera y ayuda en las construcciones. Se busca una viga más grande cuando se hace más fuerte.","Lucha","",0.6,12.5,"Agallas","Puño ferreo","Musculoso","https://pokemon.fandom.com/es/wiki/Timburr","@drawable/timburr"));
        lista_pokemons.add( new cPokemon(39,"Gurdurr","#39","Gracias a su entrenada musculatura, puede blandir vigas de acero sin problema para así derribar edificios enteros.","Lucha","",1.2,40,"Agallas","Puño ferreo","Musculoso","https://pokemon.fandom.com/es/wiki/Gurdurr","@drawable/gurdurr"));
        lista_pokemons.add( new cPokemon(40,"Conkeldurr","#40","En vez de hacer uso de la fuerza bruta, blande columnas de hormigón con la energía centrífuga de sus movimientos.","Lucha","",1.4,87,"Agallas","Puño ferreo","Musculoso","https://pokemon.fandom.com/es/wiki/Conkeldurr","@drawable/conkeldurr"));
        lista_pokemons.add( new cPokemon(41,"Tympole","#41","Emite sonidos imperceptibles para los humanos con la vibración de sus mejillas y advierte de algún peligro a los suyos.","Agua","",0.5,4.5,"Nado rápido","Absorbe agua","Renacuajo","https://pokemon.fandom.com/es/wiki/Tympole","@drawable/tympole"));
        lista_pokemons.add( new cPokemon(42,"Palpitoad","#42","Vive tanto en tierra como en el fondo del mar. Con su larga y viscosa lengua, inmoviliza a sus contrincantes.","Agua","Tierra",0.8,17,"Nado rapido","Absorbe agua","Vibrante","https://pokemon.fandom.com/es/wiki/Palpitoad","@drawable/palpitoad"));
        lista_pokemons.add( new cPokemon(43,"Seismitoad","#43","Reúne energía en sus bultos y crea vibraciones para propinar puñetazos más poderosos.","Agua","Tierra",1.5,62,"Nado rapido","Absorbe agua","Vibrante","https://pokemon.fandom.com/es/wiki/Seismitoad","@drawable/seismitoad"));
        lista_pokemons.add( new cPokemon(44,"Throh","#44","Si se topa con un rival más fuerte, ansía lanzarlo por los aires. Al hacerse más fuerte, cambia su cinturón.","Lucha","",1.3,55.5,"Foco interno","Rompemoldes","Judo","https://pokemon.fandom.com/es/wiki/Throh","@drawable/throh"));
        lista_pokemons.add( new cPokemon(45,"Sawk","#45","Para lograr dominar las técnicas de kárate más letales, se retiran a las montañas y entrenan día y noche.","Lucha","",1.4,51,"Foco interno","Rompemoldes","Karate","https://pokemon.fandom.com/es/wiki/Sawk","@drawable/sawk"));
        lista_pokemons.add( new cPokemon(46,"Sewaddle","#46","Sus hojas se usan como material para fabricar ropa, por lo que los diseñadores más famosos los tienen como mascotas.","Bicho","Planta",0.3,2.5,"Enjambre","Funda","Sastre","https://pokemon.fandom.com/es/wiki/Sewaddle","@drawable/sewaddle"));
        lista_pokemons.add( new cPokemon(47,"Swadloon","#47","Le gustan los lugares lóbregos y húmedos. Se pasa todo el día comiendo hojas esparcidas por el suelo.","Bicho","Planta",0.5,7.3,"Defensa hoja","Funda","Arropado","https://pokemon.fandom.com/es/wiki/Swadloon","@drawable/swadloon"));
        lista_pokemons.add( new cPokemon(48,"Leavanny","#48","Si se encuentra con un Pokémon joven, segrega por la boca hilos pegadizos con los que teje una prenda de ropa.","Bicho","Planta",1.2,20.5,"Enjambre","Funda","Cuidador","https://pokemon.fandom.com/es/wiki/Leavanny","@drawable/leavanny"));
        lista_pokemons.add( new cPokemon(49,"Venipede","#49","Percibe cambios en el aire mediante las antenas de su cola y de su cabeza, y así descubre la ubicación y estado del rival.","Bicho","Veneno",0.4,5.3,"Enjambre","Pies rapidos","Ciempiés","https://pokemon.fandom.com/es/wiki/Venipede","@drawable/venipede"));
        lista_pokemons.add( new cPokemon(50,"Whirlipede","#50","Permanece quieto y acumula energía para su evolución, pero, si un rival se acerca, se mueve y ataca con púas venenosas.","Bicho","Veneno",1.2,58.5,"Enjambre","Pies rapidos","Pupaciempiés","https://pokemon.fandom.com/es/wiki/Whirlipede","@drawable/whirlipede"));
        lista_pokemons.add( new cPokemon(51,"Scolipede","#51","Atenaza a sus presas con las garras que sobresalen de su cuello hasta que no se pueden mover y las remata con veneno.","Bicho","Veneno",2.5,200.5,"Enjambre","Pies rapidos","Megaciempiés","https://pokemon.fandom.com/es/wiki/Scolipede","@drawable/scolipede"));
        lista_pokemons.add( new cPokemon(52,"Cottonee","#52","Quizá por el hecho de que se relajan al estar con los suyos, forman un grupo al encontrar amigos y parecen nubes.","Planta","Hada",0.3,0.6 ,"Bromista","Clorofila","Bolalgodón","https://pokemon.fandom.com/es/wiki/Cottonee","@drawable/cottonee"));
        lista_pokemons.add( new cPokemon(53,"Whimsicott","#53","Aparecen en medio de un torbellino y entran en las casas para descolocar los muebles o esparcir algodón por doquier.","Planta","Hada",0,6.6,"Allanamiento","Clorofila","Vuelalviento","https://pokemon.fandom.com/es/wiki/Whimsicott","@drawable/whimsicott"));
        lista_pokemons.add( new cPokemon(54,"Petilil","#54","Las hojas de su cabeza vuelven a crecer rápidamente aunque se caigan. A pesar de ser amargas, restablecen la vitalidad.","Planta","",0.5,6.6,"Clorofila","Defensa hoja","Bulbo","https://pokemon.fandom.com/es/wiki/Petilil","@drawable/petilil"));
        lista_pokemons.add( new cPokemon(55,"Lilligant","#55","El aroma que despide la flor de su tocado tiene efectos tranquilizantes, pero este Pokémon requiere muchos cuidados.","Planta","",1.1,16.3,"Clorofila","Defensa hoja","Adornofloral","https://pokemon.fandom.com/es/wiki/Lilligant","@drawable/lilligant"));
        lista_pokemons.add( new cPokemon(56,"Basculin","#56","Los de color azul y los de color rojo siempre se pelean. Son muy violentos, pero su sabor es excepcional.","Agua","",1,18,"Adaptable","Rompemoldes","Violento","https://pokemon.fandom.com/es/wiki/Basculin","@drawable/basculin"));
        lista_pokemons.add( new cPokemon(57,"Sandile","#57","Viven en los desiertos y se sumergen en las cálidas arenas para que su temperatura corporal no se reduzca.","Tierra","Siniestro",0.7,15.2,"Intimidación","Irascible","Desierdrilo","https://pokemon.fandom.com/es/wiki/Sandile","@drawable/sandile"));
        lista_pokemons.add( new cPokemon(58,"Krokorok","#58","Gracias a la película que recubre sus ojos, pueden ver incluso de noche. Viven en pequeñas manadas.","Tierra","Siniestro",1,33.4,"Intimidacion","Irascible","Desierdrilo","https://pokemon.fandom.com/es/wiki/Krokorok","@drawable/krokorok"));
        lista_pokemons.add( new cPokemon(59,"Krookodile","#59","Un Pokémon bastante violento. Ataca todo lo que se mueva delante de él con sus mortíferas mandíbulas.","Tierra","Siniestro",1.5,96.3,"Intimidacion","Irascible","Amenazador","https://pokemon.fandom.com/es/wiki/Krookodile","@drawable/krookodile"));
        lista_pokemons.add( new cPokemon(60,"Darumaka","#60","Cuando se dispone a dormir, retrae sus piernas y sus brazos, y reduce la llama de su interior a 600 grados para relajarse.","Fuego","",0.6,37.5,"Entusiasmo","Foco interno","Daruma","https://pokemon.fandom.com/es/wiki/Darumaka","@drawable/darumaka"));
        lista_pokemons.add( new cPokemon(61,"Darmanitan","#61","Cuando resulta gravemente herido, se endurece como una piedra y medita para agudizar la mente.","Fuego","",1.3,92.9,"Potencia bruta","Modo daruma","Candente","https://pokemon.fandom.com/es/wiki/Darmanitan","@drawable/darmanitan"));
        lista_pokemons.add( new cPokemon(62,"Maractus","#62","Mueven su cuerpo de manera rítmica y emiten un sonido como el de las maracas. Los Pokémon que se sorprenden huyen.","Planta","",1,28,"Absorbe agua","Colector","Cactus","https://pokemon.fandom.com/es/wiki/Maractus","@drawable/maractus"));
        lista_pokemons.add( new cPokemon(63,"Dwebble","#63","Si encuentran una piedra del tamaño ideal, segregan un líquido por la boca para crear un agujero y deslizarse dentro.","Bicho","Roca",0.3,14.5,"Caparazón","Armadura frágil","Casapiedra","https://pokemon.fandom.com/es/wiki/Dwebble","@drawable/dwebble"));
        lista_pokemons.add( new cPokemon(64,"Crustle","#64","Si la roca que lleva sobre sus espaldas se quiebra en un combate territorial, se siente inseguro y se hace más débil.","Bicho","Roca",1.4,200,"Caparazón","Armadura frágil","Casarroca","https://pokemon.fandom.com/es/wiki/Crustle","@drawable/crustle"));
        lista_pokemons.add( new cPokemon(65,"Scraggy","#65","Está orgulloso de su sólido cráneo. Reparte cabezazos a diestro y siniestro con tal vehemencia que él mismo se marea.","Siniestro","Lucha",0.6,11.8,"Autoestima","Intimidación","Mudapiel","https://pokemon.fandom.com/es/wiki/Scraggy","@drawable/scraggy"));
        lista_pokemons.add( new cPokemon(66,"Scrafty","#66","Se protege de los ataques con la muda de su piel mientras reparte patadas. Cuando mayor es su cresta, más se le respeta.","Siniestro","Lucha",1.1,30,"Mudar","Intimidacion","Gamberro","https://pokemon.fandom.com/es/wiki/Scrafty","@drawable/scrafty"));
        lista_pokemons.add( new cPokemon(67,"Sigilyph","#67","Deidad protectora de una antigua ciudad. Siempre merodea por la misma ruta y permanece alerta en busca de intrusos.","Psiquico","Volador",1.4,14,"Piel milagro","Cromolente","Pseudopájaro","https://pokemon.fandom.com/es/wiki/Sigilyph","@drawable/sigilyph"));
        lista_pokemons.add( new cPokemon(68,"Yamask","#68","Almas de humanos sepultados en tumbas que han adquirido forma de Pokémon. Recuerdan su vida antes de la muerte.","Fantasma","",0.5,1.5,"Momia","------------","Espíritu","https://pokemon.fandom.com/es/wiki/Yamask","@drawable/yamask"));
        lista_pokemons.add( new cPokemon(69,"Cofagrigus","#69","Atrapa en su interior a los ladrones de tumbas que los confunden con ataúdes de verdad.","Fantasma","",1.7,76.5,"Momia","------------","Sepultura","https://pokemon.fandom.com/es/wiki/Cofagrigus","@drawable/cofagrigus"));
        lista_pokemons.add( new cPokemon(70,"Tirtouga","#70","Pokémon renacido a partir de un fósil. Es muy hábil nadando y puede sumergirse a una profundidad de 1000 m.","Agua","Roca",0.7,16.5,"Roca sólida","Nado rápido","Pretortuga","https://pokemon.fandom.com/es/wiki/Tirtouga","@drawable/tirtouga"));
        lista_pokemons.add( new cPokemon(71,"Carracosta","#71","Un golpe con sus desarrolladas aletas delanteras puede hacer perder a un rival el conocimiento o romperle los huesos.","Agua","Roca",0,81,"Roca sólida","Nado rápido","Pretortuga","https://pokemon.fandom.com/es/wiki/Carracosta","@drawable/carracosta"));
        lista_pokemons.add( new cPokemon(72,"Archen","#72","Ha renacido a partir de fósiles antiguos. Vive en la copa de los árboles y salta de una rama a otra porque no puede volar.","Roca","Volador",0.5,9.5,"Flaqueza","------------","Protopájaro","https://pokemon.fandom.com/es/wiki/Archen","@drawable/archen"));
        lista_pokemons.add( new cPokemon(73,"Archeops","#73","Corre a mayor velocidad de la que puede volar. Alcanza una velocidad de 40 km/h antes de alzarse en vuelo hacia el cielo.","Roca","Volador",1.4,32,"Flaqueza","------------","Protopájaro","https://pokemon.fandom.com/es/wiki/Archeops","@drawable/archeops"));
        lista_pokemons.add( new cPokemon(74,"Trubbish","#74","Para hacerse con más basura, sigue a gente que arroja desperdicios al suelo. Despide continuamente gases nocivos.","Veneno","",0.6,31,"Hedor","Resquicio","Bolsabasura","https://pokemon.fandom.com/es/wiki/Trubbish","@drawable/trubbish"));
        lista_pokemons.add( new cPokemon(75,"Garbodor","#75","Absorbe y procesa en su interior basura para generar nuevos gases nocivos y líquidos venenosos de alta virulencia.","Veneno","",1.9,0,"Hedor","Resquicio","Vertedero","https://pokemon.fandom.com/es/wiki/Garbodor","@drawable/garbodor"));
        lista_pokemons.add( new cPokemon(76,"Zorua","#76","Adopta la apariencia de su enemigo para engañarlo vilmente y aprovecha su estupor para poner tierra por medio.","Siniestro","",0.7,12.6,"Ilusión","------------","Zorropillo","https://pokemon.fandom.com/es/wiki/Zorua","@drawable/zorua"));
        lista_pokemons.add( new cPokemon(77,"Zoroark","#77","Se dice que Zoroark atrapa en un mundo de ilusiones a quien lo intenta atrapar y que, de esta manera, lo castiga.","Siniestro","",1.6,81.1,"Ilusión","------------","Disfrazorro","https://pokemon.fandom.com/es/wiki/Zoroark","@drawable/zoroark"));
        lista_pokemons.add( new cPokemon(78,"Minccino","#78","Se saludan entre sí frotándose la cola y limpiándosela a conciencia.","Normal","",0.4,5.8,"Gran encanto","Encadenado","Disfrazorro","https://pokemon.fandom.com/es/wiki/Minccino","@drawable/minccino"));
        lista_pokemons.add( new cPokemon(79,"Cinccino","#79","El cuerpo de Cinccino está recubierto por una grasa especial que hace que los golpes y ataques enemigos no acierten.","Normal","",0.5,7.5,"Gran encanto","Encadenado","Estola","https://pokemon.fandom.com/es/wiki/Cinccino","@drawable/cinccino"));
        lista_pokemons.add( new cPokemon(80,"Gothita","#80","Observa fijamente cualquier cosa, tanto que, en más de una ocasión, no se da cuenta de que un enemigo lo ataca.","Psiquico","",0.4,5.8,"Cacheo","Sombra trampa","Inquisitivo","https://pokemon.fandom.com/es/wiki/Gothita","@drawable/gothita"));
        lista_pokemons.add( new cPokemon(81,"Gothorita","#81","Según muchas leyendas, durante las noches estrelladas controlan a los niños que duermen, tan solo como diversión.","Psiquico","",0.7,18,"Cacheo","Sombra trampa","Manipulador","https://pokemon.fandom.com/es/wiki/Gothorita","@drawable/gothorita"));
        lista_pokemons.add( new cPokemon(82,"Gothitelle","#82","Predice el futuro a partir del movimiento de las estrellas. Al saber cuando morirá su Entrenador, emite alaridos de pena.","Psiquico","",1.5,44,"Cacheo","Sombra trampa","Astro","https://pokemon.fandom.com/es/wiki/Gothitelle","@drawable/gothitelle"));
        lista_pokemons.add( new cPokemon(83,"Solosis","#83","Gracias a la sustancia viscosa que envuelve su cuerpo, permanece tranquilo por dura o rigurosa que sea la situación.","Psiquico","",1,0.3,"Funda","Regeneración","Célula","https://pokemon.fandom.com/es/wiki/Solosis","@drawable/solosis"));
        lista_pokemons.add( new cPokemon(84,"Duosion","#84","Cuando las dos partes de su cerebro piensan lo mismo, saca todo su poder a relucir.","Psiquico","",0.6,8,"Funda","Regeneración","Mitosis","https://pokemon.fandom.com/es/wiki/Duosion","@drawable/duosion"));
        lista_pokemons.add( new cPokemon(85,"Reuniclus","#85","Hacen gala de su poder psíquico y mueven sus brazos compuestos de líquido para controlar rocas y hacerlas añicos.","Psiquico","",1,20.1,"Funda","Regeneración","Ampliación","https://pokemon.fandom.com/es/wiki/Reuniclus","@drawable/reuniclus"));
        lista_pokemons.add( new cPokemon(86,"Ducklett","#86","Nada a mayor velocidad de la que puede volar. Se sumerge en el agua para buscar musgo acuático, su comida favorita.","Agua","Volador",0.5,5.5,"Vista lince","Hidratación","Ave agua","https://pokemon.fandom.com/es/wiki/Ducklett","@drawable/ducklett"));
        lista_pokemons.add( new cPokemon(87,"Swanna","#87","Aunque no lo parezca por su grácil elegancia, puede batir con fuerza las alas y volar durante miles de kilómetros.","Agua","Volador",1.3,24.2,"Vista lince","Hidratación","Cisne","https://pokemon.fandom.com/es/wiki/Swanna","@drawable/swanna"));
        lista_pokemons.add( new cPokemon(88,"Vanillite","#88","Pokémon que ha nacido de un carámbano bañado por el sol de la mañana. Espira aliento a temperaturas de 50° bajo cero.","Hielo","",0.4,5.7,"Gélido","Armadura frágil","Nieve fresca","https://pokemon.fandom.com/es/wiki/Vanillite","@drawable/vanillite"));
        lista_pokemons.add( new cPokemon(89,"Vanillish","#89","Enfrían el aire a su alrededor y crean partículas de hielo mediante las cuales congelan a sus oponentes.","Hielo","",1.1,41,"Gélido","Armadura frágil","Nieve helada","https://pokemon.fandom.com/es/wiki/Vanillish","@drawable/vanillish"));
        lista_pokemons.add( new cPokemon(90,"Vanilluxe","#90","Absorben grandes cantidades de agua y la transforman en ventisca en su cuerpo, expulsándola cuando se enfadan.","Hielo","",1.3,57.5,"Gélido","Armadura frágil","Nieve gélida","https://pokemon.fandom.com/es/wiki/Vanilluxe","@drawable/vanilluxe"));
        lista_pokemons.add( new cPokemon(91,"Deerling","#91","El color de su cuerpo cambia no solo con las estaciones, sino también con los cambios de humedad y temperatura.","Normal","Planta",0.6,19.5, "Clorofila","Dicha","Estacional","https://pokemon.fandom.com/es/wiki/Deerling","@drawable/deerling"));
        lista_pokemons.add( new cPokemon(92,"Sawsbuck","#92","Migra con el cambio de estación, por lo que hay quien considera a Sawsbuck el heraldo de la primavera.","Normal","Planta",1.9,92.5,"Clorofila","Dicha","Estacional","https://pokemon.fandom.com/es/wiki/Sawsbuck","@drawable/sawsbuck"));
        lista_pokemons.add( new cPokemon(93,"Emolga","#93","Puede volar al extender sus membranas y electrocutar a sus enemigos mediante la electricidad acumulada en sus mejillas.","Electrico","Volador",0.4,5,"Electricidad estática","Electromotor","Vuelardilla","https://pokemon.fandom.com/es/wiki/Emolga","@drawable/emolga"));
        lista_pokemons.add( new cPokemon(94,"Karrablast","#94","Si recibe una descarga eléctrica durante un combate contra un Shelmet, puede evolucionar. Se desconoce el porqué.","Bicho","",0.5,5.9,"Enjambre","Indefenso","Bocado","https://pokemon.fandom.com/es/wiki/Karrablast","@drawable/karrablast"));
        lista_pokemons.add( new cPokemon(95,"Escavalier","#95","Se defiende de los ataques con el caparazón que roba a los Shelmet. Atacan con sus dos mortíferas lanzas.","Bicho","Acero",33,1,"Enjambre","Funda","Soldado","https://pokemon.fandom.com/es/wiki/Escavalier","@drawable/escavalier"));
        lista_pokemons.add( new cPokemon(96,"Foongus","#96","Atraen a otros Pokémon gracias a su similitud con una Poké Ball y los atacan expulsando esporas venenosas.","Planta","Veneno",0.2,1,"Efecto espora","Regeneración","Hongo","https://pokemon.fandom.com/es/wiki/Foongus","@drawable/foongus"));
        lista_pokemons.add( new cPokemon(97,"Amoonguss","#97","Lleva a cabo una danza con la especie de sombrillas de sus manos para atraer a presas. Le gustan los lugares húmedos.","Planta","Veneno",0.6,10.5,"Efecto espora","Regeneración","Hongo","https://pokemon.fandom.com/es/wiki/Amoonguss","@drawable/amoonguss"));
        lista_pokemons.add( new cPokemon(98,"Frillish","#98","Rodea a sus presas con sus tentáculos, las entumece y las arrastra a 8000 m de profundidad hasta que las ahoga.","Agua","Fantasma",1.2,33,"Absorbe agua","Humedad","Ingrávido","https://pokemon.fandom.com/es/wiki/Frillish","@drawable/frillish"));
        lista_pokemons.add( new cPokemon(99,"Jellicent","#99","Su cuerpo se compone de agua salada. Dicen que ha construido un palacio en el fondo del mar con restos de barcos.","Agua","Fantasma",2.2,135,"Absorbe agua","Humedad","Ingrávido","https://pokemon.fandom.com/es/wiki/Jellicent","@drawable/jellicent"));
        lista_pokemons.add( new cPokemon(100,"Alomomola","#100","Abraza gentilmente con sus aletas a Pokémon que están lastimados y cura sus heridas con su membrana especial.","Agua","",1.2,31.6,"Hidratación","Regeneración","Socorrista","https://pokemon.fandom.com/es/wiki/Alomomola","@drawable/alomomola"));
        lista_pokemons.add( new cPokemon(101,"Joltik","#101","No puede generar electricidad por sí mismo, así que se encarama a Pokémon grandes y absorbe su energía estática.","Bicho","Electrico",0.1,0.6,"Nerviosismo","Enjambre","Lapa","https://pokemon.fandom.com/es/wiki/Joltik","@drawable/joltik"));
        lista_pokemons.add( new cPokemon(102,"Galvantula","#102","Crea una barrera de hilos electrificados que aturde al enemigo, por lo que actúa como defensa y también como arma.","Bicho","Electrico",0.8,14.3,"Ojocompuesto","Enjambre","Electroaraña","https://pokemon.fandom.com/es/wiki/Galvantula","@drawable/galvantula"));
        lista_pokemons.add( new cPokemon(103,"Ferrosed","#103","Absorbe los componentes ferruginosos de las rocas al colgarse del techo de las cuevas. Dispara púas si se ve en peligro","Planta","Acero",18.8,0.6,"Punta acero","------------","Frutoespina","https://pokemon.fandom.com/es/wiki/Ferroseed","@drawable/ferroseed"));
        lista_pokemons.add( new cPokemon(104,"Ferrothorn","#104","Azota al enemigo con sus tres tentáculos y después dispara púas hasta que no deja ni rastro del rival.","Planta","Acero",1,110,"Punta acero","------------","Bolaespina","https://pokemon.fandom.com/es/wiki/Ferrothorn","@drawable/ferrothorn"));
        lista_pokemons.add( new cPokemon(105,"Klink","#105","La combinación fija de dos cuerpos le permite generar energía cuando se ponen a girar.","Acero","",0.3,21,"Mas","Cuerpo puro","Engranaje","https://pokemon.fandom.com/es/wiki/Klink","@drawable/klink"));
        lista_pokemons.add( new cPokemon(106,"Klang","#106","Se compone de una rueda dentada grande y otra pequeña. Lanza la pequeña para atacar, pero se debilita si no regresa.","Acero","",0.6,51,"Mas","Cuerpo puro","Engranaje","https://pokemon.fandom.com/es/wiki/Klang","@drawable/klang"));
        lista_pokemons.add( new cPokemon(107,"Klinklang","#107","Hace girar a gran velocidad la rueda dentada pequeña, le transmite energía acumulada en el núcleo rojo y la dispara.","Acero","",0.6,81,"Mas","Cuerpo puro","Engranaje","https://pokemon.fandom.com/es/wiki/Klinklang","@drawable/klinklang"));
        lista_pokemons.add( new cPokemon(108,"Tynamo","#108","Apenas puede generar energía por sí mismo, pero un banco de Tynamo puede crear violentas descargas eléctricas.","Electrico","",0.2,0.3,"Levitacion","------------","Electropez","https://pokemon.fandom.com/es/wiki/Tynamo","@drawable/tynamo"));
        lista_pokemons.add( new cPokemon(109,"Eelektrik","#109","Se enrolla alrededor de su presa, la paraliza con la electricidad de sus marcas circulares y le asesta mordiscos.","Electrico","",1.2,22,"Levitación","------------","Electropez","https://pokemon.fandom.com/es/wiki/Eelektrik","@drawable/eelektrik"));
        lista_pokemons.add( new cPokemon(110,"Eelektross","#110","Pega la ventosa de su boca en su presa y la electrocuta con una gran descarga clavándole los colmillos.","Electrico","",2.1,85.5,"Levitación","------------","Electropez","https://pokemon.fandom.com/es/wiki/Eelektross","@drawable/eelektross"));
        lista_pokemons.add( new cPokemon(111,"Elgyem","#111","Según cuentan los rumores, procede de un desierto donde hace 50 años se estrelló un ovni.","Psiquico","",0.5,9,"Telepatia","Cálculo final","Cerebro","https://pokemon.fandom.com/es/wiki/Elgyem","@drawable/elgyem"));
        lista_pokemons.add( new cPokemon(112,"Beheeyem","#112","Parece que se comunica haciendo brillar sus dedos tricolores, pero nadie ha conseguido descifrar aún su patrón.","Psiquico","",1,34.5,"Telepatia","Cálculo final","Cerebro","https://pokemon.fandom.com/es/wiki/Beheeyem","@drawable/beheeyem"));
        lista_pokemons.add( new cPokemon(113,"Litwick","#113","Su llama suele estar apagada, pero puede avivarla absorbiendo la energía vital tanto de humanos como de Pokémon.","Fantasma","Fuego",0.3,3.1,"Absorbe fuego","Sombra trampa","Vela","https://pokemon.fandom.com/es/wiki/Litwick","@drawable/litwick"));
        lista_pokemons.add( new cPokemon(114,"Lampent","#114","Al absorber almas, su llama se enciende. Espera a que la gente fallezca, así que suele deambular por los hospitales.","Fantasma","Fuego",0.6,13,"Absorbe fuego","Sombratrampa","Farolillo","https://pokemon.fandom.com/es/wiki/Lampent","@drawable/lampent"));
        lista_pokemons.add( new cPokemon(115,"Chandelure","#115","Las almas que han ardido bajo sus oscuras llamas vagan sin rumbo y eternamente por este mundo.","Fantasma","Fuego",1,34.3,"Absorbe fuego","Sombra trampa","Señuelo","https://pokemon.fandom.com/es/wiki/Chandelure","@drawable/chandelure"));
        lista_pokemons.add( new cPokemon(116,"Axew","#116","Sus grandes colmillos aún son frágiles y suelen partirse, pero los nuevos que le crecen son más duros y resistentes.","Dragon","",0.6,18,"Rivalidad","Nerviosismo","Colmillo","https://pokemon.fandom.com/es/wiki/Axew","@drawable/axew"));
        lista_pokemons.add( new cPokemon(117,"Fraxure","#117","Sus colmillos no vuelven a crecer, por lo que, al término de cada combate, los afila cuidadosamente con cantos de río.","Dragon","",1,36,"Rivalidad","Nerviosismo","Bocahacha","https://pokemon.fandom.com/es/wiki/Fraxure","@drawable/fraxure"));
        lista_pokemons.add( new cPokemon(118,"Haxorus","#118","Sus colmillos poseen una increíble fuerza destructiva, capaz de desgarrar incluso una dura y espesa columna de acero.","Dragon","",1.8,105.5,"Rivalidad","Nerviosismo","Bocahacha","https://pokemon.fandom.com/es/wiki/Haxorus","@drawable/haxorus"));
        lista_pokemons.add( new cPokemon(119,"Cubchoo","#119","Sus mocos son su barómetro de salud. Si es buena, serán densos, y la fuerza de sus movimientos de tipo Hielo aumentará.","Hielo","",0.5,8.5,"Manto níveo","Cobardía","Congelación","https://pokemon.fandom.com/es/wiki/Cubchoo","@drawable/cubchoo"));
        lista_pokemons.add( new cPokemon(120,"Beartic","#120","Adoran los mares gélidos del norte. Congelan su aliento para crear sendas por las que caminar sobre el agua.","Hielo","",2.6,260,"Manto níveo","Nado rápido","Glaciación","https://pokemon.fandom.com/es/wiki/Beartic","@drawable/beartic"));
        lista_pokemons.add( new cPokemon(121,"Cryogonal","#121","Usa cadenas de cristales de hielo para atrapar a sus presas y congelarlas a temperaturas de hasta -100°.","Hielo","",1.1,148,"Levitación","------------","Cristal","https://pokemon.fandom.com/es/wiki/Cryogonal","@drawable/cryogonal"));
        lista_pokemons.add( new cPokemon(122,"Shelmet","#122","Si está junto a Karrablast, y ambos reciben una descarga eléctrica, evolucionan los dos a la vez.","Bicho","",0.4,7.7,"Hidratación","Funda","Caracol","https://pokemon.fandom.com/es/wiki/Shelmet","@drawable/shelmet"));
        lista_pokemons.add( new cPokemon(123,"Accelgor","#123","Su cuerpo se debilita al deshidratarse, por lo que se envuelve en una membrana protectora mientras escupe veneno.","Bicho","",0.8,25.3,"Hidratación","Liviano","Sincaparazón","https://pokemon.fandom.com/es/wiki/Accelgor","@drawable/accelgor"));
        lista_pokemons.add( new cPokemon(124,"Stunfisk","#124","Cuando no logra paralizar a su rival, flexiona su cuerpo para escapar saltando con una inesperada velocidad.","Tierra","Electrico",0.7,11,"Electricidad estática","Velo arena","Trampa","https://pokemon.fandom.com/es/wiki/Stunfisk","@drawable/stunfisk"));
        lista_pokemons.add( new cPokemon(125,"Mienfoo","#125","La velocidad de sus ataques es su gran orgullo. Lo que le falta de fuerza bruta lo compensa en cantidad de golpes.","Lucha","",0.9,20,"Regeneración","Audaz","Arte marcial","https://pokemon.fandom.com/es/wiki/Mienfoo","@drawable/mienfoo"));
        lista_pokemons.add( new cPokemon(126,"Mienshao","#126","Usa el pelaje de sus brazos a modo de látigos para encadenar ataques que nadie puede parar una vez iniciados","Lucha","",1.4,35.5,"Regeneración","Audaz","Arte Marcial","https://pokemon.fandom.com/es/wiki/Mienshao","@drawable/mienshao"));
        lista_pokemons.add( new cPokemon(127,"Druddigon","#127","Recorre los estrechos túneles excavados por Excadrill y Onix, y captura a sus presas usando sus afiladas garras.","Dragon","",1.6,139,"Piel tosca","Rompemoldes","Cueva","https://pokemon.fandom.com/es/wiki/Druddigon","@drawable/druddigon"));
        lista_pokemons.add( new cPokemon(128,"Golett","#128","Un Pokémon creado a partir del barro gracias a la ciencia de antaño. Lleva activo miles de años.","Tierra","Fantasma",1,92,"Puño férreo","Indefenso","Autómata","https://pokemon.fandom.com/es/wiki/Golett","@drawable/golett"));
        lista_pokemons.add( new cPokemon(129,"Golurk","#129","Los Golurk fueron creados antaño para proteger a humanos y a Pokémon. Funcionan con una extraña energía.","Tierra","Fantasma",2.8,330,"Puño férreo","Indefenso","Autómata","https://pokemon.fandom.com/es/wiki/Golurk","@drawable/golurk"));
        lista_pokemons.add( new cPokemon(130,"Pawniard","#130","Ataca en grupo ignorando sus heridas y hundiendo en su presa las cuchillas que recubren su cuerpo.","Siniestro","Acero",0.5,10.2,"Competitivo","Presión","Tajo","https://pokemon.fandom.com/es/wiki/Pawniard","@drawable/pawniard"));
        lista_pokemons.add( new cPokemon(131,"Bisharp","#131","Un Pokémon temible que remata a su presa una vez que su séquito de Pawniard la ha debilitado e inmovilizado.","Siniestro","Acero",1.6,70,"Competitivo","Presión","Filo","https://pokemon.fandom.com/es/wiki/Bisharp","@drawable/bisharp"));
        lista_pokemons.add( new cPokemon(132,"Bouffalant","#132","Embiste con su cabeza sin distinción. Sería capaz de hacer descarrilar un tren si este invadiera su territorio.","Normal","",1.6,94.6,"Audaz","Insonorizar","Torocabezazo","https://pokemon.fandom.com/es/wiki/Bouffalant","@drawable/bouffalant"));
        lista_pokemons.add( new cPokemon(133,"Rufflet","#133","Se enfrentan a rivales muchos mayores, no por valentía, sino por pura temeridad. Pero así es como se fortalecen.","Normal","Volador",0.5,10.5,"Vista lince","Entusiasmo","Aguilucho","https://pokemon.fandom.com/es/wiki/Rufflet","@drawable/rufflet"));
        lista_pokemons.add( new cPokemon(134,"Braviary","#134","Un valiente guerrero del cielo que no duda en luchar por sus compañeros por graves que sean sus heridas.","Normal","Volador",1.5,41,"Vista lince","Competitivo","Aguerrido","https://pokemon.fandom.com/es/wiki/Braviary","@drawable/braviary"));
        lista_pokemons.add( new cPokemon(135,"Vullaby","#135","Sus pequeñas alas no le permiten volar. Usa una calavera que le dio Mandibuzz para proteger sus posaderas.","Siniestro","Volador",0.5,9,"Sacapecho","Armadura frágil","Pañal","https://pokemon.fandom.com/es/wiki/Vullaby","@drawable/vullaby"));
        lista_pokemons.add( new cPokemon(136,"Mandibuzz","#136","Vuela en círculos. Cuando avista una presa, la ataca y la transporta a su nido con suma facilidad.","Siniestro","Volador",1.2,39.5,"Sacapecho","Armadura frágil","Aguilahueso","https://pokemon.fandom.com/es/wiki/Mandibuzz","@drawable/mandibuzz"));
        lista_pokemons.add( new cPokemon(137,"Heatmor","#137","Absorbe aire por el orificio de su cola para prender una lengua de llamas con la que derrite a los Durant para comerlos.","Fuego","",1.4,58,"Gula","Humo blanco","Hormiguero","https://pokemon.fandom.com/es/wiki/Heatmor","@drawable/heatmor"));
        lista_pokemons.add( new cPokemon(138,"Durant","#138","Actúan en grupo para expulsar de sus colonias a los Heatmor, sus depredadores naturales","Bicho","Acero",0.3,33,"Enjambre","Ausente","Hormigacero","https://pokemon.fandom.com/es/wiki/Durant","@drawable/durant"));
        lista_pokemons.add( new cPokemon(139,"Deino","#139","No ve bien a su alrededor, por eso va chocándose a diestro y siniestro, y mordiendo todo lo que se mueve.","Siniestro","Dragon",0.8,17.3,"Entusiasmo","------------","Tosco","https://pokemon.fandom.com/es/wiki/Deino","@drawable/deino"));
        lista_pokemons.add( new cPokemon(140,"Zweilous","#140","Sus dos cabezas se llevan fatal, y la que consigue comer más que la otra es la que lleva la voz cantante.","Siniestro","Dragon",1.4,50,"Entusiasmo","------------","Violento","https://pokemon.fandom.com/es/wiki/Zweilous","@drawable/zweilous"));
        lista_pokemons.add( new cPokemon(141,"Hydreigon","#141","Un Pokémon temible que ataca todo lo que se mueve y devora con sus tres cabezas cuanto haya a su paso.","Siniestro","Dragon",1.8,160,"Levitación","------------","Voraz","https://pokemon.fandom.com/es/wiki/Hydreigon","@drawable/hydreigon"));
        lista_pokemons.add( new cPokemon(142,"Larvesta","#142","Se dice que nació del Sol. Al evolucionar, cubre su cuerpo con llamas que brotan de sus cuernos.","Bicho","Fuego",1.1,28.8,"Cuerpo llama","Enjambre","Antorcha","https://pokemon.fandom.com/es/wiki/Larvesta","@drawable/larvesta"));
        lista_pokemons.add( new cPokemon(143,"Volcarona","#143","Se cree que es la encarnación del sol. Salvó a muchos Pokémon de la congelación al surgir en mitad de un cruel invierno.","Bicho","Fuego",1.6,46,"Cuerpo llama","Enjambre","Sol","https://pokemon.fandom.com/es/wiki/Volcarona","@drawable/volcarona"));
        lista_pokemons.add( new cPokemon(144,"Cobalion","#144","Posee cuerpo y alma de acero. Junto a sus compañeros, castiga a aquellas personas que hacen daño a Pokémon.","Acero","Lucha",2.1,250,"Justiciero","------------","Tesón acero","https://pokemon.fandom.com/es/wiki/Cobalion","@drawable/cobalion"));
        lista_pokemons.add( new cPokemon(145,"Terrakion","#145","Las leyendas hablan de este Pokémon, que derribó un castillo con su propia fuerza para proteger a otros Pokémon.","Roca","Lucha",1.9,260,"Justiciero","------------","Gruta","https://pokemon.fandom.com/es/wiki/Terrakion","@drawable/terrakion"));
        lista_pokemons.add( new cPokemon(146,"Virizion","#146","Cuenta la leyenda que Virizion confunde a sus rivales con rápidos movimientos para proteger a otros Pokémon.","Planta","Lucha",2,200,"Justiciero","------------","Prado","https://pokemon.fandom.com/es/wiki/Virizion","@drawable/virizion"));
        lista_pokemons.add( new cPokemon(147,"Tornadus","#147","Le gusta ir volando de un lado a otro, generando tempestades tan potentes que pueden echar abajo una casa.","Volador","",1.5,63,"Bromista","Competitivo","Torbellino","https://pokemon.fandom.com/es/wiki/Tornadus","@drawable/tornadus"));
        lista_pokemons.add( new cPokemon(148,"Thundurus","#148","Su gusto por surcar el cielo lanzando rayos y provocando incendios forestales le ha granjeado pocas simpatías.","Electrico","Volador",1.5,61,"Bromista","Competitivo","Centella","https://pokemon.fandom.com/es/wiki/Thundurus","@drawable/thundurus"));
        lista_pokemons.add( new cPokemon(149,"Reshiram","#149","Pokémon legendario capaz de abrasar el mundo con sus llamas. Ayuda a quienes persiguen un mundo veraz.","Dragon","Fuego",3.2,330,"Turbollama","------------","Blanco veraz","https://pokemon.fandom.com/es/wiki/Reshiram","@drawable/reshiram"));
        lista_pokemons.add( new cPokemon(150,"Zekrom","#150","Pokémon legendario capaz de chamuscar el mundo con sus rayos. Ayuda a quienes persiguen un mundo de ideales.","Dragon","Electrico",2.9,345,"Terravoltaje","","Negro puro","https://pokemon.fandom.com/es/wiki/Zekrom","@drawable/zekrom"));
        lista_pokemons.add( new cPokemon(151,"Landorus","#151","Utiliza energía que obtiene del viento y del relámpago para nutrir el suelo y generar abundantes cosechas.","Tierra","Volador",1.5,68,"Poder arena","Potencia bruta","Fertilidad","https://pokemon.fandom.com/es/wiki/Landorus","@drawable/landorus"));
        lista_pokemons.add( new cPokemon(152,"Kyurem","#152","Pokémon legendario que aguarda al héroe que compense el vacío de su cuerpo de hielo con verdad e ideales.","Dragon","Hielo",3,325,"PresiónK","------------","Frontera","https://pokemon.fandom.com/es/wiki/Kyurem","@drawable/kyurem"));
        lista_pokemons.add( new cPokemon(153,"Keldeo","#153","Cuando está decidido, su cuerpo rebosa brío, y es capaz de saltar más alto y correr más de lo que la vista alcanza.","Agua","Lucha",1.4,48.5,"Justiciero","------------","Potro","https://pokemon.fandom.com/es/wiki/Keldeo","@drawable/keldeo"));
        lista_pokemons.add( new cPokemon(154,"Meloetta","#154","Las melodías que canta Meloetta tienen el poder de hacer sentir felicidad a los Pokémon que hay a su alrededor.","Normal","Psiquico",0.6,6.5,"Dicha","------------","Melodia","https://pokemon.fandom.com/es/wiki/Meloetta","@drawable/meloetta"));

        // Barra Superior de la applicacion
        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        actionBar.setTitle("Pokedex"); // set the top title

        // deshabilita la barra de notificacions
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Construim l'adaptador utilitzant un layout per defecte de Android.
        adaptador = new AdaptadorPokemon(this, lista_pokemons);

        // Assignem al listview l'adaptador creat
        lst.setAdapter(adaptador);
        adaptador.notifyDataSetChanged();


        //Pasar los datos al intent de la pokedex extensa
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                cPokemon pokemon_seleccionado = (cPokemon) a.getItemAtPosition(position);

            Intent intent_pokedex_extensa = new Intent( Pokedex.this, pokedex_extensa.class);

            intent_pokedex_extensa.putExtra("nom",pokemon_seleccionado.getNombre());
            intent_pokedex_extensa.putExtra("numero",pokemon_seleccionado.getNumero_pokedex());
            intent_pokedex_extensa.putExtra("descripcion",pokemon_seleccionado.getDescripcion());
            intent_pokedex_extensa.putExtra("tipo1",pokemon_seleccionado.getTipo1());
            intent_pokedex_extensa.putExtra("tipo2",pokemon_seleccionado.getTipo2());
            intent_pokedex_extensa.putExtra("altura",pokemon_seleccionado.getAltura());
            intent_pokedex_extensa.putExtra("peso",pokemon_seleccionado.getPeso());
            intent_pokedex_extensa.putExtra("habilidad",pokemon_seleccionado.getHabilidad());
            intent_pokedex_extensa.putExtra("habilidad_oculta",pokemon_seleccionado.getHabilidad_oculta());
            intent_pokedex_extensa.putExtra("especie",pokemon_seleccionado.getEspecie());
            intent_pokedex_extensa.putExtra("link",pokemon_seleccionado.getLink_pokedex());
            intent_pokedex_extensa.putExtra("fotografia",pokemon_seleccionado.getFotografia());

            startActivity(intent_pokedex_extensa);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_layout, menu);
        return true;
    }


    // Capturar pulsacions en el menú de la barra superior.
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();
                return true;

            case R.id.Todos:

                filtro("Todos");
                return true;

            case R.id.Jugar:
                Intent intentJuego = new Intent(Pokedex.this, Juego.class);
                startActivity(intentJuego);
                return true;

            case R.id.Planta:
                filtro("Planta");
                return true;

            case R.id.Veneno:
                filtro("Veneno");
                return true;

            case R.id.Fuego:
                filtro("Fuego");
                return true;

            case R.id.Agua:
                filtro("Agua");
                return true;

            case R.id.Volador:
                filtro("Volador");
                return true;

            case R.id.Roca:
                filtro("Roca");
                return true;

            case R.id.Tierra:
                filtro("Tierra");
                return true;

            case R.id.Hada:
                filtro("Hada");
                return true;

            case R.id.Bicho:
                filtro("Bicho");
                return true;

            case R.id.Siniestro:
                filtro("Siniestro");
                return true;

            case R.id.Psiquico:
                filtro("Psiquico");
                return true;

            case R.id.Acero:
                filtro("Acero");
                return true;

            case R.id.Hielo:
                filtro("Hielo");
                return true;

            case R.id.Lucha:
                filtro("Lucha");
                return true;

            case R.id.Fantasma:
                filtro("Fantasma");
                return true;

            case R.id.Electrico:
                filtro("Electrico");
                return true;

            case R.id.Dragon:
                filtro("Dragon");
                return true;

            case R.id.Normal:
                filtro("Normal");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // Metodo para hacer el filtraje de pokemons
    public void filtro(String tipo) {

        ArrayList<cPokemon> listaPokemon2 = new ArrayList<>();
        listaPokemon2.clear();
        AdaptadorPokemon adaptador2 = new AdaptadorPokemon(this, listaPokemon2);

        List<cPokemon> list = lista_pokemons;
        for(int i=0; i<list.size(); i++) {
            cPokemon pokemon = list.get(i);

            if (tipo.equals("Todos")) {
                listaPokemon2.addAll(lista_pokemons);
                break;
            }
            else if (pokemon.getTipo1().equals(tipo) || pokemon.getTipo2().equals(tipo)) {
                listaPokemon2.add(pokemon);
            }
        }

        // Assignem al listview l'adaptador creat
        lst.setAdapter(adaptador2);
    }
}

// Adaptador para los pokemons
class AdaptadorPokemon extends ArrayAdapter<cPokemon> {
    private Context cont;

    public AdaptadorPokemon(Context context, ArrayList<cPokemon> pokemons) {
        super(context, R.layout.layout_pokemon, pokemons);
        cont = context;
    }

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

    //Introducir la informacion en la casilla del listview de cada pokemon
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.layout_pokemon, null);

        cPokemon pokemon = (cPokemon) getItem(position);

        TextView tvNombre = (TextView)item.findViewById(R.id.tvNombrePokemon);
        tvNombre.setText(pokemon.getNombre());

        TextView tvNumero = (TextView)item.findViewById(R.id.tvNumeroPokemon);
        tvNumero.setText(pokemon.getNumero_pokedex());

        TextView tipo1 = (TextView) item.findViewById(R.id.tvtipo1);
        tipo1.setBackgroundColor(Color.parseColor(colorTipo(pokemon.getTipo1())));
        tipo1.setText(pokemon.getTipo1());

        TextView tipo2 = (TextView )item.findViewById(R.id.tvtipo2);
        tipo2.setBackgroundColor(Color.parseColor(colorTipo(pokemon.getTipo2())));
        tipo2.setText(pokemon.getTipo2());


        ImageView foto = (ImageView) item.findViewById(R.id.ivPokemon);
        String src = pokemon.getFotografia();
        foto.setImageResource(cont.getResources().getIdentifier(src, "drawable", cont.getOpPackageName()));

        return(item);
    }
}