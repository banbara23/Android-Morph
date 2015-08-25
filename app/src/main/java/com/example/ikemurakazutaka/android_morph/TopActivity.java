
package com.example.ikemurakazutaka.android_morph;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

import io.codetail.animation.SupportAnimator;
import io.codetail.animation.ViewAnimationUtils;

/**
 * Created by banbara23 on 15/08/24.
 */
public class TopActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        // final View view1 = (View) findViewById(R.id.activity_top_layout1);
        // final View view2 = (View) findViewById(R.id.activity_top_layout2);

        findViewById(R.id.activity_top_button).setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                animator();
            }
        });

        findViewById(R.id.activity_top_button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animator2();
            }
        });
    }

    private void animator() {

        final View myView = findViewById(R.id.activity_top_layout1);
        if (myView.getVisibility() == View.VISIBLE) {

            // get the center for the clipping circle
            int cx = (myView.getLeft() + myView.getRight()) / 2;
            int cy = (myView.getTop() + myView.getBottom()) / 2;

            // get the final radius for the clipping circle
            int finalRadius = Math.max(myView.getWidth(), myView.getHeight());

            SupportAnimator animator =
                    ViewAnimationUtils.createCircularReveal(myView, cx, cy, finalRadius, 0);
            animator.setInterpolator(new AccelerateDecelerateInterpolator());
            animator.setDuration(1000);
            animator.addListener(new SupportAnimator.AnimatorListener() {
                @Override
                public void onAnimationStart() {

                }

                @Override
                public void onAnimationEnd() {
                    myView.setVisibility(View.INVISIBLE);
                }

                @Override
                public void onAnimationCancel() {

                }

                @Override
                public void onAnimationRepeat() {

                }
            });
            animator.start();
        }
        else {
            // get the center for the clipping circle
            int cx = (myView.getLeft() + myView.getRight()) / 2;
            int cy = (myView.getTop() + myView.getBottom()) / 2;

            // get the final radius for the clipping circle
            int finalRadius = Math.max(myView.getWidth(), myView.getHeight());

            SupportAnimator animator =
                    ViewAnimationUtils.createCircularReveal(myView, cx, cy, 0, finalRadius);
            animator.setInterpolator(new AccelerateDecelerateInterpolator());
            animator.setDuration(1000);
            myView.setVisibility(View.INVISIBLE);
            animator.addListener(new SupportAnimator.AnimatorListener() {
                @Override
                public void onAnimationStart() {
                    myView.setVisibility(View.VISIBLE);
                }

                @Override
                public void onAnimationEnd() {
//                    myView.setVisibility(View.VISIBLE);
                }

                @Override
                public void onAnimationCancel() {

                }

                @Override
                public void onAnimationRepeat() {

                }
            });
            animator.start();
        }
    }

    private void animator2() {

    }
}
