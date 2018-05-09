package com.example.hongv.navigationdrawer;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;
import com.example.hongv.navigationdrawer.adapter.ViewPagerAdapter;
import com.example.hongv.navigationdrawer.view.tabfragment.CenterCommentFragment;
import com.example.hongv.navigationdrawer.view.tabfragment.CenterCourseFragment;
import com.example.hongv.navigationdrawer.view.tabfragment.CenterDetailFragment;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class CenterActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    private Toolbar toolbar;
    private FloatingActionButton fab;

    private MaterialSearchView materialSearchView;
    private String [] arrayCenter = new String[] {"Iris", "EngForU", "Academy", "Broadway"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center);
        initView();
        setSupportActionBar(toolbar);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        figureFloatingButton();
        figureSearchTool();
    }
    public void initView () {
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabs);
        toolbar = findViewById(R.id.toolbar);
    }
    private void setupViewPager (ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CenterDetailFragment(), "DETAIL");
        adapter.addFragment(new CenterCommentFragment(), "COMMENT");
        adapter.addFragment(new CenterCourseFragment(), "COURSE");
        viewPager.setAdapter(adapter);
    }

    public void figureFloatingButton () {
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void figureSearchTool () {
        materialSearchView = findViewById(R.id.material_sarchview);
        materialSearchView.closeSearch();
        materialSearchView.setSuggestions(arrayCenter);
        materialSearchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    //search tool
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu, menu);
        MenuItem item = menu.findItem(R.id.search_center);
        materialSearchView.setMenuItem(item);
        return true;
    }
}
