package com.example.homework36;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework36.databinding.ItemMusicBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.CountViewHolder> {
    private Context context;
    private OnClick onClick;

    ArrayList<Music> list = new ArrayList<>();

    public Adapter(ArrayList<Music> list,OnClick onClick) {
        this.list = list;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public CountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        ItemMusicBinding binding = ItemMusicBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountViewHolder holder, int position) {
        holder.bind(list.get(position), context);
        holder.itemView.setOnClickListener(view -> {
            onClick.onClick(list.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class CountViewHolder extends RecyclerView.ViewHolder {

        private ItemMusicBinding binding;
        private Context context;

        public CountViewHolder(@NonNull ItemMusicBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Music music, Context context) {
            binding.tvCount.setText(music.getCount());
            binding.tvNameMusic.setText(music.getNameMusic());
            binding.tvTimeMusic.setText(music.getTime());
            binding.tvNameSinger.setText(music.getSinger());
        }
    }
}
