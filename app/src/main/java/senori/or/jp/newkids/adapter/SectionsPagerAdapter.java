package senori.or.jp.newkids.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import senori.or.jp.newkids.MainActivity;
import senori.or.jp.newkids.frament.AlbumFragment;
import senori.or.jp.newkids.frament.MenuFragment;
import senori.or.jp.newkids.frament.NoticeFragment;
import senori.or.jp.newkids.frament.ScheduleFragment;

/**
 * Created by JupiteR on 2016-02-16.
 */
public class SectionsPagerAdapter extends FragmentStatePagerAdapter {
    private Context context;
    private TabLayout tabLayout;

    public SectionsPagerAdapter(FragmentManager fm, Context context, TabLayout tabLayout) {
        super(fm);
        this.context = context;
        this.tabLayout = tabLayout;

    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;


        switch (position) {

            case 0:

                fragment = new NoticeFragment();
                //    return new NoticeFragment();
                break;
            case 1:

                fragment = new AlbumFragment();
//                tabLayout.setVisibility(View.INVISIBLE);
//                tabLayout.layout(0, 0, 0, 0);
                break;
            //return new AlbumFragment();
            case 2:
                fragment = new ScheduleFragment();
//                tabLayout.setVisibility(View.VISIBLE);
                break;
            //return new NoticeFragment();
            case 3:

                fragment = new MenuFragment();
//                tabLayout.setVisibility(View.VISIBLE);
                break;
            //           return new AlbumFragment();

        }
        return fragment;
    }


    @Override
    public Object instantiateItem(View container, int position) {

        return getItem(position);
    }


    @Override
    public int getCount() {
        return 4;
    }


}
