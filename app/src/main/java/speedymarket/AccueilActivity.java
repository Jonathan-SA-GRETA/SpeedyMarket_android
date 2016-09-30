package speedymarket;

/**
 * Created by Karim and Mat on 23/09/2016.
 */

    import java.util.Timer;
    import java.util.TimerTask;

    import android.app.Activity;
    import android.os.Bundle;
    import android.view.View;
    import android.view.animation.Animation;
    import android.view.animation.AnimationUtils;
    import android.widget.ImageSwitcher;
    import android.widget.ImageView;
    import android.widget.ViewSwitcher.ViewFactory;

    import com.example.stagiaires.speedymarket.R;

/**
     *
     * @author danielme.com
     *
     */
    public class AccueilActivity extends Activity {

        private ViewFactory view;
        private ImageSwitcher imageSwitcher;

        private int[] gallery = { R.drawable.magasin_bio, R.drawable.mag, R.drawable.vendeur2,
                R.drawable.woman};

        private int position;

        private static final Integer DURATION = 10;

        private Timer timer = null;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
            imageSwitcher.setFactory(new ViewFactory() {

                public View makeView() {
                    return new ImageView(AccueilActivity.this);
                }
            });

        }



        public void startSlider() {
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {

                public void run() {
                    // avoid exception:
                    // "Only the original thread that created a view hierarchy can touch its views"
                    runOnUiThread(new Runnable() {
                        public void run() {
                            imageSwitcher.setImageResource(gallery[position]);
                            position++;
                            if (position == gallery.length) {
                                position = 0;
                            }
                        }
                    });
                }

            }, 0, DURATION);
        }

        // Stops the slider when the Activity is going into the background
        @Override
        protected void onPause() {
            super.onPause();
            if (timer != null) {
                timer.cancel();
            }
        }

        @Override
        protected void onResume() {
            super.onResume();
            if (timer != null) {
                startSlider();
            }

        }

    }


