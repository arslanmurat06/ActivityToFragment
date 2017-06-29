package udacity.examples.com.activitytofragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by HP-PC on 29.06.2017.
 */

public class FragmentLayout extends Fragment {
    View view;
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_layout,container,false);
        textView=(TextView) view.findViewById(R.id.textView);

        return view;
    }

    public void showText(String text) {

        textView.setText(text);

    }
}
