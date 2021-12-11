package co.edu.usa.reto2.ui.sucursales;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import co.edu.usa.reto2.R;
import co.edu.usa.reto2.databinding.FragmentSlideshowBinding;
import co.edu.usa.reto2.ui.slideshow.SlideshowViewModel;

public class SucursalesFragment extends Fragment {
    View v;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_sucursales,container,false);


        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}