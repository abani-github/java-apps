/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8inaction;

import pkg8inaction.def.Message;
import pkg8inaction.def.impls.MessageService;
import pkg8inaction.def.impls.MessageServiceOverride;

/**
 *
 * @author abani_000
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is Java 8");
        Message messageService = new MessageService();
        Message messageOverride = new MessageServiceOverride();
        
        System.out.println(messageService.getMessage());
        System.out.println(messageOverride.getMessage());
    }
    
}
