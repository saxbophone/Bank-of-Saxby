# Bank-of-Saxby - Design

This software is designed in an object-oriented manner and is made up of a collection of loosely-coupled `classes` and `interfaces`. This is to maximise modularity, potential code re-use and portability.

## Pinpad (`inteface`)

Pinpad describes the methods that all classes that implement a Pinpad should have:

### `public void startCapture()`

This method tells the Pinpad to start watching for keypad input.

### `pulic void stopCapture()`

This method tells the Pinpad to stop watching for keypad input.

### `public void sendButton(String button)`

This method should be called by the Pinpad when a button is pressed, with a `String` identifying which button was pressed.
