package br.com.devgeek.cartolapro;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by computador1 on 9/2/16.
 */
public class PontuacaoAdapter extends RecyclerView.Adapter<PontuacaoAdapter.PontuacaoViewHolder> {

    private List<Pontuacao> pontuacaoList;

    public PontuacaoAdapter(List<Pontuacao> pontuacaoList) {
        this.pontuacaoList = pontuacaoList;
    }


    @Override
    public int getItemCount() {
            return pontuacaoList.size();
            }

    @Override
    public void onBindViewHolder(PontuacaoViewHolder contactViewHolder, int i){

        Pontuacao pontuacao = pontuacaoList.get(i);

        if (pontuacao.getTime().equals("Arkenstone FC")){
            contactViewHolder.viewEscudo.setImageResource(R.drawable.escudo_geo);
        } else if (pontuacao.getTime().equals("DJ Soccer Club")){
            contactViewHolder.viewEscudo.setImageResource(R.drawable.escudo_dj);
        } else if (pontuacao.getTime().equals("CaiapôniaDuarte FC")){
            contactViewHolder.viewEscudo.setImageResource(R.drawable.escudo_cpa);
        } else {
            contactViewHolder.viewEscudo.setImageResource(R.drawable.escudo);
        }

        contactViewHolder.viewTime.setText(pontuacao.getTime());
        contactViewHolder.viewCartoleiro.setText(pontuacao.getCartoleiro());
        contactViewHolder.viewVariacao.setText(String.format("C$ %.2f",pontuacao.getVariacao()));
        contactViewHolder.viewPontuacao.setText(String.format("%.2f",pontuacao.getPontuacao()));
    }

    @Override
    public PontuacaoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View itemView = LayoutInflater.
            from(viewGroup.getContext()).
            inflate(R.layout.pontuacao_layout, viewGroup, false);

            return new PontuacaoViewHolder(itemView);
            }

    public static class PontuacaoViewHolder extends RecyclerView.ViewHolder {

        protected ImageView viewEscudo;
        protected TextView viewTime;
        protected TextView viewCartoleiro;
        protected TextView viewVariacao;
        protected TextView viewPontuacao;

        public PontuacaoViewHolder(View v) {
            super(v);
            viewEscudo     = (ImageView) v.findViewById(R.id.imgEscudo);
            viewTime       = (TextView)  v.findViewById(R.id.txtTime);
            viewCartoleiro = (TextView)  v.findViewById(R.id.txtCartoleiro);
            viewVariacao   = (TextView)  v.findViewById(R.id.txtVariacao);
            viewPontuacao  = (TextView)  v.findViewById(R.id.txtPontuacao);
        }
    }
}
