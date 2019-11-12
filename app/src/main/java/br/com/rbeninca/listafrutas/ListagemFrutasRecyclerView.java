package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListagemFrutasRecyclerView extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_frutas_recycler_view);


        recyclerView=findViewById(R.id.recylerView);

        //Configurando RecyclerView.
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this); //new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        FrutaController frutaController =new FrutaController();

        FrutaAdapterRecyclerView frutaAdapterRecyclerView=new FrutaAdapterRecyclerView(
                getApplicationContext(),
                R.layout.template_item_fruta,
                frutaController.FRUTAS
                );

        recyclerView.setAdapter(frutaAdapterRecyclerView);



    }
}
