# What
toolbar test.
hide toolbar when scrolling.

# Reference
[Androidでスクロールした時にToolbarを隠す](http://starzero.hatenablog.com/entry/2015/09/30/114136)

# TroubleShooting
- [RecyclerViewを使うときに起きた問題を解決する方法](http://qiita.com/Sam/items/d5b82f6c2830fa4d14a2)
- [FATAL EXCEPTION: main java.lang.NoClassDefFoundError: android.support.v7.internal.widget.TintManager](http://stackoverflow.com/questions/34015427/fatal-exception-main-java-lang-noclassdeffounderror-android-support-v7-interna)
try with set all support lib with same verion for example

```
compile 'com.android.support:appcompat-v7:23.1.1'
compile 'com.android.support:recyclerview-v7:23.1.1'
compile 'com.android.support:design:23.1.1'
```
