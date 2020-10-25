package bernardo.castro.s301073235;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;


public class CastroFragment extends Fragment {

    Button displayAnimation;
    Animation drawable = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_castro, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        displayAnimation = getView().findViewById(R.id.bernardoButtonAnimation);
        displayAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    private void animation(){
        ImageView image = getView().findViewById(R.id.benrardoAnimationFrame);

        BitmapDrawable first = (BitmapDrawable) getResources().getDrawable(R.drawable.frame1);
        BitmapDrawable second = (BitmapDrawable) getResources().getDrawable(R.drawable.frame2);
        BitmapDrawable third = (BitmapDrawable) getResources().getDrawable(R.drawable.frame3);
        BitmapDrawable fourth = (BitmapDrawable) getResources().getDrawable(R.drawable.frame4);
        BitmapDrawable fiftt = (BitmapDrawable) getResources().getDrawable(R.drawable.frame5);

    }
}