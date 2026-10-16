# Pool Aim Assistant (Android)

Floating trajectory overlay for 8 Ball Pool. Captures your screen, detects the
table and balls, and draws predicted cue-ball paths, cushion bounces and
object-ball directions. 100% offline - nothing leaves your phone.

## Build the APK from your PHONE (no computer needed)

GitHub's free cloud servers compile the app for you. Total time ~15 minutes.

1. Create a free account at https://github.com (works in the phone browser).
2. Create a new repository: tap "+" -> "New repository" -> name it `pool-aim`
   -> keep it Public -> Create.
3. In the repo, tap "Add file" -> "Upload files" -> "choose your files":
   upload **pool-aim-android.zip** (the file from this folder). Commit.
4. Tap the "Actions" tab -> the "Build APK" workflow starts automatically.
   Wait for the green checkmark (~5-10 min first time). If it asks you to
   enable workflows, tap "I understand, enable workflows" and re-run.
5. Tap the completed run -> scroll to "Artifacts" -> download
   **pool-aim-apk** (it's a zip).
6. Open the downloaded zip in your Files app, extract **app-debug.apk**,
   tap it -> "Install" (allow installs from unknown sources when asked).

## Using the app

1. Open Pool Aim -> "1. Allow overlay permission" -> grant it.
2. Tap "2. START" -> allow screen capture (this is how it sees the game).
3. Open 8 Ball Pool and start a match (practice table recommended).
4. The app shows a frozen frame of your screen. Tap, IN ORDER:
   top-left inner cushion corner, top-right, bottom-right, bottom-left,
   then the cue ball. Accuracy here = accuracy everywhere.
5. Aim: drag anywhere on the overlay - the cyan line is the predicted cue
   path, bounces included; orange = where the struck ball goes; magenta =
   cue ball after contact; red circle = contact point.
6. Power: the slider at the bottom.
7. Double-tap the real cue ball if the green marker ever lands on the wrong
   ball.
8. Tap "▶" so your touches reach the game, take the shot, tap "✋" to aim
   again. "✕" stops the app.

## Known limitations (v1)

- Detection is basic (color blobs, no OpenCV): works best on the standard
  green Miniclip table with default ball skins. Dark/custom tables may need
  tuning of the cloth color rule in Detector.kt.
- Trajectory lines are also captured by the screen feed; filters reject them,
  but if you see phantom "balls", keep lines thin (default) and re-pin cue
  with a double tap.
- Physics: cushion restitution 0.72, simplified spin-less model. Fine for
  planning, not frame-perfect.

## Fair play

Aim assistance violates 8 Ball Pool's terms of use and Miniclip's anti-cheat
can ban accounts using it (including on emulators/mirrored setups). This is
provided for learning/practice - use it offline or at your own risk.

## If the build fails

Open the failed run in Actions, copy the red error text and paste it back to
the assistant - the code will be fixed and re-zipped.
