package com.trust.utils.toast;

import android.content.Context;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.trust.utils.R;


/**
 * Description:自定义仿IOS普通Toast
 * Copyright  : Copyright (c) 2018
 * Company    : 中睿泽农
 * Author     : rondo
 * Date       : 2018/3/5 16:16
 */
public class TPrompt extends Toast {
    private Context        mContext;
    //private AnimationSet   mModalInAnim;
    //private AnimationSet   mModalOutAnim;
    private TextView       chapterNameTV;
    private RelativeLayout rl_root;
    private Handler handler = new Handler();

    public TPrompt(Context context) {
        super(context);
        this.mContext = context;
        //mModalInAnim = (AnimationSet) OptAnimationLoader.loadAnimation(mContext, R.anim.modal_in);
        //mModalOutAnim = (AnimationSet) OptAnimationLoader.loadAnimation(mContext, R.anim.modal_out);
        initView();
    }

    protected void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.toast_normal_layout, null);
        rl_root = (RelativeLayout) view.findViewById(R.id.rl_root);
        chapterNameTV = (TextView) view.findViewById(R.id.chapterName);
        setGravity(Gravity.CENTER, 0, 0);
        setDuration(Toast.LENGTH_LONG);
        setView(view);
    }

    /**
     * 文字提示
     *
     * @param msg
     */
    public void showToast(String msg) {
        if (chapterNameTV != null) {
            show();
            chapterNameTV.setText(msg);
            //mModalInAnim.setDuration(250);
            rl_root.setVisibility(View.VISIBLE);
            //rl_root.startAnimation(mModalInAnim);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    rl_root.setVisibility(View.INVISIBLE);
                    //rl_root.startAnimation(mModalOutAnim);
                }
            }, 2000);
        }
    }

}
