# Jank

[![Jank.png](https://i.postimg.cc/tTdKhgk5/Jank.png)](https://postimg.cc/0MQXvPLM)

## About
Jank is a little basic and potentially poorly optimized text editor. I started writing Jank because I wanted to get my hands dirty
with writing a text editor, hence the name Jank. It is crude and somewhat messy, but I plan on optimizing and fixing bugs in the future at a slow and 
steady rate. Something to kinda nibble on to pass time. 

## Features
Most features I have written myself. I have tried to avoid using any Java.swing or Java.awt methods such as 
undo or redo in JTextArea. I used swing and awt for mostly GUI reasons, such as scrollbar, text area, frame, etc.

| Syntax      | Description |
| ----------- | ----------- |
| ^C    | Copy      |
| ^V | Paste |
| ^X | Cut |
| ^Z | Undo |
| ^ + Shift + Z | Redo |
| ^O | New Window (Currently bugged... Need to refactor some static variables) |

## Installation
In the off chance that you want to use this Janky text editor installation is fairly straight forward.

Make sure that you're X11 display variable is set. If you're using WSL2 you can google around and find a port that should work.

I use X410 so I ran this command ``export DISPLAY=$(cat /etc/resolv.conf | grep nameserver | awk '{print $2; exit;}'):0.0``

1.``git pull https://github.com/baeddavid/Jank.git``

2.``cd Jank``

3.``javac org.Jank.java``

4.``java org.Jank``

## Implementation 
Nothing about Jank was particularly difficult to write. The biggest thing I got stuck on was writing undo/redo methods.
Undo/redo implementation in Jank is somewhat crude and inefficient. It does the job, but it is both expensive in memory
and time. 

Undo and redo is implemented with a doubly linked list. It is called TimeLine in Jank. The idea behind TimeLine is simple and therefore inefficient.
We save the state of the document every 5 seconds and add the state of the document to the timeline. When added to the timeline
we keep track of what document state we are currently on. If the user wishes to undo a change, we revert the whole document one state.
If the user wishes to redo a change, we move forward in the timeline one document state.

This is understandably very slow and has unacceptable performance in larger sized documents.
I plan on changing this implementation to a Command and Memento pattern for both efficiency and maintainability. 