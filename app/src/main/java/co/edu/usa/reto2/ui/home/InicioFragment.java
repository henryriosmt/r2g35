package co.edu.usa.reto2.ui.home;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import co.edu.usa.reto2.R;
import co.edu.usa.reto2.databinding.FragmentHomeBinding;
import co.edu.usa.reto2.ui.gallery.GalleryFragment;

public class InicioFragment extends Fragment {
    View v;
    Drawable drawable;
    ImageView imagenini;
    private InicioViewModel inicioViewModel;
    private FragmentHomeBinding binding;

    public InicioFragment() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*inicioViewModel =
                new ViewModelProvider(this).get(InicioViewModel.class);*/

        v = inflater.inflate(R.layout.fragment_home,container,false);

        Resources res = getResources();
        drawable = res.getDrawable(R.drawable.inicioimg, v.getContext().getTheme());

        imagenini = (ImageView) v.findViewById(R.id.imagenini);
        imagenini.setImageDrawable(drawable);


        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}