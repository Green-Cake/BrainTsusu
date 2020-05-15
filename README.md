# BrainTsusu
「つ」「す」「う」の三文字だけでProgrammingができちゃう！
web版もあるよ!　→ http://gake.starfree.jp/

# Strong Point
どんなプログラムでも伝言ができる！(簡単にとは言ってない)

# How to write
Brainf\*ckの各記号を置き換えただけです。
詳しくはそちらをば。
対応表:
```
> つつ
< つす
+ つう
- すつ
. すす
, すう
[ うつ
] うす
[オリジナル]
うう => 数字として出力
まて => ポインタのさす値ds停止
```
# How to use
上のBrainTsusu.jarをDownload.ターミナルからjarのあるとこまでcdして実行してください。

ファイルを指定する場合、 `-file FILE_PATH`　で。

# Sample Code
```
つうつうつうつうつうつうつうつうつうつう
つうつうつうつうつうつうつうつうつうつう
つうつうつうつうつうつうつうつうつうつう
つうつうつうつうつうつうつうつうつうつう
つうつうつうつうつうつうつうつうつうつう
つうつうつうつうつうつうつうつうつうつう
つうつうつうつうつうつうつうつうつうつう
つうつうつうつうつうつうつうつうつうつう
つうつうつうつうすす
すつすす
つうつうすす
すつすつすす
つうつうすす
```
☝はTSUSUと表示するサンプルコード(Simple)。

☟ちょっぴり複雑ver
```
//コメントも可能
つうつうつうつうつうつうつう

うつ
　つつ
　つうつうつうつうつうつうつうつうつうつう
　つうつう
　つす
　すつ
うす

つつ

すす　　　　　//T
すつすす　　　//S
つうつうすす　//U
すつすつすす　//S
つうつうすす　//U
```
☟自作のふぃぼなっち表示機。まぁバイト単位なんですぐオーバーフローしますけどね。
```
つつつつつつつつつつつつ
つうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつう
つうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつう
つすつすつすつすつすつす
つうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつう
つうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつうつう
つうすす つつつつつつつつつつつつ すす つすつすつすつすつすつす
すすすつ つつつつつつつつつつつつ すす つすつすつすつすつすつす
すつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつ
すつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつすつ
つつ つう つつ つう つすつす
つうつうつうつうつうつうつうつうつうつうつう//表示する個数(11+2=13個がオーバーフローしない限界)
うつすつ つつつつつつ
つすうつすつ
つつつつ つう つすつす
つつ つう つす
うす
つすうつすつ
つつつつつつ つう つすつすつす
うす
つつつつ うつすつ
つすつす つう つつつつ
うす
つつ うつすつ
つすつす つう つつつつ
うす
つすつす
うう
つつつつつつつつ すす つすつすつすつす
つすつす うす 
```

# I dunno how to use java
☟のbatを同じフォルダにぶっこんでみな。動かなかったら最新のjavaをインストールしてね♡
```
@echo off
cd %~dp0
java -jar BrainTsusu.jar -file ソースファイルの絶対パス
pause
```
