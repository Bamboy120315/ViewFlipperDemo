## 滚动信息Demo
  
最近项目中需要用到信息滚动的效果，  
类似淘宝、京东、今日头条的那种效果，  
于是网上看了一下，  
原来Android的原生控件中就有这个View，  
于是我就写了几个效果，    
现在拿出来大家共同探讨下。  
  
话不多说，  
看下效果先：  
![ViewFlipper](https://upload-images.jianshu.io/upload_images/6179866-c74264a89dab81a0.gif)

由于是原生控件，  
使用起来也是非常简单，  
只需要注意几个属性，  
分别是：  
  
| 属性           | 含义          | 类型      |
| ------------- |--------------:| --------:|
| autoStart     | 自动开始播放    |       int |
| flipInterval  | 间隔时间       |       int |
| inAnimation   | 新条目进入的动画 | anim.xml |
| outAnimation  | 旧条目离开的动画 | anim.xml |
  
看懂了这几个属性，  
就可以开始撸起来了，  
先在XML里画出这个View：

```
<ViewFlipper
	android:id="@+id/vf"
	android:layout_width="match_parent"
	android:layout_height="wrap_content"
	android:autoStart="true"
	android:background="@drawable/border_fv"
	android:flipInterval="3000"
	android:inAnimation="@anim/anim_up_in"
	android:outAnimation="@anim/anim_up_out" />
```
  
然后Java代码中addView即可：

```
View item1 = View.inflate(this, R.layout.item, null);
View item2 = View.inflate(this, R.layout.item, null);
View item3 = View.inflate(this, R.layout.item, null);

vf.addView(item1);
vf.addView(item2);
vf.addView(item3);
```
  
代码很简单，  
甚至连注释都不需要，  
如果还是有疑问的地方，  
欢迎在文章下评论，  
或者加入QQ讨论群：569614530，  
群里找我，  
我是尘少。  
![扫码加入QQ讨论群](https://img-blog.csdnimg.cn/20190312095824708.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2JhbWJveV8=,size_16,color_FFFFFF,t_70)
  
本文github链接：  
https://github.com/Bamboy120315/ViewFlipperDemo  
  
也可以先下载apk安装体验：  
![扫码下载apk](https://upload-images.jianshu.io/upload_images/6179866-3878748b46711c58.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)  
ps：  
部分手机刚启动时会有些卡顿，  
是因为七个动画同事执行的原因，  
正常使用是不会卡顿的。  
