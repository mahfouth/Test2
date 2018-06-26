/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test2;

import java.util.Random;

/**
 *
 * @author mahfo
 */
public class NewClass {
    
    public static void main(String args[]){
        String s = "PdfIlnk= http://twin.sci-hub.tw/4d56039b47feaab3a729f5db0ab2223f/malaquias2017.pdf#view=FitH";
        
        int pdfOndex = s.indexOf("#");
       
        String pdfName = s.substring(0,pdfOndex);
        System.out.println(pdfName);
    }
}
