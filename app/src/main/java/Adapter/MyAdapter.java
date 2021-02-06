package Adapter;
import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.musicwiki.AlbumsFragment;
import com.example.musicwiki.ArtistsFragment;
import com.example.musicwiki.TracksFragment;

public class MyAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public MyAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                AlbumsFragment AlbumsFragment = new AlbumsFragment();
                return AlbumsFragment;
            case 1:
                ArtistsFragment ArtistsFragment = new ArtistsFragment();
                return ArtistsFragment;
            case 2:
                TracksFragment TracksFragment = new TracksFragment();
                return TracksFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}