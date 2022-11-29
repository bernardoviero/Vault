package model;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class ControlKeyBoard implements NativeKeyListener {
    
    public  void  ControlKeyBoard()  {
        try{
              GlobalScreen.registerNativeHook();
        }catch(NativeHookException e){
            System.out.println("erro registro");
            System.out.println(e.getMessage());
            System.exit(0);
        }
        
        
         GlobalScreen.addNativeKeyListener(new ControlKeyBoard());;
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
//        System.out.println("keytyped:  " + e.getKeyCode());
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

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
//        System.out.println("keyrealsed:  " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    }

}
