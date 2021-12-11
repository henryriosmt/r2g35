package co.edu.usa.reto2.ui.gallery;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import co.edu.usa.reto2.R;
import co.edu.usa.reto2.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {
    View v;
    Drawable drawable1, drawable2, drawable3;
    ImageView chaqueta1, chaqueta2, chaqueta3;

    private GalleryViewModel galleryViewModel;
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_gallery,container,false);

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.chaqueta1, v.getContext().getTheme());

        chaqueta1 = (ImageView) v.findViewById(R.id.chaqueta1);
        chaqueta1.setImageDrawable(drawable1);

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.chaqueta2, v.getContext().getTheme());

        chaqueta2 = (ImageView) v.findViewById(R.id.chaqueta2);
        chaqueta2.setImageDrawable(drawable2);

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.chaqueta3, v.getContext().getTheme());

        chaqueta3 = (ImageView) v.findViewById(R.id.chaqueta3);
        chaqueta3.setImageDrawable(drawable3);

        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}