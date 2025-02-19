/*
 * Copyright 2005 Sun Microsystems, Inc. ALL RIGHTS RESERVED
 * Use of this software is authorized pursuant to the terms of the
 * license found at http://developers.sun.com/berkeley_license.html
 *
 */

package systemtray;

import java.awt.*;
import java.awt.event.*;

public class SystemTrayTest {
    
    public SystemTrayTest() {
        
        final TrayIcon trayIcon;
        
        if (SystemTray.isSupported()) {
            
            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().getImage("sangshin.gif");
            
            // Create MouseListener object, which will responds to
            // mouse click.
            MouseListener mouseListener = new MouseListener() {
                
                public void mouseClicked(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse clicked!");
                }
                public void mouseEntered(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse entered!");
                }
                public void mouseExited(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse exited!");
                }
                public void mousePressed(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse pressed!");
                }
                public void mouseReleased(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse released!");
                }
                
            };
            
            // ActionListener when exit is chosen from PopupMenu
            ActionListener exitListener = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            };
            
            // Create PopupMenu
            PopupMenu popupMenu = new PopupMenu();
            MenuItem defaultItem = new MenuItem("Exit");
            defaultItem.addActionListener(exitListener);
            popupMenu.add(defaultItem);
            
            // Create TrayIcon object
            trayIcon = new TrayIcon(image, "Tray Demo", popupMenu);
            
            ActionListener actionListener = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    trayIcon.displayMessage("Action Event",
                            "An Action Event Has Been Peformed!",
                            TrayIcon.MessageType.INFO);
                }
            };
            
            trayIcon.setImageAutoSize(true);
            trayIcon.addActionListener(actionListener);
            trayIcon.addMouseListener(mouseListener);
            
            //    Depending on which Mustang build you have, you may need to uncomment
            //    out the following code to check for an AWTException when you add
            //    an image to the system tray.
            
            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
                System.err.println("TrayIcon could not be added.");
            }
            
        } else {
            System.err.println("System tray is currently not supported.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SystemTrayTest main = new SystemTrayTest();
    }
    
}
