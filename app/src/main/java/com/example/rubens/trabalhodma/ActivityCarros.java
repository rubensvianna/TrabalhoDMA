package com.example.rubens.trabalhodma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ActivityCarros extends AppCompatActivity {

    private ListView lvCarros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carros);

        lvCarros = (ListView) findViewById(R.id.listViewCarros);
        List<Carros> listaCarros = new ArrayList<>();

        listaCarros.add(new Carros(1L, "Montana", "Chevrolet", "1.4 LS 8V Flex 2P Manual",
                "2018/2018", "R$ 38.291,00", "(44) 999655469", R.drawable.montana));

        listaCarros.add(new Carros(2L, "Fiesta", "Ford", "1.6 SE 8V Flex 4P Manual",
                "2014/2014", "R$ 27.900,00", "(44) 999655469", R.drawable.fiesta));

        listaCarros.add(new Carros(3L, "Fox", "VolksWagen", "1.6 PLUS 8V Flex 4P Manual",
                "2006/2006", "R$ 17.900,00", "(44) 999655469", R.drawable.fox));

        listaCarros.add(new Carros(4L, "Grand Siena", "Fiat", "1.4 Attractive 8V 85CV 4P Flex Manual",
                "2013/2014", "R$ 35.990,00", "(44) 999655469", R.drawable.siena));

        listaCarros.add(new Carros(5L, "Range Rover","RangeRover","2.8 Atractive",
                "2016/2017","R$420.987,00","(44)3482-0110",R.drawable.rangrover01));

        listaCarros.add(new Carros(7L, "Ferrari 2018","Ferrari","3.0 UltraSpeed",
                "2017/2018","R$987.291,00","(44)3482-0110",R.drawable.ferrari));

        listaCarros.add(new Carros(8L, "Range Rover 2018","RangeRover","3.0 UltraSpeed",
                "2017/2018","R$782.987,00","(44)3482-0110",R.drawable.rangrover02));

        listaCarros.add(new Carros(9L, "Lamborguinhi 2018","Lamborguinhi","3.0 Ultra Veloz",
                "2018/2019","R$3.298.983,00","(44)3482-0110",R.drawable.lamborguinhi));

        listaCarros.add(new Carros(10L, "Lamborguinhi 2018","Lamborguinhi","3.0 Ultra Veloz",
                "2018/2019","R$3.298.983,00","(44)3482-0110",R.drawable.lamborguini01));

        listaCarros.add(new Carros(11L, "MCLAREN 2018","MCLaren","2.9Veloz",
                "2018/2019","R$7.298.983,00","(44)3482-0110",R.drawable.mclaren));

        listaCarros.add(new Carros(12L, "Lamborguinhi 2018","Lamborguinhi","3.0 Ultra Veloz",
                "2018/2019","R$2.298.983,00","(44)3482-0110",R.drawable.mclaren01));


        listaCarros.add(new Carros(13L, "Porshe 2018","Porshe","3.0 Ultra Veloz",
                "2018/2019","1.298.983,00","(44)3482-0110",R.drawable.porshe));



        AdapterCarros adapter = new AdapterCarros(this, listaCarros);
        lvCarros.setAdapter(adapter);
    }
}
