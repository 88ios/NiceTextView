# NiceTextView
NiceTextView有助于快速实现设置页面布局等
快速实现设置页面
<TextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_centerVertical="true"
    android:drawableRight="@drawable/icon_right"
    android:text="地址管理" />
借助TextView
的属性drawableRight
然后再画一条线
<View
    android:layout_width="match_parent"
    android:layout_height="1px"
    android:background="@color/BBBBBB" />
这样做，我们还是可以勉强接受的
要是碰到再稍微复杂一点，譬如这样的

如果再按照我们之前的做法，要放两个TextView和一个ImageView控件
这样我们的内心是不是开始有点抵触了。

有了NiceTextView，我们就不用那么麻烦了，直接这样引用
<com.aikaifa.nicetextview.NiceTextView
    android:layout_width="match_parent"
    android:layout_height="50dp"
    ntv:sLeftTextString="地址管理"
    ntv:sRightIconRes="@drawable/icon_right" />


<com.aikaifa.nicetextview.NiceTextView
    android:id="@+id/tv_login"
    android:layout_width="match_parent"
    android:layout_height="100dp"
    ntv:sLeftIconRes="@drawable/head_default"
    ntv:sLeftTextString="登录/注册"
    ntv:sRightIconRes="@drawable/icon_right" />

如果每行都复制粘贴，这样一个页面布局下来，也得要30分钟左右。

现在我们可以用5分钟的时间来完成京东设置页面的布局



![image］(https://raw.githubusercontent.com/88ios/NiceTextView/master/app/src/screenshots/defautl.jpg)

![image］(https://raw.githubusercontent.com/88ios/NiceTextView/master/app/src/screenshots/more.jpg)

![image］(https://raw.githubusercontent.com/88ios/NiceTextView/master/app/src/screenshots/moreset.jpg)
![image］(https://raw.githubusercontent.com/88ios/NiceTextView/master/app/src/screenshots/set.jpg)




