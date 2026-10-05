# Whack-a-Mole-Game
The Whack-a-Mole Game is an interactive mini-game where a mole appears randomly in different positions on the screen. The player must quickly click the mole to earn points before it disappears. The game includes a score counter and timer, making it fun and engaging for users.
How to Download, Install, Run, and Play the Whack-a-Mole Game
1. What You Need
To run this game, you need:
1.A computer or laptop
2.Java JDK 8 or later
3.Apache NetBeans (recommended) or another Java IDE
4.The Whack-a-Mole project files
No database or internet connection is required to play the game.
2. How to Get/Download the Game:
1.Download the Whack-a-Mole project ZIP file.
2.Save the ZIP file on your computer.
3.Right-click the ZIP file.
4.Select Extract All.
5.Choose a folder where you want to keep the project.
6.Open the extracted project folder.
3. Install Java:
If Java is not already installed:
1.Download and install Java JDK.
2.Complete the installation.
3.Open Command Prompt.
4.Type:
java -version
5.If the Java version is displayed, Java is installed successfully.
4. Install Apache NetBeans:
1.Download and install Apache NetBeans.
2.Open NetBeans.
3.Select File → Open Project.
4.Browse to the extracted Whack-a-Mole project folder.
5.Select the project and click Open Project.
5. Run the Game:
After opening the project in NetBeans:
1.Find the main Java class, such as GUI.java.
2.Right-click the main class.
3.Select Run File.
Or you can click the Run ▶️ button in NetBeans.
The game window will appear.
6. How to Play the Game:
Step 1: Start the Game
When the game starts, you will see:
1.WHACK-A-MOLE title
2.Score: 0
3.Time: 30 sec
4.A 3 × 3 grid
5.A Restart button
Step 2: Find the Mole
A mole will appear randomly inside one of the 9 boxes.
Step 3: Click the Mole
Click the box where the mole appears.
1.Correct click → Score increases by 1
2.Wrong/empty box → No score
Step 4: Continue Playing
The mole changes its position automatically after a short time.
Try to click as many moles as possible before the timer reaches zero.
Step 5: Game Over
The game lasts for 30 seconds.
When the timer reaches:
Time: 0 sec
the game stops and a Game Over message appears with the final score.
Step 6: Restart
To play again:
1.Click the Restart button.
2.The score becomes 0.
3.The timer returns to 30 seconds.
4.A new game starts.
7. Game Rules:
Rule
Description
Game Duration: 30 seconds
Grid: 3 × 3
Total Boxes: 9
Correct Hit: +1 score
Wrong Click: No score
Mole Position: Random
Mole Movement: Automatic
Restart: Starts a new game
8. Project Files
The project mainly contains:
GUI.java
This is the main game class. It controls:
1.Game window
2.Buttons
3.Score
4.Timer
5.Mole movement
6.Click events
7.Restart
8.Game Over
MoleIcon.java
This class creates and draws the mole picture automatically.
No separate mole.png image file is required.
9. Software Used:
Software/Technology
Purpose
Java: Main programming language
Java Swing: GUI development
Apache NetBeans: Writing and running the project
JFrame:Main game window
JPanel:Organizing GUI components
JButton:Game boxes and buttons
JLabel:Score and timer
Timer: Mole movement and countdown
Random: Random mole position
10. Can Anyone Play This Game?
Yes. Anyone can play the game if they have:
1.A computer/laptop
2.Java installed
3.The project files
4.NetBeans or another Java-supported environment
No special gaming software is required.
