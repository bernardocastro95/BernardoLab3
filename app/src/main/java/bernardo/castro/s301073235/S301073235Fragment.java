package bernardo.castro.s301073235;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class S301073235Fragment extends Fragment {

    TextView name, lastName;
    float rotateLeft = 45, rotateRight = -45;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_s301073235, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        name = getView().findViewById(R.id.bernardoFirstName);
        lastName = getView().findViewById(R.id.bernardoLastName);
        name.setRotation(rotateLeft);
        lastName.setRotation(rotateRight);
    }
}