package bernardo.castro.s301073235;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

//Bernardo Silveira Dos Santos Castro, 301073235, Section 02
public class CastroFragment extends Fragment {
    private static final int PERMISSION_CODE = 1;
    Button displayAnimation, stop;
    AnimationDrawable drawable = null;

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
        stop = getView().findViewById(R.id.bernardoStopButton);
        displayAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requestPermissions(new String[]{Manifest.permission.CAMERA}, PERMISSION_CODE);
                animation();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationStop();
            }
        });
    }



    private void animation(){
        ImageView image = getView().findViewById(R.id.benrardoAnimationFrame);

        BitmapDrawable first = (BitmapDrawable) getResources().getDrawable(R.drawable.frame1);
        BitmapDrawable second = (BitmapDrawable) getResources().getDrawable(R.drawable.frame2);
        BitmapDrawable third = (BitmapDrawable) getResources().getDrawable(R.drawable.frame3);
        BitmapDrawable fourth = (BitmapDrawable) getResources().getDrawable(R.drawable.frame4);
        BitmapDrawable fifth = (BitmapDrawable) getResources().getDrawable(R.drawable.frame5);

        int duration = 200;

        drawable = new AnimationDrawable();
        drawable.setOneShot(false);
        drawable.addFrame(first, duration);
        drawable.addFrame(second, duration);
        drawable.addFrame(third, duration);
        drawable.addFrame(fourth, duration);
        drawable.addFrame(fifth, duration);

        image.setBackground(drawable);

        drawable.setVisible(true, true);
        drawable.start();

    }
    private void animationStop(){
        drawable.stop();
        drawable.setVisible(false, false);
    }
}