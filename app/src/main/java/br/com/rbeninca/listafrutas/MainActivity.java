package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button buttonLV,buttonRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLV=findViewById(R.id.buttonLV);
        buttonRV=findViewById(R.id.buttonRV);

        buttonLV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ListagemFrutaListView.class);
                startActivity(intent);
            }
        });

        buttonRV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ListagemFrutasRecyclerView.class);
                startActivity(intent);
            }
        });


    }
}
