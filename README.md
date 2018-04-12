# MyUtilsLibrary
## 开发常用工具类
>compile 'com.github.hzwuyanbo:MyUtilsLibrary:1.0.0'
## 本项目封装的简单的几个开发常用工具类，方便自己开发使用
### 仿IOS弹框
 <div>new AlertDialog(MainActivity.this).builder().setTitle("提示").setMsg("确认删除该条目吗?")</div>
       <div>              .setNegativeButton("取消", new View.OnClickListener() {</div>
             <div>            @Override</div>
                   <div>      public void onClick(View view) {</div>
                         <div>  //点击了取消按钮</div>
                         <div>}</div>
                     <div>})</div>
                     <div>.setPositiveButton("确定", new View.OnClickListener() {</div>
                         <div>@Override</div>
                         <div>public void onClick(View view) {</div>
                             <div>//点击了确定按钮</div>
                         <div>}</div>
                     <div>}).show();</div>
### 小菊花加载框
 <div>SweetAlertDialog dialog = new SweetAlertDialog(this);</div>
 <div>dialog.setTitleText("加载中...");</div>
 <div>dialog.show();</div>
 <div>dialog.dismiss();</div>
### 中间位置Toast
 <div> //普通底部Toast</div>
 <div>  T.showToast(MainActivity.this, "我在底部");</div>
 <div>  //中部Toast</div>
 <div>  T.showMiddleToast(MainActivity.this, "我在中间位置");</div>
 <div>   //成功Toast</div>
 <div>   T.showAnimSuccessToast(MainActivity.this, "成功");</div>
 <div>   //错误Toast</div>
 <div>    T.showAnimErrorToast(MainActivity.this, "失败");</div>
 
### SharedPreferences工具类
<div>PrefUtils.setBoolean(this, "trust", true);</div>
<div>PrefUtils.getBoolean(this, "trust", false);</div>
### Android 版本信息工具类
