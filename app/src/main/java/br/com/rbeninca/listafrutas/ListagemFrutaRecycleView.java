package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class ListagemFrutaRecycleView extends AppCompatActivity {
    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_fruta_recycle_view);

        recyclerView=findViewById(R.id.recyclerView);
        //Configurações RecyclerView

        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        FrutaController frutaController = new FrutaController();

        FrutaAdapterRecyclerView frutaAdapterRecyclerView = new FrutaAdapterRecyclerView(
                getApplicationContext(),
                R.layout.template_item_fruta,
                frutaController.FRUTAS
        );


        recyclerView.setAdapter(frutaAdapterRecyclerView);



    }
}
