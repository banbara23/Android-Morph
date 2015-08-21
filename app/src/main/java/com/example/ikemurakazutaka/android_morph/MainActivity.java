
package com.example.ikemurakazutaka.android_morph;

import android.support.v7.app.ActionBarActivity;
import android.util.Log;

public class MainActivity extends ActionBarActivity implements ItemFragment.OnScrollListener {

    // private FloatingActionButton mFloatingActionButton;
    // private Toolbar mToolbar;
    //
    // @Override
    // protected void onCreate(Bundle savedInstanceState) {
    // super.onCreate(savedInstanceState);
    // setContentView(R.layout.activity_main);
    //
    // // フラグメント
    // getFragmentManager().beginTransaction().add(R.id.container, new
    // ItemFragment()).commit();
    //
    // // ツールバー
    // mToolbar = (Toolbar) findViewById(R.id.toolbar_footer);
    // // フローティングボタン
    // mFloatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
    // mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
    // @Override
    // public void onClick(View v) {
    // showToast();
    // }
    // });
    // }
    //
    // private void show() {
    // if (mFloatingActionButton.getVisibility() == View.GONE) {
    // Log.d("MainActivity", "show");
    // FabTransformation.with(mFloatingActionButton).transformTo(mToolbar);
    // }
    // }
    //
    // private void hide() {
    // if (mFloatingActionButton.getVisibility() == View.VISIBLE) {
    // Log.d("MainActivity", "hide");
    // FabTransformation.with(mFloatingActionButton).transformFrom(mToolbar);
    // }
    // }
    //
    // private void showToast() {
    // Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
    // }
    //
    // @Override
    // public boolean onCreateOptionsMenu(Menu menu) {
    // // Inflate the menu; this adds items to the action bar if it is present.
    // getMenuInflater().inflate(R.menu.menu_main, menu);
    // return true;
    // }
    //
    // @Override
    // public boolean onOptionsItemSelected(MenuItem item) {
    // // Handle action bar item clicks here. The action bar will
    // // automatically handle clicks on the Home/Up button, so long
    // // as you specify a parent activity in AndroidManifest.xml.
    // int id = item.getItemId();
    //
    // // noinspection SimplifiableIfStatement
    // if (id == R.id.action_settings) {
    // return true;
    // }
    //
    // return super.onOptionsItemSelected(item);
    // }
    //
    @Override
    public void onScroll(int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        Log.d("MainActivity", "firstVisibleItem:" + firstVisibleItem + " visibleItemCount:" + visibleItemCount + " totalItemCount:" + totalItemCount);
        // 0行目かつFAB非表示
        // if (isShowFab() && firstVisibleItem == 0) {
        // return;
        // }
        // // 0行目かつFAB表示
        // if (isHideFab() && firstVisibleItem > 0) {
        // return;
        // }
        // // 0行目 かつ FAB非表示なら 表示処理開始
        // if (isHideFab() && firstVisibleItem == 0) {
        // show();
        // return;
        // }
        // // 0行目以上 かつ FAB表示なら 非表示処理開始
        // if (isShowFab() && firstVisibleItem > 0) {
        // hide();
        // }
    }
    //
    // private boolean isShowFab() {
    // return mFloatingActionButton.getVisibility() == View.VISIBLE;
    // }
    //
    // private boolean isHideFab() {
    // return mFloatingActionButton.getVisibility() == View.GONE;
    // }
    //
    // private boolean isShowToolbar() {
    // return mToolbar.getVisibility() == View.VISIBLE;
    // }
    //
    // private boolean isHideToolbar() {
    // return mToolbar.getVisibility() == View.GONE;
    // }
}
