package br.com.rbeninca.listafrutas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/* A classe Adapter deve extender de RecyclerView.Adapater, ou seja uma adapter especial para o recyclerView.
    Esse adapter deve receber a especificação do tipo de conteúdo que ele ira manusear, em quanto no ListView cada
    item é tratado diretametne como uma view, no RecyclerView cada item é uma view mas fica encapsulado em uma
    view holder, que é um envólucro em que contém a view de cada item.
    Estas ViewHolders são instânciadas e cada uma contém uma view de um item da listagem, entretanto diferente do
    ListView as o RecyclerView instancia apenas o número de VH necessárias para pre encher a tela, fazendo com que
    ao navegar na lista as Holders já instanciadas tenham seus dados substituidos pelo metódo OnBindViewHolder.
* */
public class FrutaAdapterRecyclerView extends RecyclerView.Adapter<FrutaAdapterRecyclerView.MyViewHolder>{
    Context mContext;
    int mResource;
    Fruta[] mDataset;
    /*Metódo construtod da classe Adapter, ele recebera como parametros o contexto o layout e também
    * a coleção de objetos com dados. Para que possamos acessar estes dados associamos as referencias
    * destes parametros recebidos para atributos locais*/
    public FrutaAdapterRecyclerView(Context context, int resource, Fruta[] dataSet) {
        super();
        mContext = context;
        mResource = resource;
        mDataset = dataSet;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Metodo chamado para criar os itens de layout
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.template_item_fruta,parent,false);
        MyViewHolder vh = new MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        NumberFormat nf = new DecimalFormat("#,###.00");

        holder.tvCodigo.setText(Integer.toString(mDataset[position].getCodigo()));
        holder.tvNome.setText(mDataset[position].getNome());
        holder.tvPreco.setText(nf.format (mDataset[position].getPreco()));
        holder.tvPrecoVenda.setText(nf.format (mDataset[position].getPreco_venda()));
        holder.imgView.setImageResource(mDataset[position].getImagem());
    }

    @Override
    public int getItemCount() {
        return  mDataset.length;
    }



/*
    Declaração da classe MyViewHolder que será  envolúcro para views de cada item da listagem.
 */
    public  class MyViewHolder extends  RecyclerView.ViewHolder{
        TextView tvCodigo ;
        TextView tvNome ;
        TextView tvPreco;
        TextView tvPrecoVenda;
        ImageView imgView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //Associando identificadores locais com Objetos do VH
            tvCodigo = (TextView) itemView.findViewById(R.id.tvCodigo);
            tvNome = (TextView) itemView.findViewById(R.id.tvNome);
            tvPreco =  (TextView) itemView.findViewById(R.id.tvPreco);
            tvPrecoVenda =(TextView) itemView.findViewById(R.id.tvPrecoVenda);
            imgView = itemView.findViewById(R.id.imageView);

        }
    }






}
