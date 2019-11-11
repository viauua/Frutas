package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        FrutaController frutaController = new FrutaController();

        FrutaAdapter  frutaAdapter =new FrutaAdapter(
                getApplicationContext(),
                R.layout.template_item_fruta,
                frutaController.FRUTAS
                );

        listView.setAdapter(frutaAdapter);

    }
}
