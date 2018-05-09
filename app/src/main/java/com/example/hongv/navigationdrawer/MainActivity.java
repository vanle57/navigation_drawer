package com.example.hongv.navigationdrawer;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;

import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.hongv.navigationdrawer.view.navfragment.CategoryFragment;
import com.example.hongv.navigationdrawer.view.navfragment.CommentFragment;
import com.example.hongv.navigationdrawer.view.navfragment.LoveFragment;
import com.example.hongv.navigationdrawer.view.navfragment.ProfileFragment;
import com.example.hongv.navigationdrawer.view.navfragment.SaveFragment;
import com.miguelcatalan.materialsearchview.MaterialSearchView;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private FloatingActionButton fab;
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;

    private MaterialSearchView materialSearchView;
    private String [] arrayCenter = new String[] {"Iris", "EngForU", "Academy", "Broadway"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //navigation drawer
        figureNavigationDrawer();
        //floating button
        figureFloatingButton();
        //search tool
        figureSearchTool();
    }

    public void figureNavigationDrawer () {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.nav_category_list) {
            fragmentManager.beginTransaction().replace(R.id.content_main, new CategoryFragment()).commit();
        } else if (id == R.id.nav_post) {
            fragmentManager.beginTransaction().replace(R.id.content_main, new CommentFragment()).commit();
        } else if (id == R.id.nav_love_list) {
            fragmentManager.beginTransaction().replace(R.id.content_main, new LoveFragment()).commit();
        } else if (id == R.id.nav_saved_list) {
            fragmentManager.beginTransaction().replace(R.id.content_main, new SaveFragment()).commit();
        } else if (id == R.id.nav_profile) {
            fragmentManager.beginTransaction().replace(R.id.content_main, new ProfileFragment()).commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
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
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search_center:
                materialSearchView.setMenuItem(item);
                break;
            case R.id.choose_location:
                showSelectLocation();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    public void showSelectLocation () {
        final String [] location = getResources().getStringArray(R.array.my_location);
        new AlertDialog.Builder(this)
                .setTitle("Choose Location")
                .setItems(location, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Selected " + location[which], Toast.LENGTH_SHORT).show();
            }
        })
                .create()
                .show();
    }
}
