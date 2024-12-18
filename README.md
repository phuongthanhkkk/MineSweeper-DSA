# MineSweeper Game


##### Topic Project: MineSweeper Game

![image](https://github.com/user-attachments/assets/d577f461-d798-43bb-b022-21346ac39293)


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

![image](https://github.com/user-attachments/assets/0274aa03-fc26-4243-b345-d1b663524245)

```Figure D-4 Start Window```


![image](https://github.com/user-attachments/assets/99dad0db-d2c8-406e-b462-86940cf50ff4)

```Figure D-5 Close Window```


![image](https://github.com/user-attachments/assets/b749ad42-1e41-42f6-b25a-559c35fe9070)

```Figure D-6 Screen player```


![image](https://github.com/user-attachments/assets/288e9717-d1ad-4bce-8b6e-d91a9f4c31ce)

```Figure D-7 Loss screen on easy level```


![image](https://github.com/user-attachments/assets/70d0d935-5bce-4dfe-a706-89084bb58c96)

```Figure D-8 Loss screen on hard level```


### 📚 UML Diagram
![MineSweeper](https://github.com/user-attachments/assets/3c4b2d3e-e2b7-427e-ad48-2b8d61d17a93)

