package com.example.homework36;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework36.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements OnClick {

    private Adapter adapterMusic;
    private ArrayList<Music> music;
    public final static String key = "ключ";
    private FragmentSecondBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        adapterMusic = new Adapter(music, this);
        binding.recycle.setAdapter(adapterMusic);
    }

    private void loadData() {
        music = new ArrayList<>();
        music.add(new Music("1", "3:31", "Ирина Кайратовна", "NE ANGIME?"));
        music.add(new Music("2", "2:15", "CAPTOWN", "Разная дрянь"));
        music.add(new Music("3", "3:46", "Скриптонит", "Мистер 718"));
        music.add(new Music("4", "2:50", "Bakr", "Очи"));
        music.add(new Music("5", "1:26", "The Limba", "Обманула"));
        music.add(new Music("6", "3:02", "V$XV PRiNCE", "Температура"));
        music.add(new Music("7", "4:36", "MiyaGi & Эндшпиль", "I Got Love"));
        music.add(new Music("8", "2:45", "Баястан", "Bombita"));
        music.add(new Music("9", "3:02", "qurt, Truwer", "HYBRID"));
        music.add(new Music("10", "3:13", "The Limba", "СИНИЕ ФИАЛКИ"));

    }

    @Override
    public void onClick(Music music) {
        Bundle bundle = new Bundle();
        Fragment fragment = new ThirdFragment();
        bundle.putString(key, music.getNameMusic());
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container4, fragment).addToBackStack("a").commit();
    }
}