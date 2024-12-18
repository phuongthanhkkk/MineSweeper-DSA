# MineSweeper Game


##### Topic Project: MineSweeper Game

![image](https://github.com/bachtung2003/mine-sweeper-game/assets/91307850/51e6f412-2b2a-47e0-91af-a184a1533f9f)



## 📖 About The Game

### 📜 Introduction
Minesweeper is a popular single-player computer puzzle game invented in the 1970s.
When the game starts, the player is given an R×C rectangular grid of covered squares or cells. A fixed number of N mines are randomly placed on the RxC unit and hidden from the player. The game starts in an empty field. Each player has his own starting position. Players open (by clicking) one field at a time. If there is a mine in the field, the player will explode and the game will be over. Otherwise, a box containing a single value between 0 and 8 will be displayed. The number of mines in this area is 0 and the displayed value is empty. This value represents the total number of mines adjacent (horizontally, vertically and diagonally) to the uncovered area. The object of the game is to discover all areas that are free of mines.

### 🎯 Rules

- The board is a two-dimensional space of NXM cells, which has a predetermined number of mines.
- Each cell has 4 properties:
    - Closed or open.
    - Are there mines or not?
    - Number of mines around.
    - Is it marked or not?
- There are 2 mouse interactions with each cell:
    - Left click to open the box. Then the value of the cell is displayed.
    - Right-click to highlight a cell that you believe contains a mine.
- When the cell is opened, there are three possible values:
    - If that cell has a mine, the mine image is displayed, all cells are opened and the game ends.
    - If that box has a number, that is the number of mines around. The number of surrounding cells is 8, or 5 (if the cell is on the edge), or 3 (if the cell is in the corner).
    - If there are no mines around that cell, or in other words the number of mines around is 0, the displayed value is empty.
- We can only highlight a cell with the right mouse button when the cell is in the closed state. Click the first time to mark, click again to unmark.
- The player wins when the number of unopened cells is exactly equal to the number of mines, and loses when the player opens a cell containing mines.

### :technologist: Player's interface

![image](https://github.com/user-attachments/assets/839526fd-d0e5-4a78-a157-4ab458ad4a10)


```Figure D-4 Start Window```


![image](https://github.com/bachtung2003/mine-sweeper-game/assets/91307850/fdb2f60d-07fb-4c02-9b9a-6980d9199749)

```Figure D-5 Close Window```


![image](https://github.com/bachtung2003/mine-sweeper-game/assets/91307850/df0e5387-0014-4f65-9cd6-06aadb61e3a5)

```Figure D-6 Screen player```


![image](https://github.com/bachtung2003/mine-sweeper-game/assets/91307850/c1d8cb5f-81a1-44f6-8f1f-6d67786bace2)

```Figure D-7 Loss screen on easy level```


![image](https://github.com/bachtung2003/mine-sweeper-game/assets/91307850/a713dda2-c953-4e1f-8614-7b304d3ff45c)

```Figure D-8 Loss screen on hard level```


### 📚 UML Diagram
![MineSweeper](https://github.com/bachtung2003/mine-sweeper-game/assets/91307850/95d3fb97-fb45-4061-835e-e42d79620cd4)


### 🎬 Demo
[Link our game](https://www.youtube.com/watch?v=NRgWf-SAdrw)



### :family_woman_woman_girl_girl: Contributors
| No | Stuent Name | Student ID |
| -------- | -------- | -------- |
| 1  | Trịnh Thuỷ Tiên   | ITITIU21328  |
| 2   | Bùi Phương Thanh   | ITITIU21311  |
| 3  | Trần Bách Tùng   | ITITIU21340  |
| 4   | Lê Đỗ Cao Thi   | ITCSIU21235 |
