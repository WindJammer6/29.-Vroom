# Vroom

Random personal notes on Android App Development with Java:
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

Presentation slides to pitch the project idea:
- https://www.canva.com/design/DAGe-dY8S3w/s84h1FwiLnhPeZOdrkp3uw/edit (Design by my groupmates not me, I am just the implementor)

Figma link:
- https://www.figma.com/design/rPCWeufByW9ThzQH79vdi2/Vroom?node-id=0-1&t=e2KqXYXxkes1UtQT-1 (Design by my groupmates not me, I am just the implementor)

Firebase Realtime Database link:
- https://console.firebase.google.com/u/0/project/vroom-android-application/database/vroom-android-application-default-rtdb/data/~2F (Firebase Realtime Database) (however its only accessible by me from my Gmail account)

Website links that helped me with debugging various bugs:
- https://stackoverflow.com/questions/76018702/i-cant-create-a-new-project-with-java-language-anymore-on-android-studio-flamin

Sources:
- https://www.youtube.com/watch?v=tZvjSl9dswg ('Android App Development in Java All-in-One Tutorial Series (4 HOURS!)' Youtube video by Caleb Curry) (For learning syntax basics of Android App Development in Java in Android Studio)
- https://www.youtube.com/watch?v=aiX8bMPX_t8&t=230s ('How to connect Firebase to Android Studio App | 2024' Youtube video by Easy Tuto) (For learning how to connect Firebase to Android Studio IDE)
