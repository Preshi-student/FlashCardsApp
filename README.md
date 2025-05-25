ST10470248
Precious Mbabazi
IMAD5111 Assignment 2

FlashCardApp 

Purpose and Features 
This is a flashcardsapp that is meant to help students study for exams in a more creative and engaging way. It is specifically based on the history subject that gives student an opportunity to study in a more fun way 
whereby the students get questions and then answer by clicking true or false then they get scores based on their answers and get to review their work. 

Key features:
Feature 1:  The app uses a for...loop to iterate through all the five questions. 
Feature 2:  The app uses parallel arrays, one for the questions and one for the answers which is a boolean array of true or false. 

Design Considerations 
The appearance of the app is quite visually appealing. That when the user opens the app, it already gets them motivated to start the quiz. The different screens all have different visual backgrounds that all speak 
to the function of each screen. 
The app has 4 screens in total whereby the app runs with ease on these 4 screens without encountering any errors.  It has a simple user interface that makes it easier for the user 
to interact eaasily with the app. There are no complications, so the user will not be overwhelmed. 

You can find my github link here:
https://github.com/Preshi-student/FlashCardsApp.git

Github
As I was coding the app, I kept pushing the codes to github which helped me keep track of my changes. 

App Screenshots:
![welcome screen ](https://github.com/user-attachments/assets/a850c060-0639-4d6a-9656-4154738ba67d)
![quiz screen - incorrect ](https://github.com/user-attachments/assets/edf68a14-d1c4-43fe-bce6-480e00ea79ea)
![quiz screen - correct ](https://github.com/user-attachments/assets/7b3d7c1b-d871-4ba9-9bdc-522ebfb48040)
![review screen ](https://github.com/user-attachments/assets/a585a9fe-9ee3-41c6-b7e8-85131240d393)
![review screen ](https://github.com/user-attachments/assets/8a6968f8-b9db-4fdb-a248-1aec1437c15f)

You can find my video here:
https://youtu.be/GcEM-Pa2N9I?si=C42F_ryiEnNeDuGx

Challenges and Learnings: 
Challenge 1: My app faced some IDE issues when I was trying to run it. It kept terminating. 
Solution: So I did some checks and found out that the issue was with my XML. With my imageview I had accidentally put "src" before the "drawable" feature. 
Challenge 2: My app was now running but my exit button on the review screen was not closing the app. 
Solution: So I went back to my ReviewActivity of my kotlin code and realised that I had closed off the code with finish() which only closes one screen and not the entire app.  So I went to edit that code rather to 
finishaffinity() so the entire app can close. 

















