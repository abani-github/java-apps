/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8inaction.def;

/**
 *
 * @author abani_000
 */
public interface Message {
    default String getMessage(){
        return "This is default message";
    }
}
