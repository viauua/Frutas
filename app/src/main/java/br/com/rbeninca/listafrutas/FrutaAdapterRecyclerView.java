package br.com.rbeninca.listafrutas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.text.NumberFormat;

class FrutaAdapterRecyclerView extends RecyclerView.Adapter<FrutaAdapterRecyclerView.MyViewHolder>{
    Context mContext;
    int mResource;
    Fruta[] dataset;
//Construtor do adapter
    public FrutaAdapterRecyclerView(Context context, int resource , Fruta[] frutas) {
        mContext=context;
        mResource=resource;
        dataset=frutas;

    }
//---------------------------------------------------------
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Metodo para inflar uma holder
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View itemView = layoutInflater.inflate(mResource,parent,false);
        MyViewHolder viewHolder =new MyViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Fruta fruta =dataset[position];
        NumberFormat nf = new DecimalFormat("#,###.00");
        holder.tvCodigo.setText(Integer.toString(fruta.getCodigo()));
        holder.tvNome.setText(fruta.getNome());
        holder.tvPreco.setText(nf.format (fruta.getPreco()));
        holder.tvPrecoVenda.setText(nf.format (fruta.getPreco_venda()));
        holder.imgView.setImageResource(fruta.getImagem());
    }
    @Override
    public int getItemCount() {
        return  dataset.length;
    }

    //Definição da holder
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvCodigo;
        TextView tvNome;
        TextView tvPreco;
        TextView tvPrecoVenda;
        ImageView imgView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //Associar identificadores locais a objetos da layout instanciado
            //Associando elementos da view inflada a váriaveis locais
             tvCodigo = (TextView) itemView.findViewById(R.id.tvCodigo);
             tvNome = (TextView) itemView.findViewById(R.id.tvNome);
             tvPreco =  (TextView) itemView.findViewById(R.id.tvPreco);
             tvPrecoVenda =(TextView) itemView.findViewById(R.id.tvPrecoVenda);
             imgView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
