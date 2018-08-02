package fragment;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.franchiseez.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KoleksiFragment extends Fragment {


    public KoleksiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_koleksi, container, false);

        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);

        return view;
    }


}
