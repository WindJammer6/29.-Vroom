# Vroom 🚙
<p align="center">
  <img src="https://github.com/user-attachments/assets/2ce1a2dd-d333-459f-8ddb-468f367d9c94" alt="Vroom" width="400"/>
</p>

**Short description of Vroom**:  
Vroom is an android application developed in Java to help students in Singapore easily find and connect with reputable private driving instructors. Many learners prefer private instruction due to lower costs and flexible schedules, but they often struggle with fragmented platforms, potential scams, and unreliable booking systems. Vroom addresses these issues by offering a secure, centralized platform where students can search for instructors based on price, location, and availability.

Key features include instructor discovery, booking lessons, scheduling, in-app chat, lesson reminders, and theory test quizzes. The app uses Firebase as its backend (NoSQL), storing user profiles, bookings, and chat histories efficiently. To simulate conversing with Singaporean driving instructors in the prototype, we used prompt engineering with OpenAI's GPT-3.5 Turbo Large Language Model (LLM) in the in-app chat feature. 

Advanced algorithms like Dijkstra’s algorithm are used to calculate the shortest path between towns, helping students find nearby instructors. Data structures such as HashMaps and ArrayLists support fast data access and dynamic UI updates, particularly within RecyclerViews. 

Vroom’s design follows core software engineering principles including Single Responsibility and Composition Over Inheritance, ensuring modular, maintainable code. Vroom delivers a seamless experience that simplifies the learning journey and enhances communication between students and instructors.

<br>

**Personal reflection on building Vroom:**  
![image](https://github.com/user-attachments/assets/6e828be3-22be-482a-9d85-5d89ed15ccc8)

Vroom is built as part of one of my university's module on Java and Android Development along with some of my classmates, [lacro29](https://github.com/lacro29), [marilynseet](https://github.com/marilynseet) and [brandonkimchi](https://github.com/brandonkimchi). I contributed as the main programmer, with some programming help, [Figma](www.figma.com) design, poster design and promotional video by my classmates. 

Hey, Vroom happened to win an award as one of the more popular Android Applications during a design showcase of all the projects created as part of my university's module!
  
![Vroom_Cert](https://github.com/user-attachments/assets/93bdecec-785c-4196-bc48-ae20a3492fc9)


**Disclaimer:**
Vroom is a semi-working prototype, some features are not working completely such as the 'Edit Profile' feature and the 'Lesson Booking Calender' feature (once you make a booking, that booking does not get deleted and will remain available). The instructors in Vroom are not real people.

<br>

Programming Languages used:  
![My Skills](https://go-skill-icons.vercel.app/api/icons?i=java) ![My Skills](https://go-skill-icons.vercel.app/api/icons?i=python)

Frameworks used:  
![My Skills](https://go-skill-icons.vercel.app/api/icons?i=firebase) ![My Skills](https://go-skill-icons.vercel.app/api/icons?i=chatgpt) ![My Skills](https://go-skill-icons.vercel.app/api/icons?i=figma) ![My Skills](https://go-skill-icons.vercel.app/api/icons?i=canva)

<br>

## Table of Contents
+ [Additional resources related to Vroom](#additionalresources)
+ [Personal learning notes on Android App Development with Java during building Vroom](#personallearningnotes)
+ [How to push code from Android Studio to Github?](#pushcodefromandroidstudiotogithub)

<br>

## Additional resources related to Vroom

Past Vroom prototype versions, Report, Presentation slides, Promotional video, Additional Python files, CSV files used during building Vroom, and Android Application Development tutorial: https://drive.google.com/drive/folders/180pvaDPHLwVBbXQcPiWR4SdEpYxlACJS?usp=sharing (Google Drive) (you can look at the report here or watch the promotional video to find out more details about Vroom)

Vroom Figma Design link: https://www.figma.com/community/file/1498372745570465348 (Figma)

Firebase Realtime Database link: https://console.firebase.google.com/u/0/project/vroom-android-application/database/vroom-android-application-default-rtdb/data/~2F (Firebase Realtime Database) (however its only accessible by me from my Gmail account)

<br>

## Personal learning notes on Android App Development with Java during building Vroom <a name = "personallearningnotes"></a>

I followed the [Youtube video by Caleb Curry titled, 'Android App Development in Java All-in-One Tutorial Series (4 HOURS!)'](https://www.youtube.com/watch?v=tZvjSl9dswg) and the 'AndroidApplicationTutorial' folder stores the Android Application of me following this tutorial in my Google Drive folder mentioned in the previous section: https://drive.google.com/drive/folders/180pvaDPHLwVBbXQcPiWR4SdEpYxlACJS?usp=sharing.

Android/iOS App development (not just with Java but can be for dart, swift, etc) terminology:
- Each button on the phone is called an app
- Each page in these app is called an 'Activity'
- the first page that opens when you click open an app is called the 'Main Activity' (you can think of it as the homepage of the app)
- intent - the transfer of data from 1 activity/page of the app to another
- Each component on the app (e.g. buttons, texts) is called a 'View'
- An XML language file is like the HTML and CSS language with JavaScript for Android app development with Java. It describes the layout and design (front-end) of the android app pages/activity
- Different 'Views' will have different attributes. (e.g. A text 'View' will have attributes like 'text' and 'clickable', while a button 'View' might have other types of attributes like 'onClick', and so does the other types of 'Views' will have all different types of attributes)
- An important attribute that exists in all types of 'Views' is called the 'ID' attribute. Since in android app development we would often require to reference 'Views' so we can modify or work with it inside of code. And in order to do things dynamically like that, we often want to interact with these 'Views', which we can do so by stating their 'ID' attributes
- A Fragment is a reusable UI component that represents a portion of a screen inside an Activity. Fragments allow for modular design, meaning you can break your UI into smaller, manageable pieces. Think of it like the 'Activity' → The container (full screen, while the 'Fragment' → A piece of that screen (like a section in a webpage)

Source(s):
- https://www.youtube.com/watch?v=tZvjSl9dswg (Caleb Curry) (Youtube video by Caleb Curry titled, 'Android App Development in Java All-in-One Tutorial Series (4 HOURS!)') (For learning syntax basics of Android App Development in Java in Android Studio)
- https://www.youtube.com/watch?v=aiX8bMPX_t8&t=230s (Easy Tuto) (Youtube video by Easy Tuto titled, 'How to connect Firebase to Android Studio App | 2024') (For learning how to connect Firebase to Android Studio IDE)
- https://stackoverflow.com/questions/76018702/i-cant-create-a-new-project-with-java-language-anymore-on-android-studio-flamin (StackOverflow) (helped me with debugging a bug)

<br>

## How to push code from Android Studio to Github? <a name = "pushcodefromandroidstudiotogithub"></a>
Since I did Android Development with Java using the Android Studio IDE, I needed to learn how to push code with git on the terminal from Android Studio to Github. After much googling, this is what works for me.

1.
```text
git init
```

2.
```text
git remote add origin https://github.com/WindJammer6/Vroom.git
```

3.
```text
git add .
```

4.
```text
git commit -am "[Commit message]"
```

5.
```text
git push origin master
```

OR

```text
git push origin master --force
```

Source:
- https://www.youtube.com/watch?v=VJOblwM2KJ0&t=8s (The Code City) (Youtube video by The Code City titled, 'How to Push Code to Github from Android Studio - Step by Step Guide (2023)')
