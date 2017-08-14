package com.wocalage.ydgsw.main;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.List;

/**
 * Created by jiaojian on 2017/8/14.
 */

public class PageController {
    private Activity mMainActivity;
    private List<Fragment> mPagesList;
    private FragmentPagerAdapter mPagesAdapter;
    private ViewPager mViewPager;


    public PageController(Activity activity){

    }
}
