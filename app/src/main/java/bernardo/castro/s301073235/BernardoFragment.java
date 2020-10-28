package bernardo.castro.s301073235;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.widgets.Rectangle;
import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.view.WindowManager;
import android.widget.Toast;

//Bernardo Silveira Dos Santos Castro, 301073235, Section 02
public class BernardoFragment extends Fragment  {

    ImageView image;
    private Paint p;
    private Bitmap b;
    private Canvas c;
    int startX, startY;
    int endX, endY;
    Button clear, drawingButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bernardo, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        image = getView().findViewById(R.id.bernardoImage);
        clear = getView().findViewById(R.id.bernardoClearDraw);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearDraw(view);
            }
        });
        drawingButton = getView().findViewById(R.id.bernardoStartDraw);
        drawingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawing();
            }
        });
        p = new Paint();
        p.setColor(Color.BLACK);
        p.setStrokeWidth(50);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.house);
        c = new Canvas();
        c.drawBitmap(b, getWindowWidth(), getWindowHeight(), p);
        image.setImageBitmap(b);
    }
    int getWindowWidth(){
        WindowManager wm = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        Display dis = wm.getDefaultDisplay();
        Point width = new Point();
        dis.getSize(width);
        return width.x;
    }
    int getWindowHeight(){
        WindowManager wm = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        Display dis = wm.getDefaultDisplay();
        Point height = new Point();
        dis.getSize(height);
        return height.y;
    }
    public void clearDraw(View v){
        c.drawColor(Color.TRANSPARENT);
        startX = 10;
        startY = 10;
        endX = 300;
        endY = 300;
    }
    public void drawing(){
        c.drawPoint(15, 15, p);
    }


}