package bernardo.castro.s301073235;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

//Bernardo Silveira Dos Santos Castro, 301073235, Section 02
public class S301073235Fragment extends Fragment {

    TextView name, lastName;
    float rotateLeft = 45, rotateRight = -45;
    ImageView earth, moon;
    Button start, stop;

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
        earth = getView().findViewById(R.id.bernardoEarth);
        moon = getView().findViewById(R.id.bernardoMoon);
        start = getView().findViewById(R.id.bernardoStartTween);
        stop = getActivity().findViewById(R.id.bernardoStopTween);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animating(R.anim.spinning);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stoping(R.anim.spinning);
            }
        });
    }

    private void animating(int animID){
        ImageView moon = getView().findViewById(R.id.bernardoMoon);
        Animation animation = AnimationUtils.loadAnimation(getContext(), animID);
        animation.setAnimationListener(new AnimationLister());
        moon.startAnimation(animation);

    }
    private void stoping(int animID){
        ImageView moon = getView().findViewById(R.id.bernardoMoon);
        Animation animation = AnimationUtils.loadAnimation(getContext(), animID);
        animation.setAnimationListener(new AnimationLister());
        moon.setAnimation(null);
    }
    class AnimationLister implements Animation.AnimationListener {

        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {

        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    }
}