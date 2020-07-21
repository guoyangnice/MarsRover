## 需求
假想你在火星探索团队中负责软件开发。现在你要给登陆火星的探索小车编写控制程序，根据地球发送的控制指令来控制火星车的行动。

火星车收到的指令分为三类：

1. 初始化信息：
    火星车的降落地点（x, y）和朝向（N, S, E, W）信息；

2. 移动指令：
    火星车可以前进（M）,一次移动一格；

3. 转向指令：
    火星车可以左转90度（L）或右转90度（R）。

由于地球和火星之间的距离很远，指令必须批量发送，火星车执行完整批指令之后，再回报自己所在的位置坐标和朝向。
（0，0）N
MMMM =》 （0，4） N
L => (0,0) W
MLMR => (x,y) ?


## Tasking
- give mars rover with init (0, 0) N space, when receive M command, then mars rover will replay the place (0, 1) N
- give mars rover with init (0, 0) N space, when receive L command, then mars rover will replay the place (0, 0) W
- give mars rover with init (0, 0) N space, when receive R command, then mars rover will replay the place (0, 0) E

- give mars rover with init (0, 0) N space, when receive MMMM command, then mars rover will replay the place (0, 4) N
- give mars rover with init (0, 0) N space, when receive MLLMR command, then mars rover will replay the place (0, 0) W
