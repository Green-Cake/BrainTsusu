# BrainTsusu
「つ」「す」「う」の三文字だけでProgrammingができちゃう！

# Strong Point
どんなプログラムでも伝言ができる！(簡単にとは言ってない)

# How to write
Brainf\*ukの各記号を置き換えただけです。
詳しくはそちらをば。
対応表:
```
\> つつ
\< つす
\+ つう
\- すつ
\. すす
\, すう
\[ うつ
\] うす

うう => 数字として出力(オリジナル)
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

# I dunno how to use java
☟のbatを同じフォルダにぶっこんでみな。動かなかったら最新のjavaをインストールしてね♡
```
@echo off
cd %~dp0
java -jar BrainTsusu.jar -file ソースファイルの絶対パス
pause
```
