/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simuduck;

/**
 *
 * @author oem
 */
public class MiniDucksSimulatior {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        
        mallard.performFly();
        mallard.performQuack();
        
    }
}
