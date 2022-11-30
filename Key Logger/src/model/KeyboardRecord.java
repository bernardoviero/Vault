package model;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class KeyboardRecord implements NativeKeyListener {

    public void  KeyboardRecord() {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            System.out.println("erro registro");
            System.out.println(e.getMessage());
            System.exit(0);
        }
        
        GlobalScreen.addNativeKeyListener(new KeyboardRecord());
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        System.out.println("keyPress: " + NativeKeyEvent.getKeyText(e.getKeyCode()));

        if (e.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
            try {
                GlobalScreen.unregisterNativeHook();
            } catch (NativeHookException ex) {
                System.out.println("terminando processo");
            }
        }
    }
}
