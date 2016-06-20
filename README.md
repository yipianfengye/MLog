# MLog

这是一个建议的日志框架，主要参考了logger日志框架的实现方式；

- 在build.gradle中引用MLog框架
<pre><code>
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    testCompile 'junit:junit:4.12'
    compile 'com.android.support:appcompat-v7:23.1.1'
    compile 'com.android.support:design:23.1.1'
    compile 'com.yipianfengye:MLog:1.0.0'
}
</code></pre>
        
- 在自定义的Application的onCreate方法中初始化MLog框架

<pre><code>
/**
 * Created by liuchao on 2016/1/26.
 */
public class MApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        MLog.init(true);

    }
}
</code></pre>

- 在代码中使用MLog框架

<pre><code>
fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MLog.i("测试MLog框架！！！");
            }
        });

</code></pre>
